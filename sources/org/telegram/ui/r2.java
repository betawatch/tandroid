package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r2 extends HorizontalScrollView {
    public final /* synthetic */ m60 a;
    public final /* synthetic */ s2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(s2 s2Var, Context context, m60 m60Var) {
        super(context);
        this.b = s2Var;
        this.a = m60Var;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.b.e.getMeasuredWidth();
        getMeasuredWidth();
        org.telegram.messenger.i0.L(36.0f);
        return onInterceptTouchEvent;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        s2 s2Var = this.b;
        s2Var.e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight(), 0), i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), s2Var.e.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        m60 m60Var = this.a;
        if (m60Var.d != null) {
            m60Var.d = null;
            m60Var.f = null;
        }
        this.b.a();
        org.telegram.ui.Cells.k9 k9Var = ((h4) m60Var).P0;
        if (k9Var == null || !k9Var.x()) {
            return;
        }
        k9Var.w();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.e.getMeasuredWidth() <= getMeasuredWidth() - org.telegram.messenger.i0.L(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        h4.R(this.a);
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10);
    }
}
