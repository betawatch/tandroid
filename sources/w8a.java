// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class w8a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x8a b;

    public /* synthetic */ w8a(x8a x8aVar, byte b) {
        this.a = b;
        this.b = x8aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        x8a x8aVar = this.b;
        switch (b) {
            case 0:
                if (x8aVar.x) {
                    x8aVar.d();
                    break;
                }
                break;
            default:
                x8aVar.invalidateSelf();
                break;
        }
    }
}
