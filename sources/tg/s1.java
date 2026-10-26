package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import bi.td;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.ak0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class s1 extends v8 {
    public final td W;
    public final int a0;
    public final org.telegram.ui.web.h1 b0;

    public s1(Context context, int i10, u6 u6Var) {
        super(context, u6Var);
        this.W = new td(1, 15);
        this.b0 = new org.telegram.ui.web.h1(this, 28);
        this.a0 = i10 == 1 ? y6.fk : y6.Mj;
    }

    @Override // org.telegram.ui.Cells.v8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        org.telegram.ui.web.h1 h1Var = this.b0;
        if (isEnabled) {
            td tdVar = this.W;
            tdVar.d();
            tdVar.a(canvas, y6.x0(null, this.a0, false));
            ag.n.d().a(15, h1Var);
        } else {
            ag.n.d().g(h1Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.v8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ag.n.d().g(this.b0);
    }

    @Override // org.telegram.ui.Cells.v8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ak0 ak0Var = this.e;
        float width = (ak0Var.getWidth() / 2.0f) + ak0Var.getX();
        float height = ((ak0Var.getHeight() / 2.0f) + (ak0Var.getY() + ak0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.W.g(rectF);
    }
}
