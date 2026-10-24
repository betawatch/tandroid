package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class wo0 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ int Y2;
    public final /* synthetic */ fp0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(fp0 fp0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.Z2 = fp0Var;
        this.Y2 = i10;
    }

    @Override // org.telegram.ui.Components.mm0
    public final Integer X0(int i10) {
        fp0 fp0Var = this.Z2;
        if ((i10 < fp0Var.b0 || i10 >= fp0Var.c0) && (i10 < fp0Var.d0 || i10 >= fp0Var.e0)) {
            return super.X0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        fp0 fp0Var = this.Z2;
        if (!fp0Var.G || fp0Var.E == null || fp0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(fp0Var.E.getLeft() + fp0Var.F.getLeft(), fp0Var.F.getTop());
        fp0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        fp0 fp0Var = this.Z2;
        lp0 lp0Var = fp0Var.p0;
        fp0Var.h();
        if (fp0Var.K != null) {
            if (fp0Var.J == null || !fp0Var.c()) {
                return;
            }
            fp0Var.J.g(false);
            return;
        }
        ai.y9 y9Var = this.Y2 == 1 ? lp0Var.c : lp0Var.b;
        if (y9Var == null || !fp0Var.c()) {
            return;
        }
        y9Var.a();
    }
}
