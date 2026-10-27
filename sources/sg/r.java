package sg;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r(m0 m0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = m0Var;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                u1 u1Var = m0Var.k1;
                if (hVar == m0Var.u1) {
                    m0Var.u1 = null;
                    if (!this.c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                m0 m0Var2 = this.b;
                j0 j0Var = m0Var2.v1;
                if (hVar == m0Var2.B1) {
                    m0Var2.B1 = null;
                    if (!this.c) {
                        j0Var.setVisibility(8);
                        rg.s0.e(m0Var2.E1).g();
                        j0Var.getAdapter().l();
                        break;
                    }
                }
                break;
        }
    }
}
