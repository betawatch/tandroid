package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class uo0 extends org.telegram.ui.Components.im0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ dp0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo0(dp0 dp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.W2 = dp0Var;
        this.V2 = i10;
    }

    @Override // org.telegram.ui.Components.im0
    public final Integer W0(int i10) {
        dp0 dp0Var = this.W2;
        if ((i10 < dp0Var.b0 || i10 >= dp0Var.c0) && (i10 < dp0Var.d0 || i10 >= dp0Var.e0)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.im0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dp0 dp0Var = this.W2;
        if (!dp0Var.G || dp0Var.E == null || dp0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(dp0Var.E.getLeft() + dp0Var.F.getLeft(), dp0Var.F.getTop());
        dp0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        dp0 dp0Var = this.W2;
        jp0 jp0Var = dp0Var.p0;
        dp0Var.h();
        if (dp0Var.K != null) {
            if (dp0Var.J == null || !dp0Var.c()) {
                return;
            }
            dp0Var.J.g(false);
            return;
        }
        ai.x9 x9Var = this.V2 == 1 ? jp0Var.c : jp0Var.b;
        if (x9Var == null || !dp0Var.c()) {
            return;
        }
        x9Var.a();
    }
}
