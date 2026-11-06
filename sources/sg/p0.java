package sg;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ p0(w0 w0Var, int i7) {
        this.a = i7;
        this.b = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b.a;
                if (v0Var != null) {
                    v0Var.o();
                    break;
                }
                break;
            case 1:
                w0 w0Var = this.b;
                w0Var.c.a(w0Var.r);
                u0 u0Var = w0Var.d;
                u0Var.getClass();
                u0Var.postRunnable(new s0(u0Var, 2));
                w0Var.d = null;
                break;
            default:
                w0 w0Var2 = this.b;
                w0Var2.c.q(w0Var2.y);
                break;
        }
    }
}
