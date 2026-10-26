package sg;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                v1 v1Var = n0Var.k1;
                if (hVar == n0Var.u1) {
                    n0Var.u1 = null;
                    if (!this.c) {
                        v1Var.setVisibility(8);
                    }
                    v1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                n0 n0Var2 = this.b;
                k0 k0Var = n0Var2.v1;
                if (hVar == n0Var2.B1) {
                    n0Var2.B1 = null;
                    if (!this.c) {
                        k0Var.setVisibility(8);
                        rg.s0.e(n0Var2.E1).g();
                        k0Var.getAdapter().l();
                        break;
                    }
                }
                break;
        }
    }
}
