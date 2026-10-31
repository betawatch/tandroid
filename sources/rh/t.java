package rh;

import android.content.Context;
import org.telegram.messenger.j20;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t extends p51 {
    public final /* synthetic */ int P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(tk0 tk0Var, Context context, int i10, int i11, boolean z10, j20 j20Var, org.telegram.ui.ActionBar.p6 p6Var, int i12) {
        super(tk0Var, context, i10, i11, z10, j20Var, p6Var);
        this.P = i12;
    }

    @Override // org.telegram.ui.Components.p51, org.telegram.ui.Components.sk0
    public boolean D(s4.c1 c1Var) {
        switch (this.P) {
            case 0:
                return false;
            default:
                return super.D(c1Var);
        }
    }

    @Override // org.telegram.ui.Components.p51
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
