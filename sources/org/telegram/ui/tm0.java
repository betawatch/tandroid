package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm0 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn0 b;

    public /* synthetic */ tm0(tn0 tn0Var, int i10) {
        this.a = i10;
        this.b = tn0Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                hk hkVar = this.b.I;
                if (hkVar != null) {
                    hkVar.E(num.intValue());
                    break;
                }
                break;
            default:
                tn0 tn0Var = this.b;
                tn0Var.r = false;
                tn0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    tn0Var.B0();
                    tn0Var.finishFragment();
                    tn0Var.H0();
                    break;
                }
                break;
        }
    }
}
