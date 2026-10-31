package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ha;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w0 extends rh.e4 {
    public final /* synthetic */ int t3 = 0;
    public final /* synthetic */ ha u3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(l1 l1Var, Context context, int i10, long j10, p6 p6Var) {
        super(context, i10, j10, p6Var, null);
        this.u3 = l1Var;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public int R() {
        switch (this.t3) {
            case 1:
                return ((rh.e4) this.u3).R();
            default:
                return super.R();
        }
    }

    @Override // rh.e4, org.telegram.ui.ActionBar.z2, org.telegram.ui.ActionBar.g2
    public cc k() {
        switch (this.t3) {
            case 0:
                l1 l1Var = (l1) this.u3;
                return new cc(l1Var.c, l1Var.I0);
            default:
                return super.k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(rh.e4 e4Var, Context context, int i10, long j10, p6 p6Var, View view) {
        super(context, i10, j10, p6Var, view);
        this.u3 = e4Var;
    }
}
