package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import di.ec;
import org.telegram.messenger.pc;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.ph0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class p1 extends m8 {
    public final ec a0;
    public final int b0;
    public final org.telegram.ui.web.z0 c0;

    public p1(int i7, Context context, i6 i6Var) {
        super(context, i6Var);
        this.a0 = new ec(1, 15);
        this.c0 = new org.telegram.ui.web.z0(this, 28);
        this.b0 = i7 == 1 ? n6.Wk : n6.Dk;
    }

    @Override // org.telegram.ui.Cells.m8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean e10 = pc.e(131072);
        org.telegram.ui.web.z0 z0Var = this.c0;
        if (e10) {
            ec ecVar = this.a0;
            ecVar.d();
            ecVar.a(canvas, n6.x0(null, this.b0, false));
            bg.k.d().a(15, z0Var);
        } else {
            bg.k.d().f(z0Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.m8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bg.k.d().f(this.c0);
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        ph0 ph0Var = this.e;
        float width = (ph0Var.getWidth() / 2.0f) + ph0Var.getX();
        float height = ((ph0Var.getHeight() / 2.0f) + (ph0Var.getY() + ph0Var.getPaddingTop())) - org.telegram.messenger.g0.L(3.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - org.telegram.messenger.g0.L(16.0f), height - org.telegram.messenger.g0.L(16.0f), width + org.telegram.messenger.g0.L(16.0f), height + org.telegram.messenger.g0.L(16.0f));
        this.a0.g(rectF);
    }
}
