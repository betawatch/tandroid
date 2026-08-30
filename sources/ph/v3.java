package ph;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ v3(c5 c5Var, boolean z4, int i10) {
        this.a = i10;
        this.b = c5Var;
        this.c = z4;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                c5 c5Var = this.b;
                h4 h4Var = c5Var.t1;
                if (hVar == c5Var.z1) {
                    c5Var.z1 = null;
                    if (!this.c) {
                        h4Var.setVisibility(8);
                        cg.f1.e(c5Var.C1).g();
                        h4Var.getAdapter().l();
                        break;
                    }
                }
                break;
            default:
                c5 c5Var2 = this.b;
                dg.q2 q2Var = c5Var2.j1;
                if (hVar == c5Var2.s1) {
                    c5Var2.s1 = null;
                    if (!this.c) {
                        q2Var.setVisibility(8);
                    }
                    q2Var.setMaskProvider(null);
                    break;
                }
                break;
        }
    }
}
