// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class pf2 extends zb3 {
    public final pn F = new pn(null);
    public final /* synthetic */ bg2 G;

    public pf2(bg2 bg2Var) {
        this.G = bg2Var;
    }

    @Override // zb3
    public final void N() {
        this.F.e();
    }

    @Override // zb3
    public final void O() {
        this.G.c.invalidate();
    }

    @Override // zb3
    public final void P(f89 f89Var) {
        this.G.c.invalidate();
    }

    @Override // zb3, o79
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.d();
        }
        super.m();
    }
}
