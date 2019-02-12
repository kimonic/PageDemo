package com.hisense.pagedemo.ui;

import android.animation.LayoutTransition;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerViewAccessibilityDelegate;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Display;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LayoutAnimationController;
import android.view.animation.Transformation;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

import com.hisense.pagedemo.utils.LUtils;

import java.util.ArrayList;
import java.util.Collection;

/**
 * * ================================================
 * name:            CopyRecyclerView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2019/1/15
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class CopyRecyclerViewN extends RecyclerView {
    public CopyRecyclerViewN(@NonNull Context context) {
        super(context);
        LUtils.e(getClass(), "");
    }

    public CopyRecyclerViewN(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LUtils.e(getClass(), "");
    }

    public CopyRecyclerViewN(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LUtils.e(getClass(), "");
    }

    @Nullable
    @Override
    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        LUtils.e(getClass(), "");
        return super.getCompatAccessibilityDelegate();
    }

    @Override
    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate accessibilityDelegate) {
        LUtils.e(getClass(), "");
        super.setAccessibilityDelegateCompat(accessibilityDelegate);
    }

    @Override
    public void setHasFixedSize(boolean hasFixedSize) {
        LUtils.e(getClass(), "");
        super.setHasFixedSize(hasFixedSize);
    }

    @Override
    public boolean hasFixedSize() {
        LUtils.e(getClass(), "");
        return super.hasFixedSize();
    }

    @Override
    public void setClipToPadding(boolean clipToPadding) {
        LUtils.e(getClass(), "");
        super.setClipToPadding(clipToPadding);
    }

    @Override
    public boolean getClipToPadding() {
        LUtils.e(getClass(), "");
        return super.getClipToPadding();
    }

    @Override
    public void setScrollingTouchSlop(int slopConstant) {
        LUtils.e(getClass(), "");
        super.setScrollingTouchSlop(slopConstant);
    }

    @Override
    public void swapAdapter(@Nullable Adapter adapter, boolean removeAndRecycleExistingViews) {
        LUtils.e(getClass(), "");
        super.swapAdapter(adapter, removeAndRecycleExistingViews);
    }

    @Override
    public void setAdapter(@Nullable Adapter adapter) {
        LUtils.e(getClass(), "");
        super.setAdapter(adapter);
    }

    @Nullable
    @Override
    public Adapter getAdapter() {
        LUtils.e(getClass(), "");
        return super.getAdapter();
    }

    @Override
    public void setRecyclerListener(@Nullable RecyclerListener listener) {
        LUtils.e(getClass(), "");
        super.setRecyclerListener(listener);
    }

    @Override
    public int getBaseline() {
        LUtils.e(getClass(), "");
        return super.getBaseline();
    }

    @Override
    public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener listener) {
        LUtils.e(getClass(), "");
        super.addOnChildAttachStateChangeListener(listener);
    }

    @Override
    public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener listener) {
        LUtils.e(getClass(), "");
        super.removeOnChildAttachStateChangeListener(listener);
    }

    @Override
    public void clearOnChildAttachStateChangeListeners() {
        LUtils.e(getClass(), "");
        super.clearOnChildAttachStateChangeListeners();
    }

    @Override
    public void setLayoutManager(@Nullable LayoutManager layout) {
        LUtils.e(getClass(), "");
        super.setLayoutManager(layout);
    }

    @Override
    public void setOnFlingListener(@Nullable OnFlingListener onFlingListener) {
        LUtils.e(getClass(), "");
        super.setOnFlingListener(onFlingListener);
    }

    @Nullable
    @Override
    public OnFlingListener getOnFlingListener() {
        LUtils.e(getClass(), "");
        return super.getOnFlingListener();
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        LUtils.e(getClass(), "");
        return super.onSaveInstanceState();
    }

    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        LUtils.e(getClass(), "");
        super.onRestoreInstanceState(state);
    }

    @Override
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        LUtils.e(getClass(), "");
        super.dispatchSaveInstanceState(container);
    }

    @Override
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        LUtils.e(getClass(), "");
        super.dispatchRestoreInstanceState(container);
    }

    @Nullable
    @Override
    public LayoutManager getLayoutManager() {
        LUtils.e(getClass(), "");
        return super.getLayoutManager();
    }

    @NonNull
    @Override
    public RecycledViewPool getRecycledViewPool() {
        LUtils.e(getClass(), "");
        return super.getRecycledViewPool();
    }

    @Override
    public void setRecycledViewPool(@Nullable RecycledViewPool pool) {
        LUtils.e(getClass(), "");
        super.setRecycledViewPool(pool);
    }

    @Override
    public void setViewCacheExtension(@Nullable ViewCacheExtension extension) {
        LUtils.e(getClass(), "");
        super.setViewCacheExtension(extension);
    }

    @Override
    public void setItemViewCacheSize(int size) {
        LUtils.e(getClass(), "");
        super.setItemViewCacheSize(size);
    }

    @Override
    public int getScrollState() {
        LUtils.e(getClass(), "");
        return super.getScrollState();
    }

    @Override
    public void addItemDecoration(@NonNull ItemDecoration decor, int index) {
        LUtils.e(getClass(), "");
        super.addItemDecoration(decor, index);
    }

    @Override
    public void addItemDecoration(@NonNull ItemDecoration decor) {
        LUtils.e(getClass(), "");
        super.addItemDecoration(decor);
    }

    @NonNull
    @Override
    public ItemDecoration getItemDecorationAt(int index) {
        LUtils.e(getClass(), "");
        return super.getItemDecorationAt(index);
    }

    @Override
    public int getItemDecorationCount() {
        LUtils.e(getClass(), "");
        return super.getItemDecorationCount();
    }

    @Override
    public void removeItemDecorationAt(int index) {
        LUtils.e(getClass(), "");
        super.removeItemDecorationAt(index);
    }

    @Override
    public void removeItemDecoration(@NonNull ItemDecoration decor) {
        LUtils.e(getClass(), "");
        super.removeItemDecoration(decor);
    }

    @Override
    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback childDrawingOrderCallback) {
        LUtils.e(getClass(), "");
        super.setChildDrawingOrderCallback(childDrawingOrderCallback);
    }

    @Override
    public void setOnScrollListener(@Nullable OnScrollListener listener) {
        LUtils.e(getClass(), "");
        super.setOnScrollListener(listener);
    }

    @Override
    public void addOnScrollListener(@NonNull OnScrollListener listener) {
        LUtils.e(getClass(), "");
        super.addOnScrollListener(listener);
    }

    @Override
    public void removeOnScrollListener(@NonNull OnScrollListener listener) {
        LUtils.e(getClass(), "");
        super.removeOnScrollListener(listener);
    }

    @Override
    public void clearOnScrollListeners() {
        LUtils.e(getClass(), "");
        super.clearOnScrollListeners();
    }

    @Override
    public void scrollToPosition(int position) {
        LUtils.e(getClass(), "");
        super.scrollToPosition(position);
    }

    @Override
    public void smoothScrollToPosition(int position) {
        LUtils.e(getClass(), "");
        super.smoothScrollToPosition(position);
    }

    @Override
    public void scrollTo(int x, int y) {
        LUtils.e(getClass(), "");
        super.scrollTo(x, y);
    }

    @Override
    public void scrollBy(int x, int y) {
        LUtils.e(getClass(), "");
        super.scrollBy(x, y);
    }

    @Override
    public int computeHorizontalScrollOffset() {
        LUtils.e(getClass(), "");
        return super.computeHorizontalScrollOffset();
    }

    @Override
    public int computeHorizontalScrollExtent() {
        LUtils.e(getClass(), "");
        return super.computeHorizontalScrollExtent();
    }

    @Override
    public int computeHorizontalScrollRange() {
        LUtils.e(getClass(), "");
        return super.computeHorizontalScrollRange();
    }

    @Override
    public int computeVerticalScrollOffset() {
        LUtils.e(getClass(), "");
        return super.computeVerticalScrollOffset();
    }

    @Override
    public int computeVerticalScrollExtent() {
        LUtils.e(getClass(), "");
        return super.computeVerticalScrollExtent();
    }

    @Override
    public int computeVerticalScrollRange() {
        LUtils.e(getClass(), "");
        return super.computeVerticalScrollRange();
    }

    @Override
    public void setLayoutFrozen(boolean frozen) {
        LUtils.e(getClass(), "");
        super.setLayoutFrozen(frozen);
    }

    @Override
    public boolean isLayoutFrozen() {
        LUtils.e(getClass(), "");
        return super.isLayoutFrozen();
    }

    @Override
    public void smoothScrollBy(int dx, int dy) {
        LUtils.e(getClass(), "");
        super.smoothScrollBy(dx, dy);
    }

    @Override
    public void smoothScrollBy(int dx, int dy, @Nullable Interpolator interpolator) {
        LUtils.e(getClass(), "");
        super.smoothScrollBy(dx, dy, interpolator);
    }

    @Override
    public boolean fling(int velocityX, int velocityY) {
        LUtils.e(getClass(), "");
        return super.fling(velocityX, velocityY);
    }

    @Override
    public void stopScroll() {
        LUtils.e(getClass(), "");
        super.stopScroll();
    }

    @Override
    public int getMinFlingVelocity() {
        LUtils.e(getClass(), "");
        return super.getMinFlingVelocity();
    }

    @Override
    public int getMaxFlingVelocity() {
        LUtils.e(getClass(), "");
        return super.getMaxFlingVelocity();
    }

    @Override
    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        LUtils.e(getClass(), "");
        super.setEdgeEffectFactory(edgeEffectFactory);
    }

    @NonNull
    @Override
    public EdgeEffectFactory getEdgeEffectFactory() {
        LUtils.e(getClass(), "");
        return super.getEdgeEffectFactory();
    }

    @Override
    public View focusSearch(View focused, int direction) {
        LUtils.e(getClass(), "");
        return super.focusSearch(focused, direction);
    }

    @Override
    public void requestChildFocus(View child, View focused) {
        LUtils.e(getClass(), "");
        super.requestChildFocus(child, focused);
    }

    @Override
    public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate) {
        LUtils.e(getClass(), "");
        return super.requestChildRectangleOnScreen(child, rect, immediate);
    }

    @Override
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        LUtils.e(getClass(), "");
        super.addFocusables(views, direction, focusableMode);
    }

    @Override
    protected boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        LUtils.e(getClass(), "");
        return super.onRequestFocusInDescendants(direction, previouslyFocusedRect);
    }

    @Override
    protected void onAttachedToWindow() {
        LUtils.e(getClass(), "");
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        LUtils.e(getClass(), "");
        super.onDetachedFromWindow();
    }

    @Override
    public boolean isAttachedToWindow() {
        LUtils.e(getClass(), "");
        return super.isAttachedToWindow();
    }

    @Override
    public void addOnItemTouchListener(@NonNull OnItemTouchListener listener) {
        LUtils.e(getClass(), "");
        super.addOnItemTouchListener(listener);
    }

    @Override
    public void removeOnItemTouchListener(@NonNull OnItemTouchListener listener) {
        LUtils.e(getClass(), "");
        super.removeOnItemTouchListener(listener);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent e) {
        LUtils.e(getClass(), "");
        return super.onInterceptTouchEvent(e);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        LUtils.e(getClass(), "");
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        LUtils.e(getClass(), "");
        return super.onTouchEvent(e);
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        LUtils.e(getClass(), "");
        return super.onGenericMotionEvent(event);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        LUtils.e(getClass(), "");
        super.onMeasure(widthSpec, heightSpec);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        LUtils.e(getClass(), "");
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    public void setItemAnimator(@Nullable ItemAnimator animator) {
        LUtils.e(getClass(), "");
        super.setItemAnimator(animator);
    }

    @Override
    public boolean isComputingLayout() {
        LUtils.e(getClass(), "");
        return super.isComputingLayout();
    }

    @Override
    public void sendAccessibilityEventUnchecked(AccessibilityEvent event) {
        LUtils.e(getClass(), "");
        super.sendAccessibilityEventUnchecked(event);
    }

    @Nullable
    @Override
    public ItemAnimator getItemAnimator() {
        LUtils.e(getClass(), "");
        return super.getItemAnimator();
    }

    @Override
    protected void removeDetachedView(View child, boolean animate) {
        LUtils.e(getClass(), "");
        super.removeDetachedView(child, animate);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        LUtils.e(getClass(), "");
        super.onLayout(changed, l, t, r, b);
    }

    @Override
    public void requestLayout() {
        LUtils.e(getClass(), "");
        super.requestLayout();
    }

    @Override
    public void draw(Canvas c) {
        LUtils.e(getClass(), "");
        super.draw(c);
    }

    @Override
    public void onDraw(Canvas c) {
        LUtils.e(getClass(), "?????");
        super.onDraw(c);
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        LUtils.e(getClass(), "");
        return super.checkLayoutParams(p);
    }

    @Override
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LUtils.e(getClass(), "");
        return super.generateDefaultLayoutParams();
    }

    @Override
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        LUtils.e(getClass(), "");
        return super.generateLayoutParams(attrs);
    }

    @Override
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        LUtils.e(getClass(), "");
        return super.generateLayoutParams(p);
    }

    @Override
    public boolean isAnimating() {
        LUtils.e(getClass(), "");
        return super.isAnimating();
    }

    @Override
    public void invalidateItemDecorations() {
        LUtils.e(getClass(), "");
        super.invalidateItemDecorations();
    }

    @Override
    public boolean getPreserveFocusAfterLayout() {
        LUtils.e(getClass(), "");
        return super.getPreserveFocusAfterLayout();
    }

    @Override
    public void setPreserveFocusAfterLayout(boolean preserveFocusAfterLayout) {
        LUtils.e(getClass(), "");
        super.setPreserveFocusAfterLayout(preserveFocusAfterLayout);
    }

    @Override
    public ViewHolder getChildViewHolder(@NonNull View child) {
        LUtils.e(getClass(), "");
        return super.getChildViewHolder(child);
    }

    @Nullable
    @Override
    public View findContainingItemView(@NonNull View view) {
        LUtils.e(getClass(), "");
        return super.findContainingItemView(view);
    }

    @Nullable
    @Override
    public ViewHolder findContainingViewHolder(@NonNull View view) {
        LUtils.e(getClass(), "");
        return super.findContainingViewHolder(view);
    }

    @Override
    public int getChildPosition(@NonNull View child) {
        LUtils.e(getClass(), "");
        return super.getChildPosition(child);
    }

    @Override
    public int getChildAdapterPosition(@NonNull View child) {
        LUtils.e(getClass(), "");
        return super.getChildAdapterPosition(child);
    }

    @Override
    public int getChildLayoutPosition(@NonNull View child) {
        LUtils.e(getClass(), "");
        return super.getChildLayoutPosition(child);
    }

    @Override
    public long getChildItemId(@NonNull View child) {
        LUtils.e(getClass(), "");
        return super.getChildItemId(child);
    }

    @Nullable
    @Override
    public ViewHolder findViewHolderForPosition(int position) {
        LUtils.e(getClass(), "");
        return super.findViewHolderForPosition(position);
    }

    @Nullable
    @Override
    public ViewHolder findViewHolderForLayoutPosition(int position) {
        LUtils.e(getClass(), "");
        return super.findViewHolderForLayoutPosition(position);
    }

    @Nullable
    @Override
    public ViewHolder findViewHolderForAdapterPosition(int position) {
        LUtils.e(getClass(), "");
        return super.findViewHolderForAdapterPosition(position);
    }

    @Override
    public ViewHolder findViewHolderForItemId(long id) {
        LUtils.e(getClass(), "");
        return super.findViewHolderForItemId(id);
    }

    @Nullable
    @Override
    public View findChildViewUnder(float x, float y) {
        LUtils.e(getClass(), "");
        return super.findChildViewUnder(x, y);
    }

    @Override
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        LUtils.e(getClass(), "");
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override
    public void offsetChildrenVertical(int dy) {
        LUtils.e(getClass(), "");
        super.offsetChildrenVertical(dy);
    }

    @Override
    public void onChildAttachedToWindow(@NonNull View child) {
        LUtils.e(getClass(), "");
        super.onChildAttachedToWindow(child);
    }

    @Override
    public void onChildDetachedFromWindow(@NonNull View child) {
        LUtils.e(getClass(), "");
        super.onChildDetachedFromWindow(child);
    }

    @Override
    public void offsetChildrenHorizontal(int dx) {
        LUtils.e(getClass(), "");
        super.offsetChildrenHorizontal(dx);
    }

    @Override
    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect outBounds) {
        LUtils.e(getClass(), "");
        super.getDecoratedBoundsWithMargins(view, outBounds);
    }

    @Override
    public void onScrolled(int dx, int dy) {
        LUtils.e(getClass(), "");
        super.onScrolled(dx, dy);
    }

    @Override
    public void onScrollStateChanged(int state) {
        LUtils.e(getClass(), "");
        super.onScrollStateChanged(state);
    }

    @Override
    public boolean hasPendingAdapterUpdates() {
        LUtils.e(getClass(), "");
        return super.hasPendingAdapterUpdates();
    }

    @Override
    public void setNestedScrollingEnabled(boolean enabled) {
        LUtils.e(getClass(), "");
        super.setNestedScrollingEnabled(enabled);
    }

    @Override
    public boolean isNestedScrollingEnabled() {
        LUtils.e(getClass(), "");
        return super.isNestedScrollingEnabled();
    }

    @Override
    public boolean startNestedScroll(int axes) {
        LUtils.e(getClass(), "");
        return super.startNestedScroll(axes);
    }

    @Override
    public boolean startNestedScroll(int axes, int type) {
        LUtils.e(getClass(), "");
        return super.startNestedScroll(axes, type);
    }

    @Override
    public void stopNestedScroll() {
        LUtils.e(getClass(), "");
        super.stopNestedScroll();
    }

    @Override
    public void stopNestedScroll(int type) {
        LUtils.e(getClass(), "");
        super.stopNestedScroll(type);
    }

    @Override
    public boolean hasNestedScrollingParent() {
        LUtils.e(getClass(), "");
        return super.hasNestedScrollingParent();
    }

    @Override
    public boolean hasNestedScrollingParent(int type) {
        LUtils.e(getClass(), "");
        return super.hasNestedScrollingParent(type);
    }

    @Override
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        LUtils.e(getClass(), "");
        return super.dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    @Override
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        LUtils.e(getClass(), "");
        return super.dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    @Override
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        LUtils.e(getClass(), "");
        return super.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow);
    }

    @Override
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        LUtils.e(getClass(), "");
        return super.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow, type);
    }

    @Override
    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        LUtils.e(getClass(), "");
        return super.dispatchNestedFling(velocityX, velocityY, consumed);
    }

    @Override
    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        LUtils.e(getClass(), "");
        return super.dispatchNestedPreFling(velocityX, velocityY);
    }

    @Override
    protected int getChildDrawingOrder(int childCount, int i) {
        LUtils.e(getClass(), "");
        return super.getChildDrawingOrder(childCount, i);
    }

    @Override
    public int getDescendantFocusability() {
        LUtils.e(getClass(), "");
        return super.getDescendantFocusability();
    }

    @Override
    public void setDescendantFocusability(int focusability) {
        LUtils.e(getClass(), "");
        super.setDescendantFocusability(focusability);
    }

    @Override
    public void focusableViewAvailable(View v) {
        LUtils.e(getClass(), "");
        super.focusableViewAvailable(v);
    }

    @Override
    public boolean showContextMenuForChild(View originalView) {
        LUtils.e(getClass(), "");
        return super.showContextMenuForChild(originalView);
    }

    @Override
    public boolean showContextMenuForChild(View originalView, float x, float y) {
        LUtils.e(getClass(), "");
        return super.showContextMenuForChild(originalView, x, y);
    }

    @Override
    public ActionMode startActionModeForChild(View originalView, ActionMode.Callback callback) {
        LUtils.e(getClass(), "");
        return super.startActionModeForChild(originalView, callback);
    }

    @Override
    public ActionMode startActionModeForChild(View originalView, ActionMode.Callback callback, int type) {
        LUtils.e(getClass(), "");
        return super.startActionModeForChild(originalView, callback, type);
    }

    @Override
    public boolean requestSendAccessibilityEvent(View child, AccessibilityEvent event) {
        LUtils.e(getClass(), "");
        return super.requestSendAccessibilityEvent(child, event);
    }

    @Override
    public boolean onRequestSendAccessibilityEvent(View child, AccessibilityEvent event) {
        LUtils.e(getClass(), "");
        return super.onRequestSendAccessibilityEvent(child, event);
    }

    @Override
    public void childHasTransientStateChanged(View child, boolean childHasTransientState) {
        LUtils.e(getClass(), "");
        super.childHasTransientStateChanged(child, childHasTransientState);
    }

    @Override
    public boolean hasTransientState() {
        LUtils.e(getClass(), "");
        return super.hasTransientState();
    }

    @Override
    public boolean dispatchUnhandledMove(View focused, int direction) {
        LUtils.e(getClass(), "");
        return super.dispatchUnhandledMove(focused, direction);
    }

    @Override
    public void clearChildFocus(View child) {
        LUtils.e(getClass(), "");
        super.clearChildFocus(child);
    }

    @Override
    public void clearFocus() {
        LUtils.e(getClass(), "");
        super.clearFocus();
    }

    @Override
    public View getFocusedChild() {
        LUtils.e(getClass(), "");
        return super.getFocusedChild();
    }

    @Override
    public boolean hasFocus() {
        LUtils.e(getClass(), "");
        return super.hasFocus();
    }

    @Override
    public View findFocus() {
        LUtils.e(getClass(), "");
        return super.findFocus();
    }

    @Override
    public void addKeyboardNavigationClusters(Collection<View> views, int direction) {
        LUtils.e(getClass(), "");
        super.addKeyboardNavigationClusters(views, direction);
    }

    @Override
    public void setTouchscreenBlocksFocus(boolean touchscreenBlocksFocus) {
        LUtils.e(getClass(), "");
        super.setTouchscreenBlocksFocus(touchscreenBlocksFocus);
    }

    @Override
    public boolean getTouchscreenBlocksFocus() {
        LUtils.e(getClass(), "");
        return super.getTouchscreenBlocksFocus();
    }

    @Override
    public void findViewsWithText(ArrayList<View> outViews, CharSequence text, int flags) {
        LUtils.e(getClass(), "");
        super.findViewsWithText(outViews, text, flags);
    }

    @Override
    public void dispatchWindowFocusChanged(boolean hasFocus) {
        LUtils.e(getClass(), "");
        super.dispatchWindowFocusChanged(hasFocus);
    }

    @Override
    public void addTouchables(ArrayList<View> views) {
        LUtils.e(getClass(), "");
        super.addTouchables(views);
    }

    @Override
    public void dispatchDisplayHint(int hint) {
        LUtils.e(getClass(), "");
        super.dispatchDisplayHint(hint);
    }

    @Override
    protected void dispatchVisibilityChanged(View changedView, int visibility) {
        LUtils.e(getClass(), "");
        super.dispatchVisibilityChanged(changedView, visibility);
    }

    @Override
    public void dispatchWindowVisibilityChanged(int visibility) {
        LUtils.e(getClass(), "");
        super.dispatchWindowVisibilityChanged(visibility);
    }

    @Override
    public void dispatchConfigurationChanged(Configuration newConfig) {
        LUtils.e(getClass(), "");
        super.dispatchConfigurationChanged(newConfig);
    }

    @Override
    public void recomputeViewAttributes(View child) {
        LUtils.e(getClass(), "");
        super.recomputeViewAttributes(child);
    }

    @Override
    public void bringChildToFront(View child) {
        LUtils.e(getClass(), "");
        super.bringChildToFront(child);
    }

    @Override
    public boolean dispatchDragEvent(DragEvent event) {
        LUtils.e(getClass(), "");
        return super.dispatchDragEvent(event);
    }

    @Override
    public void dispatchWindowSystemUiVisiblityChanged(int visible) {
        LUtils.e(getClass(), "");
        super.dispatchWindowSystemUiVisiblityChanged(visible);
    }

    @Override
    public void dispatchSystemUiVisibilityChanged(int visible) {
        LUtils.e(getClass(), "");
        super.dispatchSystemUiVisibilityChanged(visible);
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent event) {
        LUtils.e(getClass(), "");
        return super.dispatchKeyEventPreIme(event);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        LUtils.e(getClass(), "");
        return super.dispatchKeyEvent(event);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        LUtils.e(getClass(), "");
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent event) {
        LUtils.e(getClass(), "");
        return super.dispatchTrackballEvent(event);
    }

    @Override
    public boolean dispatchCapturedPointerEvent(MotionEvent event) {
        LUtils.e(getClass(), "");
        return super.dispatchCapturedPointerEvent(event);
    }

    @Override
    public void dispatchPointerCaptureChanged(boolean hasCapture) {
        LUtils.e(getClass(), "");
        super.dispatchPointerCaptureChanged(hasCapture);
    }

    @Override
    public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
        LUtils.e(getClass(), "");
        return super.onResolvePointerIcon(event, pointerIndex);
    }

    @Override
    protected boolean dispatchHoverEvent(MotionEvent event) {
        LUtils.e(getClass(), "");
        return super.dispatchHoverEvent(event);
    }

    @Override
    public void addChildrenForAccessibility(ArrayList<View> outChildren) {
        LUtils.e(getClass(), "");
        super.addChildrenForAccessibility(outChildren);
    }

    @Override
    public boolean onInterceptHoverEvent(MotionEvent event) {
        LUtils.e(getClass(), "");
        return super.onInterceptHoverEvent(event);
    }

    @Override
    protected boolean dispatchGenericPointerEvent(MotionEvent event) {
        LUtils.e(getClass(), "");
        return super.dispatchGenericPointerEvent(event);
    }

    @Override
    protected boolean dispatchGenericFocusedEvent(MotionEvent event) {
        LUtils.e(getClass(), "");
        return super.dispatchGenericFocusedEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        LUtils.e(getClass(), "");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public void setMotionEventSplittingEnabled(boolean split) {
        LUtils.e(getClass(), "");
        super.setMotionEventSplittingEnabled(split);
    }

    @Override
    public boolean isMotionEventSplittingEnabled() {
        LUtils.e(getClass(), "");
        return super.isMotionEventSplittingEnabled();
    }

    @Override
    public boolean isTransitionGroup() {
        LUtils.e(getClass(), "");
        return super.isTransitionGroup();
    }

    @Override
    public void setTransitionGroup(boolean isTransitionGroup) {
        LUtils.e(getClass(), "");
        super.setTransitionGroup(isTransitionGroup);
    }

    @Override
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        LUtils.e(getClass(), "");
        return super.requestFocus(direction, previouslyFocusedRect);
    }

    @Override
    public boolean restoreDefaultFocus() {
        LUtils.e(getClass(), "");
        return super.restoreDefaultFocus();
    }

    @Override
    public void dispatchStartTemporaryDetach() {
        LUtils.e(getClass(), "");
        super.dispatchStartTemporaryDetach();
    }

    @Override
    public void dispatchFinishTemporaryDetach() {
        LUtils.e(getClass(), "");
        super.dispatchFinishTemporaryDetach();
    }

    @Override
    public void dispatchProvideStructure(ViewStructure structure) {
        LUtils.e(getClass(), "");
        super.dispatchProvideStructure(structure);
    }

    @Override
    public void dispatchProvideAutofillStructure(ViewStructure structure, int flags) {
        LUtils.e(getClass(), "");
        super.dispatchProvideAutofillStructure(structure, flags);
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        LUtils.e(getClass(), "");
        return super.getAccessibilityClassName();
    }

    @Override
    public void notifySubtreeAccessibilityStateChanged(View child, View source, int changeType) {
        LUtils.e(getClass(), "");
        super.notifySubtreeAccessibilityStateChanged(child, source, changeType);
    }

    @Override
    public boolean onNestedPrePerformAccessibilityAction(View target, int action, Bundle args) {
        LUtils.e(getClass(), "");
        return super.onNestedPrePerformAccessibilityAction(target, action, args);
    }

    @Override
    protected void dispatchFreezeSelfOnly(SparseArray<Parcelable> container) {
        LUtils.e(getClass(), "");
        super.dispatchFreezeSelfOnly(container);
    }

    @Override
    protected void dispatchThawSelfOnly(SparseArray<Parcelable> container) {
        LUtils.e(getClass(), "");
        super.dispatchThawSelfOnly(container);
    }

    @Override
    protected void setChildrenDrawingCacheEnabled(boolean enabled) {
        LUtils.e(getClass(), "");
        super.setChildrenDrawingCacheEnabled(enabled);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        LUtils.e(getClass(), "");
        super.dispatchDraw(canvas);
    }

    @Override
    public ViewGroupOverlay getOverlay() {
        LUtils.e(getClass(), "");
        return super.getOverlay();
    }

    @Override
    public boolean getClipChildren() {
        LUtils.e(getClass(), "");
        return super.getClipChildren();
    }

    @Override
    public void setClipChildren(boolean clipChildren) {
        LUtils.e(getClass(), "");
        super.setClipChildren(clipChildren);
    }

    @Override
    public void dispatchSetSelected(boolean selected) {
        LUtils.e(getClass(), "");
        super.dispatchSetSelected(selected);
    }

    @Override
    public void dispatchSetActivated(boolean activated) {
        LUtils.e(getClass(), "");
        super.dispatchSetActivated(activated);
    }

    @Override
    protected void dispatchSetPressed(boolean pressed) {
        LUtils.e(getClass(), "");
        super.dispatchSetPressed(pressed);
    }

    @Override
    public void dispatchDrawableHotspotChanged(float x, float y) {
        LUtils.e(getClass(), "");
        super.dispatchDrawableHotspotChanged(x, y);
    }

    @Override
    protected void setStaticTransformationsEnabled(boolean enabled) {
        LUtils.e(getClass(), "");
        super.setStaticTransformationsEnabled(enabled);
    }

    @Override
    protected boolean getChildStaticTransformation(View child, Transformation t) {
        LUtils.e(getClass(), "");
        return super.getChildStaticTransformation(child, t);
    }

    @Override
    public void addView(View child) {
        LUtils.e(getClass(), "");
        super.addView(child);
    }

    @Override
    public void addView(View child, int index) {
        LUtils.e(getClass(), "");
        super.addView(child, index);
    }

    @Override
    public void addView(View child, int width, int height) {
        LUtils.e(getClass(), "");
        super.addView(child, width, height);
    }

    @Override
    public void addView(View child, ViewGroup.LayoutParams params) {
        LUtils.e(getClass(), "");
        super.addView(child, params);
    }

    @Override
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        LUtils.e(getClass(), "");
        super.addView(child, index, params);
    }

    @Override
    public void updateViewLayout(View view, ViewGroup.LayoutParams params) {
        LUtils.e(getClass(), "");
        super.updateViewLayout(view, params);
    }

    @Override
    public void setOnHierarchyChangeListener(OnHierarchyChangeListener listener) {
        LUtils.e(getClass(), "");
        super.setOnHierarchyChangeListener(listener);
    }

    @Override
    public void onViewAdded(View child) {
        LUtils.e(getClass(), "");
        super.onViewAdded(child);
    }

    @Override
    public void onViewRemoved(View child) {
        LUtils.e(getClass(), "");
        super.onViewRemoved(child);
    }

    @Override
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params) {
        LUtils.e(getClass(), "");
        return super.addViewInLayout(child, index, params);
    }

    @Override
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        LUtils.e(getClass(), "");
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    @Override
    protected void cleanupLayoutState(View child) {
        LUtils.e(getClass(), "");
        super.cleanupLayoutState(child);
    }

    @Override
    protected void attachLayoutAnimationParameters(View child, ViewGroup.LayoutParams params, int index, int count) {
        LUtils.e(getClass(), "");
        super.attachLayoutAnimationParameters(child, params, index, count);
    }

    @Override
    public void removeView(View view) {
        LUtils.e(getClass(), "");
        super.removeView(view);
    }

    @Override
    public void removeViewInLayout(View view) {
        LUtils.e(getClass(), "");
        super.removeViewInLayout(view);
    }

    @Override
    public void removeViewsInLayout(int start, int count) {
        LUtils.e(getClass(), "");
        super.removeViewsInLayout(start, count);
    }

    @Override
    public void removeViewAt(int index) {
        LUtils.e(getClass(), "");
        super.removeViewAt(index);
    }

    @Override
    public void removeViews(int start, int count) {
        LUtils.e(getClass(), "");
        super.removeViews(start, count);
    }

    @Override
    public void setLayoutTransition(LayoutTransition transition) {
        LUtils.e(getClass(), "");
        super.setLayoutTransition(transition);
    }

    @Override
    public LayoutTransition getLayoutTransition() {
        LUtils.e(getClass(), "");
        return super.getLayoutTransition();
    }

    @Override
    public void removeAllViews() {
        LUtils.e(getClass(), "");
        super.removeAllViews();
    }

    @Override
    public void removeAllViewsInLayout() {
        LUtils.e(getClass(), "");
        super.removeAllViewsInLayout();
    }

    @Override
    protected void attachViewToParent(View child, int index, ViewGroup.LayoutParams params) {
        LUtils.e(getClass(), "");
        super.attachViewToParent(child, index, params);
    }

    @Override
    protected void detachViewFromParent(View child) {
        LUtils.e(getClass(), "");
        super.detachViewFromParent(child);
    }

    @Override
    protected void detachViewFromParent(int index) {
        LUtils.e(getClass(), "");
        super.detachViewFromParent(index);
    }

    @Override
    protected void detachViewsFromParent(int start, int count) {
        LUtils.e(getClass(), "");
        super.detachViewsFromParent(start, count);
    }

    @Override
    protected void detachAllViewsFromParent() {
        LUtils.e(getClass(), "");
        super.detachAllViewsFromParent();
    }

    @Override
    public void onDescendantInvalidated(@NonNull View child, @NonNull View target) {
        LUtils.e(getClass(), "");
        super.onDescendantInvalidated(child, target);
    }

    @Override
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        LUtils.e(getClass(), "");
        return super.invalidateChildInParent(location, dirty);
    }

    @Override
    public boolean getChildVisibleRect(View child, Rect r, Point offset) {
        LUtils.e(getClass(), "");
        return super.getChildVisibleRect(child, r, offset);
    }

    @Override
    protected boolean canAnimate() {
        LUtils.e(getClass(), "");
        return super.canAnimate();
    }

    @Override
    public void startLayoutAnimation() {
        LUtils.e(getClass(), "");
        super.startLayoutAnimation();
    }

    @Override
    public void scheduleLayoutAnimation() {
        LUtils.e(getClass(), "");
        super.scheduleLayoutAnimation();
    }

    @Override
    public void setLayoutAnimation(LayoutAnimationController controller) {
        LUtils.e(getClass(), "");
        super.setLayoutAnimation(controller);
    }

    @Override
    public LayoutAnimationController getLayoutAnimation() {
        LUtils.e(getClass(), "");
        return super.getLayoutAnimation();
    }

    @Override
    public boolean isAnimationCacheEnabled() {
        LUtils.e(getClass(), "");
        return super.isAnimationCacheEnabled();
    }

    @Override
    public void setAnimationCacheEnabled(boolean enabled) {
        LUtils.e(getClass(), "");
        super.setAnimationCacheEnabled(enabled);
    }

    @Override
    public boolean isAlwaysDrawnWithCacheEnabled() {
        LUtils.e(getClass(), "");
        return super.isAlwaysDrawnWithCacheEnabled();
    }

    @Override
    public void setAlwaysDrawnWithCacheEnabled(boolean always) {
        LUtils.e(getClass(), "");
        super.setAlwaysDrawnWithCacheEnabled(always);
    }

    @Override
    protected boolean isChildrenDrawnWithCacheEnabled() {
        LUtils.e(getClass(), "");
        return super.isChildrenDrawnWithCacheEnabled();
    }

    @Override
    protected void setChildrenDrawnWithCacheEnabled(boolean enabled) {
        LUtils.e(getClass(), "");
        super.setChildrenDrawnWithCacheEnabled(enabled);
    }

    @Override
    protected boolean isChildrenDrawingOrderEnabled() {
        LUtils.e(getClass(), "");
        return super.isChildrenDrawingOrderEnabled();
    }

    @Override
    protected void setChildrenDrawingOrderEnabled(boolean enabled) {
        LUtils.e(getClass(), "");
        super.setChildrenDrawingOrderEnabled(enabled);
    }

    @Override
    public int getPersistentDrawingCache() {
        LUtils.e(getClass(), "");
        return super.getPersistentDrawingCache();
    }

    @Override
    public void setPersistentDrawingCache(int drawingCacheToKeep) {
        LUtils.e(getClass(), "");
        super.setPersistentDrawingCache(drawingCacheToKeep);
    }

    @Override
    public int getLayoutMode() {
        LUtils.e(getClass(), "");
        return super.getLayoutMode();
    }

    @Override
    public void setLayoutMode(int layoutMode) {
        LUtils.e(getClass(), "");
        super.setLayoutMode(layoutMode);
    }

    @Override
    protected void debug(int depth) {
        LUtils.e(getClass(), "");
        super.debug(depth);
    }

    @Override
    public int indexOfChild(View child) {
        LUtils.e(getClass(), "");
        return super.indexOfChild(child);
    }

    @Override
    public int getChildCount() {
        LUtils.e(getClass(), "");
        return super.getChildCount();
    }

    @Override
    public View getChildAt(int index) {
        LUtils.e(getClass(), "");
        return super.getChildAt(index);
    }

    @Override
    protected void measureChildren(int widthMeasureSpec, int heightMeasureSpec) {
        LUtils.e(getClass(), "");
        super.measureChildren(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        LUtils.e(getClass(), "");
        super.measureChild(child, parentWidthMeasureSpec, parentHeightMeasureSpec);
    }

    @Override
    protected void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        LUtils.e(getClass(), "");
        super.measureChildWithMargins(child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    @Override
    public void clearDisappearingChildren() {
        LUtils.e(getClass(), "");
        super.clearDisappearingChildren();
    }

    @Override
    public void startViewTransition(View view) {
        LUtils.e(getClass(), "");
        super.startViewTransition(view);
    }

    @Override
    public void endViewTransition(View view) {
        LUtils.e(getClass(), "");
        super.endViewTransition(view);
    }

    @Override
    public boolean gatherTransparentRegion(Region region) {
        LUtils.e(getClass(), "");
        return super.gatherTransparentRegion(region);
    }

    @Override
    public void requestTransparentRegion(View child) {
        LUtils.e(getClass(), "");
        super.requestTransparentRegion(child);
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        LUtils.e(getClass(), "");
        return super.dispatchApplyWindowInsets(insets);
    }

    @Override
    public Animation.AnimationListener getLayoutAnimationListener() {
        LUtils.e(getClass(), "");
        return super.getLayoutAnimationListener();
    }

    @Override
    protected void drawableStateChanged() {
        LUtils.e(getClass(), "");
        super.drawableStateChanged();
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        LUtils.e(getClass(), "");
        super.jumpDrawablesToCurrentState();
    }

    @Override
    protected int[] onCreateDrawableState(int extraSpace) {
        LUtils.e(getClass(), "");
        return super.onCreateDrawableState(extraSpace);
    }

    @Override
    public void setAddStatesFromChildren(boolean addsStates) {
        LUtils.e(getClass(), "");
        super.setAddStatesFromChildren(addsStates);
    }

    @Override
    public boolean addStatesFromChildren() {
        LUtils.e(getClass(), "");
        return super.addStatesFromChildren();
    }

    @Override
    public void childDrawableStateChanged(View child) {
        LUtils.e(getClass(), "");
        super.childDrawableStateChanged(child);
    }

    @Override
    public void setLayoutAnimationListener(Animation.AnimationListener animationListener) {
        LUtils.e(getClass(), "");
        super.setLayoutAnimationListener(animationListener);
    }

    @Override
    public boolean shouldDelayChildPressedState() {
        LUtils.e(getClass(), "");
        return super.shouldDelayChildPressedState();
    }

    @Override
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        LUtils.e(getClass(), "");
        return super.onStartNestedScroll(child, target, nestedScrollAxes);
    }

    @Override
    public void onNestedScrollAccepted(View child, View target, int axes) {
        LUtils.e(getClass(), "");
        super.onNestedScrollAccepted(child, target, axes);
    }

    @Override
    public void onStopNestedScroll(View child) {
        LUtils.e(getClass(), "");
        super.onStopNestedScroll(child);
    }

    @Override
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        LUtils.e(getClass(), "");
        super.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
    }

    @Override
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        LUtils.e(getClass(), "");
        super.onNestedPreScroll(target, dx, dy, consumed);
    }

    @Override
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        LUtils.e(getClass(), "");
        return super.onNestedFling(target, velocityX, velocityY, consumed);
    }

    @Override
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        LUtils.e(getClass(), "");
        return super.onNestedPreFling(target, velocityX, velocityY);
    }

    @Override
    public int getNestedScrollAxes() {
        LUtils.e(getClass(), "");
        return super.getNestedScrollAxes();
    }

    @Override
    public String toString() {
        LUtils.e(getClass(), "");
        return super.toString();
    }

    @Override
    public int getVerticalFadingEdgeLength() {
        LUtils.e(getClass(), "");
        return super.getVerticalFadingEdgeLength();
    }

    @Override
    public void setFadingEdgeLength(int length) {
        LUtils.e(getClass(), "");
        super.setFadingEdgeLength(length);
    }

    @Override
    public int getHorizontalFadingEdgeLength() {
        LUtils.e(getClass(), "");
        return super.getHorizontalFadingEdgeLength();
    }

    @Override
    public int getVerticalScrollbarWidth() {
        LUtils.e(getClass(), "");
        return super.getVerticalScrollbarWidth();
    }

    @Override
    protected int getHorizontalScrollbarHeight() {
        LUtils.e(getClass(), "");
        return super.getHorizontalScrollbarHeight();
    }

    @Override
    public void setVerticalScrollbarPosition(int position) {
        LUtils.e(getClass(), "");
        super.setVerticalScrollbarPosition(position);
    }

    @Override
    public int getVerticalScrollbarPosition() {
        LUtils.e(getClass(), "");
        return super.getVerticalScrollbarPosition();
    }

    @Override
    public void setScrollIndicators(int indicators) {
        LUtils.e(getClass(), "");
        super.setScrollIndicators(indicators);
    }

    @Override
    public void setScrollIndicators(int indicators, int mask) {
        LUtils.e(getClass(), "");
        super.setScrollIndicators(indicators, mask);
    }

    @Override
    public int getScrollIndicators() {
        LUtils.e(getClass(), "");
        return super.getScrollIndicators();
    }

    @Override
    public void setOnScrollChangeListener(OnScrollChangeListener l) {
        LUtils.e(getClass(), "");
        super.setOnScrollChangeListener(l);
    }

    @Override
    public void setOnFocusChangeListener(OnFocusChangeListener l) {
        LUtils.e(getClass(), "");
        super.setOnFocusChangeListener(l);
    }

    @Override
    public void addOnLayoutChangeListener(OnLayoutChangeListener listener) {
        LUtils.e(getClass(), "");
        super.addOnLayoutChangeListener(listener);
    }

    @Override
    public void removeOnLayoutChangeListener(OnLayoutChangeListener listener) {
        LUtils.e(getClass(), "");
        super.removeOnLayoutChangeListener(listener);
    }

    @Override
    public void addOnAttachStateChangeListener(OnAttachStateChangeListener listener) {
        LUtils.e(getClass(), "");
        super.addOnAttachStateChangeListener(listener);
    }

    @Override
    public void removeOnAttachStateChangeListener(OnAttachStateChangeListener listener) {
        LUtils.e(getClass(), "");
        super.removeOnAttachStateChangeListener(listener);
    }

    @Override
    public OnFocusChangeListener getOnFocusChangeListener() {
        LUtils.e(getClass(), "");
        return super.getOnFocusChangeListener();
    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        LUtils.e(getClass(), "");
        super.setOnClickListener(l);
    }

    @Override
    public boolean hasOnClickListeners() {
        LUtils.e(getClass(), "");
        return super.hasOnClickListeners();
    }

    @Override
    public void setOnLongClickListener(@Nullable OnLongClickListener l) {
        LUtils.e(getClass(), "");
        super.setOnLongClickListener(l);
    }

    @Override
    public void setOnContextClickListener(@Nullable OnContextClickListener l) {
        LUtils.e(getClass(), "");
        super.setOnContextClickListener(l);
    }

    @Override
    public void setOnCreateContextMenuListener(OnCreateContextMenuListener l) {
        LUtils.e(getClass(), "");
        super.setOnCreateContextMenuListener(l);
    }

    @Override
    public boolean performClick() {
        LUtils.e(getClass(), "");
        return super.performClick();
    }

    @Override
    public boolean callOnClick() {
        LUtils.e(getClass(), "");
        return super.callOnClick();
    }

    @Override
    public boolean performLongClick() {
        LUtils.e(getClass(), "");
        return super.performLongClick();
    }

    @Override
    public boolean performLongClick(float x, float y) {
        LUtils.e(getClass(), "");
        return super.performLongClick(x, y);
    }

    @Override
    public boolean performContextClick(float x, float y) {
        LUtils.e(getClass(), "");
        return super.performContextClick(x, y);
    }

    @Override
    public boolean performContextClick() {
        LUtils.e(getClass(), "");
        return super.performContextClick();
    }

    @Override
    public boolean showContextMenu() {
        LUtils.e(getClass(), "");
        return super.showContextMenu();
    }

    @Override
    public boolean showContextMenu(float x, float y) {
        LUtils.e(getClass(), "");
        return super.showContextMenu(x, y);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        LUtils.e(getClass(), "");
        return super.startActionMode(callback);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int type) {
        LUtils.e(getClass(), "");
        return super.startActionMode(callback, type);
    }

    @Override
    public void setOnKeyListener(OnKeyListener l) {
        LUtils.e(getClass(), "");
        super.setOnKeyListener(l);
    }

    @Override
    public void setOnTouchListener(OnTouchListener l) {
        LUtils.e(getClass(), "");
        super.setOnTouchListener(l);
    }

    @Override
    public void setOnGenericMotionListener(OnGenericMotionListener l) {
        LUtils.e(getClass(), "");
        super.setOnGenericMotionListener(l);
    }

    @Override
    public void setOnHoverListener(OnHoverListener l) {
        LUtils.e(getClass(), "");
        super.setOnHoverListener(l);
    }

    @Override
    public void setOnDragListener(OnDragListener l) {
        LUtils.e(getClass(), "");
        super.setOnDragListener(l);
    }

    @Override
    public boolean requestRectangleOnScreen(Rect rectangle) {
        LUtils.e(getClass(), "");
        return super.requestRectangleOnScreen(rectangle);
    }

    @Override
    public boolean requestRectangleOnScreen(Rect rectangle, boolean immediate) {
        LUtils.e(getClass(), "");
        return super.requestRectangleOnScreen(rectangle, immediate);
    }

    @Override
    public boolean hasFocusable() {
        LUtils.e(getClass(), "");
        return super.hasFocusable();
    }

    @Override
    public boolean hasExplicitFocusable() {
        LUtils.e(getClass(), "");
        return super.hasExplicitFocusable();
    }

    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        LUtils.e(getClass(), "");
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }

    @Override
    public void setAccessibilityPaneTitle(@Nullable CharSequence accessibilityPaneTitle) {
        LUtils.e(getClass(), "");
        super.setAccessibilityPaneTitle(accessibilityPaneTitle);
    }

    @Nullable
    @Override
    public CharSequence getAccessibilityPaneTitle() {
        LUtils.e(getClass(), "");
        return super.getAccessibilityPaneTitle();
    }

    @Override
    public void sendAccessibilityEvent(int eventType) {
        LUtils.e(getClass(), "");
        super.sendAccessibilityEvent(eventType);
    }

    @Override
    public void announceForAccessibility(CharSequence text) {
        LUtils.e(getClass(), "");
        super.announceForAccessibility(text);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        LUtils.e(getClass(), "");
        return super.dispatchPopulateAccessibilityEvent(event);
    }

    @Override
    public void onPopulateAccessibilityEvent(AccessibilityEvent event) {
        LUtils.e(getClass(), "");
        super.onPopulateAccessibilityEvent(event);
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        LUtils.e(getClass(), "");
        super.onInitializeAccessibilityEvent(event);
    }

    @Override
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        LUtils.e(getClass(), "");
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        LUtils.e(getClass(), "");
        super.onInitializeAccessibilityNodeInfo(info);
    }

    @Override
    public void onProvideStructure(ViewStructure structure) {
        LUtils.e(getClass(), "");
        super.onProvideStructure(structure);
    }

    @Override
    public void onProvideAutofillStructure(ViewStructure structure, int flags) {
        LUtils.e(getClass(), "");
        super.onProvideAutofillStructure(structure, flags);
    }

    @Override
    public void onProvideVirtualStructure(ViewStructure structure) {
        LUtils.e(getClass(), "");
        super.onProvideVirtualStructure(structure);
    }

    @Override
    public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) {
        LUtils.e(getClass(), "");
        super.onProvideAutofillVirtualStructure(structure, flags);
    }

    @Override
    public void autofill(AutofillValue value) {
        LUtils.e(getClass(), "");
        super.autofill(value);
    }

    @Override
    public void autofill(@NonNull SparseArray<AutofillValue> values) {
        LUtils.e(getClass(), "");
        super.autofill(values);
    }

    @Override
    public void setAutofillId(@Nullable AutofillId id) {
        LUtils.e(getClass(), "");
        super.setAutofillId(id);
    }

    @Override
    public int getAutofillType() {
        LUtils.e(getClass(), "");
        return super.getAutofillType();
    }

    @Nullable
    @Override
    public String[] getAutofillHints() {
        LUtils.e(getClass(), "");
        return super.getAutofillHints();
    }

    @Nullable
    @Override
    public AutofillValue getAutofillValue() {
        LUtils.e(getClass(), "");
        return super.getAutofillValue();
    }

    @Override
    public int getImportantForAutofill() {
        LUtils.e(getClass(), "");
        return super.getImportantForAutofill();
    }

    @Override
    public void setImportantForAutofill(int mode) {
        LUtils.e(getClass(), "");
        super.setImportantForAutofill(mode);
    }

    @Override
    public void addExtraDataToAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo info, @NonNull String extraDataKey, @Nullable Bundle arguments) {
        LUtils.e(getClass(), "");
        super.addExtraDataToAccessibilityNodeInfo(info, extraDataKey, arguments);
    }

    @Override
    public boolean isVisibleToUserForAutofill(int virtualId) {
        LUtils.e(getClass(), "");
        return super.isVisibleToUserForAutofill(virtualId);
    }

    @Override
    public void setAccessibilityDelegate(@Nullable AccessibilityDelegate delegate) {
        LUtils.e(getClass(), "");
        super.setAccessibilityDelegate(delegate);
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        LUtils.e(getClass(), "");
        return super.getAccessibilityNodeProvider();
    }

//    @Override
//    public CharSequence getContentDescription() {
//LUtils.e(CopyRecyclerView .class,"");
//        return super.getContentDescription();
//    }

    @Override
    public void setContentDescription(CharSequence contentDescription) {
        LUtils.e(getClass(), "");
        super.setContentDescription(contentDescription);
    }

    @Override
    public void setAccessibilityTraversalBefore(int beforeId) {
        LUtils.e(getClass(), "");
        super.setAccessibilityTraversalBefore(beforeId);
    }

    @Override
    public int getAccessibilityTraversalBefore() {
        LUtils.e(getClass(), "");
        return super.getAccessibilityTraversalBefore();
    }

    @Override
    public void setAccessibilityTraversalAfter(int afterId) {
        LUtils.e(getClass(), "");
        super.setAccessibilityTraversalAfter(afterId);
    }

    @Override
    public int getAccessibilityTraversalAfter() {
        LUtils.e(getClass(), "");
        return super.getAccessibilityTraversalAfter();
    }

    @Override
    public int getLabelFor() {
        LUtils.e(getClass(), "");
        return super.getLabelFor();
    }

    @Override
    public void setLabelFor(int id) {
        LUtils.e(getClass(), "");
        super.setLabelFor(id);
    }

    @Override
    public boolean isFocused() {
        LUtils.e(getClass(), "");
        return super.isFocused();
    }

    @Override
    public boolean isScrollContainer() {
        LUtils.e(getClass(), "");
        return super.isScrollContainer();
    }

    @Override
    public void setScrollContainer(boolean isScrollContainer) {
        LUtils.e(getClass(), "");
        super.setScrollContainer(isScrollContainer);
    }

    @Override
    public int getDrawingCacheQuality() {
        LUtils.e(getClass(), "");
        return super.getDrawingCacheQuality();
    }

    @Override
    public void setDrawingCacheQuality(int quality) {
        LUtils.e(getClass(), "");
        super.setDrawingCacheQuality(quality);
    }

    @Override
    public boolean getKeepScreenOn() {
        LUtils.e(getClass(), "");
        return super.getKeepScreenOn();
    }

    @Override
    public void setKeepScreenOn(boolean keepScreenOn) {
        LUtils.e(getClass(), "");
        super.setKeepScreenOn(keepScreenOn);
    }

    @Override
    public int getNextFocusLeftId() {
        LUtils.e(getClass(), "");
        return super.getNextFocusLeftId();
    }

    @Override
    public void setNextFocusLeftId(int nextFocusLeftId) {
        LUtils.e(getClass(), "");
        super.setNextFocusLeftId(nextFocusLeftId);
    }

    @Override
    public int getNextFocusRightId() {
        LUtils.e(getClass(), "");
        return super.getNextFocusRightId();
    }

    @Override
    public void setNextFocusRightId(int nextFocusRightId) {
        LUtils.e(getClass(), "");
        super.setNextFocusRightId(nextFocusRightId);
    }

    @Override
    public int getNextFocusUpId() {
        LUtils.e(getClass(), "");
        return super.getNextFocusUpId();
    }

    @Override
    public void setNextFocusUpId(int nextFocusUpId) {
        LUtils.e(getClass(), "");
        super.setNextFocusUpId(nextFocusUpId);
    }

    @Override
    public int getNextFocusDownId() {
        LUtils.e(getClass(), "");
        return super.getNextFocusDownId();
    }

    @Override
    public void setNextFocusDownId(int nextFocusDownId) {
        LUtils.e(getClass(), "");
        super.setNextFocusDownId(nextFocusDownId);
    }

    @Override
    public int getNextFocusForwardId() {
        LUtils.e(getClass(), "");
        return super.getNextFocusForwardId();
    }

    @Override
    public void setNextFocusForwardId(int nextFocusForwardId) {
        LUtils.e(getClass(), "");
        super.setNextFocusForwardId(nextFocusForwardId);
    }

    @Override
    public int getNextClusterForwardId() {
        LUtils.e(getClass(), "");
        return super.getNextClusterForwardId();
    }

    @Override
    public void setNextClusterForwardId(int nextClusterForwardId) {
        LUtils.e(getClass(), "");
        super.setNextClusterForwardId(nextClusterForwardId);
    }

    @Override
    public boolean isShown() {
        LUtils.e(getClass(), "");
        return super.isShown();
    }

    @Override
    protected boolean fitSystemWindows(Rect insets) {
        LUtils.e(getClass(), "");
        return super.fitSystemWindows(insets);
    }

    @Override
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        LUtils.e(getClass(), "");
        return super.onApplyWindowInsets(insets);
    }

    @Override
    public void setOnApplyWindowInsetsListener(OnApplyWindowInsetsListener listener) {
        LUtils.e(getClass(), "");
        super.setOnApplyWindowInsetsListener(listener);
    }

    @Override
    public WindowInsets getRootWindowInsets() {
        LUtils.e(getClass(), "");
        return super.getRootWindowInsets();
    }

    @Override
    public WindowInsets computeSystemWindowInsets(WindowInsets in, Rect outLocalInsets) {
        LUtils.e(getClass(), "");
        return super.computeSystemWindowInsets(in, outLocalInsets);
    }

    @Override
    public void setFitsSystemWindows(boolean fitSystemWindows) {
        LUtils.e(getClass(), "");
        super.setFitsSystemWindows(fitSystemWindows);
    }

    @Override
    public boolean getFitsSystemWindows() {
        LUtils.e(getClass(), "");
        return super.getFitsSystemWindows();
    }

    @Override
    public void requestFitSystemWindows() {
        LUtils.e(getClass(), "");
        super.requestFitSystemWindows();
    }

    @Override
    public void requestApplyInsets() {
        LUtils.e(getClass(), "");
        super.requestApplyInsets();
    }

    @Override
    public int getVisibility() {
        LUtils.e(getClass(), "");
        return super.getVisibility();
    }

    @Override
    public void setVisibility(int visibility) {
        LUtils.e(getClass(), "");
        super.setVisibility(visibility);
    }

    @Override
    public boolean isEnabled() {
        LUtils.e(getClass(), "");
        return super.isEnabled();
    }

    @Override
    public void setEnabled(boolean enabled) {
        LUtils.e(getClass(), "");
        super.setEnabled(enabled);
    }

    @Override
    public void setFocusable(boolean focusable) {
        LUtils.e(getClass(), "");
        super.setFocusable(focusable);
    }

    @Override
    public void setFocusable(int focusable) {
        LUtils.e(getClass(), "");
        super.setFocusable(focusable);
    }

    @Override
    public void setFocusableInTouchMode(boolean focusableInTouchMode) {
        LUtils.e(getClass(), "");
        super.setFocusableInTouchMode(focusableInTouchMode);
    }

    @Override
    public void setAutofillHints(@Nullable String... autofillHints) {
        LUtils.e(getClass(), "");
        super.setAutofillHints(autofillHints);
    }

    @Override
    public void setSoundEffectsEnabled(boolean soundEffectsEnabled) {
        LUtils.e(getClass(), "");
        super.setSoundEffectsEnabled(soundEffectsEnabled);
    }

    @Override
    public boolean isSoundEffectsEnabled() {
        LUtils.e(getClass(), "");
        return super.isSoundEffectsEnabled();
    }

    @Override
    public void setHapticFeedbackEnabled(boolean hapticFeedbackEnabled) {
        LUtils.e(getClass(), "");
        super.setHapticFeedbackEnabled(hapticFeedbackEnabled);
    }

    @Override
    public boolean isHapticFeedbackEnabled() {
        LUtils.e(getClass(), "");
        return super.isHapticFeedbackEnabled();
    }

    @Override
    public void setLayoutDirection(int layoutDirection) {
        LUtils.e(getClass(), "");
        super.setLayoutDirection(layoutDirection);
    }

    @Override
    public int getLayoutDirection() {
        LUtils.e(getClass(), "");
        return super.getLayoutDirection();
    }

    @Override
    public void setHasTransientState(boolean hasTransientState) {
        LUtils.e(getClass(), "");
        super.setHasTransientState(hasTransientState);
    }

    @Override
    public boolean isLaidOut() {
        LUtils.e(getClass(), "");
        return super.isLaidOut();
    }

    @Override
    public void setWillNotDraw(boolean willNotDraw) {
        LUtils.e(getClass(), "");
        super.setWillNotDraw(willNotDraw);
    }

    @Override
    public boolean willNotDraw() {
        LUtils.e(getClass(), "");
        return super.willNotDraw();
    }

    @Override
    public void setWillNotCacheDrawing(boolean willNotCacheDrawing) {
        LUtils.e(getClass(), "");
        super.setWillNotCacheDrawing(willNotCacheDrawing);
    }

    @Override
    public boolean willNotCacheDrawing() {
        LUtils.e(getClass(), "");
        return super.willNotCacheDrawing();
    }

    @Override
    public boolean isClickable() {
        LUtils.e(getClass(), "");
        return super.isClickable();
    }

    @Override
    public void setClickable(boolean clickable) {
        LUtils.e(getClass(), "");
        super.setClickable(clickable);
    }

    @Override
    public boolean isLongClickable() {
        LUtils.e(getClass(), "");
        return super.isLongClickable();
    }

    @Override
    public void setLongClickable(boolean longClickable) {
        LUtils.e(getClass(), "");
        super.setLongClickable(longClickable);
    }

    @Override
    public boolean isContextClickable() {
        LUtils.e(getClass(), "");
        return super.isContextClickable();
    }

    @Override
    public void setContextClickable(boolean contextClickable) {
        LUtils.e(getClass(), "");
        super.setContextClickable(contextClickable);
    }

    @Override
    public void setPressed(boolean pressed) {
        LUtils.e(getClass(), "");
        super.setPressed(pressed);
    }

    @Override
    public boolean isPressed() {
        LUtils.e(getClass(), "");
        return super.isPressed();
    }

    @Override
    public boolean isSaveEnabled() {
        LUtils.e(getClass(), "");
        return super.isSaveEnabled();
    }

    @Override
    public void setSaveEnabled(boolean enabled) {
        LUtils.e(getClass(), "");
        super.setSaveEnabled(enabled);
    }

    @Override
    public boolean getFilterTouchesWhenObscured() {
        LUtils.e(getClass(), "");
        return super.getFilterTouchesWhenObscured();
    }

    @Override
    public void setFilterTouchesWhenObscured(boolean enabled) {
        LUtils.e(getClass(), "");
        super.setFilterTouchesWhenObscured(enabled);
    }

    @Override
    public boolean isSaveFromParentEnabled() {
        LUtils.e(getClass(), "");
        return super.isSaveFromParentEnabled();
    }

    @Override
    public void setSaveFromParentEnabled(boolean enabled) {
        LUtils.e(getClass(), "");
        super.setSaveFromParentEnabled(enabled);
    }

    @Override
    public int getFocusable() {
        LUtils.e(getClass(), "");
        return super.getFocusable();
    }

    @Override
    public boolean isScreenReaderFocusable() {
        LUtils.e(getClass(), "");
        return super.isScreenReaderFocusable();
    }

    @Override
    public void setScreenReaderFocusable(boolean screenReaderFocusable) {
        LUtils.e(getClass(), "");
        super.setScreenReaderFocusable(screenReaderFocusable);
    }

    @Override
    public boolean isAccessibilityHeading() {
        LUtils.e(getClass(), "");
        return super.isAccessibilityHeading();
    }

    @Override
    public void setAccessibilityHeading(boolean isHeading) {
        LUtils.e(getClass(), "");
        super.setAccessibilityHeading(isHeading);
    }

    @Override
    public View focusSearch(int direction) {
        LUtils.e(getClass(), "");
        return super.focusSearch(direction);
    }

    @Override
    public void setKeyboardNavigationCluster(boolean isCluster) {
        LUtils.e(getClass(), "");
        super.setKeyboardNavigationCluster(isCluster);
    }

    @Override
    public void setFocusedByDefault(boolean isFocusedByDefault) {
        LUtils.e(getClass(), "");
        super.setFocusedByDefault(isFocusedByDefault);
    }

    @Override
    public View keyboardNavigationClusterSearch(View currentCluster, int direction) {
        LUtils.e(getClass(), "");
        return super.keyboardNavigationClusterSearch(currentCluster, direction);
    }

    @Override
    public void setDefaultFocusHighlightEnabled(boolean defaultFocusHighlightEnabled) {
        LUtils.e(getClass(), "");
        super.setDefaultFocusHighlightEnabled(defaultFocusHighlightEnabled);
    }

    @Override
    public ArrayList<View> getFocusables(int direction) {
        LUtils.e(getClass(), "");
        return super.getFocusables(direction);
    }

    @Override
    public void addFocusables(ArrayList<View> views, int direction) {
        LUtils.e(getClass(), "");
        super.addFocusables(views, direction);
    }

    @Override
    public ArrayList<View> getTouchables() {
        LUtils.e(getClass(), "");
        return super.getTouchables();
    }

    @Override
    public boolean isAccessibilityFocused() {
        LUtils.e(getClass(), "");
        return super.isAccessibilityFocused();
    }

    @Override
    public int getImportantForAccessibility() {
        LUtils.e(getClass(), "");
        return super.getImportantForAccessibility();
    }

    @Override
    public void setAccessibilityLiveRegion(int mode) {
        LUtils.e(getClass(), "");
        super.setAccessibilityLiveRegion(mode);
    }

    @Override
    public int getAccessibilityLiveRegion() {
        LUtils.e(getClass(), "");
        return super.getAccessibilityLiveRegion();
    }

    @Override
    public void setImportantForAccessibility(int mode) {
        LUtils.e(getClass(), "");
        super.setImportantForAccessibility(mode);
    }

    @Override
    public boolean isImportantForAccessibility() {
        LUtils.e(getClass(), "");
        return super.isImportantForAccessibility();
    }

    @Override
    public ViewParent getParentForAccessibility() {
        LUtils.e(getClass(), "");
        return super.getParentForAccessibility();
    }

    @Override
    public boolean dispatchNestedPrePerformAccessibilityAction(int action, Bundle arguments) {
        LUtils.e(getClass(), "");
        return super.dispatchNestedPrePerformAccessibilityAction(action, arguments);
    }

    @Override
    public boolean performAccessibilityAction(int action, Bundle arguments) {
        LUtils.e(getClass(), "");
        return super.performAccessibilityAction(action, arguments);
    }

    @Override
    public void onStartTemporaryDetach() {
        LUtils.e(getClass(), "");
        super.onStartTemporaryDetach();
    }

    @Override
    public void onFinishTemporaryDetach() {
        LUtils.e(getClass(), "");
        super.onFinishTemporaryDetach();
    }

    @Override
    public KeyEvent.DispatcherState getKeyDispatcherState() {
        LUtils.e(getClass(), "");
        return super.getKeyDispatcherState();
    }

    @Override
    public boolean onFilterTouchEventForSecurity(MotionEvent event) {
        LUtils.e(getClass(), "");
        return super.onFilterTouchEventForSecurity(event);
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        LUtils.e(getClass(), "");
        return super.dispatchGenericMotionEvent(event);
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        LUtils.e(getClass(), "");
        super.onWindowFocusChanged(hasWindowFocus);
    }

    @Override
    public boolean hasWindowFocus() {
        LUtils.e(getClass(), "");
        return super.hasWindowFocus();
    }

    @Override
    protected void onVisibilityChanged(@NonNull View changedView, int visibility) {
        LUtils.e(getClass(), "");
        super.onVisibilityChanged(changedView, visibility);
    }

    @Override
    protected void onDisplayHint(int hint) {
        LUtils.e(getClass(), "");
        super.onDisplayHint(hint);
    }

    @Override
    protected void onWindowVisibilityChanged(int visibility) {
        LUtils.e(getClass(), "");
        super.onWindowVisibilityChanged(visibility);
    }

    @Override
    public void onVisibilityAggregated(boolean isVisible) {
        LUtils.e(getClass(), "");
        super.onVisibilityAggregated(isVisible);
    }

    @Override
    public int getWindowVisibility() {
        LUtils.e(getClass(), "");
        return super.getWindowVisibility();
    }

    @Override
    public void getWindowVisibleDisplayFrame(Rect outRect) {
        LUtils.e(getClass(), "");
        super.getWindowVisibleDisplayFrame(outRect);
    }

    @Override
    protected void onConfigurationChanged(Configuration newConfig) {
        LUtils.e(getClass(), "");
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean isInTouchMode() {
        LUtils.e(getClass(), "");
        return super.isInTouchMode();
    }

    @Override
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        LUtils.e(getClass(), "");
        return super.onKeyPreIme(keyCode, event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        LUtils.e(getClass(), "");
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        LUtils.e(getClass(), "");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        LUtils.e(getClass(), "");
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        LUtils.e(getClass(), "");
        return super.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public boolean onKeyShortcut(int keyCode, KeyEvent event) {
        LUtils.e(getClass(), "");
        return super.onKeyShortcut(keyCode, event);
    }

    @Override
    public boolean onCheckIsTextEditor() {
        LUtils.e(getClass(), "");
        return super.onCheckIsTextEditor();
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        LUtils.e(getClass(), "");
        return super.onCreateInputConnection(outAttrs);
    }

    @Override
    public boolean checkInputConnectionProxy(View view) {
        LUtils.e(getClass(), "");
        return super.checkInputConnectionProxy(view);
    }

    @Override
    public void createContextMenu(ContextMenu menu) {
        LUtils.e(getClass(), "");
        super.createContextMenu(menu);
    }

    @Override
    protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
        LUtils.e(getClass(), "");
        return super.getContextMenuInfo();
    }

    @Override
    protected void onCreateContextMenu(ContextMenu menu) {
        LUtils.e(getClass(), "");
        super.onCreateContextMenu(menu);
    }

    @Override
    public boolean onTrackballEvent(MotionEvent event) {
        LUtils.e(getClass(), "");
        return super.onTrackballEvent(event);
    }

    @Override
    public boolean onHoverEvent(MotionEvent event) {
        LUtils.e(getClass(), "");
        return super.onHoverEvent(event);
    }

    @Override
    public boolean isHovered() {
        LUtils.e(getClass(), "");
        return super.isHovered();
    }

    @Override
    public void setHovered(boolean hovered) {
        LUtils.e(getClass(), "");
        super.setHovered(hovered);
    }

    @Override
    public void onHoverChanged(boolean hovered) {
        LUtils.e(getClass(), "");
        super.onHoverChanged(hovered);
    }

    @Override
    public void cancelLongPress() {
        LUtils.e(getClass(), "");
        super.cancelLongPress();
    }

    @Override
    public void setTouchDelegate(TouchDelegate delegate) {
        LUtils.e(getClass(), "");
        super.setTouchDelegate(delegate);
    }

    @Override
    public TouchDelegate getTouchDelegate() {
        LUtils.e(getClass(), "");
        return super.getTouchDelegate();
    }

    @Override
    public void bringToFront() {
        LUtils.e(getClass(), "");
        super.bringToFront();
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        LUtils.e(getClass(), "");
        super.onScrollChanged(l, t, oldl, oldt);
    }

    @Override
    public void setScrollX(int value) {
        LUtils.e(getClass(), "");
        super.setScrollX(value);
    }

    @Override
    public void setScrollY(int value) {
        LUtils.e(getClass(), "");
        super.setScrollY(value);
    }

    @Override
    public void getDrawingRect(Rect outRect) {
        LUtils.e(getClass(), "");
        super.getDrawingRect(outRect);
    }

    @Override
    public Matrix getMatrix() {
        LUtils.e(getClass(), "");
        return super.getMatrix();
    }

    @Override
    public float getCameraDistance() {
        LUtils.e(getClass(), "");
        return super.getCameraDistance();
    }

    @Override
    public void setCameraDistance(float distance) {
        LUtils.e(getClass(), "");
        super.setCameraDistance(distance);
    }

    @Override
    public float getRotation() {
        LUtils.e(getClass(), "");
        return super.getRotation();
    }

    @Override
    public void setRotation(float rotation) {
        LUtils.e(getClass(), "");
        super.setRotation(rotation);
    }

    @Override
    public float getRotationY() {
        LUtils.e(getClass(), "");
        return super.getRotationY();
    }

    @Override
    public void setRotationY(float rotationY) {
        LUtils.e(getClass(), "");
        super.setRotationY(rotationY);
    }

    @Override
    public float getRotationX() {
        LUtils.e(getClass(), "");
        return super.getRotationX();
    }

    @Override
    public void setRotationX(float rotationX) {
        LUtils.e(getClass(), "");
        super.setRotationX(rotationX);
    }

    @Override
    public float getScaleX() {
        LUtils.e(getClass(), "");
        return super.getScaleX();
    }

    @Override
    public void setScaleX(float scaleX) {
        LUtils.e(getClass(), "");
        super.setScaleX(scaleX);
    }

    @Override
    public float getScaleY() {
        LUtils.e(getClass(), "");
        return super.getScaleY();
    }

    @Override
    public void setScaleY(float scaleY) {
        LUtils.e(getClass(), "");
        super.setScaleY(scaleY);
    }

    @Override
    public float getPivotX() {
        LUtils.e(getClass(), "");
        return super.getPivotX();
    }

    @Override
    public void setPivotX(float pivotX) {
        LUtils.e(getClass(), "");
        super.setPivotX(pivotX);
    }

    @Override
    public float getPivotY() {
        LUtils.e(getClass(), "");
        return super.getPivotY();
    }

    @Override
    public void setPivotY(float pivotY) {
        LUtils.e(getClass(), "");
        super.setPivotY(pivotY);
    }

    @Override
    public boolean isPivotSet() {
        LUtils.e(getClass(), "");
        return super.isPivotSet();
    }

    @Override
    public void resetPivot() {
        LUtils.e(getClass(), "");
        super.resetPivot();
    }

    @Override
    public float getAlpha() {
        LUtils.e(getClass(), "");
        return super.getAlpha();
    }

    @Override
    public void forceHasOverlappingRendering(boolean hasOverlappingRendering) {
        LUtils.e(getClass(), "");
        super.forceHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override
    public boolean hasOverlappingRendering() {
        LUtils.e(getClass(), "");
        return super.hasOverlappingRendering();
    }

    @Override
    public void setAlpha(float alpha) {
        LUtils.e(getClass(), "");
        super.setAlpha(alpha);
    }

    @Override
    public boolean isDirty() {
        LUtils.e(getClass(), "");
        return super.isDirty();
    }

    @Override
    public float getX() {
        LUtils.e(getClass(), "");
        return super.getX();
    }

    @Override
    public void setX(float x) {
        LUtils.e(getClass(), "");
        super.setX(x);
    }

    @Override
    public float getY() {
        LUtils.e(getClass(), "");
        return super.getY();
    }

    @Override
    public void setY(float y) {
        LUtils.e(getClass(), "");
        super.setY(y);
    }

    @Override
    public float getZ() {
        LUtils.e(getClass(), "");
        return super.getZ();
    }

    @Override
    public void setZ(float z) {
        LUtils.e(getClass(), "");
        super.setZ(z);
    }

    @Override
    public float getElevation() {
        LUtils.e(getClass(), "");
        return super.getElevation();
    }

    @Override
    public void setElevation(float elevation) {
        LUtils.e(getClass(), "");
        super.setElevation(elevation);
    }

    @Override
    public float getTranslationX() {
        LUtils.e(getClass(), "");
        return super.getTranslationX();
    }

    @Override
    public void setTranslationX(float translationX) {
        LUtils.e(getClass(), "");
        super.setTranslationX(translationX);
    }

    @Override
    public float getTranslationY() {
        LUtils.e(getClass(), "");
        return super.getTranslationY();
    }

    @Override
    public void setTranslationY(float translationY) {
        LUtils.e(getClass(), "");
        super.setTranslationY(translationY);
    }

    @Override
    public float getTranslationZ() {
        LUtils.e(getClass(), "");
        return super.getTranslationZ();
    }

    @Override
    public void setTranslationZ(float translationZ) {
        LUtils.e(getClass(), "");
        super.setTranslationZ(translationZ);
    }

    @Override
    public StateListAnimator getStateListAnimator() {
        LUtils.e(getClass(), "");
        return super.getStateListAnimator();
    }

    @Override
    public void setStateListAnimator(StateListAnimator stateListAnimator) {
        LUtils.e(getClass(), "");
        super.setStateListAnimator(stateListAnimator);
    }

    @Override
    public void setClipToOutline(boolean clipToOutline) {
        LUtils.e(getClass(), "");
        super.setClipToOutline(clipToOutline);
    }

    @Override
    public void setOutlineProvider(ViewOutlineProvider provider) {
        LUtils.e(getClass(), "");
        super.setOutlineProvider(provider);
    }

    @Override
    public ViewOutlineProvider getOutlineProvider() {
        LUtils.e(getClass(), "");
        return super.getOutlineProvider();
    }

    @Override
    public void invalidateOutline() {
        LUtils.e(getClass(), "");
        super.invalidateOutline();
    }

    @Override
    public void setOutlineSpotShadowColor(int color) {
        LUtils.e(getClass(), "");
        super.setOutlineSpotShadowColor(color);
    }

    @Override
    public int getOutlineSpotShadowColor() {
        LUtils.e(getClass(), "");
        return super.getOutlineSpotShadowColor();
    }

    @Override
    public void setOutlineAmbientShadowColor(int color) {
        LUtils.e(getClass(), "");
        super.setOutlineAmbientShadowColor(color);
    }

    @Override
    public int getOutlineAmbientShadowColor() {
        LUtils.e(getClass(), "");
        return super.getOutlineAmbientShadowColor();
    }

    @Override
    public void getHitRect(Rect outRect) {
        LUtils.e(getClass(), "");
        super.getHitRect(outRect);
    }

    @Override
    public void getFocusedRect(Rect r) {
        LUtils.e(getClass(), "");
        super.getFocusedRect(r);
    }

    @Override
    public boolean getGlobalVisibleRect(Rect r, Point globalOffset) {
        LUtils.e(getClass(), "");
        return super.getGlobalVisibleRect(r, globalOffset);
    }

    @Override
    public void offsetTopAndBottom(int offset) {
        LUtils.e(getClass(), "");
        super.offsetTopAndBottom(offset);
    }

    @Override
    public void offsetLeftAndRight(int offset) {
        LUtils.e(getClass(), "");
        super.offsetLeftAndRight(offset);
    }

    @Override
    public ViewGroup.LayoutParams getLayoutParams() {
        LUtils.e(getClass(), "");
        return super.getLayoutParams();
    }

    @Override
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        LUtils.e(getClass(), "");
        super.setLayoutParams(params);
    }

    @Override
    protected boolean awakenScrollBars() {
        LUtils.e(getClass(), "");
        return super.awakenScrollBars();
    }

    @Override
    protected boolean awakenScrollBars(int startDelay) {
        LUtils.e(getClass(), "");
        return super.awakenScrollBars(startDelay);
    }

    @Override
    protected boolean awakenScrollBars(int startDelay, boolean invalidate) {
        LUtils.e(getClass(), "");
        return super.awakenScrollBars(startDelay, invalidate);
    }

    @Override
    public void invalidate(Rect dirty) {
        LUtils.e(getClass(), "");
        super.invalidate(dirty);
    }

    @Override
    public void invalidate(int l, int t, int r, int b) {
        LUtils.e(getClass(), "");
        super.invalidate(l, t, r, b);
    }

    @Override
    public void invalidate() {
        LUtils.e(getClass(), "");
        super.invalidate();
    }

    @Override
    public boolean isOpaque() {
        LUtils.e(getClass(), "");
        return super.isOpaque();
    }

    @Override
    public Handler getHandler() {
        LUtils.e(getClass(), "");
        return super.getHandler();
    }

    @Override
    public boolean post(Runnable action) {
        LUtils.e(getClass(), "");
        return super.post(action);
    }

    @Override
    public boolean postDelayed(Runnable action, long delayMillis) {
        LUtils.e(getClass(), "");
        return super.postDelayed(action, delayMillis);
    }

    @Override
    public void postOnAnimation(Runnable action) {
        LUtils.e(getClass(), "");
        super.postOnAnimation(action);
    }

    @Override
    public void postOnAnimationDelayed(Runnable action, long delayMillis) {
        LUtils.e(getClass(), "");
        super.postOnAnimationDelayed(action, delayMillis);
    }

    @Override
    public boolean removeCallbacks(Runnable action) {
        LUtils.e(getClass(), "");
        return super.removeCallbacks(action);
    }

    @Override
    public void postInvalidate() {
        LUtils.e(getClass(), "");
        super.postInvalidate();
    }

    @Override
    public void postInvalidate(int left, int top, int right, int bottom) {
        LUtils.e(getClass(), "");
        super.postInvalidate(left, top, right, bottom);
    }

    @Override
    public void postInvalidateDelayed(long delayMilliseconds) {
        LUtils.e(getClass(), "");
        super.postInvalidateDelayed(delayMilliseconds);
    }

    @Override
    public void postInvalidateDelayed(long delayMilliseconds, int left, int top, int right, int bottom) {
        LUtils.e(getClass(), "");
        super.postInvalidateDelayed(delayMilliseconds, left, top, right, bottom);
    }

    @Override
    public void postInvalidateOnAnimation() {
        LUtils.e(getClass(), "");
        super.postInvalidateOnAnimation();
    }

    @Override
    public void postInvalidateOnAnimation(int left, int top, int right, int bottom) {
        LUtils.e(getClass(), "");
        super.postInvalidateOnAnimation(left, top, right, bottom);
    }

    @Override
    public void computeScroll() {
        LUtils.e(getClass(), "");
        super.computeScroll();
    }

    @Override
    public boolean isHorizontalFadingEdgeEnabled() {
        LUtils.e(getClass(), "");
        return super.isHorizontalFadingEdgeEnabled();
    }

    @Override
    public void setHorizontalFadingEdgeEnabled(boolean horizontalFadingEdgeEnabled) {
        LUtils.e(getClass(), "");
        super.setHorizontalFadingEdgeEnabled(horizontalFadingEdgeEnabled);
    }

    @Override
    public boolean isVerticalFadingEdgeEnabled() {
        LUtils.e(getClass(), "");
        return super.isVerticalFadingEdgeEnabled();
    }

    @Override
    public void setVerticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled) {
        LUtils.e(getClass(), "");
        super.setVerticalFadingEdgeEnabled(verticalFadingEdgeEnabled);
    }

    @Override
    protected float getTopFadingEdgeStrength() {
        LUtils.e(getClass(), "");
        return super.getTopFadingEdgeStrength();
    }

    @Override
    protected float getBottomFadingEdgeStrength() {
        LUtils.e(getClass(), "");
        return super.getBottomFadingEdgeStrength();
    }

    @Override
    protected float getLeftFadingEdgeStrength() {
        LUtils.e(getClass(), "");
        return super.getLeftFadingEdgeStrength();
    }

    @Override
    protected float getRightFadingEdgeStrength() {
        LUtils.e(getClass(), "");
        return super.getRightFadingEdgeStrength();
    }

    @Override
    public boolean isHorizontalScrollBarEnabled() {
        LUtils.e(getClass(), "");
        return super.isHorizontalScrollBarEnabled();
    }

    @Override
    public void setHorizontalScrollBarEnabled(boolean horizontalScrollBarEnabled) {
        LUtils.e(getClass(), "");
        super.setHorizontalScrollBarEnabled(horizontalScrollBarEnabled);
    }

    @Override
    public boolean isVerticalScrollBarEnabled() {
        LUtils.e(getClass(), "");
        return super.isVerticalScrollBarEnabled();
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled) {
        LUtils.e(getClass(), "");
        super.setVerticalScrollBarEnabled(verticalScrollBarEnabled);
    }

    @Override
    public void setScrollbarFadingEnabled(boolean fadeScrollbars) {
        LUtils.e(getClass(), "");
        super.setScrollbarFadingEnabled(fadeScrollbars);
    }

    @Override
    public boolean isScrollbarFadingEnabled() {
        LUtils.e(getClass(), "");
        return super.isScrollbarFadingEnabled();
    }

    @Override
    public int getScrollBarDefaultDelayBeforeFade() {
        LUtils.e(getClass(), "");
        return super.getScrollBarDefaultDelayBeforeFade();
    }

    @Override
    public void setScrollBarDefaultDelayBeforeFade(int scrollBarDefaultDelayBeforeFade) {
        LUtils.e(getClass(), "");
        super.setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade);
    }

    @Override
    public int getScrollBarFadeDuration() {
        LUtils.e(getClass(), "");
        return super.getScrollBarFadeDuration();
    }

    @Override
    public void setScrollBarFadeDuration(int scrollBarFadeDuration) {
        LUtils.e(getClass(), "");
        super.setScrollBarFadeDuration(scrollBarFadeDuration);
    }

    @Override
    public int getScrollBarSize() {
        LUtils.e(getClass(), "");
        return super.getScrollBarSize();
    }

    @Override
    public void setScrollBarSize(int scrollBarSize) {
        LUtils.e(getClass(), "");
        super.setScrollBarSize(scrollBarSize);
    }

    @Override
    public void setScrollBarStyle(int style) {
        LUtils.e(getClass(), "");
        super.setScrollBarStyle(style);
    }

    @Override
    public int getScrollBarStyle() {
        LUtils.e(getClass(), "");
        return super.getScrollBarStyle();
    }

    @Override
    public boolean canScrollHorizontally(int direction) {
        LUtils.e(getClass(), "");
        return super.canScrollHorizontally(direction);
    }

    @Override
    public boolean canScrollVertically(int direction) {
        LUtils.e(getClass(), "");
        return super.canScrollVertically(direction);
    }

    @Override
    public void onScreenStateChanged(int screenState) {
        LUtils.e(getClass(), "");
        super.onScreenStateChanged(screenState);
    }

    @Override
    public void onRtlPropertiesChanged(int layoutDirection) {
        LUtils.e(getClass(), "");
        super.onRtlPropertiesChanged(layoutDirection);
    }

    @Override
    public boolean canResolveLayoutDirection() {
        LUtils.e(getClass(), "");
        return super.canResolveLayoutDirection();
    }

    @Override
    public boolean isLayoutDirectionResolved() {
        LUtils.e(getClass(), "");
        return super.isLayoutDirectionResolved();
    }

    @Override
    protected int getWindowAttachCount() {
        LUtils.e(getClass(), "");
        return super.getWindowAttachCount();
    }

    @Override
    public IBinder getWindowToken() {
        LUtils.e(getClass(), "");
        return super.getWindowToken();
    }

    @Override
    public WindowId getWindowId() {
        LUtils.e(getClass(), "");
        return super.getWindowId();
    }

    @Override
    public IBinder getApplicationWindowToken() {
        LUtils.e(getClass(), "");
        return super.getApplicationWindowToken();
    }

    @Override
    public Display getDisplay() {
        LUtils.e(getClass(), "");
        return super.getDisplay();
    }

    @Override
    public void onCancelPendingInputEvents() {
        LUtils.e(getClass(), "");
        super.onCancelPendingInputEvents();
    }

    @Override
    public void saveHierarchyState(SparseArray<Parcelable> container) {
        LUtils.e(getClass(), "");
        super.saveHierarchyState(container);
    }

    @Override
    public void restoreHierarchyState(SparseArray<Parcelable> container) {
        LUtils.e(getClass(), "");
        super.restoreHierarchyState(container);
    }

    @Override
    public long getDrawingTime() {
        LUtils.e(getClass(), "");
        return super.getDrawingTime();
    }

    @Override
    public void setDuplicateParentStateEnabled(boolean enabled) {
        LUtils.e(getClass(), "");
        super.setDuplicateParentStateEnabled(enabled);
    }

    @Override
    public boolean isDuplicateParentStateEnabled() {
        LUtils.e(getClass(), "");
        return super.isDuplicateParentStateEnabled();
    }

    @Override
    public void setLayerType(int layerType, @Nullable Paint paint) {
        LUtils.e(getClass(), "");
        super.setLayerType(layerType, paint);
    }

    @Override
    public void setLayerPaint(@Nullable Paint paint) {
        LUtils.e(getClass(), "");
        super.setLayerPaint(paint);
    }

    @Override
    public int getLayerType() {
        LUtils.e(getClass(), "");
        return super.getLayerType();
    }

    @Override
    public void buildLayer() {
        LUtils.e(getClass(), "");
        super.buildLayer();
    }

    @Override
    public void setDrawingCacheEnabled(boolean enabled) {
        LUtils.e(getClass(), "");
        super.setDrawingCacheEnabled(enabled);
    }

    @Override
    public boolean isDrawingCacheEnabled() {
        LUtils.e(getClass(), "");
        return super.isDrawingCacheEnabled();
    }

    @Override
    public Bitmap getDrawingCache() {
        LUtils.e(getClass(), "");
        return super.getDrawingCache();
    }

    @Override
    public Bitmap getDrawingCache(boolean autoScale) {
        LUtils.e(getClass(), "");
        return super.getDrawingCache(autoScale);
    }

    @Override
    public void destroyDrawingCache() {
        LUtils.e(getClass(), "");
        super.destroyDrawingCache();
    }

    @Override
    public void setDrawingCacheBackgroundColor(int color) {
        LUtils.e(getClass(), "");
        super.setDrawingCacheBackgroundColor(color);
    }

    @Override
    public int getDrawingCacheBackgroundColor() {
        LUtils.e(getClass(), "");
        return super.getDrawingCacheBackgroundColor();
    }

    @Override
    public void buildDrawingCache() {
        LUtils.e(getClass(), "");
        super.buildDrawingCache();
    }

    @Override
    public void buildDrawingCache(boolean autoScale) {
        LUtils.e(getClass(), "");
        super.buildDrawingCache(autoScale);
    }

    @Override
    public boolean isInEditMode() {
        LUtils.e(getClass(), "");
        return super.isInEditMode();
    }

    @Override
    protected boolean isPaddingOffsetRequired() {
        LUtils.e(getClass(), "");
        return super.isPaddingOffsetRequired();
    }

    @Override
    protected int getLeftPaddingOffset() {
        LUtils.e(getClass(), "");
        return super.getLeftPaddingOffset();
    }

    @Override
    protected int getRightPaddingOffset() {
        LUtils.e(getClass(), "");
        return super.getRightPaddingOffset();
    }

    @Override
    protected int getTopPaddingOffset() {
        LUtils.e(getClass(), "");
        return super.getTopPaddingOffset();
    }

    @Override
    protected int getBottomPaddingOffset() {
        LUtils.e(getClass(), "");
        return super.getBottomPaddingOffset();
    }

    @Override
    public boolean isHardwareAccelerated() {
        LUtils.e(getClass(), "");
        return super.isHardwareAccelerated();
    }

    @Override
    public void setClipBounds(Rect clipBounds) {
        LUtils.e(getClass(), "");
        super.setClipBounds(clipBounds);
    }

    @Override
    public Rect getClipBounds() {
        LUtils.e(getClass(), "");
        return super.getClipBounds();
    }

    @Override
    public boolean getClipBounds(Rect outRect) {
        LUtils.e(getClass(), "");
        return super.getClipBounds(outRect);
    }

    @Override
    public int getSolidColor() {
        LUtils.e(getClass(), "");
        return super.getSolidColor();
    }

    @Override
    public boolean isLayoutRequested() {
        LUtils.e(getClass(), "");
        return super.isLayoutRequested();
    }

    @Override
    protected void onFinishInflate() {
        LUtils.e(getClass(), "");
        super.onFinishInflate();
    }

    @Override
    public Resources getResources() {
        LUtils.e(getClass(), "");
        return super.getResources();
    }

    @Override
    public void invalidateDrawable(@NonNull Drawable drawable) {
        LUtils.e(getClass(), "");
        super.invalidateDrawable(drawable);
    }

    @Override
    public void scheduleDrawable(@NonNull Drawable who, @NonNull Runnable what, long when) {
        LUtils.e(getClass(), "");
        super.scheduleDrawable(who, what, when);
    }

    @Override
    public void unscheduleDrawable(@NonNull Drawable who, @NonNull Runnable what) {
        LUtils.e(getClass(), "");
        super.unscheduleDrawable(who, what);
    }

    @Override
    public void unscheduleDrawable(Drawable who) {
        LUtils.e(getClass(), "");
        super.unscheduleDrawable(who);
    }

    @Override
    protected boolean verifyDrawable(@NonNull Drawable who) {
        LUtils.e(getClass(), "");
        return super.verifyDrawable(who);
    }

    @Override
    public void drawableHotspotChanged(float x, float y) {
        LUtils.e(getClass(), "");
        super.drawableHotspotChanged(x, y);
    }

    @Override
    public void refreshDrawableState() {
        LUtils.e(getClass(), "");
        super.refreshDrawableState();
    }

    @Override
    public void setBackgroundColor(int color) {
        LUtils.e(getClass(), "");
        super.setBackgroundColor(color);
    }

    @Override
    public void setBackgroundResource(int resid) {
        LUtils.e(getClass(), "");
        super.setBackgroundResource(resid);
    }

    @Override
    public void setBackground(Drawable background) {
        LUtils.e(getClass(), "");
        super.setBackground(background);
    }

    @Override
    public void setBackgroundDrawable(Drawable background) {
        LUtils.e(getClass(), "");
        super.setBackgroundDrawable(background);
    }

    @Override
    public Drawable getBackground() {
        LUtils.e(getClass(), "");
        return super.getBackground();
    }

    @Override
    public void setBackgroundTintList(@Nullable ColorStateList tint) {
        LUtils.e(getClass(), "");
        super.setBackgroundTintList(tint);
    }

    @Nullable
    @Override
    public ColorStateList getBackgroundTintList() {
        LUtils.e(getClass(), "");
        return super.getBackgroundTintList();
    }

    @Override
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode tintMode) {
        LUtils.e(getClass(), "");
        super.setBackgroundTintMode(tintMode);
    }

    @Nullable
    @Override
    public PorterDuff.Mode getBackgroundTintMode() {
        LUtils.e(getClass(), "");
        return super.getBackgroundTintMode();
    }

    @Override
    public Drawable getForeground() {
        LUtils.e(getClass(), "");
        return super.getForeground();
    }

    @Override
    public void setForeground(Drawable foreground) {
        LUtils.e(getClass(), "");
        super.setForeground(foreground);
    }

    @Override
    public int getForegroundGravity() {
        LUtils.e(getClass(), "");
        return super.getForegroundGravity();
    }

    @Override
    public void setForegroundGravity(int gravity) {
        LUtils.e(getClass(), "");
        super.setForegroundGravity(gravity);
    }

    @Override
    public void setForegroundTintList(@Nullable ColorStateList tint) {
        LUtils.e(getClass(), "");
        super.setForegroundTintList(tint);
    }

    @Nullable
    @Override
    public ColorStateList getForegroundTintList() {
        LUtils.e(getClass(), "");
        return super.getForegroundTintList();
    }

    @Override
    public void setForegroundTintMode(@Nullable PorterDuff.Mode tintMode) {
        LUtils.e(getClass(), "");
        super.setForegroundTintMode(tintMode);
    }

    @Nullable
    @Override
    public PorterDuff.Mode getForegroundTintMode() {
        LUtils.e(getClass(), "");
        return super.getForegroundTintMode();
    }

    @Override
    public void onDrawForeground(Canvas canvas) {
        LUtils.e(getClass(), "");
        super.onDrawForeground(canvas);
    }

    @Override
    public void setPadding(int left, int top, int right, int bottom) {
        LUtils.e(getClass(), "");
        super.setPadding(left, top, right, bottom);
    }

    @Override
    public void setPaddingRelative(int start, int top, int end, int bottom) {
        LUtils.e(getClass(), "");
        super.setPaddingRelative(start, top, end, bottom);
    }

    @Override
    public int getPaddingTop() {
        LUtils.e(getClass(), "");
        return super.getPaddingTop();
    }

    @Override
    public int getPaddingBottom() {
        LUtils.e(getClass(), "");
        return super.getPaddingBottom();
    }

    @Override
    public int getPaddingLeft() {
        LUtils.e(getClass(), "");
        return super.getPaddingLeft();
    }

    @Override
    public int getPaddingStart() {
        LUtils.e(getClass(), "");
        return super.getPaddingStart();
    }

    @Override
    public int getPaddingRight() {
        LUtils.e(getClass(), "");
        return super.getPaddingRight();
    }

    @Override
    public int getPaddingEnd() {
        LUtils.e(getClass(), "");
        return super.getPaddingEnd();
    }

    @Override
    public boolean isPaddingRelative() {
        LUtils.e(getClass(), "");
        return super.isPaddingRelative();
    }

    @Override
    public void setSelected(boolean selected) {
        LUtils.e(getClass(), "");
        super.setSelected(selected);
    }

    @Override
    public boolean isSelected() {
        LUtils.e(getClass(), "");
        return super.isSelected();
    }

    @Override
    public void setActivated(boolean activated) {
        LUtils.e(getClass(), "");
        super.setActivated(activated);
    }

    @Override
    public boolean isActivated() {
        LUtils.e(getClass(), "");
        return super.isActivated();
    }

    @Override
    public ViewTreeObserver getViewTreeObserver() {
        LUtils.e(getClass(), "");
        return super.getViewTreeObserver();
    }

    @Override
    public View getRootView() {
        LUtils.e(getClass(), "");
        return super.getRootView();
    }

    @Override
    public void getLocationOnScreen(int[] outLocation) {
        LUtils.e(getClass(), "");
        super.getLocationOnScreen(outLocation);
    }

    @Override
    public void getLocationInWindow(int[] outLocation) {
        LUtils.e(getClass(), "");
        super.getLocationInWindow(outLocation);
    }

    @Override
    public void setId(int id) {
        LUtils.e(getClass(), "");
        super.setId(id);
    }

    @Override
    public int getId() {
        LUtils.e(getClass(), "");
        return super.getId();
    }

    @Override
    public Object getTag() {
        LUtils.e(getClass(), "");
        return super.getTag();
    }

    @Override
    public void setTag(Object tag) {
        LUtils.e(getClass(), "");
        super.setTag(tag);
    }

    @Override
    public Object getTag(int key) {
        LUtils.e(getClass(), "");
        return super.getTag(key);
    }

    @Override
    public void setTag(int key, Object tag) {
        LUtils.e(getClass(), "");
        super.setTag(key, tag);
    }

    @Override
    public boolean isInLayout() {
        LUtils.e(getClass(), "");
        return super.isInLayout();
    }

    @Override
    public void forceLayout() {
        LUtils.e(getClass(), "");
        super.forceLayout();
    }

    @Override
    protected int getSuggestedMinimumHeight() {
        LUtils.e(getClass(), "");
        return super.getSuggestedMinimumHeight();
    }

    @Override
    protected int getSuggestedMinimumWidth() {
        LUtils.e(getClass(), "");
        return super.getSuggestedMinimumWidth();
    }

    @Override
    public int getMinimumHeight() {
        LUtils.e(getClass(), "");
        return super.getMinimumHeight();
    }

    @Override
    public void setMinimumHeight(int minHeight) {
        LUtils.e(getClass(), "");
        super.setMinimumHeight(minHeight);
    }

    @Override
    public int getMinimumWidth() {
        LUtils.e(getClass(), "");
        return super.getMinimumWidth();
    }

    @Override
    public void setMinimumWidth(int minWidth) {
        LUtils.e(getClass(), "");
        super.setMinimumWidth(minWidth);
    }

    @Override
    public Animation getAnimation() {
        LUtils.e(getClass(), "");
        return super.getAnimation();
    }

    @Override
    public void startAnimation(Animation animation) {
        LUtils.e(getClass(), "");
        super.startAnimation(animation);
    }

    @Override
    public void clearAnimation() {
        LUtils.e(getClass(), "");
        super.clearAnimation();
    }

    @Override
    public void setAnimation(Animation animation) {
        LUtils.e(getClass(), "");
        super.setAnimation(animation);
    }

    @Override
    protected void onAnimationStart() {
        LUtils.e(getClass(), "");
        super.onAnimationStart();
    }

    @Override
    protected void onAnimationEnd() {
        LUtils.e(getClass(), "");
        super.onAnimationEnd();
    }

    @Override
    protected boolean onSetAlpha(int alpha) {
        LUtils.e(getClass(), "");
        return super.onSetAlpha(alpha);
    }

    @Override
    public void playSoundEffect(int soundConstant) {
        LUtils.e(getClass(), "");
        super.playSoundEffect(soundConstant);
    }

    @Override
    public boolean performHapticFeedback(int feedbackConstant) {
        LUtils.e(getClass(), "");
        return super.performHapticFeedback(feedbackConstant);
    }

    @Override
    public boolean performHapticFeedback(int feedbackConstant, int flags) {
        LUtils.e(getClass(), "");
        return super.performHapticFeedback(feedbackConstant, flags);
    }

    @Override
    public void setSystemUiVisibility(int visibility) {
        LUtils.e(getClass(), "");
        super.setSystemUiVisibility(visibility);
    }

    @Override
    public int getSystemUiVisibility() {
        LUtils.e(getClass(), "");
        return super.getSystemUiVisibility();
    }

    @Override
    public int getWindowSystemUiVisibility() {
        LUtils.e(getClass(), "");
        return super.getWindowSystemUiVisibility();
    }

    @Override
    public void onWindowSystemUiVisibilityChanged(int visible) {
        LUtils.e(getClass(), "");
        super.onWindowSystemUiVisibilityChanged(visible);
    }

    @Override
    public void setOnSystemUiVisibilityChangeListener(OnSystemUiVisibilityChangeListener l) {
        LUtils.e(getClass(), "");
        super.setOnSystemUiVisibilityChangeListener(l);
    }

    @Override
    public boolean onDragEvent(DragEvent event) {
        LUtils.e(getClass(), "");
        return super.onDragEvent(event);
    }

    @Override
    protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
        LUtils.e(getClass(), "");
        return super.overScrollBy(deltaX, deltaY, scrollX, scrollY, scrollRangeX, scrollRangeY, maxOverScrollX, maxOverScrollY, isTouchEvent);
    }

    @Override
    protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        LUtils.e(getClass(), "");
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
    }

    @Override
    public int getOverScrollMode() {
        LUtils.e(getClass(), "");
        return super.getOverScrollMode();
    }

    @Override
    public void setOverScrollMode(int overScrollMode) {
        LUtils.e(getClass(), "");
        super.setOverScrollMode(overScrollMode);
    }

    @Override
    public void setTextDirection(int textDirection) {
        LUtils.e(getClass(), "");
        super.setTextDirection(textDirection);
    }

    @Override
    public int getTextDirection() {
        LUtils.e(getClass(), "");
        return super.getTextDirection();
    }

    @Override
    public boolean canResolveTextDirection() {
        LUtils.e(getClass(), "");
        return super.canResolveTextDirection();
    }

    @Override
    public boolean isTextDirectionResolved() {
        LUtils.e(getClass(), "");
        return super.isTextDirectionResolved();
    }

    @Override
    public void setTextAlignment(int textAlignment) {
        LUtils.e(getClass(), "");
        super.setTextAlignment(textAlignment);
    }

    @Override
    public int getTextAlignment() {
        LUtils.e(getClass(), "");
        return super.getTextAlignment();
    }

    @Override
    public boolean canResolveTextAlignment() {
        LUtils.e(getClass(), "");
        return super.canResolveTextAlignment();
    }

    @Override
    public boolean isTextAlignmentResolved() {
        LUtils.e(getClass(), "");
        return super.isTextAlignmentResolved();
    }

    @Override
    public void setPointerIcon(PointerIcon pointerIcon) {
        LUtils.e(getClass(), "");
        super.setPointerIcon(pointerIcon);
    }

    @Override
    public PointerIcon getPointerIcon() {
        LUtils.e(getClass(), "");
        return super.getPointerIcon();
    }

    @Override
    public boolean hasPointerCapture() {
        LUtils.e(getClass(), "");
        return super.hasPointerCapture();
    }

    @Override
    public void requestPointerCapture() {
        LUtils.e(getClass(), "");
        super.requestPointerCapture();
    }

    @Override
    public void releasePointerCapture() {
        LUtils.e(getClass(), "");
        super.releasePointerCapture();
    }

    @Override
    public void onPointerCaptureChange(boolean hasCapture) {
        LUtils.e(getClass(), "");
        super.onPointerCaptureChange(hasCapture);
    }

    @Override
    public boolean onCapturedPointerEvent(MotionEvent event) {
        LUtils.e(getClass(), "");
        return super.onCapturedPointerEvent(event);
    }

    @Override
    public void setOnCapturedPointerListener(OnCapturedPointerListener l) {
        LUtils.e(getClass(), "");
        super.setOnCapturedPointerListener(l);
    }

    @Override
    public ViewPropertyAnimator animate() {
        LUtils.e(getClass(), "");
        return super.animate();
    }

    @Override
    public String getTransitionName() {
        LUtils.e(getClass(), "");
        return super.getTransitionName();
    }

    @Override
    public void setTooltipText(@Nullable CharSequence tooltipText) {
        LUtils.e(getClass(), "");
        super.setTooltipText(tooltipText);
    }

    @Nullable
    @Override
    public CharSequence getTooltipText() {
        LUtils.e(getClass(), "");
        return super.getTooltipText();
    }

    @Override
    public void addOnUnhandledKeyEventListener(OnUnhandledKeyEventListener listener) {
        LUtils.e(getClass(), "");
        super.addOnUnhandledKeyEventListener(listener);
    }

    @Override
    public void removeOnUnhandledKeyEventListener(OnUnhandledKeyEventListener listener) {
        LUtils.e(getClass(), "");
        super.removeOnUnhandledKeyEventListener(listener);
    }


}