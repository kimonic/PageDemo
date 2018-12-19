package com.hisense.pagedemo.ui.clouds;

import android.support.annotation.Nullable;
import android.view.View;
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
 * name:            GameAdapter
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/18
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class GameAdapter extends BaseAdapter<GameBean,BaseViewHolder> {
    public GameAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }

    private boolean isShowPosition = true;
    @Override
    protected void convert(BaseViewHolder helper, GameBean item) {
        //-----------------------------电影图片---------------------------------------------
        ImageView imageView = helper.getView(R.id.iv_jhk_game_movie);
        Glide.with(imageView.getContext()).load(item.getMoviewImageUrl())
                .apply(RequestOptions.bitmapTransform(new FitCenter()))
                .into(imageView);

        //----------------下载数量与分类----------------------------------------------------
        ((TextView) (helper.getView(R.id.tv_jhk_game_bottom_1))).setText(item.getDownLoadCount());
        ((TextView) (helper.getView(R.id.tv_jhk_game_bottom_2))).setText(item.getType());

        //--------------------------当前所处位置-----------------------------------------------
        TextView textView = helper.getView(R.id.tv_jhk_game_position);
        if (isShowPosition) {
            textView.setVisibility(View.VISIBLE);
            textView.setText(("" + helper.getAdapterPosition()));
        } else {
            textView.setVisibility(View.GONE);
        }

        //----------------------------左上角label-------------------------------------------
        ImageView imageView1 = helper.getView(R.id.iv_jhk_game_flag);
        if (item.isShowLabel()) {
            imageView1.setVisibility(View.VISIBLE);
            Glide.with(imageView1).load(item.getLabelImageUrl()).into(imageView1);
        }else {
            imageView1.setVisibility(View.INVISIBLE);
        }

        //--------------------评分--------应用名称--------------------------------------------------
        ((TextView)(helper.getView(R.id.tv_jhk_game_review))).setText(item.getReview());
        ((TextView)(helper.getView(R.id.tv_jhk_game_name))).setText(item.getName());

    }
}
