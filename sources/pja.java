// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pja implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rja b;

    public /* synthetic */ pja(rja rjaVar, byte b) {
        this.a = b;
        this.b = rjaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rja rjaVar = this.b;
        switch (b) {
            case 0:
                rjaVar.W0 = false;
                if (!rjaVar.Z0 && rjaVar.X0) {
                    rjaVar.x(true);
                    break;
                }
                break;
            case 1:
                rjaVar.W0 = false;
                break;
            case 2:
                rjaVar.Z0 = false;
                if (!rjaVar.W0 && rjaVar.X0) {
                    rjaVar.x(true);
                    break;
                }
                break;
            default:
                rjaVar.Z0 = false;
                break;
        }
    }
}
