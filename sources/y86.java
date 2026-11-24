// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class y86 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sx5 b;
    public final /* synthetic */ h96 c;

    public /* synthetic */ y86(sx5 sx5Var, h96 h96Var, byte b) {
        this.a = b;
        this.b = sx5Var;
        this.c = h96Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        h96 h96Var = this.c;
        sx5 sx5Var = this.b;
        switch (b) {
            case 0:
                sx5Var.run();
                h96Var.a();
                break;
            default:
                sx5Var.run();
                h96Var.a();
                break;
        }
    }
}
