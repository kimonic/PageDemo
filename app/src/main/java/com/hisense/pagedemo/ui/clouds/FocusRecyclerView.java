package com.hisense.pagedemo.ui.clouds;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;

import com.bumptech.glide.Glide;
import com.hisense.pagedemo.utils.LogUtils;

import java.util.ArrayList;

/**
 * * ================================================
 * name:            FocusRecyclerView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/19
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class FocusRecyclerView extends RecyclerView {
    public FocusRecyclerView(Context context) {
        this(context, null, 0);
    }

    public FocusRecyclerView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FocusRecyclerView(Context context, @Nullable AttributeSet attrs,
                             int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private int width = 0, height = 0;

    private void init() {
        //滚动过程中glide暂停加载
        addOnScrollListener(new OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                switch (newState) {
                    case SCROLL_STATE_IDLE:
                        try {
                            Glide.with(getContext()).resumeRequests();
                        } catch (Exception e) {
                            Log.e("测试专用", "recyclerview滑动监听出错---001---");
                        }
                        break;
                    case SCROLL_STATE_DRAGGING:
                        try {
                            Glide.with(getContext()).pauseRequests();
                        } catch (Exception e) {
                            Log.e("测试专用", "recyclerview滑动监听出错---002---");
                        }
                        break;
                    case SCROLL_STATE_SETTLING:
                        try {
                            Glide.with(getContext()).pauseRequests();
                        } catch (Exception e) {
                            Log.e("测试专用", "recyclerview滑动监听出错---003---");
                        }
                        break;
                }
            }
        });

        //刷新适配器时防止焦点丢失,将焦点锁定在recyclerview内
        getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public void onGlobalFocusChanged(View oldFocus, View newFocus) {
                if (oldFocus!=null&&newFocus==null){
                    oldFocus.requestFocus();
                }
            }
        });

    }


    @Override
    public View focusSearch(View focused, int direction) {
        if (focusSearchListener != null) {
            return focusSearchListener.focusSearch(focused, super.focusSearch(focused, direction), direction);
        }
        return super.focusSearch(focused, direction);
    }


    public View superFocusSearch(View focused, int direction) {
        return super.focusSearch(focused, direction);
    }

    private FocusSearchListener focusSearchListener;

    public void setFocusSearchListener(
            FocusSearchListener focusSearchListener) {
        this.focusSearchListener = focusSearchListener;
    }

    public interface FocusSearchListener {
        View focusSearch(View focused, View nextFocused, int direction);
    }


    //----------------------------------------------处理长按事件----------------------------------------
//    private long startTime=0;
//
//
//    @Override
//    public boolean dispatchKeyEvent(KeyEvent event) {
//        switch (event.getAction()) {
//            case KeyEvent.ACTION_DOWN:
//                //间隔300ms时焦点基本不会乱掉
//                if (System.currentTimeMillis()-startTime<150){
//                    return true;
//                }else {
//                    startTime=System.currentTimeMillis();
//                }
//                break;
//            case KeyEvent.ACTION_UP:
//                break;
//
//        }
//        return super.dispatchKeyEvent(event);
//    }
//----------------------------------------------处理长按事件----------------------------------------


}
