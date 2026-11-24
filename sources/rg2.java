// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rg2 implements hj6, gla {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sg2 b;

    public /* synthetic */ rg2(sg2 sg2Var, byte b) {
        this.a = b;
        this.b = sg2Var;
    }

    @Override // hj6
    public final boolean a(ij6 ij6Var, boolean z) {
        wg2 wg2Var = this.b.d;
        return wg2Var.i0(wg2Var.a.E(((Integer) ij6Var.getTag()).intValue()), !z, ij6Var);
    }

    @Override // gla
    public final void i(int i) {
        byte b = this.a;
        boolean z = true;
        sg2 sg2Var = this.b;
        switch (b) {
            case 1:
                wg2 wg2Var = sg2Var.d;
                if (wg2Var.r != null) {
                    int i2 = wg2Var.p1;
                    if ((i2 <= 0 || i != 0) && (i2 != 0 || i <= 0)) {
                        z = false;
                    }
                    wg2Var.p1 = i;
                    if (z) {
                        qg2 A0 = wg2Var.A0();
                        wg2Var.F0();
                        wg2Var.D0(A0);
                    }
                    wg2Var.a.g(wg2Var.P0);
                    break;
                }
                break;
            default:
                sg2Var.d.s1 = i + 1;
                break;
        }
    }

    @Override // gla
    public final void m() {
        byte b = this.a;
    }

    private final void b() {
    }

    private final void c() {
    }
}
