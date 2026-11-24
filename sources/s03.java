// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class s03 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y03 b;

    public /* synthetic */ s03(y03 y03Var, byte b) {
        this.a = b;
        this.b = y03Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        y03 y03Var = this.b;
        switch (b) {
            case 0:
                o13 o13Var = y03Var.f;
                if (o13Var != null) {
                    o13Var.M(new c03("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            default:
                o13 o13Var2 = y03Var.f;
                if (o13Var2 != null) {
                    o13Var2.M(new c03("No provider data returned.", (byte) 2));
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
        }
    }
}
