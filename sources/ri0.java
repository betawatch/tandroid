// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ri0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aj0 b;

    public /* synthetic */ ri0(aj0 aj0Var, byte b) {
        this.a = b;
        this.b = aj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        aj0 aj0Var = this.b;
        switch (b) {
            case 0:
                lj0 lj0Var = aj0Var.m0;
                aod aodVar = lj0Var.c;
                if (aodVar == null) {
                    aodVar = new ij0();
                    lj0Var.c = aodVar;
                }
                aodVar.b();
                break;
            default:
                aj0Var.m0.u = false;
                break;
        }
    }
}
