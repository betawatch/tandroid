// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sc4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pd4 b;

    public /* synthetic */ sc4(pd4 pd4Var, byte b) {
        this.a = b;
        this.b = pd4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pd4 pd4Var = this.b;
        switch (b) {
            case 0:
                pd4Var.o0();
                break;
            default:
                pd4Var.n0();
                break;
        }
    }
}
