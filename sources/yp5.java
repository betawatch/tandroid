// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yp5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bq5 b;

    public /* synthetic */ yp5(bq5 bq5Var, byte b) {
        this.a = b;
        this.b = bq5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bq5 bq5Var = this.b;
        switch (b) {
            case 0:
                v01 v01Var = bq5Var.A;
                if (v01Var != null) {
                    bq5Var.a.g(v01Var);
                    bq5Var.A = null;
                    break;
                }
                break;
            default:
                bq5Var.a(null, true, null);
                break;
        }
    }
}
