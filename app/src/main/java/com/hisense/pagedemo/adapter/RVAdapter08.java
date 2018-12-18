package com.hisense.pagedemo.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.RVBean08;

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
public class RVAdapter08 extends BaseMultiItemQuickAdapter<RVBean08, BaseViewHolder> {


    private boolean isShowPosition = true;

    public RVAdapter08(List<RVBean08> data) {
        super(data);
        addItemType(RVBean08.TYPE_ONE, R.layout.rv_item_0801_group);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean08 item) {
        switch (helper.getItemViewType()) {
            case RVBean08.TYPE_ONE:
                //-----------------------------电影图片---------------------------------------------
                ImageView imageView = helper.getView(R.id.iv_rcitem_0801_group_moview);
                Glide.with(imageView.getContext()).load(item.getMoviewImageUrl())
                        .apply(RequestOptions.bitmapTransform(new FitCenter()))
                        .into(imageView);

                //----------------下载数量与分类
                ((TextView) (helper.getView(R.id.tv_rvitem_0801_group_bottom_1))).setText(item.getDownLoadCount());
                ((TextView) (helper.getView(R.id.tv_rvitem_0801_group_bottom_2))).setText(item.getType());

                //--------------------------当前所处位置
                TextView textView = helper.getView(R.id.tv_rvitem_0801_group_position);
                if (isShowPosition) {
                    textView.setVisibility(View.VISIBLE);
                    textView.setText(("" + helper.getAdapterPosition()));
                } else {
                    textView.setVisibility(View.GONE);
                }

                //----------------------------左上角label-------------------------------------------
                ImageView imageView1 = helper.getView(R.id.iv_rcitem_0801_group_flag);
                if (item.isShowLabel()) {
                    imageView1.setVisibility(View.VISIBLE);
                    Glide.with(imageView1).load(item.getLabelImageUrl()).into(imageView1);
                }else {
                    imageView1.setVisibility(View.GONE);
                }
                
                //--------------------评分--------应用名称--------------------------------------------------
                ((TextView)(helper.getView(R.id.tv_rvitem_0801_group_review))).setText(item.getReview());
                ((TextView)(helper.getView(R.id.tv_rvitem_0801_group_name))).setText(item.getName());

                break;


        }
    }
}
