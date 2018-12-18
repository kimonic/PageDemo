package com.hisense.pagedemo.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

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
public class RVBean18 implements MultiItemEntity {

    public final static int TYPE_ONE = 1;
    public final static int TYPE_TWO = 2;
    public final static int TYPE_THREE = 3;

    private int itemType = 1;

    private RVBean18item01 bean18item01;
    private RVBean18item02 bean18item02;

    public RVBean18item01 getBean18item01() {
        return bean18item01;
    }

    public void setBean18item01(RVBean18item01 bean18item01) {
        this.bean18item01 = bean18item01;
    }

    public RVBean18item02 getBean18item02() {
        return bean18item02;
    }

    public void setBean18item02(RVBean18item02 bean18item02) {
        this.bean18item02 = bean18item02;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    @Override
    public int getItemType() {
        return itemType;
    }


}
