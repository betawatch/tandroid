// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xt4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ au4 b;

    public /* synthetic */ xt4(au4 au4Var, byte b) {
        this.a = b;
        this.b = au4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        au4 au4Var = this.b;
        switch (b) {
            case 0:
                au4Var.dismiss();
                break;
            default:
                au4Var.F0();
                break;
        }
    }
}
