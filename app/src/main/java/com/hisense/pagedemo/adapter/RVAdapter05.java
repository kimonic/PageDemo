package com.hisense.pagedemo.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.MovieInfoBean;
import com.hisense.pagedemo.bean.RVBean05;
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
public class RVAdapter05 extends BaseMultiItemQuickAdapter<RVBean05, BaseViewHolder> {


    private boolean isShowPosition=true;

    public RVAdapter05(List<RVBean05> data) {
        super(data);
        addItemType(RVBean05.TYPE_ONE, R.layout.rv_header_05);
        addItemType(RVBean05.TYPE_TWO, R.layout.rv_item_0501);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean05 item) {
        switch (helper.getItemViewType()) {
            case RVBean05.TYPE_ONE:
                RecommendImageView recommendImageView=helper.getView(R.id.riv_rvheader_05);
                recommendImageView.setBitmapUrl(item.getHeaderUrl());
                setFullSpan(helper);
                break;
           
            case RVBean05.TYPE_TWO:
                MovieInfoView movieInfoView=helper.getView(R.id.miv_rvitem_0501);
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
