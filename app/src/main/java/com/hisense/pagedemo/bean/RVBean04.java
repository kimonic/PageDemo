package com.hisense.pagedemo.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

/**
 * * ================================================
 * name:            RVBean04
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class RVBean04 implements MultiItemEntity {

    public final static int TYPE_ONE = 1;
    public final static int TYPE_TWO = 2;
    public final static int TYPE_THREE = 3;

    private int itemType = 1;
    private List<String> indicator;
    private MovieInfoBean movieInfoBean;

    private String  portraitUrl="";
    private String name="";
    private String content="";

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getIndicator() {
        return indicator;
    }

    public void setIndicator(List<String> indicator) {
        this.indicator = indicator;
    }

    public MovieInfoBean getMovieInfoBean() {
        return movieInfoBean;
    }

    public void setMovieInfoBean(MovieInfoBean movieInfoBean) {
        this.movieInfoBean = movieInfoBean;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    @Override
    public int getItemType() {
        return itemType;
    }


}
