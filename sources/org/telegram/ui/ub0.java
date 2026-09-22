package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ub0 extends yd {
    public final /* synthetic */ zb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub0(zb0 zb0Var, Context context) {
        super(context);
        this.c = zb0Var;
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
