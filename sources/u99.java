// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u99 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y99 b;

    public /* synthetic */ u99(y99 y99Var, byte b) {
        this.a = b;
        this.b = y99Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        y99 y99Var = this.b;
        switch (b) {
            case 0:
                y99Var.Y0();
                break;
            default:
                y99Var.d2.O(true);
                gl.e3(new u99(y99Var, (byte) 0), 150L);
                break;
        }
    }
}
