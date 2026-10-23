package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class r81 implements ch.a {
    public final RectF a = new RectF();
    public final /* synthetic */ y8 b;
    public final /* synthetic */ u91 c;

    public r81(u91 u91Var, y8 y8Var) {
        this.c = u91Var;
        this.b = y8Var;
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
        u91 u91Var = this.c;
        u91Var.fragmentView.getMeasuredWidth();
        u91Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(u91Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                lVar = u91Var.T;
                view = u91Var.S;
            } else if (i10 != 1 || (ccVar = u91Var.j0) == null) {
                ie ieVar = u91Var.k0;
                if (ieVar != null) {
                    lVar = ieVar.b1;
                    view = ieVar;
                } else {
                    lVar = null;
                    view = null;
                }
            } else {
                lVar = ccVar.G;
                view = ccVar;
            }
            if (lVar != null && view != null) {
                y8 y8Var = this.b;
                RectF rectF2 = this.a;
                ih.k.c(view, y8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    u91Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                lVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
