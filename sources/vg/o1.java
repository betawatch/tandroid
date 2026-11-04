package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import ci.lc;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.fh0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o1 extends l8 {
    public final lc a0;
    public final int b0;
    public final r4.u c0;

    public o1(int i3, Context context, e6 e6Var) {
        super(context, e6Var);
        this.a0 = new lc(1, 15);
        this.c0 = new r4.u(this, 22);
        this.b0 = i3 == 1 ? k6.Tk : k6.Ak;
    }

    @Override // org.telegram.ui.Cells.l8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean e10 = org.telegram.messenger.lc.e(131072);
        r4.u uVar = this.c0;
        if (e10) {
            lc lcVar = this.a0;
            lcVar.d();
            lcVar.a(canvas, k6.x0(null, this.b0, false));
            cg.j.d().a(15, uVar);
        } else {
            cg.j.d().f(uVar);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.l8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cg.j.d().f(this.c0);
    }

    @Override // org.telegram.ui.Cells.l8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        fh0 fh0Var = this.e;
        float width = (fh0Var.getWidth() / 2.0f) + fh0Var.getX();
        float height = ((fh0Var.getHeight() / 2.0f) + (fh0Var.getY() + fh0Var.getPaddingTop())) - org.telegram.messenger.g0.L(3.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - org.telegram.messenger.g0.L(16.0f), height - org.telegram.messenger.g0.L(16.0f), width + org.telegram.messenger.g0.L(16.0f), height + org.telegram.messenger.g0.L(16.0f));
        this.a0.g(rectF);
    }
}
