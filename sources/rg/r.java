package rg;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                t1 t1Var = m0Var.v1;
                if (hVar == m0Var.F1) {
                    m0Var.F1 = null;
                    if (!this.c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                m0 m0Var2 = this.b;
                i0 i0Var = m0Var2.G1;
                if (hVar == m0Var2.M1) {
                    m0Var2.M1 = null;
                    if (!this.c) {
                        i0Var.setVisibility(8);
                        qg.v0.e(m0Var2.P1).g();
                        i0Var.getAdapter().l();
                        break;
                    }
                }
                break;
        }
    }
}
