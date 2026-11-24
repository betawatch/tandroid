// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class p28 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y5b b;

    public /* synthetic */ p28(y5b y5bVar, byte b) {
        this.a = b;
        this.b = y5bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        y5b y5bVar = this.b;
        switch (b) {
            case 0:
                y5bVar.dismiss();
                break;
            case 1:
                y5bVar.dismiss();
                break;
            default:
                y5bVar.onBackPressed();
                break;
        }
    }
}
