// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class zm0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dn0 b;

    public /* synthetic */ zm0(dn0 dn0Var, byte b) {
        this.a = b;
        this.b = dn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dn0 dn0Var = this.b;
        switch (b) {
            case 0:
                dn0Var.dismiss();
                break;
            default:
                dn0Var.onBackPressed();
                break;
        }
    }
}
