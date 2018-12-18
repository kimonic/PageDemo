package com.hisense.pagedemo.bean;

/**
 * * ================================================
 * name:            MovieInfoBean
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class MovieInfoBean {
    private String name;
    private String position;
    private String review;
    private String bitmapUrl;
    private String vip;
    private boolean vipflag;



    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public boolean getVipflag() {
        return vipflag;
    }

    public void setVipflag(boolean vipflag) {
        this.vipflag = vipflag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getBitmapUrl() {
        return bitmapUrl;
    }

    public void setBitmapUrl(String bitmapUrl) {
        this.bitmapUrl = bitmapUrl;
    }
}
