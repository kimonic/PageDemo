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
import com.hisense.pagedemo.bean.RVBean12;
import com.hisense.pagedemo.ui.item.IndicatorView;

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
public class RVAdapter12 extends BaseMultiItemQuickAdapter<RVBean12, BaseViewHolder> {


    private boolean isShowPosition = true;

    public RVAdapter12(List<RVBean12> data) {
        super(data);
        addItemType(RVBean12.TYPE_ONE, R.layout.rv_item1201_group);
        addItemType(RVBean12.TYPE_TWO, R.layout.rv_item1202_group);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean12 item) {
        switch (helper.getItemViewType()) {

            case RVBean12.TYPE_ONE:

                ImageView imageView = helper.getView(R.id.iv_rvitem_1201_group_goodsimag);
                Glide.with(imageView).load(item.getProductImageUrl())
                        .apply(RequestOptions.bitmapTransform(new FitCenter()))
                        .into(imageView);

                ((TextView) (helper.getView(R.id.tv_rvitem_1201_group_goodsname))).setText(item.getName());
                ((TextView) (helper.getView(R.id.tv_rvitem_1201_group_originalprice))).setText(item.getOriginalPrice());
                ((TextView) (helper.getView(R.id.tv_rvitem_1201_group_price))).setText(item.getPrice());


                if (isShowPosition) {
                    ((TextView) (helper.getView(R.id.tv_rvitem_1201_group_position)))
                            .setText(("" + helper.getAdapterPosition()));
                } else {
                    ((TextView) (helper.getView(R.id.tv_rvitem_1201_group_position)))
                            .setText("");
                }
                break;
            case RVBean12.TYPE_TWO:
                LinearLayout linearLayout=helper.getView(R.id.ll_rvitem_1202);
                if (item.getIndicator()!=null&&linearLayout.getChildCount()!=item.getIndicator().size()){
                    linearLayout.removeAllViews();
                    List<String> indicator=item.getIndicator();
                    for (int i = 0; i < indicator.size(); i++) {
                        IndicatorView indicatorView=new IndicatorView(linearLayout.getContext());
                        if (i==0){
                            indicatorView.setIndicatorFlag(true);
                        }
                        indicatorView.setPositionInParent(i);
                        indicatorView.setContent(indicator.get(i));

                        //焦点变化监听
                        indicatorView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                            @Override
                            public void onFocusChange(View v, boolean hasFocus) {
                                if (listener!=null){
                                    listener.onFocusChange(v,hasFocus);
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

    public interface FocusChangeListener{
        void onFocusChange(View v, boolean hasFocus);
    }
}
