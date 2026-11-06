package p4;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ g1 c;

    public /* synthetic */ h0(m0 m0Var, g1 g1Var, int i7) {
        this.a = i7;
        this.b = m0Var;
        this.c = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                q4.q qVar = m0Var.n;
                g1 g1Var = this.c;
                qVar.f(m0Var.h0(g1Var));
                m0Var.j.v(g1Var.t().a(17) ? g1Var.y0() : e2.l1.a);
                break;
            default:
                m0 m0Var2 = this.b;
                m0Var2.n.f(m0Var2.h0(this.c));
                break;
        }
    }
}
