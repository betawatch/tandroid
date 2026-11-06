package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class r2 extends HorizontalScrollView {
    public final /* synthetic */ o50 a;
    public final /* synthetic */ s2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(s2 s2Var, Context context, o50 o50Var) {
        super(context);
        this.b = s2Var;
        this.a = o50Var;
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
    public final void onMeasure(int i7, int i10) {
        s2 s2Var = this.b;
        s2Var.e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight(), 0), i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), s2Var.e.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        o50 o50Var = this.a;
        if (o50Var.d != null) {
            o50Var.d = null;
            o50Var.f = null;
        }
        this.b.a();
        org.telegram.ui.Cells.i9 i9Var = ((g4) o50Var).P0;
        if (i9Var == null || !i9Var.x()) {
            return;
        }
        i9Var.w();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.e.getMeasuredWidth() <= getMeasuredWidth() - org.telegram.messenger.g0.L(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z9) {
        g4.R(this.a);
        return super.overScrollBy(i7, i10, i11, i12, i13, i14, i15, i16, z9);
    }
}
