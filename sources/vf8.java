// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vf8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yf8 b;

    public /* synthetic */ vf8(yf8 yf8Var, byte b) {
        this.a = b;
        this.b = yf8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yf8 yf8Var = this.b;
        switch (b) {
            case 0:
                yf8Var.a(true);
                break;
            default:
                yf8Var.d();
                break;
        }
    }
}
