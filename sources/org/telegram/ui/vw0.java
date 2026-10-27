package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vw0 extends tg.r1 {
    public final /* synthetic */ ww0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw0(ww0 ww0Var, Context context) {
        super(context);
        this.N = ww0Var;
    }

    @Override // tg.r1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            ww0 ww0Var = this.N;
            ww0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, ww0Var.d.n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ww0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
