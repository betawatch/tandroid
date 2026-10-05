package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.nj0;
import yh.l8;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class t1 extends r8 {
    public final l8 Q;
    public final int R;
    public final s1 S;

    public t1(Context context, int i10, d6 d6Var) {
        super(context, d6Var);
        this.Q = new l8(1, 15);
        this.S = new s1(this, 0);
        this.R = i10 == 1 ? i6.fk : i6.Mj;
    }

    @Override // org.telegram.ui.Cells.r8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        s1 s1Var = this.S;
        if (isEnabled) {
            l8 l8Var = this.Q;
            l8Var.d();
            l8Var.a(canvas, i6.w0(null, this.R, false));
            yf.h.d().a(15, s1Var);
        } else {
            yf.h.d().f(s1Var);
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
        nj0 nj0Var = this.e;
        float width = (nj0Var.getWidth() / 2.0f) + nj0Var.getX();
        float height = ((nj0Var.getHeight() / 2.0f) + (nj0Var.getY() + nj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.Q.g(rectF);
    }
}
