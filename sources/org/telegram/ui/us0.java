package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class us0 extends ug.k1 {
    public final /* synthetic */ vs0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(vs0 vs0Var, Context context) {
        super(context);
        this.N = vs0Var;
    }

    @Override // ug.k1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            vs0 vs0Var = this.N;
            vs0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, vs0Var.d.n.O);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), vs0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
