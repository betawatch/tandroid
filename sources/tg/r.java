package tg;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r(h0 h0Var, boolean z10, int i7) {
        this.a = i7;
        this.b = h0Var;
        this.c = z10;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                h0 h0Var = this.b;
                k1 k1Var = h0Var.f1;
                if (gVar == h0Var.p1) {
                    h0Var.p1 = null;
                    if (!this.c) {
                        k1Var.setVisibility(8);
                    }
                    k1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                h0 h0Var2 = this.b;
                e0 e0Var = h0Var2.q1;
                if (gVar == h0Var2.w1) {
                    h0Var2.w1 = null;
                    if (!this.c) {
                        e0Var.setVisibility(8);
                        sg.k0.e(h0Var2.z1).g();
                        e0Var.getAdapter().f();
                        break;
                    }
                }
                break;
        }
    }
}
