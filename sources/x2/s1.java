package x2;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class s1 extends l {
    public final a k;

    public s1(a aVar) {
        this.k = aVar;
    }

    public abstract void A(e2.l1 l1Var);

    public final void B() {
        y(null, this.k);
    }

    public void C() {
        B();
    }

    @Override // x2.a
    public boolean a(e2.l0 l0Var) {
        return this.k.a(l0Var);
    }

    @Override // x2.a
    public e2.l1 h() {
        return this.k.h();
    }

    @Override // x2.a
    public final e2.l0 i() {
        return this.k.i();
    }

    @Override // x2.a
    public boolean j() {
        return this.k.j();
    }

    @Override // x2.a
    public final void m(j2.d0 d0Var) {
        this.j = d0Var;
        this.i = h2.m0.q(null);
        C();
    }

    @Override // x2.a
    public void t(e2.l0 l0Var) {
        this.k.t(l0Var);
    }

    @Override // x2.l
    public final g0 u(Object obj, g0 g0Var) {
        return z(g0Var);
    }

    @Override // x2.l
    public final long v(Object obj, long j3) {
        return j3;
    }

    @Override // x2.l
    public final int w(int i7, Object obj) {
        return i7;
    }

    @Override // x2.l
    public final void x(Object obj, a aVar, e2.l1 l1Var) {
        A(l1Var);
    }

    public g0 z(g0 g0Var) {
        return g0Var;
    }
}
