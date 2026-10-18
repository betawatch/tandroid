package yh;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ u2(g4 g4Var, int i10) {
        this.a = i10;
        this.b = g4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s3 s3Var = this.b.d;
                if (!s3Var.l.isEmpty()) {
                    s3Var.l.clear();
                    s3Var.h();
                    break;
                }
                break;
            case 1:
                s3 s3Var2 = this.b.d;
                if (!s3Var2.k.isEmpty()) {
                    s3Var2.k.clear();
                    s3Var2.h();
                    break;
                }
                break;
            case 2:
                s3 s3Var3 = this.b.d;
                if (!s3Var3.j.isEmpty()) {
                    s3Var3.j.clear();
                    s3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.d.i(r3.b);
                break;
            case 4:
                this.b.d.i(r3.c);
                break;
            default:
                this.b.d.i(r3.d);
                break;
        }
    }
}
