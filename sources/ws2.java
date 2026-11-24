// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ws2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ it2 b;

    public /* synthetic */ ws2(it2 it2Var, byte b) {
        this.a = b;
        this.b = it2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        it2 it2Var = this.b;
        switch (b) {
            case 0:
                it2Var.d0();
                break;
            case 1:
                if (it2Var.K) {
                    it2Var.d.d.requestFocus();
                    gl.E3(it2Var.d.d);
                    break;
                }
                break;
            default:
                it2Var.presentFragment(mu1.W9(it2Var.I), true);
                break;
        }
    }
}
