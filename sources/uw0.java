// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class uw0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zha b;

    public /* synthetic */ uw0(zha zhaVar, byte b) {
        this.a = b;
        this.b = zhaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zha zhaVar = this.b;
        switch (b) {
            case 0:
                zhaVar.a(true);
                break;
            case 1:
                zhaVar.a(true);
                break;
            case 2:
                if (!zhaVar.I && zhaVar.U) {
                    zhaVar.c();
                    break;
                }
                break;
            default:
                zhaVar.a(true);
                break;
        }
    }
}
