package com.hisense.pagedemo.adapter;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.RVBean18item02;
import com.hisense.pagedemo.bean.RVBean18item02.ChildItem;

import java.util.List;

/**
 * * ================================================
 * name:            RVAdapter05
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：第五个页面的适配器
 * introduce:
 * history：
 * ===================================================
 */
public class RVAdapter18Child extends BaseQuickAdapter<ChildItem, BaseViewHolder> {


    private boolean isShowPosition = true;

    public RVAdapter18Child(int layoutResId, @Nullable List<ChildItem> data) {
        super(layoutResId, data);
    }


    @Override
    protected void convert(BaseViewHolder helper, RVBean18item02.ChildItem item) {
                //-----------------------------头像图片---------------------------------------------
                ImageView imageView = helper.getView(R.id.iv_rvitem_0901_group_portrait);
                Glide.with(imageView.getContext()).load(item.getPortraitUrl())
                        .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                        .into(imageView);


                //--------------------------当前所处位置--------------------------------------------
                TextView textView = helper.getView(R.id.tv_rvitem_0901_group_position);
                if (isShowPosition) {
                    textView.setVisibility(View.VISIBLE);
                    textView.setText(("" + (helper.getAdapterPosition()+1)));
                } else {
                    textView.setVisibility(View.GONE);
                }



                //--------------------演员姓名--------------------------------------------------
                ((TextView)(helper.getView(R.id.tv_rvitem_0901_group_name))).setText(item.getActorName());
                ((TextView)(helper.getView(R.id.tv_rvitem_0901_group_role))).setVisibility(View.GONE);

    }
}
