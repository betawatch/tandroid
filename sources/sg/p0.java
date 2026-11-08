package sg;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
