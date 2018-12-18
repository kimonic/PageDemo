package com.hisense.pagedemo.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.MovieInfoBean;
import com.hisense.pagedemo.bean.RVBean05Group;
import com.hisense.pagedemo.bean.RVBean05Group;
import com.hisense.pagedemo.ui.item.MovieInfoView;
import com.hisense.pagedemo.ui.item.RecommendImageView;

import java.util.List;

/**
 * * ================================================
 * name:            RVAdapter05
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：第五,六个页面的适配器
 * introduce:
 * history：
 * ===================================================
 */
public class RVAdapter05Group extends BaseMultiItemQuickAdapter<RVBean05Group, BaseViewHolder> {


    private boolean isShowPosition=true;

    public RVAdapter05Group(List<RVBean05Group> data) {
        super(data);
        addItemType(RVBean05Group.TYPE_ONE, R.layout.rv_header_06_group);
        addItemType(RVBean05Group.TYPE_TWO, R.layout.rv_item_0601_group);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean05Group item) {
        switch (helper.getItemViewType()) {
            case RVBean05Group.TYPE_ONE:
                ImageView imageView=helper.getView(R.id.iv_rv_header_06_recommend);
                Glide.with(imageView).load(item.getHeaderUrl())
                        .apply(RequestOptions.bitmapTransform(new CenterCrop()))
                        .into(imageView);
                setFullSpan(helper);
                break;
           
            case RVBean05Group.TYPE_TWO:
                MovieInfoBean movieInfoBean=item.getMovieInfoBean();
                ImageView imageView1=helper.getView(R.id.iv_rcitem_0601_group_moview);
                Glide.with(imageView1).load(movieInfoBean.getBitmapUrl())
                        .apply(RequestOptions.bitmapTransform(new FitCenter()))
                        .into(imageView1);

                ImageView imageView2=helper.getView(R.id.iv_rcitem_0601_group_flag);
                if (movieInfoBean.getVipflag()){
                    imageView2.setVisibility(View.VISIBLE);
                }else {
                    imageView2.setVisibility(View.INVISIBLE);
                }

                TextView name=helper.getView(R.id.tv_rvitem_0601_group_name);
                name.setText(movieInfoBean.getName());

                TextView review=helper.getView(R.id.tv_rvitem_0601_group_review);
                review.setText(movieInfoBean.getReview());

                TextView position=helper.getView(R.id.tv_rvitem_0601_group_position);
                if (isShowPosition) {
                    position.setText(("" + ((helper.getAdapterPosition()))));
                    position.setVisibility(View.VISIBLE);
                } else {
                    position.setText("");
                    position.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}
