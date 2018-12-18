package com.hisense.pagedemo.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.RVBean09Single;
import com.hisense.pagedemo.bean.RVBean09Single;
import com.hisense.pagedemo.ui.item.MovieActorView;

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
public class RVAdapter09Single extends BaseMultiItemQuickAdapter<RVBean09Single, BaseViewHolder> {


    private boolean isShowPosition = true;

    public RVAdapter09Single(List<RVBean09Single> data) {
        super(data);
        addItemType(RVBean09Single.TYPE_ONE, R.layout.rv_item_0901);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean09Single item) {
        switch (helper.getItemViewType()) {
            case RVBean09Single.TYPE_ONE:
                //-----------------------------头像图片---------------------------------------------
                MovieActorView movieActorView = helper.getView(R.id.mav_rvitem_0901);
                movieActorView.setPortraitUrl(item.getPortraitUrl());

                //--------------------------当前所处位置--------------------------------------------
                if (isShowPosition) {
                    movieActorView.setPosition("" + (helper.getAdapterPosition() + 1));
                } else {
                    movieActorView.setPosition("");
                }


                //--------------------演员姓名--------------------------------------------------
               movieActorView.setName(item.getName());

                break;


        }
    }
}
