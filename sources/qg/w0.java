package qg;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ w0(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b1 b1Var = this.b.a;
                if (b1Var != null) {
                    b1Var.b();
                    break;
                }
                break;
            case 1:
                c1 c1Var = this.b;
                c1Var.c.a(c1Var.r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                break;
            default:
                c1 c1Var2 = this.b;
                c1Var2.c.q(c1Var2.x);
                break;
        }
    }
}
