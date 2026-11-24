// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vwb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kxb b;

    public /* synthetic */ vwb(kxb kxbVar, byte b) {
        this.a = b;
        this.b = kxbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kxb kxbVar = this.b;
        switch (b) {
            case 0:
                if (kxbVar.i()) {
                    kxbVar.j();
                    break;
                }
                break;
            default:
                axb axbVar = kxbVar.K;
                axbVar.z1(true);
                ywb ywbVar = kxbVar.y;
                ywbVar.z1(true);
                kxbVar.N.a(true, true);
                gl.V3(ywbVar);
                gl.V3(axbVar);
                break;
        }
    }
}
