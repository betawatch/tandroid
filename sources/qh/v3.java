package qh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ v3(b5 b5Var, boolean z4, int i10) {
        this.a = i10;
        this.b = b5Var;
        this.c = z4;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                b5 b5Var = this.b;
                h4 h4Var = b5Var.t1;
                if (hVar == b5Var.z1) {
                    b5Var.z1 = null;
                    if (!this.c) {
                        h4Var.setVisibility(8);
                        dg.e1.e(b5Var.C1).g();
                        h4Var.getAdapter().l();
                        break;
                    }
                }
                break;
            default:
                b5 b5Var2 = this.b;
                eg.o2 o2Var = b5Var2.j1;
                if (hVar == b5Var2.s1) {
                    b5Var2.s1 = null;
                    if (!this.c) {
                        o2Var.setVisibility(8);
                    }
                    o2Var.setMaskProvider(null);
                    break;
                }
                break;
        }
    }
}
