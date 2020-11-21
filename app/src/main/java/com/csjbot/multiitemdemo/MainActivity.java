package com.csjbot.multiitemdemo;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<MultiItemEntity> multiList = new ArrayList<>();
    AllMapAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_all_map);
        initData();
    }

    private void initData() {
        adapter = new AllMapAdapter(this, multiList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        String json = getJson();
        Gson gson = new Gson();
        List<MapBean> mapBeans = gson.fromJson(json, new TypeToken<List<MapBean>>() {
        }.getType());
        for (int i = 0; i < mapBeans.size(); i++) {
            Level1Item level1Item = new Level1Item();
            level1Item.setMapName(mapBeans.get(i).getMapName());
            level1Item.setMapNumber(mapBeans.get(i).getMapNumber());
            level1Item.setExpanded(false);
            List<MapBean.MapPointBeansBean> mapPointBeans = mapBeans.get(i).getMapPointBeans();
            List<Level2Item> mll = new ArrayList<>();
            mll.clear();
            if (mapPointBeans != null && mapPointBeans.size() > 0) {
                level1Item.setPointBeans(mapPointBeans);
                for (int j = 0; j < mapPointBeans.size(); j++) {
                    if (TextUtils.isEmpty(mapBeans.get(i).getMapPointBeans().get(j).getPointName())) {
                        break;
                    }
                    Level2Item level2Item = new Level2Item();
                    level2Item.setMapNumber(mapPointBeans.get(j).getMapNumber());
                    level2Item.setPointLevel(mapPointBeans.get(j).getPointLevel());
                    level2Item.setPointName(mapPointBeans.get(j).getPointName());
                    level2Item.setPointNumber(mapPointBeans.get(j).getPointNumber());
                    level2Item.setPointType(mapPointBeans.get(j).getPointType());
                    level2Item.setPointX(mapPointBeans.get(j).getPointX());
                    level2Item.setPointY(mapPointBeans.get(j).getPointY());
                    level2Item.setPointR(mapPointBeans.get(j).getPointR());
                    level1Item.addSubItem(level2Item);
                    if (!mll.contains(level2Item)) {
                        mll.add(level2Item);
                    }
                }
            }
            level1Item.setLevel2Items(mll);
            multiList.add(level1Item);
            adapter.notifyDataSetChanged();
        }

    }


    public String getJson() {

        StringBuilder stringBuilder = new StringBuilder();
        try {
            AssetManager assetManager = getAssets();
            BufferedReader bf = new BufferedReader(new InputStreamReader(
                    assetManager.open("data.json")));
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}