// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class r31 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y31 b;

    public /* synthetic */ r31(y31 y31Var, byte b) {
        this.a = b;
        this.b = y31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        y31 y31Var = this.b;
        switch (b) {
            case 0:
                y31Var.i0();
                break;
            case 1:
                y31Var.m0();
                break;
            default:
                r31 r31Var = y31Var.e;
                gl.r(r31Var);
                gl.e3(r31Var, 5000L);
                break;
        }
    }
}
