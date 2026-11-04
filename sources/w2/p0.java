package w2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ p0(w0 w0Var, int i3) {
        this.a = i3;
        this.b = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = true;
                break;
            case 1:
                this.b.w();
                break;
            default:
                w0 w0Var = this.b;
                if (!w0Var.i0) {
                    d0 d0Var = w0Var.J;
                    d0Var.getClass();
                    d0Var.k(w0Var);
                    break;
                }
                break;
        }
    }
}
