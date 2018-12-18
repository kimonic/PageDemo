package com.hisense.pagedemo.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.MovieInfoBean;
import com.hisense.pagedemo.bean.RVBean07;
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
 * description：第五个页面的适配器
 * introduce:
 * history：
 * ===================================================
 */
public class RVAdapter07 extends BaseMultiItemQuickAdapter<RVBean07, BaseViewHolder> {


    private boolean isShowPosition=true;

    public RVAdapter07(List<RVBean07> data) {
        super(data);
        addItemType(RVBean07.TYPE_ONE, R.layout.rv_header_07);
        addItemType(RVBean07.TYPE_TWO, R.layout.rv_item_0701);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean07 item) {
        switch (helper.getItemViewType()) {
            case RVBean07.TYPE_ONE:
                RecommendImageView recommendImageView=helper.getView(R.id.riv_rvheader_0701);
                recommendImageView.setBitmapUrl(item.getHeaderUrl());
                RecommendImageView recommendImageView1=helper.getView(R.id.riv_rvheader_0702);
                recommendImageView1.setBitmapUrl(item.getHeaderUrl1());
                setFullSpan(helper);
                break;
           
            case RVBean07.TYPE_TWO:
                MovieInfoView movieInfoView=helper.getView(R.id.miv_rvitem_0701);
                MovieInfoBean movieInfoBean=item.getMovieInfoBean();

                movieInfoView.setName(movieInfoBean.getName());
                movieInfoView.setReview(movieInfoBean.getReview());
                movieInfoView.setVipFlag(movieInfoBean.getVipflag());
                movieInfoView.setVip(movieInfoBean.getVip());
                movieInfoView.loadBitmap(movieInfoBean.getBitmapUrl());
                if (isShowPosition) {
                    movieInfoView.setPosition("" + ((helper.getAdapterPosition())));
                } else {
                    movieInfoView.setPosition("");
                }
                break;
        }
    }
//    private FocusChangeListener listener;
//
//    public FocusChangeListener getListener() {
//        return listener;
//    }
//
//    public void setListener(FocusChangeListener listener) {
//        this.listener = listener;
//    }
//
//    public interface FocusChangeListener{
//        void onFocusChange(View v, boolean hasFocus);
//    }
}
