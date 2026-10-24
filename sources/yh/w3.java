package yh;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                s3 s3Var = this.b.c;
                if (!s3Var.j.isEmpty()) {
                    s3Var.j.clear();
                    s3Var.h();
                    break;
                }
                break;
            case 1:
                s3 s3Var2 = this.b.c;
                if (!s3Var2.k.isEmpty()) {
                    s3Var2.k.clear();
                    s3Var2.h();
                    break;
                }
                break;
            case 2:
                s3 s3Var3 = this.b.c;
                if (!s3Var3.l.isEmpty()) {
                    s3Var3.l.clear();
                    s3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.c.i(r3.b);
                break;
            case 4:
                this.b.c.i(r3.c);
                break;
            default:
                this.b.c.i(r3.d);
                break;
        }
    }
}
