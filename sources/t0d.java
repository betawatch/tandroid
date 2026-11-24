// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class t0d extends ur2 {
    public final rh0 k;

    public t0d(rh0 rh0Var) {
        this.k = rh0Var;
    }

    public void A(bqb bqbVar) {
        n(new yh6(bqbVar, (byte) 0));
    }

    public void B() {
        y(null, this.k);
    }

    @Override // rh0
    public boolean a(bt6 bt6Var) {
        return this.k.a(bt6Var);
    }

    @Override // rh0
    public bqb h() {
        return this.k.h();
    }

    @Override // rh0
    public final bt6 i() {
        return this.k.i();
    }

    @Override // rh0
    public boolean j() {
        return this.k.j();
    }

    @Override // rh0
    public final void m(w0c w0cVar) {
        this.j = hac.q(null);
        B();
    }

    @Override // rh0
    public void t(bt6 bt6Var) {
        this.k.t(bt6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur2
    public final rz6 u(Integer num, rz6 rz6Var) {
        return z(rz6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur2
    public final long v(long j, Integer num) {
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur2
    public final int w(int i, Integer num) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur2
    public final void x(Integer num, rh0 rh0Var, bqb bqbVar) {
        A(bqbVar);
    }

    public rz6 z(rz6 rz6Var) {
        return rz6Var;
    }
}
