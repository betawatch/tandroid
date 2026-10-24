package rg;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                u1 u1Var = m0Var.v1;
                if (hVar == m0Var.F1) {
                    m0Var.F1 = null;
                    if (!this.c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                m0 m0Var2 = this.b;
                j0 j0Var = m0Var2.G1;
                if (hVar == m0Var2.M1) {
                    m0Var2.M1 = null;
                    if (!this.c) {
                        j0Var.setVisibility(8);
                        qg.u0.e(m0Var2.P1).g();
                        j0Var.getAdapter().l();
                        break;
                    }
                }
                break;
        }
    }
}
