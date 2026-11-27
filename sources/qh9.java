// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dg9 b;
    public final /* synthetic */ int c;

    public /* synthetic */ qh9(dg9 dg9Var, int i, byte b) {
        this.a = b;
        this.b = dg9Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        dg9 dg9Var = this.b;
        switch (b) {
            case 0:
                dg9Var.O();
                dg9Var.setSelection(Math.max(0, Math.min(i, dg9Var.length())));
                break;
            case 1:
                dg9Var.O();
                dg9Var.setSelection(Math.max(0, Math.min(i, dg9Var.length())));
                break;
            case 2:
                dg9Var.O();
                dg9Var.setSelection(Math.max(0, Math.min(i, dg9Var.length())));
                break;
            case 3:
                dg9Var.O();
                dg9Var.setSelection(Math.min(i, dg9Var.length()));
                break;
            default:
                dg9Var.O();
                dg9Var.setSelection(Math.max(0, Math.min(i, dg9Var.length())));
                break;
        }
    }
}
