// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pj7 implements tb1, amc {
    public final vb1 a;
    public final /* synthetic */ qj7 b;

    public pj7(qj7 qj7Var, vb1 vb1Var) {
        this.b = qj7Var;
        this.a = vb1Var;
    }

    @Override // amc
    public final void a(qx9 qx9Var, int i) {
        this.a.a(qx9Var, i);
    }

    @Override // tb1
    public final du2 b(Object obj, hs4 hs4Var) {
        qj7 qj7Var = this.b;
        ub1 ub1Var = new ub1(qj7Var, this);
        du2 E = this.a.E((g7c) obj, ub1Var);
        if (E != null) {
            qj7.h.set(qj7Var, null);
        }
        return E;
    }

    @Override // tb1
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // px2
    public final cy2 getContext() {
        return this.a.e;
    }

    @Override // px2
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
