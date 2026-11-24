// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ye2 extends gb3 {
    public final on F = new on(null);
    public final /* synthetic */ kf2 G;

    public ye2(kf2 kf2Var) {
        this.G = kf2Var;
    }

    @Override // gb3
    public final void N() {
        this.F.e();
    }

    @Override // gb3
    public final void O() {
        this.G.c.invalidate();
    }

    @Override // gb3
    public final void P(s49 s49Var) {
        this.G.c.invalidate();
    }

    @Override // gb3, b49
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
