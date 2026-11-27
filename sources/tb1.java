// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class tb1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ub1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ tb1(ub1 ub1Var, boolean z, byte b) {
        this.a = b;
        this.b = ub1Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        ub1 ub1Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    ub1Var.V0.setVisibility(8);
                    break;
                }
                break;
            default:
                if (!z) {
                    ub1Var.Z0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
