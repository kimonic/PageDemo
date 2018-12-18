package com.hisense.pagedemo.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * * ================================================
 * name:            RVBean08
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：  页面08临时数据源
 * introduce:
 * history：
 * ===================================================
 */
public class RVBean08Single implements MultiItemEntity {

    public final static int TYPE_ONE = 1;
    public final static int TYPE_TWO = 2;
    public final static int TYPE_THREE = 3;

    private int itemType = 1;

    /**评分*/
    private String review="4.7";
    /**当前所处的位置*/
    private String  position="";
    /**下载数量*/
    private String  downLoadCount="300w+ 下载";
    /**应用类别*/
    private  String  type="休闲益智";
    /**应用名称*/
    private String name="纯音乐";
    /**是否显示标签图片*/
    private boolean installFlag=false;
    /**应用图片url地址*/
    private String appImgUrl="";
    private String installText="已安装";

    public boolean isInstallFlag() {
        return installFlag;
    }

    public void setInstallFlag(boolean installFlag) {
        this.installFlag = installFlag;
    }

    public String getAppImgUrl() {
        return appImgUrl;
    }

    public void setAppImgUrl(String appImgUrl) {
        this.appImgUrl = appImgUrl;
    }

    public String getInstallText() {
        return installText;
    }

    public void setInstallText(String installText) {
        this.installText = installText;
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


    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    @Override
    public int getItemType() {
        return itemType;
    }


}
