package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b01 b;

    public /* synthetic */ yz0(b01 b01Var, int i10) {
        this.a = i10;
        this.b = b01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b01 b01Var = this.b;
                c01 c01Var = b01Var.w;
                if (b01Var.a != 0) {
                    c01Var.onBackPressed();
                    break;
                } else {
                    c01Var.dismiss();
                    break;
                }
            default:
                org.telegram.messenger.i0.J3(this.b.n.d);
                break;
        }
    }
}
