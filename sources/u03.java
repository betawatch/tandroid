// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                    o13Var.L(obj);
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
                o13Var2.L(obj);
                return;
        }
    }
}
