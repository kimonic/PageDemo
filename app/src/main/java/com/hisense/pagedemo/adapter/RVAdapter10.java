package com.hisense.pagedemo.adapter;

import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.RVBean10;
import com.hisense.pagedemo.ui.SelectConstraintLayout;

import java.util.List;

/**
 * * ================================================
 * name:            RVAdapter10
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：第五个页面的适配器
 * introduce:
 * history：
 * ===================================================
 */
public class RVAdapter10 extends BaseMultiItemQuickAdapter<RVBean10, BaseViewHolder> {


    private boolean isShowPosition=true;

    public RVAdapter10(List<RVBean10> data) {
        super(data);
        addItemType(RVBean10.TYPE_TWO, R.layout.rv_item1001_group);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean10 item) {
        switch (helper.getItemViewType()) {

            case RVBean10.TYPE_TWO:

                SelectConstraintLayout layout=helper.getView(R.id.scl_rvitem_1001_group);
                layout.setPositionInAdapter(helper.getAdapterPosition());

                ImageView imageView=helper.getView(R.id.iv_rvitem_1001_group_portrait);
                Glide.with(imageView).load(item.getMovieInfoBean().getBitmapUrl())
                        .apply(RequestOptions.bitmapTransform(new FitCenter()))
                        .into(imageView);

                ((TextView) (helper.getView(R.id.tv_rvitem_1001_group_name))).setText(item.getMovieInfoBean().getName());
                ((TextView) (helper.getView(R.id.tv_rvitem_1001_group_review))).setText(item.getMovieInfoBean().getReview());



                if (isShowPosition) {
                    ((TextView) (helper.getView(R.id.tv_rvitem_1001_group_position)))
                            .setText(("" + (helper.getAdapterPosition()+1)));
                } else {
                    ((TextView) (helper.getView(R.id.tv_rvitem_1001_group_position)))
                            .setText("");
                }
                break;
        }
    }
}
