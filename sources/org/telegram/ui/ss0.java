package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ss0 extends ug.n1 {
    public final /* synthetic */ ts0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(ts0 ts0Var, Context context) {
        super(context);
        this.O = ts0Var;
    }

    @Override // ug.n1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            ts0 ts0Var = this.O;
            ts0Var.d.n.o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, ts0Var.d.n.P);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), ts0Var.d.n.o0.f);
        }
        super.dispatchDraw(canvas);
    }
}
