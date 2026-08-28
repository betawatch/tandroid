package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w2 extends HorizontalScrollView {
    public final /* synthetic */ a70 a;
    public final /* synthetic */ x2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, Context context, a70 a70Var) {
        super(context);
        this.b = x2Var;
        this.a = a70Var;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.b.e.getMeasuredWidth();
        getMeasuredWidth();
        AndroidUtilities.dp(36.0f);
        return onInterceptTouchEvent;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        x2 x2Var = this.b;
        x2Var.e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i9) - getPaddingLeft()) - getPaddingRight(), 0), i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i9), x2Var.e.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        a70 a70Var = this.a;
        if (a70Var.d != null) {
            a70Var.d = null;
            a70Var.f = null;
        }
        this.b.a();
        org.telegram.ui.Cells.n9 n9Var = ((l4) a70Var).K0;
        if (n9Var == null || !n9Var.y()) {
            return;
        }
        n9Var.x();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.e.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        l4.T(this.a);
        return super.overScrollBy(i9, i10, i11, i12, i13, i14, i15, i16, z10);
    }
}
