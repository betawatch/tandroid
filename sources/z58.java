// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class z58 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j68 b;

    public /* synthetic */ z58(j68 j68Var, byte b) {
        this.a = b;
        this.b = j68Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j68 j68Var = this.b;
        switch (b) {
            case 0:
                o68 o68Var = j68Var.x;
                k68 k68Var = o68Var.A1;
                if (k68Var != null) {
                    lcb lcbVar = ((ccb) k68Var).d;
                    lcbVar.Z0 = false;
                    lcbVar.U();
                }
                o68Var.c1(false);
                o68Var.R2 = true;
                o68Var.u0.E(true);
                break;
            case 1:
                o68 o68Var2 = j68Var.x;
                o68Var2.D3 = true;
                o68Var2.setActive(false);
                break;
            case 2:
                o68 o68Var3 = j68Var.x;
                o68Var3.D3 = true;
                o68Var3.setActive(false);
                break;
            default:
                ((ccb) j68Var.x.A1).g(false);
                break;
        }
    }
}
