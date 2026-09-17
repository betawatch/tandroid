package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
