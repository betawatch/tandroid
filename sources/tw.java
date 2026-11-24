// default package

import android.app.Activity;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tw extends HorizontalScrollView {
    public final /* synthetic */ ui5 a;
    public final /* synthetic */ uw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(uw uwVar, Activity activity, ui5 ui5Var) {
        super(activity);
        this.b = uwVar;
        this.a = ui5Var;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.b.e.getMeasuredWidth();
        getMeasuredWidth();
        Typeface typeface = gm.a;
        return onInterceptTouchEvent;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ehb ehbVar = this.b.e;
        ehbVar.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), 0), i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), ehbVar.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ui5 ui5Var = this.a;
        if (ui5Var.d != null) {
            ui5Var.d = null;
            ui5Var.f = null;
        }
        this.b.a();
        gkb gkbVar = ((o) ui5Var).Q0;
        if (gkbVar == null || !gkbVar.w()) {
            return;
        }
        gkbVar.v();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.e.getMeasuredWidth() <= getMeasuredWidth() - gm.L(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        o.R(this.a);
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
