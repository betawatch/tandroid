// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class zp8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pq8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ zp8(pq8 pq8Var, int i, byte b) {
        this.a = b;
        this.b = pq8Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        pq8 pq8Var = this.b;
        switch (b) {
            case 0:
                pq8Var.f.scrollBy(0, i);
                break;
            default:
                va vaVar = pq8Var.f;
                if (vaVar != null) {
                    vaVar.setSpanCount(i);
                    break;
                }
                break;
        }
    }
}
