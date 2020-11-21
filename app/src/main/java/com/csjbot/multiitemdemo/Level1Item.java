package com.csjbot.multiitemdemo;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

/**
 * Time:2020/10/16
 * Author:cll
 * Des:  点位管理 全部地图页面  头部标题
 */
public class Level1Item extends AbstractExpandableItem<Level2Item> implements MultiItemEntity {
    private String mapNumber;
    private String mapName;

    private List<MapBean.MapPointBeansBean> pointBeans;
    private List<Level2Item> level2Items;

    public Level1Item() {
        setExpanded(false);
    }

    public List<Level2Item> getLevel2Items() {
        return level2Items;
    }

    public void setLevel2Items(List<Level2Item> level1Items) {
        this.level2Items = level1Items;
    }

    public List<MapBean.MapPointBeansBean> getPointBeans() {
        return pointBeans;
    }

    public void setPointBeans(List<MapBean.MapPointBeansBean> pointBeans) {
        this.pointBeans = pointBeans;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    public String getMapNumber() {
        return mapNumber;
    }

    public void setMapNumber(String mapNumber) {
        this.mapNumber = mapNumber;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    @Override
    public int getItemType() {
        return 0;
    }
}
