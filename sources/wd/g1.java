package wd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // wd.e1
    public final boolean i() {
        return false;
    }

    @Override // wd.e1
    public final void j(Throwable th2) {
        q qVar = this.h;
        q F = n1.F(qVar);
        n1 n1Var = this.e;
        h1 h1Var = this.f;
        Object obj = this.n;
        if (F == null || !n1Var.P(h1Var, F, obj)) {
            h1Var.a.c(new be.h(2), 2);
            q F2 = n1.F(qVar);
            if (F2 == null || !n1Var.P(h1Var, F2, obj)) {
                n1Var.g(n1Var.q(h1Var, obj));
            }
        }
    }
}
