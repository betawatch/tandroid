package sg;

import ai.ee;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.bk0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class s1 extends r8 {
    public final ee W;
    public final int a0;
    public final org.telegram.ui.web.a2 b0;

    public s1(Context context, int i10, g6 g6Var) {
        super(context, g6Var);
        this.W = new ee(1, 15);
        this.b0 = new org.telegram.ui.web.a2(this, 25);
        this.a0 = i10 == 1 ? k6.fk : k6.Mj;
    }

    @Override // org.telegram.ui.Cells.r8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        org.telegram.ui.web.a2 a2Var = this.b0;
        if (isEnabled) {
            ee eeVar = this.W;
            eeVar.d();
            eeVar.a(canvas, k6.x0(null, this.a0, false));
            zf.h.d().a(15, a2Var);
        } else {
            zf.h.d().f(a2Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.r8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zf.h.d().f(this.b0);
    }

    @Override // org.telegram.ui.Cells.r8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        bk0 bk0Var = this.e;
        float width = (bk0Var.getWidth() / 2.0f) + bk0Var.getX();
        float height = ((bk0Var.getHeight() / 2.0f) + (bk0Var.getY() + bk0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.W.g(rectF);
    }
}
