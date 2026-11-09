package sg;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ q0(r0 r0Var, int i7) {
        this.a = i7;
        this.b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b.b.d;
                if (t0Var != null) {
                    t0Var.postRunnable(t0Var.x);
                    break;
                }
                break;
            case 1:
                t0 t0Var2 = this.b.b.d;
                if (t0Var2 != null) {
                    t0Var2.postRunnable(t0Var2.x);
                    break;
                }
                break;
            default:
                v0 v0Var = this.b.b;
                t0 t0Var3 = v0Var.d;
                t0Var3.getClass();
                t0Var3.postRunnable(new s0(t0Var3, 2));
                v0Var.d = null;
                break;
        }
    }
}
