package com.hisense.pagedemo.adapter;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.RVBean18;
import com.hisense.pagedemo.bean.RVBean18item01;
import com.hisense.pagedemo.bean.RVBean18item02;
import com.hisense.pagedemo.ui.PageRecyclerView;

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
public class RVAdapter18 extends BaseMultiItemQuickAdapter<RVBean18, BaseViewHolder> {


    private boolean isShowPosition = true;

    public RVAdapter18(List<RVBean18> data) {
        super(data);
        addItemType(RVBean18.TYPE_ONE, R.layout.rv_header_18_group);
        addItemType(RVBean18.TYPE_TWO, R.layout.rv_item_1801_group);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean18 item) {
        switch (helper.getItemViewType()) {

            case RVBean18.TYPE_ONE:

                ImageView imageView = helper.getView(R.id.iv_header_18_movieimg);
                ImageView imageViewQRCode = helper.getView(R.id.iv_rv_header_18_qrcode);
                ImageView imageViewDataFrom = helper.getView(R.id.iv_rv_header_18_datafrom);
                RVBean18item01 bean18item01 = item.getBean18item01();

                Glide.with(imageView).load(bean18item01.getPosterUrl())
                        .apply(RequestOptions.bitmapTransform(new FitCenter()))
                        .into(imageView);

                Glide.with(imageViewQRCode).load(bean18item01.getQrCodeUrl())
                        .apply(RequestOptions.bitmapTransform(new FitCenter()))
                        .into(imageViewQRCode);

                //------------------数据来自根据类型判断--------------------------------------------
                Glide.with(imageViewDataFrom).load(bean18item01.getDataFromResouse())
                        .apply(RequestOptions.bitmapTransform(new FitCenter()))
                        .into(imageViewDataFrom);

                ((TextView) (helper.getView(R.id.tv_rv_header_18_content))).setText(bean18item01.getMovieContent());
                ((TextView) (helper.getView(R.id.tv_rv_header_18_name))).setText(bean18item01.getMovieName());
                ((TextView) (helper.getView(R.id.tv_rv_header_18_review))).setText(bean18item01.getReview());
                ((TextView) (helper.getView(R.id.tv_rv_header_18_type))).setText(bean18item01.getMovieType());

                setFullSpan(helper);

                break;
            case RVBean18.TYPE_TWO:
                final PageRecyclerView recyclerView = helper.getView(R.id.prv_rvitem_1801_actor);
                RVBean18item02 bean18item02 = item.getBean18item02();
                ((TextView) (helper.getView(R.id.tv_rvitem_1801_title))).setText(bean18item02.getTitle());
                final RVAdapter18Child adapter18Child = new RVAdapter18Child(R.layout.rv_item_0901_group, bean18item02.getChildItemList());
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(),
                        LinearLayoutManager.HORIZONTAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(adapter18Child);
                setFullSpan(helper);

//                recyclerView.setFocusSearchListener(new PageRecyclerView.FocusSearchListener() {
//                    @Override
//                    public View focusSearch(View focused, View nextFocused, int direction) {
//                        int position=recyclerView.getChildAdapterPosition(focused);
//                        switch (direction) {
//                            case View.FOCUS_LEFT:
//                                if (position-1>0){
////                                    recyclerView.mFocusSearch(focused,View.FOCUS_LEFT);
//                                    Log.e("Tag","下一个获得焦点的视图是--------FOCUS_LEFT--------"+adapter18Child.getViewByPosition(recyclerView,position-1,R.id.scl_rvitem_0801_group));
//                                    return adapter18Child.getViewByPosition(recyclerView,position-1,R.id.scl_rvitem_0801_group);
//                                }
//
//                                break;
//                            case View.FOCUS_RIGHT:
//                                if (position+1<adapter18Child.getItemCount()-1){
////                                    recyclerView.mFocusSearch(focused,View.FOCUS_RIGHT);
//                                    Log.e("Tag","下一个获得焦点的视图是-------FOCUS_RIGHT---------"+adapter18Child.getViewByPosition(recyclerView,position+1,R.id.scl_rvitem_0801_group));
//                                    return adapter18Child.getViewByPosition(recyclerView,position+1,R.id.scl_rvitem_0801_group);
//                                }
//                                break;
//                        }
//                        return nextFocused;
//                    }
//                });

                break;
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
