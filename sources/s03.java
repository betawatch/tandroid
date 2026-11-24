// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                    o13Var.L(new c03("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            default:
                o13 o13Var2 = y03Var.f;
                if (o13Var2 != null) {
                    o13Var2.L(new c03("No provider data returned.", (byte) 2));
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
        }
    }
}
