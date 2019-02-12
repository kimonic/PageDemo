package com.hisense.pagedemo.ui.clouds.date1218;

/**
 * * ================================================
 * name:            ActorBean
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/18
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class ActorBean {
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

    public int getItemType() {
        return itemType;
    }


}
