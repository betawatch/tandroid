package u2;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ p0(x0 x0Var, int i10) {
        this.a = i10;
        this.b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b0 = true;
                break;
            case 1:
                this.b.w();
                break;
            default:
                x0 x0Var = this.b;
                if (!x0Var.h0) {
                    d0 d0Var = x0Var.I;
                    d0Var.getClass();
                    d0Var.v(x0Var);
                    break;
                }
                break;
        }
    }
}
