package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e51 b;

    public /* synthetic */ r41(e51 e51Var, int i10) {
        this.a = i10;
        this.b = e51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        e51 e51Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.vp.r1(e51Var.currentAccount).l0(null);
                break;
            case 1:
                gf.f.r(e51Var.getParentActivity(), org.telegram.messenger.cd.L0(2131752154, null));
                break;
            default:
                e51Var.c.f3.O(true);
                break;
        }
    }
}
