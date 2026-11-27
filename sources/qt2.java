// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qt2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cu2 b;

    public /* synthetic */ qt2(cu2 cu2Var, byte b) {
        this.a = b;
        this.b = cu2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cu2 cu2Var = this.b;
        switch (b) {
            case 0:
                cu2Var.d0();
                break;
            case 1:
                if (cu2Var.K) {
                    cu2Var.d.d.requestFocus();
                    hl.E3(cu2Var.d.d);
                    break;
                }
                break;
            default:
                cu2Var.presentFragment(zu1.ha(cu2Var.I), true);
                break;
        }
    }
}
