// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vf8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yf8 b;

    public /* synthetic */ vf8(yf8 yf8Var, byte b) {
        this.a = b;
        this.b = yf8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yf8 yf8Var = this.b;
        switch (b) {
            case 0:
                yf8Var.a(true);
                break;
            default:
                yf8Var.d();
                break;
        }
    }
}
