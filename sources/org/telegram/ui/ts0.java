package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ts0 extends ug.o1 {
    public final /* synthetic */ us0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(us0 us0Var, Context context) {
        super(context);
        this.O = us0Var;
    }

    @Override // ug.o1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            us0 us0Var = this.O;
            us0Var.d.n.o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, us0Var.d.n.P);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), us0Var.d.n.o0.f);
        }
        super.dispatchDraw(canvas);
    }
}
