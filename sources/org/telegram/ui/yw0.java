package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class yw0 extends rg.p1 {
    public final /* synthetic */ zw0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw0(zw0 zw0Var, Context context) {
        super(context);
        this.N = zw0Var;
    }

    @Override // rg.p1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            zw0 zw0Var = this.N;
            zw0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, zw0Var.d.n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), zw0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
