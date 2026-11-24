// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ue6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hj3 b;

    public /* synthetic */ ue6(hj3 hj3Var, byte b) {
        this.a = b;
        this.b = hj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hj3 hj3Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new ue6(hj3Var, (byte) 1));
                break;
            default:
                hj3Var.a("CANCELLED");
                break;
        }
    }
}
