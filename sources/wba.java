// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wba implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iea b;
    public final /* synthetic */ int c;

    public /* synthetic */ wba(iea ieaVar, int i, byte b) {
        this.a = b;
        this.b = ieaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        iea ieaVar = this.b;
        switch (b) {
            case 0:
                ieaVar.h.scrollBy(0, i);
                break;
            case 1:
                ieaVar.h.scrollBy(0, i);
                break;
            default:
                ieaVar.h.scrollBy(0, i);
                break;
        }
    }
}
