package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ss0 extends ug.k1 {
    public final /* synthetic */ ts0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(ts0 ts0Var, Context context) {
        super(context);
        this.N = ts0Var;
    }

    @Override // ug.k1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            ts0 ts0Var = this.N;
            ts0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, ts0Var.d.n.O);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), ts0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
