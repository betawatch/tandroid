// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class u03 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y03 b;
    public final /* synthetic */ d03 c;

    public /* synthetic */ u03(y03 y03Var, d03 d03Var, byte b) {
        this.a = b;
        this.b = y03Var;
        this.c = d03Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        y03 y03Var = this.b;
        switch (b) {
            case 0:
                o13 o13Var = y03Var.f;
                if (o13Var != null) {
                    o13Var.M(obj);
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            default:
                o13 o13Var2 = y03Var.f;
                if (o13Var2 == null) {
                    rp5.e("callback");
                    throw null;
                }
                if (obj == null) {
                    obj = new c03("No provider data returned", (byte) 2);
                }
                o13Var2.M(obj);
                return;
        }
    }
}
