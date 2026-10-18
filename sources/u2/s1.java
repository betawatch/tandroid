package u2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class s1 extends l {
    public final a k;

    public s1(a aVar) {
        this.k = aVar;
    }

    public abstract void A(b2.o1 o1Var);

    public final void B() {
        y(null, this.k);
    }

    public void C() {
        B();
    }

    @Override // u2.a
    public boolean a(b2.o0 o0Var) {
        return this.k.a(o0Var);
    }

    @Override // u2.a
    public b2.o1 h() {
        return this.k.h();
    }

    @Override // u2.a
    public final b2.o0 i() {
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
    public void t(b2.o0 o0Var) {
        this.k.t(o0Var);
    }

    @Override // u2.l
    public final f0 u(Object obj, f0 f0Var) {
        return z(f0Var);
    }

    @Override // u2.l
    public final long v(Object obj, long j10) {
        return j10;
    }

    @Override // u2.l
    public final int w(int i10, Object obj) {
        return i10;
    }

    @Override // u2.l
    public final void x(Object obj, a aVar, b2.o1 o1Var) {
        A(o1Var);
    }

    public f0 z(f0 f0Var) {
        return f0Var;
    }
}
