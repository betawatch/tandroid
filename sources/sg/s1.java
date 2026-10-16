package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.bk0;
import zh.b8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class s1 extends r8 {
    public final b8 R;
    public final int S;
    public final ri.h0 T;

    public s1(Context context, int i10, c6 c6Var) {
        super(context, c6Var);
        this.R = new b8(1, 15);
        this.T = new ri.h0(this, 6);
        this.S = i10 == 1 ? g6.fk : g6.Mj;
    }

    @Override // org.telegram.ui.Cells.r8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        ri.h0 h0Var = this.T;
        if (isEnabled) {
            b8 b8Var = this.R;
            b8Var.d();
            b8Var.a(canvas, g6.x0(null, this.S, false));
            zf.i.d().a(15, h0Var);
        } else {
            zf.i.d().f(h0Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.r8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zf.i.d().f(this.T);
    }

    @Override // org.telegram.ui.Cells.r8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        bk0 bk0Var = this.e;
        float width = (bk0Var.getWidth() / 2.0f) + bk0Var.getX();
        float height = ((bk0Var.getHeight() / 2.0f) + (bk0Var.getY() + bk0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.R.g(rectF);
    }
}
