// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
