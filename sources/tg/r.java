package tg;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r(g0 g0Var, boolean z10, int i7) {
        this.a = i7;
        this.b = g0Var;
        this.c = z10;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                j1 j1Var = g0Var.f1;
                if (gVar == g0Var.p1) {
                    g0Var.p1 = null;
                    if (!this.c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                g0 g0Var2 = this.b;
                d0 d0Var = g0Var2.q1;
                if (gVar == g0Var2.w1) {
                    g0Var2.w1 = null;
                    if (!this.c) {
                        d0Var.setVisibility(8);
                        sg.k0.e(g0Var2.z1).g();
                        d0Var.getAdapter().f();
                        break;
                    }
                }
                break;
        }
    }
}
