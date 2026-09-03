package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x2 extends HorizontalScrollView {
    public final /* synthetic */ p70 a;
    public final /* synthetic */ y2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(y2 y2Var, Context context, p70 p70Var) {
        super(context);
        this.b = y2Var;
        this.a = p70Var;
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
    public final void onMeasure(int i10, int i11) {
        y2 y2Var = this.b;
        y2Var.e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight(), 0), i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), y2Var.e.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        p70 p70Var = this.a;
        if (p70Var.d != null) {
            p70Var.d = null;
            p70Var.f = null;
        }
        this.b.a();
        org.telegram.ui.Cells.l9 l9Var = ((n4) p70Var).L0;
        if (l9Var == null || !l9Var.y()) {
            return;
        }
        l9Var.x();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.e.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z4) {
        n4.T(this.a);
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z4);
    }
}
