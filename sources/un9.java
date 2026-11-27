// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class un9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xn9 b;

    public /* synthetic */ un9(xn9 xn9Var, byte b) {
        this.a = b;
        this.b = xn9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xn9 xn9Var = this.b;
        switch (b) {
            case 0:
                if (xn9Var.W != 0) {
                    xn9Var.V = true;
                    break;
                }
                break;
            default:
                xn9Var.c();
                break;
        }
    }
}
