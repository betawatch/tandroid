// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qj6 implements Runnable {
    public final /* synthetic */ ak6 a;

    public qj6(ak6 ak6Var) {
        this.a = ak6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ak6 ak6Var = this.a;
        if (ak6Var.b == null) {
            return;
        }
        for (int i = 0; i < ak6Var.b.getChildCount(); i++) {
            View childAt = ak6Var.b.getChildAt(i);
            if (childAt instanceof xj6) {
                xj6 xj6Var = (xj6) childAt;
                if (xj6Var.J) {
                    xj6Var.b(xj6Var.n, xj6Var.r);
                }
            }
        }
        gm.d3(this, 500L);
    }
}
