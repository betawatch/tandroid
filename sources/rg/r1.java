package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.fk0;
import yh.b8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class r1 extends r8 {
    public final b8 R;
    public final int S;
    public final org.telegram.ui.web.q0 T;

    public r1(Context context, int i10, e6 e6Var) {
        super(context, e6Var);
        this.R = new b8(1, 15);
        this.T = new org.telegram.ui.web.q0(this, 29);
        this.S = i10 == 1 ? i6.fk : i6.Mj;
    }

    @Override // org.telegram.ui.Cells.r8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        org.telegram.ui.web.q0 q0Var = this.T;
        if (isEnabled) {
            b8 b8Var = this.R;
            b8Var.d();
            b8Var.a(canvas, i6.x0(null, this.S, false));
            yf.h.d().a(15, q0Var);
        } else {
            yf.h.d().f(q0Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.r8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yf.h.d().f(this.T);
    }

    @Override // org.telegram.ui.Cells.r8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        fk0 fk0Var = this.e;
        float width = (fk0Var.getWidth() / 2.0f) + fk0Var.getX();
        float height = ((fk0Var.getHeight() / 2.0f) + (fk0Var.getY() + fk0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.R.g(rectF);
    }
}
