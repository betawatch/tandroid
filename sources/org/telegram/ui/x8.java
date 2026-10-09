package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class x8 extends FragmentContextView {
    public final /* synthetic */ int R0 = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(j9 j9Var, Context context, j9 j9Var2, v8 v8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j9Var2, v8Var, false, e6Var);
        this.S0 = j9Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.R0) {
            case 0:
                j9 j9Var = (j9) this.S0;
                j9Var.M.i(j9Var.N, i10 == 0, true);
                break;
            default:
                fg1 fg1Var = (fg1) this.S0;
                fg1Var.U0.i(fg1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(fg1 fg1Var, Context context, fg1 fg1Var2) {
        super(context, fg1Var2, null, false, null);
        this.S0 = fg1Var;
    }
}
