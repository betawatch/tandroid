package u2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class v1 extends m {
    public final a k;

    public v1(a aVar) {
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

    @Override // u2.m
    public final h0 u(Object obj, h0 h0Var) {
        return z(h0Var);
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
    public final void x(Object obj, a aVar, b2.o1 o1Var) {
        A(o1Var);
    }

    public h0 z(h0 h0Var) {
        return h0Var;
    }
}
