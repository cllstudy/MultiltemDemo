package com.csjbot.multiitemdemo;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.Objects;

/**
 * Time:2020/10/16
 * Author:cll
 * Des:点位管理 全部地图页面  头部标题下内容
 */
public class Level2Item extends AbstractExpandableItem implements MultiItemEntity {
    private Long id;
    //外键
    private Long tid;
    //地图编号
    private String mapNumber;
    //点位名字
    private String pointName;
    // 点位编号
    private String pointNumber;

    private String  pointX;

    private String pointY;

    private String pointR;
    //0 普通点位  非0:特殊点位
    private int pointLevel;
    // 点类别,0 普通等待点 1 售货机等待点 2 电梯前等待点  3 电梯内等待点
    private int pointType;

    private boolean isSelect;


    private boolean isUseMap;

    public boolean isUseMap() {
        return isUseMap;
    }

    public void setUseMap(boolean useMap) {
        isUseMap = useMap;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getMapNumber() {
        return mapNumber;
    }

    public void setMapNumber(String mapNumber) {
        this.mapNumber = mapNumber;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public String getPointNumber() {
        return pointNumber;
    }

    public void setPointNumber(String pointNumber) {
        this.pointNumber = pointNumber;
    }

    public String getPointX() {
        return pointX;
    }

    public void setPointX(String pointX) {
        this.pointX = pointX;
    }

    public String getPointY() {
        return pointY;
    }

    public void setPointY(String pointY) {
        this.pointY = pointY;
    }

    public String getPointR() {
        return pointR;
    }

    public void setPointR(String pointR) {
        this.pointR = pointR;
    }

    public int getPointLevel() {
        return pointLevel;
    }

    public void setPointLevel(int pointLevel) {
        this.pointLevel = pointLevel;
    }

    public int getPointType() {
        return pointType;
    }

    public void setPointType(int pointType) {
        this.pointType = pointType;
    }

    @Override
    public int getItemType() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Level2Item)) return false;
        Level2Item item = (Level2Item) o;
        return getPointLevel() == item.getPointLevel() &&
                getPointType() == item.getPointType() &&
                isSelect() == item.isSelect() &&
                isUseMap() == item.isUseMap() &&
                getMapNumber().equals(item.getMapNumber()) &&
                getPointName().equals(item.getPointName()) &&
                getPointNumber().equals(item.getPointNumber()) &&
                getPointX().equals(item.getPointX()) &&
                getPointY().equals(item.getPointY()) &&
                getPointR().equals(item.getPointR());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTid(), getMapNumber(), getPointName(), getPointNumber(), getPointX(), getPointY(), getPointR(), getPointLevel(), getPointType(), isSelect(), isUseMap());
    }

    @Override
    public int getLevel() {
        return 1;
    }
}
