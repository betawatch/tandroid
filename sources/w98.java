// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class w98 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aa8 b;

    public /* synthetic */ w98(aa8 aa8Var, byte b) {
        this.a = b;
        this.b = aa8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        aa8 aa8Var = this.b;
        switch (b) {
            case 0:
                aa8Var.d();
                break;
            default:
                aa8Var.f();
                break;
        }
    }
}
