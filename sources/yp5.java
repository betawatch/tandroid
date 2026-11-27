// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
