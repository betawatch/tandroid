package p4;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                m0Var.j.w(g1Var.t().a(17) ? g1Var.y0() : e2.l1.a);
                break;
            default:
                m0 m0Var2 = this.b;
                m0Var2.n.f(m0Var2.h0(this.c));
                break;
        }
    }
}
