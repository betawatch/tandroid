package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class x91 implements bh.a {
    public final RectF a = new RectF();
    public final /* synthetic */ y8 b;
    public final /* synthetic */ ab1 c;

    public x91(ab1 ab1Var, y8 y8Var) {
        this.c = ab1Var;
        this.b = y8Var;
    }

    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        ah.o oVar;
        View view;
        ec ecVar;
        ab1 ab1Var = this.c;
        ab1Var.fragmentView.getMeasuredWidth();
        ab1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ab1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                oVar = ab1Var.T;
                view = ab1Var.S;
            } else if (i10 != 1 || (ecVar = ab1Var.j0) == null) {
                le leVar = ab1Var.k0;
                if (leVar != null) {
                    oVar = leVar.b1;
                    view = leVar;
                } else {
                    oVar = null;
                    view = null;
                }
            } else {
                oVar = ecVar.G;
                view = ecVar;
            }
            if (oVar != null && view != null) {
                y8 y8Var = this.b;
                RectF rectF2 = this.a;
                hh.k.c(view, y8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    ab1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                oVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
