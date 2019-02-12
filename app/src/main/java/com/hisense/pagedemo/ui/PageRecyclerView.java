package com.hisense.pagedemo.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;

import com.hisense.pagedemo.utils.LUtils;
import com.hisense.pagedemo.utils.LogUtils;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

/**
 * * ================================================
 * name:            TvRecyclerViewCommon
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/22
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class PageRecyclerView extends CopyRecyclerViewN {
    public PageRecyclerView(Context context) {
        this(context, null, 0);
    }

    public PageRecyclerView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PageRecyclerView(Context context, @Nullable AttributeSet attrs,
                            int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {

                Log.e("dingzhixin","onGlobalLayout执行------------------------hisense111");
            }
        });
        getViewTreeObserver().addOnDrawListener(new ViewTreeObserver.OnDrawListener() {
            @Override
            public void onDraw() {
                Log.e("dingzhixin","onDraw执行------------------------hisense111");

            }
        });
        getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public void onGlobalFocusChanged(View oldFocus, View newFocus) {
                Log.e("dingzhixin","onGlobalFocusChanged执行-----oldFocus-------hisense111------------"+oldFocus);
                Log.e("dingzhixin","onGlobalFocusChanged执行-------newFocus---------hisense111--------"+newFocus);

            }
        });
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                Log.e("dingzhixin","onPreDraw执行------------------------hisense111");
                return true;
            }
        });
        getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public void onWindowFocusChanged(boolean hasFocus) {
                Log.e("dingzhixin","onWindowFocusChanged执行------hasFocus----hisense111--------------"+hasFocus);

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

    private ArrayList<View>  viewsFocus;
    @Override
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        super.addFocusables(views, direction, focusableMode);
        if (viewsFocus==null){
            viewsFocus=new ArrayList<>();
        }
        viewsFocus.clear();
        viewsFocus.addAll(views);
        LUtils.e(getClass(),"viewFocus的大小--addFocusables----"
                +viewsFocus.size());
    }

    @Override
    public int getDescendantFocusability() {
        if (viewsFocus!=null)
            LUtils.e(getClass(),"viewFocus的大小--getDescendantFocusability----"
        +viewsFocus.size());
        return super.getDescendantFocusability();
    }

    public ArrayList<View> getViewsFocus() {
        return viewsFocus;
    }

    public void setViewsFocus(ArrayList<View> viewsFocus) {
        this.viewsFocus = viewsFocus;
    }

    public View mFocusSearch(View focused, int direction) {
        return super.focusSearch(focused, direction);
    }

    private FocusSearchListener focusSearchListener;

    public void setFocusSearchListener(FocusSearchListener focusSearchListener) {
        this.focusSearchListener = focusSearchListener;
    }

    public interface FocusSearchListener {
        View focusSearch(View focused, View nextFocused, int direction);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float scaleX = 1f - 35f / getWidth();
        canvas.save();
        canvas.scale(scaleX, 1, getWidth() / 2, 0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    //----------------------------------------------处理长按事件----------------------------------------
    private long startTime=0;


    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        switch (event.getAction()) {
            case KeyEvent.ACTION_DOWN:
                //间隔300ms时焦点基本不会乱掉
                if (System.currentTimeMillis()-startTime<150){
                    return true;
                }else {
                    startTime=System.currentTimeMillis();
                }
                break;
            case KeyEvent.ACTION_UP:
                break;

        }
        return super.dispatchKeyEvent(event);
    }
//----------------------------------------------处理长按事件----------------------------------------



}
