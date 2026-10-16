package u2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ p0(w0 w0Var, int i10) {
        this.a = i10;
        this.b = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b0 = true;
                break;
            case 1:
                this.b.t();
                break;
            default:
                w0 w0Var = this.b;
                if (!w0Var.h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.F(w0Var);
                    break;
                }
                break;
        }
    }
}
