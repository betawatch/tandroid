// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pj2 implements gla {
    public final /* synthetic */ nj2 a;
    public final /* synthetic */ rj2 b;

    public pj2(rj2 rj2Var, nj2 nj2Var) {
        this.b = rj2Var;
        this.a = nj2Var;
    }

    @Override // gla
    public final void i(int i) {
        rj2 rj2Var = this.b;
        rj2Var.t1 = i;
        rj2Var.E0(true);
    }

    @Override // gla
    public final void m() {
        int measuredHeight = this.b.n1.getMeasuredHeight();
        nj2 nj2Var = this.a;
        nj2Var.z(0 - nj2Var.getScrollX(), measuredHeight - nj2Var.getScrollY(), false);
    }
}
