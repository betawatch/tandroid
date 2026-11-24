// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class sx4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tx3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ sx4(tx3 tx3Var, int i, byte b) {
        this.a = b;
        this.b = tx3Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        tx3 tx3Var = this.b;
        switch (b) {
            case 0:
                eu6 eu6Var = ((ux4) ((xl3) tx3Var.f).d).d;
                if (eu6Var != null) {
                    eu6Var.j(i);
                    break;
                }
                break;
            default:
                eu6 eu6Var2 = ((ux4) ((xl3) tx3Var.f).d).d;
                if (eu6Var2 != null) {
                    eu6Var2.k(i);
                    break;
                }
                break;
        }
    }
}
