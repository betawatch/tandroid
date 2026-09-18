package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class w91 implements bh.a {
    public final RectF a = new RectF();
    public final /* synthetic */ x8 b;
    public final /* synthetic */ za1 c;

    public w91(za1 za1Var, x8 x8Var) {
        this.c = za1Var;
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
        za1 za1Var = this.c;
        za1Var.fragmentView.getMeasuredWidth();
        za1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(za1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                oVar = za1Var.T;
                view = za1Var.S;
            } else if (i10 != 1 || (dcVar = za1Var.j0) == null) {
                ke keVar = za1Var.k0;
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
                    za1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                oVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
