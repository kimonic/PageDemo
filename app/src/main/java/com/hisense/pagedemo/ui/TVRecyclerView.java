package com.hisense.pagedemo.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import com.hisense.pagedemo.R;


/**
 * * ================================================
 * name:            TVRecyclerView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/12
 * description：  自定义recyclerview
 * notice:   只适用于指定item为布局R.layout.rvitem_act_main的布局使用
 * introduce:
 * history：
 * ===================================================
 */
public class TVRecyclerView extends RecyclerView {
    public TVRecyclerView(@NonNull Context context) {
        this(context, null, 0);
    }

    public TVRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TVRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        //解决焦点在0位置时不能移动到recyclerview的顶部
        setOnScrollListener(new OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
                if (RecyclerView.SCROLL_STATE_IDLE == newState
                        && linearLayoutManager != null
                        && linearLayoutManager.findFirstVisibleItemPosition() == 0) {
                    boolean ll = false;
                    for (int i = 0; i < ((ViewGroup) getChildAt(0)).getChildCount(); i++) {
                        if (((ViewGroup) getChildAt(0)).getChildAt(i).isFocused()) {
                            ll = true;
                        }
                    }
                    if (ll) {
                        scrollToPosition(0);
                    }
                }

            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {

            }
        });
    }



    // TODO: 2018/11/15 ------------------初加载动画------------------------------------

    @Override
    protected int getChildDrawingOrder(int childCount, int i) {
        return super.getChildDrawingOrder(childCount, i);
    }

//    @Override
//    protected void dispatchDraw(Canvas canvas) {
//        super.dispatchDraw(canvas);
//    }
//    private Paint paint = new PaintBuilder().setColor(Color.BLUE).setStyle(Paint.Style.STROKE).setStrokeWidth(3).build();
//    private boolean isFirst = true;
//    private boolean isFirstF = true;
//    private List<RectF> list;
//
//    @Override
//    protected void dispatchDraw(Canvas canvas) {
//        super.dispatchDraw(canvas);
////        Log.e("Tag", "高度与宽度---------" + getWidth() + "getHeight-----" + getHeight());
////        Log.e("Tag", "高度与宽度---------1---" + ScreenUtils.getDensity(getContext()));
////        Log.e("Tag", "高度与宽度---------2---" + ScreenUtils.getDensityDpi(getContext()));
////        Log.e("Tag", "高度与宽度---------3---" + ScreenUtils.getScreenHeight(getContext()));
////        Log.e("Tag", "高度与宽度---------4---" + ScreenUtils.getScreenWidth(getContext()));
////        canvas.drawCircle(100, 100, 100, paint);
//        if (isFirst){
//            initFirst();
//            animateM(canvas);
//            isFirst=false;
//        }
//        if (isFirstF){
//            canvas.save();
//            canvas.translate(0,10*count);
//            for (int i = 0; i < list.size(); i++) {
//                canvas.drawRect(list.get(i),paint);
//            }
//            canvas.restore();
//
//        }
//
//    }
//
//    private int count=20;
//    private void animateM(Canvas canvas){
//        SingleThreadUtils.getInstance().execute(new Runnable() {
//            @Override
//            public void run() {
//                while (isFirstF){
//                    count--;
//                    try {
//                        Thread.sleep(60);
//                        if (count==0){
//                            isFirstF=false;
//                            postInvalidate();
//                            break;
//                        }
//                        postInvalidate();
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//    }
//
//    private void initFirst() {//时机宽度344
//        list = new ArrayList<>();
//        int width = getWidth();
//        int rectWidth = (width - 120) / 5;
//        int rectHeight = rectWidth / 18 * 13;
//        int rectStartX = 10 * 2;
//        for (int i = 0; i < 15; i++) {
//            //去除宽度100*2后除以5即为rect宽度,宽高比为18:13
//            //上方去除高度为3*2
//            RectF rectF = new RectF();
//            rectF.left = rectStartX + (10 * 2 + rectWidth) * (i % 5);
//            rectF.right = rectF.left + rectWidth;
//            if (i<5){
//                rectF.top = 6 ;
//                rectF.bottom = rectF.top + rectHeight;
//            }else if (i<10){
//                rectF.top = 6 + (6 + rectHeight);
//                rectF.bottom = rectF.top + rectHeight;
//            }else {
//                rectF.top = 6 + (6 + rectHeight) *2;
//                rectF.bottom = rectF.top + rectHeight;
//            }
//            list.add(rectF);
//        }
//
//    }


    // TODO: 2018/11/15 ------------------初加载动画------------------------------------

//    /**
//     * 自定义焦点变化
//     */
//    @Override
//    public View focusSearch(View focused, int direction) {
//        View view = super.focusSearch(focused, direction);
//        switch (direction) {
//            case View.FOCUS_RIGHT:
//                if (focused.getId() == R.id.miv_rvitem_act_main_5) {
//                    View view1 = super.focusSearch(focused, View.FOCUS_DOWN);
//                    if (view1 == null) {
//                        if (view == null && listener != null) {
//                            listener.loadMore();
//                        }
//                        return focused;
//                    } else if (view1 instanceof ConstraintLayout) {
//                        return ((ConstraintLayout) view1).getChildAt(0);
//                    } else if (view1 instanceof MovieInfoView) {
//                        return ((ViewGroup) (view1.getParent())).getChildAt(0);
//                    }
//                }
//            case View.FOCUS_DOWN:
//                //加载更多的时机
//                if (view == null && listener != null) {
//                    listener.loadMore();
//                    return focused;
//                }
//                if (view instanceof ConstraintLayout) {
//                    return view.findViewById(focused.getId());
//                }
//                break;
//            case View.FOCUS_UP:
//                if (view instanceof ConstraintLayout) {
//                    return view.findViewById(focused.getId());
//                }
//                break;
//        }
//
//        return view;
//
//    }

    private LoadMoreListener listener;

    public void setLoadMoreListener(LoadMoreListener listener) {
        this.listener = listener;
    }

    public interface LoadMoreListener {
        void loadMore();
    }
}
