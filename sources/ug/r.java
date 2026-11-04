package ug;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements q1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r(f0 f0Var, boolean z10, int i3) {
        this.a = i3;
        this.b = f0Var;
        this.c = z10;
    }

    @Override // q1.c
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                i1 i1Var = f0Var.f1;
                if (gVar == f0Var.p1) {
                    f0Var.p1 = null;
                    if (!this.c) {
                        i1Var.setVisibility(8);
                    }
                    i1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                f0 f0Var2 = this.b;
                c0 c0Var = f0Var2.q1;
                if (gVar == f0Var2.w1) {
                    f0Var2.w1 = null;
                    if (!this.c) {
                        c0Var.setVisibility(8);
                        tg.k0.e(f0Var2.z1).g();
                        c0Var.getAdapter().f();
                        break;
                    }
                }
                break;
        }
    }
}
