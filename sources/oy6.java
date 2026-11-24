// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class oy6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xy6 b;

    public /* synthetic */ oy6(xy6 xy6Var, byte b) {
        this.a = b;
        this.b = xy6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xy6 xy6Var = this.b;
        switch (b) {
            case 0:
                xy6Var.e();
                break;
            case 1:
                xy6.k(xy6Var.q, true, true);
                break;
            default:
                xy6Var.e();
                break;
        }
    }
}
