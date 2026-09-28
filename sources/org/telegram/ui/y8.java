package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class y8 extends FragmentContextView {
    public final /* synthetic */ int Q0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(k9 k9Var, Context context, k9 k9Var2, w8 w8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, k9Var2, w8Var, false, d6Var);
        this.R0 = k9Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.Q0) {
            case 0:
                k9 k9Var = (k9) this.R0;
                k9Var.M.i(k9Var.N, i10 == 0, true);
                break;
            default:
                wf1 wf1Var = (wf1) this.R0;
                wf1Var.U0.i(wf1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(wf1 wf1Var, Context context, wf1 wf1Var2) {
        super(context, wf1Var2, null, false, null);
        this.R0 = wf1Var;
    }
}
