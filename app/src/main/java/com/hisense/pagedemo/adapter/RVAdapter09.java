package com.hisense.pagedemo.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.RVBean09;

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
public class RVAdapter09 extends BaseMultiItemQuickAdapter<RVBean09, BaseViewHolder> {


    private boolean isShowPosition = true;

    public RVAdapter09(List<RVBean09> data) {
        super(data);
        addItemType(RVBean09.TYPE_ONE, R.layout.rv_item_0901_group);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean09 item) {
        switch (helper.getItemViewType()) {
            case RVBean09.TYPE_ONE:
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
                    textView.setVisibility(View.INVISIBLE);
                }


                
                //--------------------演员姓名--------------------------------------------------
                ((TextView)(helper.getView(R.id.tv_rvitem_0901_group_name))).setText(item.getName());

                break;


        }
    }
}
