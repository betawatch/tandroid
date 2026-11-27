// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
