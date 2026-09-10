package u2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class r1 extends m {
    public final a k;

    public r1(a aVar) {
        this.k = aVar;
    }

    public abstract void A(b2.k1 k1Var);

    public final void B() {
        y(null, this.k);
    }

    public void C() {
        B();
    }

    @Override // u2.a
    public boolean a(b2.k0 k0Var) {
        return this.k.a(k0Var);
    }

    @Override // u2.a
    public b2.k1 h() {
        return this.k.h();
    }

    @Override // u2.a
    public final b2.k0 i() {
        return this.k.i();
    }

    @Override // u2.a
    public boolean j() {
        return this.k.j();
    }

    @Override // u2.a
    public final void m(g2.c0 c0Var) {
        this.j = c0Var;
        this.i = e2.d0.o(null);
        C();
    }

    @Override // u2.a
    public void t(b2.k0 k0Var) {
        this.k.t(k0Var);
    }

    @Override // u2.m
    public final g0 u(Object obj, g0 g0Var) {
        return z(g0Var);
    }

    @Override // u2.m
    public final long v(Object obj, long j3) {
        return j3;
    }

    @Override // u2.m
    public final int w(int i10, Object obj) {
        return i10;
    }

    @Override // u2.m
    public final void x(Object obj, a aVar, b2.k1 k1Var) {
        A(k1Var);
    }

    public g0 z(g0 g0Var) {
        return g0Var;
    }
}
