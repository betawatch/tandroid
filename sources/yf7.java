// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yf7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gg7 b;

    public /* synthetic */ yf7(gg7 gg7Var, byte b) {
        this.a = b;
        this.b = gg7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gg7 gg7Var = this.b;
        switch (b) {
            case 0:
                gg7Var.dismiss();
                break;
            case 1:
                gg7Var.b1(true, false);
                break;
            default:
                gg7Var.b1(true, false);
                break;
        }
    }
}
