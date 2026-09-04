package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class y91 implements ch.a {
    public final RectF a = new RectF();
    public final /* synthetic */ w8 b;
    public final /* synthetic */ bb1 c;

    public y91(bb1 bb1Var, w8 w8Var) {
        this.c = bb1Var;
        this.b = w8Var;
    }

    @Override // ch.a
    public final void e(bh.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // ch.a
    public final void f(Canvas canvas, RectF rectF) {
        bh.l lVar;
        View view;
        cc ccVar;
        bb1 bb1Var = this.c;
        bb1Var.fragmentView.getMeasuredWidth();
        bb1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(bb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                lVar = bb1Var.T;
                view = bb1Var.S;
            } else if (i10 != 1 || (ccVar = bb1Var.j0) == null) {
                ke keVar = bb1Var.k0;
                if (keVar != null) {
                    lVar = keVar.b1;
                    view = keVar;
                } else {
                    lVar = null;
                    view = null;
                }
            } else {
                lVar = ccVar.G;
                view = ccVar;
            }
            if (lVar != null && view != null) {
                w8 w8Var = this.b;
                RectF rectF2 = this.a;
                ih.k.c(view, w8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    bb1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                lVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
