// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class y79 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a89 b;

    public /* synthetic */ y79(a89 a89Var, byte b) {
        this.a = b;
        this.b = a89Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a89 a89Var = this.b;
        switch (b) {
            case 0:
                int i = a89Var.a;
                b89 b89Var = a89Var.w;
                if (i != 0) {
                    b89Var.onBackPressed();
                    break;
                } else {
                    b89Var.dismiss();
                    break;
                }
            default:
                gl.E3(a89Var.n.d);
                break;
        }
    }
}
