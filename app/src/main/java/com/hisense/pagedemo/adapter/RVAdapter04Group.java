package com.hisense.pagedemo.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.RVBean04;
import com.hisense.pagedemo.ui.item.IndicatorView;

import java.util.List;

/**
 * * ================================================
 * name:            RVAdapter04Group
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class RVAdapter04Group extends BaseMultiItemQuickAdapter<RVBean04, BaseViewHolder> {


    private boolean isShowPosition = true;

    public RVAdapter04Group(List<RVBean04> data) {
        super(data);
        addItemType(RVBean04.TYPE_ONE, R.layout.rv_header_04_group);
        addItemType(RVBean04.TYPE_TWO, R.layout.rv_item_0401);
//        addItemType(RVBean04.TYPE_THREE, R.layout.rv_item_0402);
        // TODO: 2018/12/4 ---------------------04页---------使用控件显示---------------------------
        addItemType(RVBean04.TYPE_THREE, R.layout.rv_item_0401_group);
        // TODO: 2018/12/4 ---------------------04页---------使用控件显示---------------------------
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean04 item) {
        switch (helper.getItemViewType()) {
            case RVBean04.TYPE_ONE:
                ImageView imageViewHeader=helper.getView(R.id.iv_header_04group_portrait);
                Glide.with(imageViewHeader)
                        .load(item.getPortraitUrl())
                        .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                        .into(imageViewHeader);

                TextView textView=helper.getView(R.id.tv_header_04group_name);
                TextView textView1=helper.getView(R.id.tv_header_04group_content);
                textView.setText(item.getName());
                textView1.setText(item.getContent());





                setFullSpan(helper);
                break;
            case RVBean04.TYPE_TWO:
                LinearLayout linearLayout = helper.getView(R.id.ll_rvitem_0401);
                if (item.getIndicator() != null && item.getIndicator().size() > 0 && linearLayout.getChildCount() != item.getIndicator().size()) {
                    linearLayout.removeAllViews();
                    for (int i = 0; i < item.getIndicator().size(); i++) {
                        IndicatorView indicatorView = new IndicatorView(linearLayout.getContext());
                        indicatorView.setContent(item.getIndicator().get(i));
                        indicatorView.setPositionInParent(i);
                        if (i == 0) {
                            indicatorView.setIndicatorFlag(true);
                        }
                        //焦点变化监听
                        indicatorView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                            @Override
                            public void onFocusChange(View v, boolean hasFocus) {
                                if (listener != null) {
                                    listener.onFocusChange(v, hasFocus);
                                }
                            }
                        });
                        linearLayout.addView(indicatorView);
                    }
                }
                setFullSpan(helper);
                break;
//            case RVBean04.TYPE_THREE:
//                MovieInfoView movieInfoView = helper.getView(R.id.miv_rvitem_0402);
//                MovieInfoBean movieInfoBean = item.getMovieInfoBean();
//
//                movieInfoView.setName(movieInfoBean.getName());
//                movieInfoView.setReview(movieInfoBean.getReview());
//                movieInfoView.setVipFlag(movieInfoBean.getVipflag());
//                movieInfoView.setVip(movieInfoBean.getVip());
//                movieInfoView.loadBitmap(movieInfoBean.getBitmapUrl());
//                if (isShowPosition) {
//                    movieInfoView.setPosition("" + ((helper.getAdapterPosition()) - 1));
//                } else {
//                    movieInfoView.setPosition("");
//                }
//                break;

            // TODO: 2018/12/4 ---------------------04页---------使用控件显示---------------------------
            case RVBean04.TYPE_THREE:
                ImageView imageView = helper.getView(R.id.iv_rcitem_0401_group_moview);
                Glide.with(imageView).load(item.getMovieInfoBean().getBitmapUrl())
                        .apply(RequestOptions.bitmapTransform(new FitCenter()))
                        .into(imageView);


                if (isShowPosition) {
                    ((TextView) (helper.getView(R.id.tv_rvitem_0401_group_position)))
                            .setText(("" + ((helper.getAdapterPosition()) - 1)));
                } else {
                    ((TextView) (helper.getView(R.id.tv_rvitem_0401_group_position)))
                            .setText("");
                }


                ((TextView) (helper.getView(R.id.tv_rvitem_0401_group_name))).setText(item.getMovieInfoBean().getName());
                ((TextView) (helper.getView(R.id.tv_rvitem_0401_group_review))).setText(item.getMovieInfoBean().getReview());


                ImageView imageView1=helper.getView(R.id.iv_rcitem_0401_group_flag);
                if (item.getMovieInfoBean().getVipflag()){
                    imageView1.setVisibility(View.VISIBLE);
                    Glide.with(imageView1).load(R.drawable.zuoshangjiaolabel).into(imageView1);
                }else {
                    imageView1.setVisibility(View.GONE);
                }
                break;
            // TODO: 2018/12/4 ---------------------04页---------使用控件显示---------------------------


        }
    }

    private FocusChangeListener listener;

    public FocusChangeListener getListener() {
        return listener;
    }

    public void setListener(FocusChangeListener listener) {
        this.listener = listener;
    }

    public interface FocusChangeListener {
        void onFocusChange(View v, boolean hasFocus);
    }
}
