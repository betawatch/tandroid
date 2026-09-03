package qh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ u3(a5 a5Var, boolean z4, int i10) {
        this.a = i10;
        this.b = a5Var;
        this.c = z4;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                a5 a5Var = this.b;
                g4 g4Var = a5Var.t1;
                if (hVar == a5Var.z1) {
                    a5Var.z1 = null;
                    if (!this.c) {
                        g4Var.setVisibility(8);
                        dg.e1.e(a5Var.C1).g();
                        g4Var.getAdapter().l();
                        break;
                    }
                }
                break;
            default:
                a5 a5Var2 = this.b;
                eg.o2 o2Var = a5Var2.j1;
                if (hVar == a5Var2.s1) {
                    a5Var2.s1 = null;
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
