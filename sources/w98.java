// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w98 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aa8 b;

    public /* synthetic */ w98(aa8 aa8Var, byte b) {
        this.a = b;
        this.b = aa8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        aa8 aa8Var = this.b;
        switch (b) {
            case 0:
                aa8Var.d();
                break;
            default:
                aa8Var.f();
                break;
        }
    }
}
