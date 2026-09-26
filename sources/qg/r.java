package qg;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r(n0 n0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = n0Var;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                u1 u1Var = n0Var.v1;
                if (hVar == n0Var.F1) {
                    n0Var.F1 = null;
                    if (!this.c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                n0 n0Var2 = this.b;
                k0 k0Var = n0Var2.G1;
                if (hVar == n0Var2.M1) {
                    n0Var2.M1 = null;
                    if (!this.c) {
                        k0Var.setVisibility(8);
                        pg.u0.e(n0Var2.P1).g();
                        k0Var.getAdapter().l();
                        break;
                    }
                }
                break;
        }
    }
}
