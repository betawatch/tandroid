package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class w91 implements bh.a {
    public final RectF a = new RectF();
    public final /* synthetic */ w8 b;
    public final /* synthetic */ za1 c;

    public w91(za1 za1Var, w8 w8Var) {
        this.c = za1Var;
        this.b = w8Var;
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
        za1 za1Var = this.c;
        za1Var.fragmentView.getMeasuredWidth();
        za1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(za1Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                nVar = za1Var.T;
                view = za1Var.S;
            } else if (i10 != 1 || (ccVar = za1Var.j0) == null) {
                je jeVar = za1Var.k0;
                if (jeVar != null) {
                    nVar = jeVar.b1;
                    view = jeVar;
                } else {
                    nVar = null;
                    view = null;
                }
            } else {
                nVar = ccVar.G;
                view = ccVar;
            }
            if (nVar != null && view != null) {
                w8 w8Var = this.b;
                RectF rectF2 = this.a;
                hh.k.c(view, w8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    za1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                nVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
