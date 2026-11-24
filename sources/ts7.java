// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt7 b;
    public final /* synthetic */ am9 c;

    public /* synthetic */ ts7(wt7 wt7Var, am9 am9Var, byte b) {
        this.a = b;
        this.b = wt7Var;
        this.c = am9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        am9 am9Var = this.c;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                wt7Var.D0(am9Var, true);
                break;
            default:
                wt7Var.B0(am9Var);
                break;
        }
    }
}
