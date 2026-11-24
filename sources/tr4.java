// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wr4 b;

    public /* synthetic */ tr4(wr4 wr4Var, byte b) {
        this.a = b;
        this.b = wr4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wr4 wr4Var = this.b;
        switch (b) {
            case 0:
                wr4Var.dismiss();
                break;
            default:
                wr4Var.E0();
                break;
        }
    }
}
