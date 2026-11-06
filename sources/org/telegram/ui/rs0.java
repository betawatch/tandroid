package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class rs0 extends ug.k1 {
    public final /* synthetic */ ss0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(ss0 ss0Var, Context context) {
        super(context);
        this.N = ss0Var;
    }

    @Override // ug.k1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            ss0 ss0Var = this.N;
            ss0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, ss0Var.d.n.O);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), ss0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
