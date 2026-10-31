package vh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c3(b4 b4Var, boolean z10, int i10) {
        this.a = i10;
        this.b = b4Var;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                b4 b4Var = this.b;
                n3 n3Var = b4Var.f1;
                if (jVar == b4Var.l1) {
                    b4Var.l1 = null;
                    if (!this.c) {
                        n3Var.setVisibility(8);
                        ig.s0.e(b4Var.o1).g();
                        n3Var.getAdapter().f();
                        break;
                    }
                }
                break;
            default:
                b4 b4Var2 = this.b;
                jg.a2 a2Var = b4Var2.V0;
                if (jVar == b4Var2.e1) {
                    b4Var2.e1 = null;
                    if (!this.c) {
                        a2Var.setVisibility(8);
                    }
                    a2Var.setMaskProvider(null);
                    break;
                }
                break;
        }
    }
}
