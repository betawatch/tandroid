// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class u85 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w85 b;

    public /* synthetic */ u85(w85 w85Var, byte b) {
        this.a = b;
        this.b = w85Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        w85 w85Var = this.b;
        switch (b) {
            case 0:
                int width = w85Var.getWidth();
                int height = w85Var.getHeight();
                if (w85Var.w && !w85Var.y && width > 0 && height > 0 && !w85Var.a.isEmpty() && w85Var.F > 0.0f && w85Var.b() && Math.abs(Math.log((width / height) / w85Var.F)) > 0.06d) {
                    w85Var.f(true);
                    break;
                }
                break;
            default:
                if (w85Var.y) {
                    w85Var.g();
                    w85Var.post(new u85(w85Var, (byte) 0));
                    break;
                }
                break;
        }
    }
}
