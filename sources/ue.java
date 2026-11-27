// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cf7 b;

    public /* synthetic */ ue(cf7 cf7Var, byte b) {
        this.a = b;
        this.b = cf7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cf7 cf7Var = this.b;
        switch (b) {
            case 0:
                cf7Var.A(false);
                break;
            case 1:
                cf7Var.A(false);
                break;
            default:
                cf7Var.A(true);
                break;
        }
    }
}
