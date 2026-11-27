// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w21 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c21 b;

    public /* synthetic */ w21(c21 c21Var, byte b) {
        this.a = b;
        this.b = c21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        c21 c21Var = this.b;
        switch (b) {
            case 0:
                c21Var.performHapticFeedback(3, 2);
                break;
            default:
                c21Var.performHapticFeedback(3, 2);
                break;
        }
    }
}
