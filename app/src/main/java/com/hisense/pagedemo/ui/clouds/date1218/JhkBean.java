package com.hisense.pagedemo.ui.clouds.date1218;

import java.util.List;

/**
 * * ================================================
 * name:            JhkBean
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/18
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class JhkBean {
    private int itemType = 1;

    private String name="";
    private String price="";
    private String originalPrice="";
    private String position="";
    private String productImageUrl="";
    private List<String> indicator;


    public List<String> getIndicator() {
        return indicator;
    }

    public void setIndicator(List<String> indicator) {
        this.indicator = indicator;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public int getItemType() {
        return itemType;
    }




}
