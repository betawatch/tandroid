// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wjb extends dv3 {
    public final /* synthetic */ xjb h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjb(xjb xjbVar, Context context) {
        super(context);
        this.h2 = xjbVar;
    }

    @Override // vu3, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        v44 v44Var = this.h2.J;
        if (v44Var == null || v44Var.getVisibility() != 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // vu3, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.h2.m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.h2.m();
    }
}
