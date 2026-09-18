package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.bj0;
import yh.k8;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class q1 extends r8 {
    public final k8 Q;
    public final int R;
    public final org.telegram.ui.web.u0 S;

    public q1(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
        this.Q = new k8(1, 15);
        this.S = new org.telegram.ui.web.u0(this, 29);
        this.R = i10 == 1 ? j6.fk : j6.Mj;
    }

    @Override // org.telegram.ui.Cells.r8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        org.telegram.ui.web.u0 u0Var = this.S;
        if (isEnabled) {
            k8 k8Var = this.Q;
            k8Var.d();
            k8Var.a(canvas, j6.w0(null, this.R, false));
            yf.h.d().a(15, u0Var);
        } else {
            yf.h.d().f(u0Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.r8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yf.h.d().f(this.S);
    }

    @Override // org.telegram.ui.Cells.r8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        bj0 bj0Var = this.e;
        float width = (bj0Var.getWidth() / 2.0f) + bj0Var.getX();
        float height = ((bj0Var.getHeight() / 2.0f) + (bj0Var.getY() + bj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.Q.g(rectF);
    }
}
