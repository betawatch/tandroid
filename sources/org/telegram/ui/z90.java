package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa0 b;

    public /* synthetic */ z90(pa0 pa0Var, int i7) {
        this.a = i7;
        this.b = pa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pa0.b0(this.b);
                break;
            case 1:
                pa0 pa0Var = this.b;
                org.telegram.messenger.sa saVar = pa0Var.G;
                if (saVar != null) {
                    pa0Var.F.h(saVar);
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
                org.telegram.messenger.da daVar = pa0Var3.F;
                if (daVar != null) {
                    daVar.n(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), pa0Var3.t0());
                }
                if (!pa0Var3.O.getRadiusSet()) {
                    double d = pa0Var3.M;
                    if (d > 0.0d) {
                        pa0Var3.L.Z0(d);
                    } else {
                        jb.m mVar = pa0Var3.L;
                        if (mVar != null) {
                            mVar.V0();
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
                org.telegram.messenger.g0.g3(new z90(this.b, 1));
                break;
        }
    }
}
