// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class yy1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ az1 b;

    public /* synthetic */ yy1(az1 az1Var, byte b) {
        this.a = b;
        this.b = az1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        az1 az1Var = this.b;
        switch (b) {
            case 0:
                az1Var.a();
                break;
            default:
                gl.d3(az1Var.E, 400L);
                az1Var.c();
                break;
        }
    }
}
