// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ue6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hj3 b;

    public /* synthetic */ ue6(hj3 hj3Var, byte b) {
        this.a = b;
        this.b = hj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hj3 hj3Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new ue6(hj3Var, (byte) 1));
                break;
            default:
                hj3Var.a("CANCELLED");
                break;
        }
    }
}
