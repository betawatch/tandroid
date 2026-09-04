package yh;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ v2(g4 g4Var, int i10) {
        this.a = i10;
        this.b = g4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t3 t3Var = this.b.d;
                if (!t3Var.l.isEmpty()) {
                    t3Var.l.clear();
                    t3Var.h();
                    break;
                }
                break;
            case 1:
                t3 t3Var2 = this.b.d;
                if (!t3Var2.k.isEmpty()) {
                    t3Var2.k.clear();
                    t3Var2.h();
                    break;
                }
                break;
            case 2:
                t3 t3Var3 = this.b.d;
                if (!t3Var3.j.isEmpty()) {
                    t3Var3.j.clear();
                    t3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.d.i(s3.b);
                break;
            case 4:
                this.b.d.i(s3.c);
                break;
            default:
                this.b.d.i(s3.d);
                break;
        }
    }
}
