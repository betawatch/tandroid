package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y91 implements bh.a {
    public final RectF a = new RectF();
    public final /* synthetic */ v8 b;
    public final /* synthetic */ bb1 c;

    public y91(bb1 bb1Var, v8 v8Var) {
        this.c = bb1Var;
        this.b = v8Var;
    }

    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        ah.n nVar;
        View view;
        cc ccVar;
        bb1 bb1Var = this.c;
        bb1Var.fragmentView.getMeasuredWidth();
        bb1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(bb1Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                nVar = bb1Var.T;
                view = bb1Var.S;
            } else if (i10 != 1 || (ccVar = bb1Var.j0) == null) {
                ke keVar = bb1Var.k0;
                if (keVar != null) {
                    nVar = keVar.b1;
                    view = keVar;
                } else {
                    nVar = null;
                    view = null;
                }
            } else {
                nVar = ccVar.G;
                view = ccVar;
            }
            if (nVar != null && view != null) {
                v8 v8Var = this.b;
                RectF rectF2 = this.a;
                hh.j.c(view, v8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    bb1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                nVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
