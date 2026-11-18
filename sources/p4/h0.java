package p4;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ i1 c;

    public /* synthetic */ h0(m0 m0Var, i1 i1Var, int i7) {
        this.a = i7;
        this.b = m0Var;
        this.c = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                q4.q qVar = m0Var.n;
                i1 i1Var = this.c;
                qVar.f(m0Var.h0(i1Var));
                m0Var.j.w(i1Var.t().a(17) ? i1Var.y0() : e2.l1.a);
                break;
            default:
                m0 m0Var2 = this.b;
                m0Var2.n.f(m0Var2.h0(this.c));
                break;
        }
    }
}
