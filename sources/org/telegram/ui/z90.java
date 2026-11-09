package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra0 b;

    public /* synthetic */ z90(ra0 ra0Var, int i7) {
        this.a = i7;
        this.b = ra0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ra0.c0(this.b);
                break;
            case 1:
                ra0 ra0Var = this.b;
                org.telegram.messenger.ua uaVar = ra0Var.F;
                if (uaVar != null) {
                    ra0Var.E.h(uaVar);
                    ra0Var.F = null;
                    break;
                }
                break;
            case 2:
                ra0.a0(this.b);
                break;
            case 3:
                ra0 ra0Var2 = this.b;
                ra0Var2.getLocationController().o(0, ra0Var2.l0, true);
                ra0Var2.y = false;
                break;
            case 4:
                ra0 ra0Var3 = this.b;
                org.telegram.messenger.fa faVar = ra0Var3.E;
                if (faVar != null) {
                    faVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), ra0Var3.t0());
                }
                if (!ra0Var3.N.getRadiusSet()) {
                    double d = ra0Var3.L;
                    if (d > 0.0d) {
                        ra0Var3.K.V0(d);
                    } else {
                        m4.d0 d0Var = ra0Var3.K;
                        if (d0Var != null) {
                            d0Var.R0();
                            ra0Var3.K = null;
                        }
                    }
                }
                ra0Var3.N = null;
                break;
            case 5:
                this.b.D0();
                break;
            case 6:
                this.b.D0();
                break;
            default:
                org.telegram.messenger.g0.h3(new z90(this.b, 1));
                break;
        }
    }
}
