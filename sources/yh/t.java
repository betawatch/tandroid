package yh;

import android.os.Bundle;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.h10;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ t(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                a0Var.r1.d.e3.h1(1, a0Var.L1.b);
                a0Var.i1.a(false, true);
                a0Var.q0 = true;
                h10 h10Var = a0Var.u1;
                i0.v1(h10Var.r);
                h10Var.r.clearFocus();
                break;
            case 1:
                a0 a0Var2 = this.b;
                a0Var2.t1.d.e3.h1(1, a0Var2.L1.b);
                a0Var2.j1.a(false, true);
                a0Var2.q0 = true;
                h10 h10Var2 = a0Var2.v1;
                i0.v1(h10Var2.r);
                h10Var2.r.clearFocus();
                break;
            default:
                a0 a0Var3 = this.b;
                a0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", a0Var3.l1);
                a0Var3.q1.presentFragment(new l(bundle));
                a0Var3.dismiss();
                break;
        }
    }
}
