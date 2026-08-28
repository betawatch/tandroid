package yf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r(l0 l0Var, boolean z10, int i9) {
        this.a = i9;
        this.b = l0Var;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                t1 t1Var = l0Var.r1;
                if (hVar == l0Var.B1) {
                    l0Var.B1 = null;
                    if (!this.c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                l0 l0Var2 = this.b;
                i0 i0Var = l0Var2.C1;
                if (hVar == l0Var2.I1) {
                    l0Var2.I1 = null;
                    if (!this.c) {
                        i0Var.setVisibility(8);
                        xf.s0.e(l0Var2.L1).g();
                        i0Var.getAdapter().l();
                        break;
                    }
                }
                break;
        }
    }
}
