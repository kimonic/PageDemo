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
 * name:            TaoBaoAdapter
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/18
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class TaoBaoAdapter extends BaseAdapter<TaoBaoBean,BaseViewHolder> {
    public TaoBaoAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }
    private boolean isShowPosition=true;

    @Override
    protected void convert(BaseViewHolder helper, TaoBaoBean item) {
        ImageView imageView=helper.getView(R.id.iv_jhk_taobao_portrait);
        Glide.with(imageView).load(item.getProduceImageUrl())
                .apply(RequestOptions.bitmapTransform(new FitCenter()))
                .into(imageView);

        ((TextView) (helper.getView(R.id.tv_jhk_taobao_free))).setText(item.getFree());
        ((TextView) (helper.getView(R.id.tv_jhk_taobao_goodsname))).setText(item.getName());
        ((TextView) (helper.getView(R.id.tv_jhk_taobao_price))).setText(item.getPrice());
        ((TextView) (helper.getView(R.id.tv_jhk_taobao_shoppinginfo))).setText(item.getInfo());
        ((TextView) (helper.getView(R.id.tv_jhk_taobao_type))).setText(item.getType());



        if (isShowPosition) {
            ((TextView) (helper.getView(R.id.tv_jhk_taobao_position)))
                    .setText(("" + (helper.getAdapterPosition()+1)));
        } else {
            ((TextView) (helper.getView(R.id.tv_jhk_taobao_position)))
                    .setText("");
        }
    }
}
