// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
