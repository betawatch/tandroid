package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class vo0 extends org.telegram.ui.Components.tl0 {
    public final /* synthetic */ int U2;
    public final /* synthetic */ dp0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo0(dp0 dp0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.V2 = dp0Var;
        this.U2 = i10;
    }

    @Override // org.telegram.ui.Components.tl0
    public final Integer W0(int i10) {
        dp0 dp0Var = this.V2;
        if ((i10 < dp0Var.Q || i10 >= dp0Var.R) && (i10 < dp0Var.S || i10 >= dp0Var.T)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        O0(canvas, this.V2.Q, Math.max(r0.T, r0.R) - 1, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, this.m2), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        dp0 dp0Var = this.V2;
        ip0 ip0Var = dp0Var.g0;
        dp0.a(dp0Var);
        if (dp0Var.C != null) {
            if (dp0Var.B == null || !dp0Var.c()) {
                return;
            }
            dp0Var.B.g(false);
            return;
        }
        mh.l7 l7Var = this.U2 == 1 ? ip0Var.c : ip0Var.b;
        if (l7Var == null || !dp0Var.c()) {
            return;
        }
        l7Var.a();
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        dp0.a(this.V2);
    }
}
