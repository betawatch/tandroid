package yh;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;

    public /* synthetic */ x3(f4 f4Var, int i10) {
        this.a = i10;
        this.b = f4Var;
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
