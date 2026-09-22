package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class y91 implements bh.a {
    public final RectF a = new RectF();
    public final /* synthetic */ x8 b;
    public final /* synthetic */ bb1 c;

    public y91(bb1 bb1Var, x8 x8Var) {
        this.c = bb1Var;
        this.b = x8Var;
    }

    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        ah.o oVar;
        View view;
        dc dcVar;
        bb1 bb1Var = this.c;
        bb1Var.fragmentView.getMeasuredWidth();
        bb1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(bb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                oVar = bb1Var.T;
                view = bb1Var.S;
            } else if (i10 != 1 || (dcVar = bb1Var.j0) == null) {
                ke keVar = bb1Var.k0;
                if (keVar != null) {
                    oVar = keVar.b1;
                    view = keVar;
                } else {
                    oVar = null;
                    view = null;
                }
            } else {
                oVar = dcVar.G;
                view = dcVar;
            }
            if (oVar != null && view != null) {
                x8 x8Var = this.b;
                RectF rectF2 = this.a;
                hh.k.c(view, x8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    bb1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                oVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
