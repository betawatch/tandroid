// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tn3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ co3 b;

    public /* synthetic */ tn3(co3 co3Var, byte b) {
        this.a = b;
        this.b = co3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        co3 co3Var = this.b;
        switch (b) {
            case 0:
                co3Var.d(null);
                break;
            case 1:
                co3Var.g = true;
                co3Var.d(null);
                break;
            case 2:
                co3Var.d(null);
                break;
            default:
                co3Var.f(2, "I recorded it this morning on my way to the office.");
                break;
        }
    }
}
