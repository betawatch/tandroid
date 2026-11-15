package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class y90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa0 b;

    public /* synthetic */ y90(pa0 pa0Var, int i7) {
        this.a = i7;
        this.b = pa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pa0.c0(this.b);
                break;
            case 1:
                pa0 pa0Var = this.b;
                org.telegram.messenger.ta taVar = pa0Var.G;
                if (taVar != null) {
                    pa0Var.F.h(taVar);
                    pa0Var.G = null;
                    break;
                }
                break;
            case 2:
                pa0.a0(this.b);
                break;
            case 3:
                pa0 pa0Var2 = this.b;
                pa0Var2.getLocationController().o(0, pa0Var2.m0, true);
                pa0Var2.y = false;
                break;
            case 4:
                pa0 pa0Var3 = this.b;
                org.telegram.messenger.ea eaVar = pa0Var3.F;
                if (eaVar != null) {
                    eaVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), pa0Var3.t0());
                }
                if (!pa0Var3.O.getRadiusSet()) {
                    double d = pa0Var3.M;
                    if (d > 0.0d) {
                        pa0Var3.L.g1(d);
                    } else {
                        k8.a aVar = pa0Var3.L;
                        if (aVar != null) {
                            aVar.c1();
                            pa0Var3.L = null;
                        }
                    }
                }
                pa0Var3.O = null;
                break;
            case 5:
                this.b.D0();
                break;
            case 6:
                this.b.D0();
                break;
            default:
                org.telegram.messenger.g0.h3(new y90(this.b, 1));
                break;
        }
    }
}
