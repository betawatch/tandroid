// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yd8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ae8 b;

    public /* synthetic */ yd8(ae8 ae8Var, byte b) {
        this.a = b;
        this.b = ae8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ae8 ae8Var = this.b;
        switch (b) {
            case 0:
                ae8Var.d.a(false);
                break;
            default:
                Runnable runnable = ae8Var.I;
                ae8Var.I = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = ae8Var.J;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
