package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class rp0 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ aq0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp0(aq0 aq0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.W2 = aq0Var;
        this.V2 = i10;
    }

    @Override // org.telegram.ui.Components.mm0
    public final Integer W0(int i10) {
        aq0 aq0Var = this.W2;
        if ((i10 < aq0Var.b0 || i10 >= aq0Var.c0) && (i10 < aq0Var.d0 || i10 >= aq0Var.e0)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        aq0 aq0Var = this.W2;
        if (!aq0Var.G || aq0Var.E == null || aq0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(aq0Var.E.getLeft() + aq0Var.F.getLeft(), aq0Var.F.getTop());
        aq0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        aq0 aq0Var = this.W2;
        gq0 gq0Var = aq0Var.p0;
        aq0Var.h();
        if (aq0Var.K != null) {
            if (aq0Var.J == null || !aq0Var.c()) {
                return;
            }
            aq0Var.J.g(false);
            return;
        }
        zh.f5 f5Var = this.V2 == 1 ? gq0Var.c : gq0Var.b;
        if (f5Var == null || !aq0Var.c()) {
            return;
        }
        f5Var.a();
    }
}
