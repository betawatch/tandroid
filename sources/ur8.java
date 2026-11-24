// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ur8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xr8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ur8(xr8 xr8Var, int i, byte b) {
        this.a = b;
        this.b = xr8Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        xr8 xr8Var = this.b;
        switch (b) {
            case 0:
                xr8Var.b.e(i, xr8Var.d.i(i));
                break;
            default:
                xr8Var.b.e(i, xr8Var.d.i(i));
                break;
        }
    }
}
