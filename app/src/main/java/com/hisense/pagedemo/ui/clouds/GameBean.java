package com.hisense.pagedemo.ui.clouds;

/**
 * * ================================================
 * name:            GameBean
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/18
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class GameBean {
    private int itemType = 1;

    /**
     * 已安装部分标签图片
     */
    private int labelImageUrl;
    /**
     * 评分
     */
    private String review = "4.7";
    /**
     * 当前所处的位置
     */
    private String position = "";
    /**
     * 下载数量
     */
    private String downLoadCount = "300w+ 下载";
    /**
     * 应用类别
     */
    private String type = "休闲益智";
    /**
     * 应用名称
     */
    private String name = "纯音乐";
    /**
     * 是否显示标签图片
     */
    private boolean isShowLabel = false;
    /**
     * 应用图片url地址
     */
    private String moviewImageUrl = "";

    public String getMoviewImageUrl() {
        return moviewImageUrl;
    }

    public void setMoviewImageUrl(String moviewImageUrl) {
        this.moviewImageUrl = moviewImageUrl;
    }

    public int getLabelImageUrl() {
        return labelImageUrl;
    }

    public void setLabelImageUrl(int labelImageUrl) {
        this.labelImageUrl = labelImageUrl;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDownLoadCount() {
        return downLoadCount;
    }

    public void setDownLoadCount(String downLoadCount) {
        this.downLoadCount = downLoadCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isShowLabel() {
        return isShowLabel;
    }

    public void setShowLabel(boolean showLabel) {
        isShowLabel = showLabel;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public int getItemType() {
        return itemType;
    }


}
