package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vs0 extends ug.k1 {
    public final /* synthetic */ ws0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(ws0 ws0Var, Context context) {
        super(context);
        this.N = ws0Var;
    }

    @Override // ug.k1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            ws0 ws0Var = this.N;
            ws0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, ws0Var.d.n.O);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), ws0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
