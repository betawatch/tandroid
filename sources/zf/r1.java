package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import gh.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.pi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r1 extends p8 {
    public final bb M;
    public final int N;
    public final q1 O;

    public r1(Context context, int i9, b6 b6Var) {
        super(context, b6Var);
        this.M = new bb(1, 15);
        this.O = new q1(0, this);
        this.N = i9 == 1 ? f6.fk : f6.Mj;
    }

    @Override // org.telegram.ui.Cells.p8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        q1 q1Var = this.O;
        if (isEnabled) {
            bb bbVar = this.M;
            bbVar.d();
            bbVar.a(canvas, f6.w0(null, this.N, false));
            ff.k.d().a(15, q1Var);
        } else {
            ff.k.d().g(q1Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.p8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ff.k.d().g(this.O);
    }

    @Override // org.telegram.ui.Cells.p8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        pi0 pi0Var = this.e;
        float width = (pi0Var.getWidth() / 2.0f) + pi0Var.getX();
        float height = ((pi0Var.getHeight() / 2.0f) + (pi0Var.getY() + pi0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.M.g(rectF);
    }
}
