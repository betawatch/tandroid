package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class to0 extends org.telegram.ui.Components.im0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ cp0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to0(cp0 cp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.W2 = cp0Var;
        this.V2 = i10;
    }

    @Override // org.telegram.ui.Components.im0
    public final Integer W0(int i10) {
        cp0 cp0Var = this.W2;
        if ((i10 < cp0Var.b0 || i10 >= cp0Var.c0) && (i10 < cp0Var.d0 || i10 >= cp0Var.e0)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.im0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        cp0 cp0Var = this.W2;
        if (!cp0Var.G || cp0Var.E == null || cp0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(cp0Var.E.getLeft() + cp0Var.F.getLeft(), cp0Var.F.getTop());
        cp0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        cp0 cp0Var = this.W2;
        ip0 ip0Var = cp0Var.p0;
        cp0Var.h();
        if (cp0Var.K != null) {
            if (cp0Var.J == null || !cp0Var.c()) {
                return;
            }
            cp0Var.J.g(false);
            return;
        }
        ai.y9 y9Var = this.V2 == 1 ? ip0Var.c : ip0Var.b;
        if (y9Var == null || !cp0Var.c()) {
            return;
        }
        y9Var.a();
    }
}
