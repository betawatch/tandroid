// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class xl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ im7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ xl7(im7 im7Var, long j, long j2, byte b) {
        this.a = b;
        this.b = im7Var;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        im7 im7Var = this.b;
        switch (b) {
            case 0:
                im7Var.G = j2;
                im7Var.H = j;
                break;
            default:
                im7Var.i(j2, j);
                break;
        }
    }
}
