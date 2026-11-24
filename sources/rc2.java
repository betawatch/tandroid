// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rc2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zc2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ rc2(zc2 zc2Var, long j, byte b) {
        this.a = b;
        this.b = zc2Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        zc2 zc2Var = this.b;
        switch (b) {
            case 0:
                zc2Var.n = j;
                zc2Var.r = true;
                zc2Var.c0();
                break;
            default:
                zc2Var.h0(j);
                break;
        }
    }
}
