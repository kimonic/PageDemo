package com.hisense.pagedemo.ui.clouds;

import com.hisense.pagedemo.bean.MovieInfoBean;

/**
 * * ================================================
 * name:            CinemaBean
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/18
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class CinemaBean {

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

    public int getItemType() {
        return itemType;
    }

}
