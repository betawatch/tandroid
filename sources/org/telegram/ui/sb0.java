package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class sb0 extends yd {
    public final /* synthetic */ xb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb0(xb0 xb0Var, Context context) {
        super(context);
        this.c = xb0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.c.getClass();
    }

    @Override // org.telegram.ui.yd, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }
}
