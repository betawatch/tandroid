// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class yj3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gk3 b;

    public /* synthetic */ yj3(gk3 gk3Var, byte b) {
        this.a = b;
        this.b = gk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gk3 gk3Var = this.b;
        switch (b) {
            case 0:
                for (tj3 tj3Var : gk3Var.S.f0) {
                    ((x46) tj3Var.a.getLayoutManager()).u = false;
                }
                break;
            default:
                gk3Var.K();
                break;
        }
    }
}
