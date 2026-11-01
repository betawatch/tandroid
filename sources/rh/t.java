package rh;

import android.content.Context;
import org.telegram.messenger.k20;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class t extends q51 {
    public final /* synthetic */ int P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(uk0 uk0Var, Context context, int i10, int i11, boolean z10, k20 k20Var, org.telegram.ui.ActionBar.p6 p6Var, int i12) {
        super(uk0Var, context, i10, i11, z10, k20Var, p6Var);
        this.P = i12;
    }

    @Override // org.telegram.ui.Components.q51, org.telegram.ui.Components.tk0
    public boolean D(s4.c1 c1Var) {
        switch (this.P) {
            case 0:
                return false;
            default:
                return super.D(c1Var);
        }
    }

    @Override // org.telegram.ui.Components.q51
    public int I(int i10) {
        switch (this.P) {
            case 1:
                if (i10 == org.telegram.ui.ActionBar.t6.i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.t6.w0(i10, this.x);
            default:
                return super.I(i10);
        }
    }
}
