package pg;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ y0(f1 f1Var, int i10) {
        this.a = i10;
        this.b = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e1 e1Var = this.b.a;
                if (e1Var != null) {
                    e1Var.b();
                    break;
                }
                break;
            case 1:
                f1 f1Var = this.b;
                f1Var.c.a(f1Var.r);
                d1 d1Var = f1Var.d;
                d1Var.getClass();
                d1Var.postRunnable(new b1(d1Var, 2));
                f1Var.d = null;
                break;
            default:
                f1 f1Var2 = this.b;
                f1Var2.c.q(f1Var2.x);
                break;
        }
    }
}
