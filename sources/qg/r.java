package qg;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r(p0 p0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = p0Var;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                p0 p0Var = this.b;
                w1 w1Var = p0Var.v1;
                if (hVar == p0Var.F1) {
                    p0Var.F1 = null;
                    if (!this.c) {
                        w1Var.setVisibility(8);
                    }
                    w1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                p0 p0Var2 = this.b;
                l0 l0Var = p0Var2.G1;
                if (hVar == p0Var2.M1) {
                    p0Var2.M1 = null;
                    if (!this.c) {
                        l0Var.setVisibility(8);
                        pg.t0.e(p0Var2.P1).g();
                        l0Var.getAdapter().l();
                        break;
                    }
                }
                break;
        }
    }
}
