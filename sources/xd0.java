// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xd0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ko b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xd0(ko koVar, Object obj, byte b) {
        this.a = b;
        this.b = koVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        ko koVar = this.b;
        switch (b) {
            case 0:
                if (koVar.a == 0) {
                    koVar.p(obj);
                    break;
                }
                break;
            default:
                int i = koVar.a - 1;
                koVar.a = i;
                if (i == 0) {
                    koVar.p(obj);
                    break;
                }
                break;
        }
    }
}
