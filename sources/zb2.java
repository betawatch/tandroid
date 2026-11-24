// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class zb2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fc2 b;

    public /* synthetic */ zb2(fc2 fc2Var, byte b) {
        this.a = b;
        this.b = fc2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fc2 fc2Var = this.b;
        switch (b) {
            case 0:
                kk7.f(fc2Var.C.a).k(kk7.v2, Long.valueOf(fc2Var.c), Long.valueOf(fc2Var.b.id), Boolean.FALSE);
                break;
            case 1:
                fc2Var.E = false;
                fc2Var.d();
                kk7.f(fc2Var.C.a).k(kk7.B2, new Object[0]);
                break;
            case 2:
            default:
                fc2Var.e();
                break;
        }
    }
}
