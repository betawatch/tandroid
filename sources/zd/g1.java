package zd;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class g1 extends e1 {
    public final n1 e;
    public final h1 f;
    public final q h;
    public final Object n;

    public g1(n1 n1Var, h1 h1Var, q qVar, Object obj) {
        this.e = n1Var;
        this.f = h1Var;
        this.h = qVar;
        this.n = obj;
    }

    @Override // zd.e1
    public final boolean i() {
        return false;
    }

    @Override // zd.e1
    public final void j(Throwable th2) {
        q qVar = this.h;
        q F = n1.F(qVar);
        n1 n1Var = this.e;
        h1 h1Var = this.f;
        Object obj = this.n;
        if (F == null || !n1Var.P(h1Var, F, obj)) {
            h1Var.a.c(new ee.h(2), 2);
            q F2 = n1.F(qVar);
            if (F2 == null || !n1Var.P(h1Var, F2, obj)) {
                n1Var.g(n1Var.q(h1Var, obj));
            }
        }
    }
}
