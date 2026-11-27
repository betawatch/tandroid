// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class si0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bj0 b;

    public /* synthetic */ si0(bj0 bj0Var, byte b) {
        this.a = b;
        this.b = bj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bj0 bj0Var = this.b;
        switch (b) {
            case 0:
                mj0 mj0Var = bj0Var.m0;
                rsd rsdVar = mj0Var.c;
                if (rsdVar == null) {
                    rsdVar = new jj0();
                    mj0Var.c = rsdVar;
                }
                rsdVar.b();
                break;
            default:
                bj0Var.m0.u = false;
                break;
        }
    }
}
