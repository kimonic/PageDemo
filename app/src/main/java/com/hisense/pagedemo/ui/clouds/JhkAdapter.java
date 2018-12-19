package com.hisense.pagedemo.ui.clouds;

import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;

import java.util.List;

/**
 * * ================================================
 * name:            JhkAdapter
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/18
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class JhkAdapter extends BaseAdapter<JhkBean,BaseViewHolder> {
    public JhkAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }

    private boolean isShowPosition=true;
    @Override
    protected void convert(BaseViewHolder helper, JhkBean item) {
        ImageView imageView = helper.getView(R.id.iv_jhk_juhaokan_goodsimag);
        Glide.with(imageView).load(item.getProductImageUrl())
                .apply(RequestOptions.bitmapTransform(new FitCenter()))
                .into(imageView);

        ((TextView) (helper.getView(R.id.tv_jhk_juhaokan_goodsname))).setText(item.getName());
        ((TextView) (helper.getView(R.id.tv_jhk_juhaokan_originalprice))).setText(item.getOriginalPrice());
        ((TextView) (helper.getView(R.id.tv_jhk_juhaokan_price))).setText(item.getPrice());


        if (isShowPosition) {
            ((TextView) (helper.getView(R.id.tv_jhk_juhaokan_position)))
                    .setText(("" + helper.getAdapterPosition()));
        } else {
            ((TextView) (helper.getView(R.id.tv_jhk_juhaokan_position)))
                    .setText("");
        }
    }
}
