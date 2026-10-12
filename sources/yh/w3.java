package yh;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ w3(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t3 t3Var = this.b.c;
                if (!t3Var.j.isEmpty()) {
                    t3Var.j.clear();
                    t3Var.h();
                    break;
                }
                break;
            case 1:
                t3 t3Var2 = this.b.c;
                if (!t3Var2.k.isEmpty()) {
                    t3Var2.k.clear();
                    t3Var2.h();
                    break;
                }
                break;
            case 2:
                t3 t3Var3 = this.b.c;
                if (!t3Var3.l.isEmpty()) {
                    t3Var3.l.clear();
                    t3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.c.i(s3.b);
                break;
            case 4:
                this.b.c.i(s3.c);
                break;
            default:
                this.b.c.i(s3.d);
                break;
        }
    }
}
