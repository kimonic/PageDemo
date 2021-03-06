package com.hisense.pagedemo.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * * ================================================
 * name:            RVBean07
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class RVBean07 implements MultiItemEntity {

    public final static int TYPE_ONE = 1;
    public final static int TYPE_TWO = 2;
    public final static int TYPE_THREE = 3;

    private int itemType = 1;
    private MovieInfoBean movieInfoBean;
    private String  headerUrl;
    private String  headerUrl1;

    public String getHeaderUrl1() {
        return headerUrl1;
    }

    public void setHeaderUrl1(String headerUrl1) {
        this.headerUrl1 = headerUrl1;
    }

    public String getHeaderUrl() {
        return headerUrl;
    }

    public void setHeaderUrl(String headerUrl) {
        this.headerUrl = headerUrl;
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
