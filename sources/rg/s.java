package rg;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ s(o0 o0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = o0Var;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                o0 o0Var = this.b;
                v1 v1Var = o0Var.v1;
                if (hVar == o0Var.F1) {
                    o0Var.F1 = null;
                    if (!this.c) {
                        v1Var.setVisibility(8);
                    }
                    v1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                o0 o0Var2 = this.b;
                l0 l0Var = o0Var2.G1;
                if (hVar == o0Var2.M1) {
                    o0Var2.M1 = null;
                    if (!this.c) {
                        l0Var.setVisibility(8);
                        qg.s0.e(o0Var2.P1).g();
                        l0Var.getAdapter().l();
                        break;
                    }
                }
                break;
        }
    }
}
