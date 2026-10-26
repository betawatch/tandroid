package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class tw0 extends tg.r1 {
    public final /* synthetic */ uw0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw0(uw0 uw0Var, Context context) {
        super(context);
        this.N = uw0Var;
    }

    @Override // tg.r1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            uw0 uw0Var = this.N;
            uw0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, uw0Var.d.n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), uw0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
