// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class wv8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cw8 b;

    public /* synthetic */ wv8(cw8 cw8Var, byte b) {
        this.a = b;
        this.b = cw8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cw8 cw8Var = this.b;
        switch (b) {
            case 0:
                cw8Var.e0 = true;
                break;
            case 1:
                cw8Var.v();
                break;
            default:
                if (!cw8Var.k0) {
                    wt6 wt6Var = cw8Var.J;
                    wt6Var.getClass();
                    wt6Var.f(cw8Var);
                    break;
                }
                break;
        }
    }
}
