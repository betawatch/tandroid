package x2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
    public final void m(j2.c0 c0Var) {
        this.j = c0Var;
        this.i = h2.l0.q(null);
        C();
    }

    @Override // x2.a
    public void t(e2.l0 l0Var) {
        this.k.t(l0Var);
    }

    @Override // x2.l
    public final f0 u(Object obj, f0 f0Var) {
        return z(f0Var);
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

    public f0 z(f0 f0Var) {
        return f0Var;
    }
}
