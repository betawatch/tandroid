// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
