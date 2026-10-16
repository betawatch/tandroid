package u2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class t1 extends m {
    public final a k;

    public t1(a aVar) {
        this.k = aVar;
    }

    public abstract void A(b2.p1 p1Var);

    public final void B() {
        y(null, this.k);
    }

    public void C() {
        B();
    }

    @Override // u2.a
    public boolean a(b2.p0 p0Var) {
        return this.k.a(p0Var);
    }

    @Override // u2.a
    public b2.p1 h() {
        return this.k.h();
    }

    @Override // u2.a
    public final b2.p0 i() {
        return this.k.i();
    }

    @Override // u2.a
    public boolean j() {
        return this.k.j();
    }

    @Override // u2.a
    public final void m(g2.c0 c0Var) {
        this.j = c0Var;
        this.i = e2.m0.q(null);
        C();
    }

    @Override // u2.a
    public void t(b2.p0 p0Var) {
        this.k.t(p0Var);
    }

    @Override // u2.m
    public final g0 u(Object obj, g0 g0Var) {
        return z(g0Var);
    }

    @Override // u2.m
    public final long v(Object obj, long j10) {
        return j10;
    }

    @Override // u2.m
    public final int w(int i10, Object obj) {
        return i10;
    }

    @Override // u2.m
    public final void x(Object obj, a aVar, b2.p1 p1Var) {
        A(p1Var);
    }

    public g0 z(g0 g0Var) {
        return g0Var;
    }
}
