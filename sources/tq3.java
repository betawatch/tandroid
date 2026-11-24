// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class tq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vq3 b;
    public final /* synthetic */ wq3 c;

    public /* synthetic */ tq3(vq3 vq3Var, wq3 wq3Var, byte b) {
        this.a = b;
        this.b = vq3Var;
        this.c = wq3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wq3 wq3Var = this.c;
        vq3 vq3Var = this.b;
        switch (b) {
            case 0:
                wq3Var.I(vq3Var.a, vq3Var.b);
                break;
            default:
                wq3Var.y(vq3Var.a, vq3Var.b);
                break;
        }
    }
}
