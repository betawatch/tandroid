package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ la0 b;

    public /* synthetic */ u90(la0 la0Var, int i3) {
        this.a = i3;
        this.b = la0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                la0.c0(this.b);
                break;
            case 1:
                la0 la0Var = this.b;
                org.telegram.messenger.na naVar = la0Var.G;
                if (naVar != null) {
                    la0Var.F.h(naVar);
                    la0Var.G = null;
                    break;
                }
                break;
            case 2:
                la0.a0(this.b);
                break;
            case 3:
                la0 la0Var2 = this.b;
                la0Var2.getLocationController().o(0, la0Var2.m0, true);
                la0Var2.y = false;
                break;
            case 4:
                la0 la0Var3 = this.b;
                org.telegram.messenger.z9 z9Var = la0Var3.F;
                if (z9Var != null) {
                    z9Var.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), la0Var3.t0());
                }
                if (!la0Var3.O.getRadiusSet()) {
                    double d = la0Var3.M;
                    if (d > 0.0d) {
                        la0Var3.L.e1(d);
                    } else {
                        m2.t tVar = la0Var3.L;
                        if (tVar != null) {
                            tVar.U0();
                            la0Var3.L = null;
                        }
                    }
                }
                la0Var3.O = null;
                break;
            case 5:
                this.b.D0();
                break;
            case 6:
                this.b.D0();
                break;
            default:
                org.telegram.messenger.g0.h3(new u90(this.b, 1));
                break;
        }
    }
}
