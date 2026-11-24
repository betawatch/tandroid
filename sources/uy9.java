// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class uy9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zy9 b;

    public /* synthetic */ uy9(zy9 zy9Var, byte b) {
        this.a = b;
        this.b = zy9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zy9 zy9Var = this.b;
        switch (b) {
            case 0:
                zy9Var.d1(true);
                break;
            case 1:
                zy9Var.i1(true, false);
                break;
            case 2:
                zy9Var.Y0();
                break;
            case 3:
                zy9Var.i1(true, false);
                break;
            case 4:
                zy9Var.i1(true, false);
                break;
            case 5:
                zy9Var.i1(true, false);
                break;
            case 6:
                zy9Var.Z1.clear();
                zy9Var.a2.clear();
                zy9Var.dismiss();
                break;
            default:
                zy9Var.dismiss();
                break;
        }
    }
}
