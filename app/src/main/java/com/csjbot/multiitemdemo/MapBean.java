package com.csjbot.multiitemdemo;

import java.util.List;

/**
 * Time:2020/11/21
 * Author:cll
 * Des:
 */
public class MapBean {

    /**
     * creatTime : 2020-11-20 02:53:57
     * currentFloor : 1
     * id : 1
     * mapName : 一楼
     * mapNumber : 131605840801671
     * mapPointBeans : [{"currentFloor":1,"id":3,"mapNumber":"131605840801671","pointLevel":0,"pointName":"我是一楼点位","pointNumber":"1605852765","pointR":"0.01140000010512451","pointType":0,"pointX":"0.0049113375","pointY":"0.0","tid":1},{"currentFloor":1,"id":4,"mapNumber":"131605840801671","pointLevel":0,"pointName":"非官方旗舰店","pointNumber":"1605852770","pointR":"0.01140000010512451","pointType":0,"pointX":"0.0049113375","pointY":"0.0","tid":1},{"currentFloor":1,"id":5,"mapNumber":"131605840801671","pointLevel":0,"pointName":"奇葩都有","pointNumber":"1605852721","pointR":"0.01140000010512451","pointType":0,"pointX":"0.0049113375","pointY":"0.0","tid":1},{"currentFloor":1,"id":6,"mapNumber":"131605840801671","pointLevel":1,"pointName":"1-电梯前等待点","pointNumber":"1605852767","pointR":"0.01140000010512451","pointType":2,"pointX":"0.0049113375","pointY":"0.0","tid":1},{"currentFloor":1,"id":7,"mapNumber":"131605840801671","pointLevel":1,"pointName":"1-电梯内等待点","pointNumber":"1605852723","pointR":"0.01140000010512451","pointType":3,"pointX":"0.0049113375","pointY":"0.0","tid":1},{"currentFloor":1,"id":8,"mapNumber":"131605840801671","pointLevel":1,"pointName":"1-售货机等待点","pointNumber":"1605852765","pointR":"0.01140000010512451","pointType":1,"pointX":"0.0049113375","pointY":"0.0","tid":1},{"currentFloor":1,"id":9,"mapNumber":"131605840801671","pointLevel":1,"pointName":"你好看","pointNumber":"1605852728","pointR":"0.01140000010512451","pointType":0,"pointX":"0.0049113375","pointY":"0.0","tid":1}]
     * updateTime : 2020-11-20 02:53:57
     */

    private String creatTime;
    private int currentFloor;
    private int id;
    private String mapName;
    private String mapNumber;
    private String updateTime;
    private List<MapPointBeansBean> mapPointBeans;

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getMapNumber() {
        return mapNumber;
    }

    public void setMapNumber(String mapNumber) {
        this.mapNumber = mapNumber;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public List<MapPointBeansBean> getMapPointBeans() {
        return mapPointBeans;
    }

    public void setMapPointBeans(List<MapPointBeansBean> mapPointBeans) {
        this.mapPointBeans = mapPointBeans;
    }

    public static class MapPointBeansBean {
        /**
         * currentFloor : 1
         * id : 3
         * mapNumber : 131605840801671
         * pointLevel : 0
         * pointName : 我是一楼点位
         * pointNumber : 1605852765
         * pointR : 0.01140000010512451
         * pointType : 0
         * pointX : 0.0049113375
         * pointY : 0.0
         * tid : 1
         */

        private int currentFloor;
        private int id;
        private String mapNumber;
        private int pointLevel;
        private String pointName;
        private String pointNumber;
        private String pointR;
        private int pointType;
        private String pointX;
        private String pointY;
        private int tid;

        public int getCurrentFloor() {
            return currentFloor;
        }

        public void setCurrentFloor(int currentFloor) {
            this.currentFloor = currentFloor;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMapNumber() {
            return mapNumber;
        }

        public void setMapNumber(String mapNumber) {
            this.mapNumber = mapNumber;
        }

        public int getPointLevel() {
            return pointLevel;
        }

        public void setPointLevel(int pointLevel) {
            this.pointLevel = pointLevel;
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

        public String getPointR() {
            return pointR;
        }

        public void setPointR(String pointR) {
            this.pointR = pointR;
        }

        public int getPointType() {
            return pointType;
        }

        public void setPointType(int pointType) {
            this.pointType = pointType;
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

        public int getTid() {
            return tid;
        }

        public void setTid(int tid) {
            this.tid = tid;
        }
    }
}
