// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
