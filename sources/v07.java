// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class v07 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e17 b;

    public /* synthetic */ v07(e17 e17Var, byte b) {
        this.a = b;
        this.b = e17Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e17 e17Var = this.b;
        switch (b) {
            case 0:
                e17Var.e();
                break;
            case 1:
                e17.k(e17Var.q, true, true);
                break;
            default:
                e17Var.e();
                break;
        }
    }
}
