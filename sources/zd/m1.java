package zd;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class m1 extends k1 {
    public final u1 e;
    public final n1 f;
    public final q h;
    public final Object n;

    public m1(u1 u1Var, n1 n1Var, q qVar, Object obj) {
        this.e = u1Var;
        this.f = n1Var;
        this.h = qVar;
        this.n = obj;
    }

    @Override // zd.d1
    public final void a(Throwable th2) {
        q D = u1.D(this.h);
        u1 u1Var = this.e;
        n1 n1Var = this.f;
        Object obj = this.n;
        if (D != null) {
            while (e0.n(D.e, false, new m1(u1Var, n1Var, D, obj), 1) == w1.a) {
                D = u1.D(D);
                if (D == null) {
                }
            }
            return;
        }
        u1Var.f(u1Var.o(n1Var, obj));
    }
}
