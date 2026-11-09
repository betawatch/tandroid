package sg;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ p0(v0 v0Var, int i7) {
        this.a = i7;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b.a;
                if (u0Var != null) {
                    u0Var.o();
                    break;
                }
                break;
            case 1:
                v0 v0Var = this.b;
                v0Var.c.a(v0Var.r);
                t0 t0Var = v0Var.d;
                t0Var.getClass();
                t0Var.postRunnable(new s0(t0Var, 2));
                v0Var.d = null;
                break;
            default:
                v0 v0Var2 = this.b;
                v0Var2.c.q(v0Var2.y);
                break;
        }
    }
}
