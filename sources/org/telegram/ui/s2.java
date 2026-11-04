package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s2 extends HorizontalScrollView {
    public final /* synthetic */ i50 a;
    public final /* synthetic */ t2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(t2 t2Var, Context context, i50 i50Var) {
        super(context);
        this.b = t2Var;
        this.a = i50Var;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.b.e.getMeasuredWidth();
        getMeasuredWidth();
        org.telegram.messenger.g0.L(36.0f);
        return onInterceptTouchEvent;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        t2 t2Var = this.b;
        t2Var.e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i3) - getPaddingLeft()) - getPaddingRight(), 0), i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i3), t2Var.e.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        i50 i50Var = this.a;
        if (i50Var.d != null) {
            i50Var.d = null;
            i50Var.f = null;
        }
        this.b.a();
        org.telegram.ui.Cells.h9 h9Var = ((i4) i50Var).Q0;
        if (h9Var == null || !h9Var.x()) {
            return;
        }
        h9Var.w();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.e.getMeasuredWidth() <= getMeasuredWidth() - org.telegram.messenger.g0.L(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        i4.R(this.a);
        return super.overScrollBy(i3, i10, i11, i12, i13, i14, i15, i16, z10);
    }
}
