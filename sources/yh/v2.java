package yh;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ v2(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
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
