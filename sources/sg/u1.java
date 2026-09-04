package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.aj0;
import zh.h8;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class u1 extends r8 {
    public final h8 Q;
    public final int R;
    public final p0 S;

    public u1(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
        this.Q = new h8(1, 15);
        this.S = new p0(this, 3);
        this.R = i10 == 1 ? j6.fk : j6.Mj;
    }

    @Override // org.telegram.ui.Cells.r8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        p0 p0Var = this.S;
        if (isEnabled) {
            h8 h8Var = this.Q;
            h8Var.d();
            h8Var.a(canvas, j6.w0(null, this.R, false));
            yf.h.d().a(15, p0Var);
        } else {
            yf.h.d().f(p0Var);
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
        aj0 aj0Var = this.e;
        float width = (aj0Var.getWidth() / 2.0f) + aj0Var.getX();
        float height = ((aj0Var.getHeight() / 2.0f) + (aj0Var.getY() + aj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.Q.g(rectF);
    }
}
