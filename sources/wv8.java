// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
