package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import di.bc;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.fh0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m1 extends l8 {
    public final bc a0;
    public final int b0;
    public final q2.d c0;

    public m1(int i7, Context context, e6 e6Var) {
        super(context, e6Var);
        this.a0 = new bc(1, 15);
        this.c0 = new q2.d(this, 25);
        this.b0 = i7 == 1 ? j6.Wk : j6.Dk;
    }

    @Override // org.telegram.ui.Cells.l8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean e10 = qc.e(131072);
        q2.d dVar = this.c0;
        if (e10) {
            bc bcVar = this.a0;
            bcVar.d();
            bcVar.a(canvas, j6.x0(null, this.b0, false));
            bg.k.d().a(15, dVar);
        } else {
            bg.k.d().f(dVar);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.l8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bg.k.d().f(this.c0);
    }

    @Override // org.telegram.ui.Cells.l8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        fh0 fh0Var = this.e;
        float width = (fh0Var.getWidth() / 2.0f) + fh0Var.getX();
        float height = ((fh0Var.getHeight() / 2.0f) + (fh0Var.getY() + fh0Var.getPaddingTop())) - org.telegram.messenger.g0.L(3.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - org.telegram.messenger.g0.L(16.0f), height - org.telegram.messenger.g0.L(16.0f), width + org.telegram.messenger.g0.L(16.0f), height + org.telegram.messenger.g0.L(16.0f));
        this.a0.g(rectF);
    }
}
