package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y8 extends FragmentContextView {
    public final /* synthetic */ int X0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(j9 j9Var, Context context, j9 j9Var2, w8 w8Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, j9Var2, w8Var, false, p6Var);
        this.Y0 = j9Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.X0) {
            case 0:
                j9 j9Var = (j9) this.Y0;
                j9Var.I.i(j9Var.J, i10 == 0, true);
                break;
            default:
                nb1 nb1Var = (nb1) this.Y0;
                nb1Var.U0.i(nb1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(nb1 nb1Var, Context context, nb1 nb1Var2) {
        super(context, nb1Var2, null, false, null);
        this.Y0 = nb1Var;
    }
}
