package com.hisense.pagedemo.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.RVBean10Single;
import com.hisense.pagedemo.ui.item.MoviePosterView;

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
public class RVAdapter10Single extends BaseMultiItemQuickAdapter<RVBean10Single, BaseViewHolder> {


    private boolean isShowPosition=true;

    public RVAdapter10Single(List<RVBean10Single> data) {
        super(data);
        addItemType(RVBean10Single.TYPE_ONE, R.layout.rv_item1001);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean10Single item) {
        switch (helper.getItemViewType()) {

            case RVBean10Single.TYPE_ONE:

                MoviePosterView moviePosterView=helper.getView(R.id.mpv_rvitem_1001);

                moviePosterView.setName(item.getName());
                moviePosterView.setReview(item.getReview());
                moviePosterView.setPosterUrl(item.getPosterUrl());
                if (isShowPosition) {
                    moviePosterView.setPosition(("" + (helper.getAdapterPosition()+1)));
                } else {
                    moviePosterView.setPosition("");
                }
                break;
        }
    }
}
