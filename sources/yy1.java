// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yy1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ az1 b;

    public /* synthetic */ yy1(az1 az1Var, byte b) {
        this.a = b;
        this.b = az1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        az1 az1Var = this.b;
        switch (b) {
            case 0:
                az1Var.a();
                break;
            default:
                gl.e3(az1Var.E, 400L);
                az1Var.c();
                break;
        }
    }
}
