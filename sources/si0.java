// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
