// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
