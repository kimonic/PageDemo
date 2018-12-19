package com.hisense.pagedemo.ui.clouds;

/**
 * * ================================================
 * name:            TaoBaoBean
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/18
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class TaoBaoBean {
    private int itemType = 1;

    private String name="";
    private String price="";
    private String free="";
    private String info="";
    private String type="";
    private String position="";
    private String produceImageUrl="";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getProduceImageUrl() {
        return produceImageUrl;
    }

    public void setProduceImageUrl(String produceImageUrl) {
        this.produceImageUrl = produceImageUrl;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public int getItemType() {
        return itemType;
    }

}
