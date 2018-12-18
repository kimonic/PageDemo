package com.hisense.pagedemo.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.RVBean12Single;
import com.hisense.pagedemo.bean.RVBean12Single;
import com.hisense.pagedemo.ui.item.IndicatorView;
import com.hisense.pagedemo.ui.item.Shopping12View;

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
public class RVAdapter12Single extends BaseMultiItemQuickAdapter<RVBean12Single, BaseViewHolder> {


    private boolean isShowPosition = true;

    public RVAdapter12Single(List<RVBean12Single> data) {
        super(data);
        addItemType(RVBean12Single.TYPE_ONE, R.layout.rv_item1201);
        addItemType(RVBean12Single.TYPE_TWO, R.layout.rv_item1202_group);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean12Single item) {
        switch (helper.getItemViewType()) {

            case RVBean12Single.TYPE_ONE:

                Shopping12View shopping12View = helper.getView(R.id.sv_rvitem_1201);
                shopping12View.setGoodsImgUrl(item.getProductImageUrl());
                shopping12View.setGoodsName(item.getName());
                shopping12View.setOriginalPrice(item.getOriginalPrice());
                shopping12View.setPrice(item.getPrice());


                if (isShowPosition) {
                    shopping12View.setPosition("" + helper.getAdapterPosition());
                } else {
                    shopping12View.setPosition("");
                }
                break;
            case RVBean12Single.TYPE_TWO:
                LinearLayout linearLayout = helper.getView(R.id.ll_rvitem_1202);
                if (item.getIndicator() != null && linearLayout.getChildCount() != item.getIndicator().size()) {
                    linearLayout.removeAllViews();
                    List<String> indicator = item.getIndicator();
                    for (int i = 0; i < indicator.size(); i++) {
                        IndicatorView indicatorView = new IndicatorView(linearLayout.getContext());
                        if (i == 0) {
                            indicatorView.setIndicatorFlag(true);
                        }
                        indicatorView.setPositionInParent(i);
                        indicatorView.setContent(indicator.get(i));

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
