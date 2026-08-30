package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class to0 extends org.telegram.ui.Components.sl0 {
    public final /* synthetic */ int U2;
    public final /* synthetic */ bp0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to0(bp0 bp0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.V2 = bp0Var;
        this.U2 = i10;
    }

    @Override // org.telegram.ui.Components.sl0
    public final Integer W0(int i10) {
        bp0 bp0Var = this.V2;
        if ((i10 < bp0Var.Q || i10 >= bp0Var.R) && (i10 < bp0Var.S || i10 >= bp0Var.T)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        O0(canvas, this.V2.Q, Math.max(r0.T, r0.R) - 1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.m2), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        bp0 bp0Var = this.V2;
        gp0 gp0Var = bp0Var.g0;
        bp0.a(bp0Var);
        if (bp0Var.C != null) {
            if (bp0Var.B == null || !bp0Var.c()) {
                return;
            }
            bp0Var.B.g(false);
            return;
        }
        lh.l7 l7Var = this.U2 == 1 ? gp0Var.c : gp0Var.b;
        if (l7Var == null || !bp0Var.c()) {
            return;
        }
        l7Var.a();
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        bp0.a(this.V2);
    }
}
