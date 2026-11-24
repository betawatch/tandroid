// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class tq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vq3 b;
    public final /* synthetic */ wq3 c;

    public /* synthetic */ tq3(vq3 vq3Var, wq3 wq3Var, byte b) {
        this.a = b;
        this.b = vq3Var;
        this.c = wq3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wq3 wq3Var = this.c;
        vq3 vq3Var = this.b;
        switch (b) {
            case 0:
                wq3Var.I(vq3Var.a, vq3Var.b);
                break;
            default:
                wq3Var.y(vq3Var.a, vq3Var.b);
                break;
        }
    }
}
