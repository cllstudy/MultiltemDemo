package com.csjbot.multiitemdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;


import java.util.List;

/**
 * Time:2020/10/16
 * Author:cll
 * Des:
 */
public class AllMapAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    Context context;
    private Level1Item level1Item;
    private boolean isListData = false;
    private int tempPosition = -1;
    List<MultiItemEntity> multiItemEntities;
    private String mapNumber;

    public AllMapAdapter(Context context, List<MultiItemEntity> data) {
        super(data);
        this.context = context;
        this.multiItemEntities = data;
        addItemType(0, R.layout.adapter_map_header_layout);
        addItemType(1, R.layout.item_all_map_layout);

    }

    @Override
    protected void convert(@NonNull final BaseViewHolder helper, MultiItemEntity item) {
        switch (helper.getItemViewType()) {
            case 0:
                level1Item = (Level1Item) item;
                mapNumber = level1Item.getMapNumber();
                TextView tvTitle = helper.itemView.findViewById(R.id.header_text);
//                TextView tvTitle = helper.getView(R.id.header_text);
                String mapName = level1Item.getMapName();
                tvTitle.setText(level1Item.getMapName());



                helper.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (level1Item.getLevel2Items() == null) {
                            return;
                        }
                        int pos = helper.getAdapterPosition();
                        if (level1Item.isExpanded()) {
                            isListData = true;
                            collapse(pos);
                        } else {
                            isListData = false;
                            expand(pos);
                            tempPosition = pos;

                        }
                        if (tempPosition == pos) {
                            isListData = false;
                        }
                    }
                });
                break;
            case 1:
                Level2Item level2Item = (Level2Item) item;
                String item2Map = level2Item.getMapNumber();
                if (isListData == false && item2Map.equals(mapNumber)) {
                    RecyclerView rvItem = helper.itemView.findViewById(R.id.rv_all_map_item);
                    rvItem.removeAllViews();
                    rvItem.setLayoutManager(new GridLayoutManager(context, 8));
                    RvItemAdapter rvItemAdapter = new RvItemAdapter(level1Item.getLevel2Items());
                    rvItem.setAdapter(rvItemAdapter);
                    isListData = true;
                }

                break;
        }
    }

    private class RvItemAdapter extends BaseQuickAdapter<Level2Item, BaseViewHolder> {

        public RvItemAdapter(@Nullable List<Level2Item> data) {
            super(R.layout.adapter_map_content_layout, data);
        }

        @Override
        protected void convert(@NonNull BaseViewHolder helper, Level2Item item) {
            Button btc = helper.getView(R.id.bt_content);
            btc.setText(item.getPointName());

        }
    }
}
