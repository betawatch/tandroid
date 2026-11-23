package p4;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;
    public final /* synthetic */ h1 c;

    public /* synthetic */ h0(n0 n0Var, h1 h1Var, int i7) {
        this.a = i7;
        this.b = n0Var;
        this.c = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                q4.q qVar = n0Var.n;
                h1 h1Var = this.c;
                qVar.f(n0Var.h0(h1Var));
                n0Var.j.w(h1Var.u().a(17) ? h1Var.z0() : e2.l1.a);
                break;
            default:
                n0 n0Var2 = this.b;
                n0Var2.n.f(n0Var2.h0(this.c));
                break;
        }
    }
}
