package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tw0 extends eg.k2 {
    public final /* synthetic */ uw0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw0(uw0 uw0Var, Context context) {
        super(context);
        this.K = uw0Var;
    }

    @Override // eg.k2, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            uw0 uw0Var = this.K;
            uw0Var.d.n.k0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, uw0Var.d.n.L);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), uw0Var.d.n.k0.f);
        }
        super.dispatchDraw(canvas);
    }
}
