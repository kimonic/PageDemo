package com.hisense.pagedemo.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * * ================================================
 * name:            RVBean10
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class RVBean10 implements MultiItemEntity {

    public final static int TYPE_ONE = 1;
    public final static int TYPE_TWO = 2;
    public final static int TYPE_THREE = 3;

    private int itemType = 1;
    private MovieInfoBean movieInfoBean;

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
