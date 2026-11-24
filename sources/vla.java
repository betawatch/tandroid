// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vla implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wla b;
    public final /* synthetic */ int c;

    public /* synthetic */ vla(wla wlaVar, int i, byte b) {
        this.a = b;
        this.b = wlaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        int i = this.c;
        wla wlaVar = this.b;
        switch (b) {
            case 0:
                wlaVar.post(new vla(wlaVar, i, b2));
                break;
            default:
                if (i == wlaVar.h) {
                    wlaVar.f = false;
                    wlaVar.d = true;
                    wlaVar.b();
                    break;
                }
                break;
        }
    }
}
