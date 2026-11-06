package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa0 b;

    public /* synthetic */ x90(pa0 pa0Var, int i7) {
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
                org.telegram.messenger.ua uaVar = pa0Var.F;
                if (uaVar != null) {
                    pa0Var.E.h(uaVar);
                    pa0Var.F = null;
                    break;
                }
                break;
            case 2:
                pa0.a0(this.b);
                break;
            case 3:
                pa0 pa0Var2 = this.b;
                pa0Var2.getLocationController().o(0, pa0Var2.l0, true);
                pa0Var2.y = false;
                break;
            case 4:
                pa0 pa0Var3 = this.b;
                org.telegram.messenger.fa faVar = pa0Var3.E;
                if (faVar != null) {
                    faVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), pa0Var3.t0());
                }
                if (!pa0Var3.N.getRadiusSet()) {
                    double d = pa0Var3.L;
                    if (d > 0.0d) {
                        pa0Var3.K.V0(d);
                    } else {
                        m4.d0 d0Var = pa0Var3.K;
                        if (d0Var != null) {
                            d0Var.R0();
                            pa0Var3.K = null;
                        }
                    }
                }
                pa0Var3.N = null;
                break;
            case 5:
                this.b.D0();
                break;
            case 6:
                this.b.D0();
                break;
            default:
                org.telegram.messenger.g0.h3(new x90(this.b, 1));
                break;
        }
    }
}
