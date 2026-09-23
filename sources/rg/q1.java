package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.bj0;
import yh.i8;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class q1 extends s8 {
    public final i8 Q;
    public final int R;
    public final org.telegram.ui.web.t0 S;

    public q1(Context context, int i10, d6 d6Var) {
        super(context, d6Var);
        this.Q = new i8(1, 15);
        this.S = new org.telegram.ui.web.t0(this, 29);
        this.R = i10 == 1 ? h6.fk : h6.Mj;
    }

    @Override // org.telegram.ui.Cells.s8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        org.telegram.ui.web.t0 t0Var = this.S;
        if (isEnabled) {
            i8 i8Var = this.Q;
            i8Var.d();
            i8Var.a(canvas, h6.w0(null, this.R, false));
            yf.h.d().a(15, t0Var);
        } else {
            yf.h.d().f(t0Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.s8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yf.h.d().f(this.S);
    }

    @Override // org.telegram.ui.Cells.s8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
