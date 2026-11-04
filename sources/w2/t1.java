package w2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class t1 extends l {
    public final a k;

    public t1(a aVar) {
        this.k = aVar;
    }

    public abstract void A(d2.n1 n1Var);

    public final void B() {
        y(null, this.k);
    }

    public void C() {
        B();
    }

    @Override // w2.a
    public boolean a(d2.n0 n0Var) {
        return this.k.a(n0Var);
    }

    @Override // w2.a
    public d2.n1 h() {
        return this.k.h();
    }

    @Override // w2.a
    public final d2.n0 i() {
        return this.k.i();
    }

    @Override // w2.a
    public boolean j() {
        return this.k.j();
    }

    @Override // w2.a
    public final void m(i2.d0 d0Var) {
        this.j = d0Var;
        this.i = g2.n0.q(null);
        C();
    }

    @Override // w2.a
    public void t(d2.n0 n0Var) {
        this.k.t(n0Var);
    }

    @Override // w2.l
    public final g0 u(Object obj, g0 g0Var) {
        return z(g0Var);
    }

    @Override // w2.l
    public final long v(Object obj, long j10) {
        return j10;
    }

    @Override // w2.l
    public final int w(int i3, Object obj) {
        return i3;
    }

    @Override // w2.l
    public final void x(Object obj, a aVar, d2.n1 n1Var) {
        A(n1Var);
    }

    public g0 z(g0 g0Var) {
        return g0Var;
    }
}
