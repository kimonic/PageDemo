package com.hisense.pagedemo.ui.clouds;

import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.ui.SelectConstraintLayout;

import java.util.List;

/**
 * * ================================================
 * name:            CinemaAdapter
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/18
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class CinemaAdapter extends BaseAdapter<CinemaBean,BaseViewHolder> {
    public CinemaAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }
    private boolean isShowPosition=true;

    @Override
    protected void convert(BaseViewHolder helper, CinemaBean item) {
//        SelectConstraintLayout layout=helper.getView(R.id.scl_jhk_cinama);
//        layout.setPositionInAdapter(helper.getAdapterPosition());

        ImageView imageView=helper.getView(R.id.iv_jhk_cinama_portrait);
        Glide.with(imageView).load(item.getMovieInfoBean().getBitmapUrl())
                .apply(RequestOptions.bitmapTransform(new FitCenter()))
                .into(imageView);

        ((TextView) (helper.getView(R.id.tv_jhk_cinama_name))).setText(item.getMovieInfoBean().getName());
        ((TextView) (helper.getView(R.id.tv_jhk_cinama_review))).setText(item.getMovieInfoBean().getReview());



        if (isShowPosition) {
            ((TextView) (helper.getView(R.id.tv_jhk_cinama_position)))
                    .setText(("" + (helper.getAdapterPosition()+1)));
        } else {
            ((TextView) (helper.getView(R.id.tv_jhk_cinama_position)))
                    .setText("");
        }
    }
}
