// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class syc extends jq2 {
    public final qg0 k;

    public syc(qg0 qg0Var) {
        this.k = qg0Var;
    }

    public void A(aob aobVar) {
        n(new yf6(aobVar, (byte) 0));
    }

    public void B() {
        y(null, this.k);
    }

    @Override // qg0
    public boolean a(br6 br6Var) {
        return this.k.a(br6Var);
    }

    @Override // qg0
    public aob h() {
        return this.k.h();
    }

    @Override // qg0
    public final br6 i() {
        return this.k.i();
    }

    @Override // qg0
    public boolean j() {
        return this.k.j();
    }

    @Override // qg0
    public final void m(vyb vybVar) {
        this.j = g8c.q(null);
        B();
    }

    @Override // qg0
    public void t(br6 br6Var) {
        this.k.t(br6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jq2
    public final rx6 u(Integer num, rx6 rx6Var) {
        return z(rx6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jq2
    public final long v(long j, Integer num) {
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jq2
    public final int w(int i, Integer num) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jq2
    public final void x(Integer num, qg0 qg0Var, aob aobVar) {
        A(aobVar);
    }

    public rx6 z(rx6 rx6Var) {
        return rx6Var;
    }
}
