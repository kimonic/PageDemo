package com.hisense.pagedemo.ui.clouds.date1218;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * * ================================================
 * name:            BaseAdapter
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/18
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class BaseAdapter<T,K extends BaseViewHolder> extends BaseQuickAdapter<T,K> {


    public BaseAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }

    public BaseAdapter(@Nullable List data) {
        super(data);
    }

    public BaseAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(K helper, T item) {

    }


}
