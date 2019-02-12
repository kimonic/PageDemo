package com.hisense.pagedemo.ui.clouds.date1218;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;

import java.util.List;

/**
 * * ================================================
 * name:            ActorAdapter
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/18
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class ActorAdapter extends BaseAdapter<ActorBean, BaseViewHolder> {
    public ActorAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }

    private boolean isShowPosition = true;


    @Override
    protected void convert(BaseViewHolder helper, ActorBean item) {
        //-----------------------------头像图片---------------------------------------------
        ImageView imageView = helper.getView(R.id.iv_jhk_actor_portrait);
        Glide.with(imageView.getContext()).load(item.getPortraitUrl())
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .into(imageView);


        //--------------------------当前所处位置--------------------------------------------
        TextView textView = helper.getView(R.id.tv_jhk_actor_position);
        if (isShowPosition) {
            textView.setVisibility(View.VISIBLE);
            textView.setText(("" + (helper.getAdapterPosition() + 1)));
        } else {
            textView.setVisibility(View.INVISIBLE);
        }


        //--------------------演员姓名--------------------------------------------------
        ((TextView) (helper.getView(R.id.tv_jhk_actor_name))).setText(item.getName());


    }

}
