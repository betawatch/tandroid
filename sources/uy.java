// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class uy implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ez b;

    public /* synthetic */ uy(ez ezVar, byte b) {
        this.a = b;
        this.b = ezVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ez ezVar = this.b;
        switch (b) {
            case 0:
                ezVar.onBackPressed();
                break;
            default:
                ezVar.a1();
                break;
        }
    }
}
