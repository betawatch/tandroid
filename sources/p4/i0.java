package p4;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;
    public final /* synthetic */ i1 c;

    public /* synthetic */ i0(n0 n0Var, i1 i1Var, int i7) {
        this.a = i7;
        this.b = n0Var;
        this.c = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                q4.q qVar = n0Var.n;
                i1 i1Var = this.c;
                qVar.f(n0Var.h0(i1Var));
                n0Var.j.w(i1Var.t().a(17) ? i1Var.y0() : e2.l1.a);
                break;
            default:
                n0 n0Var2 = this.b;
                n0Var2.n.f(n0Var2.h0(this.c));
                break;
        }
    }
}
