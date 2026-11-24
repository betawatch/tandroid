// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mc9 b;
    public final /* synthetic */ int c;

    public /* synthetic */ yd9(mc9 mc9Var, int i, byte b) {
        this.a = b;
        this.b = mc9Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        mc9 mc9Var = this.b;
        switch (b) {
            case 0:
                mc9Var.O();
                mc9Var.setSelection(Math.max(0, Math.min(i, mc9Var.length())));
                break;
            case 1:
                mc9Var.O();
                mc9Var.setSelection(Math.max(0, Math.min(i, mc9Var.length())));
                break;
            case 2:
                mc9Var.O();
                mc9Var.setSelection(Math.max(0, Math.min(i, mc9Var.length())));
                break;
            case 3:
                mc9Var.O();
                mc9Var.setSelection(Math.min(i, mc9Var.length()));
                break;
            default:
                mc9Var.O();
                mc9Var.setSelection(Math.max(0, Math.min(i, mc9Var.length())));
                break;
        }
    }
}
