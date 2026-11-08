package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import bi.ud;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class l1 extends m8 {
    public final ud W;
    public final int a0;
    public final sg.t0 b0;

    public l1(int i7, Context context, f6 f6Var) {
        super(context, f6Var);
        this.W = new ud(1, 15);
        this.b0 = new sg.t0(this, 20);
        this.a0 = i7 == 1 ? k6.Tk : k6.Ak;
    }

    @Override // org.telegram.ui.Cells.m8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean e10 = sc.e(131072);
        sg.t0 t0Var = this.b0;
        if (e10) {
            ud udVar = this.W;
            udVar.d();
            udVar.a(canvas, k6.x0(null, this.a0, false));
            bg.k.d().a(15, t0Var);
        } else {
            bg.k.d().f(t0Var);
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
        ch0 ch0Var = this.e;
        float width = (ch0Var.getWidth() / 2.0f) + ch0Var.getX();
        float height = ((ch0Var.getHeight() / 2.0f) + (ch0Var.getY() + ch0Var.getPaddingTop())) - org.telegram.messenger.g0.L(3.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - org.telegram.messenger.g0.L(16.0f), height - org.telegram.messenger.g0.L(16.0f), width + org.telegram.messenger.g0.L(16.0f), height + org.telegram.messenger.g0.L(16.0f));
        this.W.g(rectF);
    }
}
