// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z31 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g41 b;

    public /* synthetic */ z31(g41 g41Var, byte b) {
        this.a = b;
        this.b = g41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        g41 g41Var = this.b;
        switch (b) {
            case 0:
                g41Var.i0();
                break;
            case 1:
                g41Var.m0();
                break;
            default:
                z31 z31Var = g41Var.e;
                hl.r(z31Var);
                hl.d3(z31Var, 5000L);
                break;
        }
    }
}
