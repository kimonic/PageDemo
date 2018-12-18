package com.hisense.pagedemo.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * * ================================================
 * name:            RVBean09
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：  页面08临时数据源
 * introduce:
 * history：
 * ===================================================
 */
public class RVBean09Single implements MultiItemEntity {

    public final static int TYPE_ONE = 1;
    public final static int TYPE_TWO = 2;
    public final static int TYPE_THREE = 3;

    private int itemType = 1;
    /**当前所处的位置*/
    private String  position="";

    /**演员姓名*/
    private String name="";

    /**头像图片地址*/
    private String portraitUrl="";

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
