package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import di.ec;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.rh0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class o1 extends n8 {
    public final ec a0;
    public final int b0;
    public final org.telegram.ui.web.z0 c0;

    public o1(int i7, Context context, h6 h6Var) {
        super(context, h6Var);
        this.a0 = new ec(1, 15);
        this.c0 = new org.telegram.ui.web.z0(this, 28);
        this.b0 = i7 == 1 ? m6.Wk : m6.Dk;
    }

    @Override // org.telegram.ui.Cells.n8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean e10 = qc.e(131072);
        org.telegram.ui.web.z0 z0Var = this.c0;
        if (e10) {
            ec ecVar = this.a0;
            ecVar.d();
            ecVar.a(canvas, m6.x0(null, this.b0, false));
            bg.k.d().a(15, z0Var);
        } else {
            bg.k.d().f(z0Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.n8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bg.k.d().f(this.c0);
    }

    @Override // org.telegram.ui.Cells.n8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        rh0 rh0Var = this.e;
        float width = (rh0Var.getWidth() / 2.0f) + rh0Var.getX();
        float height = ((rh0Var.getHeight() / 2.0f) + (rh0Var.getY() + rh0Var.getPaddingTop())) - org.telegram.messenger.g0.L(3.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - org.telegram.messenger.g0.L(16.0f), height - org.telegram.messenger.g0.L(16.0f), width + org.telegram.messenger.g0.L(16.0f), height + org.telegram.messenger.g0.L(16.0f));
        this.a0.g(rectF);
    }
}
