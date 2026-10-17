package yh;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
