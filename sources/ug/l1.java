package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import bi.ud;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.dh0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l1 extends m8 {
    public final ud W;
    public final int a0;
    public final sh.b b0;

    public l1(int i7, Context context, g6 g6Var) {
        super(context, g6Var);
        this.W = new ud(1, 15);
        this.b0 = new sh.b(this, 18);
        this.a0 = i7 == 1 ? l6.Tk : l6.Ak;
    }

    @Override // org.telegram.ui.Cells.m8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean e10 = sc.e(131072);
        sh.b bVar = this.b0;
        if (e10) {
            ud udVar = this.W;
            udVar.d();
            udVar.a(canvas, l6.x0(null, this.a0, false));
            bg.k.d().a(15, bVar);
        } else {
            bg.k.d().f(bVar);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.m8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bg.k.d().f(this.b0);
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        dh0 dh0Var = this.e;
        float width = (dh0Var.getWidth() / 2.0f) + dh0Var.getX();
        float height = ((dh0Var.getHeight() / 2.0f) + (dh0Var.getY() + dh0Var.getPaddingTop())) - org.telegram.messenger.g0.L(3.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - org.telegram.messenger.g0.L(16.0f), height - org.telegram.messenger.g0.L(16.0f), width + org.telegram.messenger.g0.L(16.0f), height + org.telegram.messenger.g0.L(16.0f));
        this.W.g(rectF);
    }
}
