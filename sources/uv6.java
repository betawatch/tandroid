// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class uv6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lw6 b;

    public /* synthetic */ uv6(lw6 lw6Var, byte b) {
        this.a = b;
        this.b = lw6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lw6 lw6Var = this.b;
        switch (b) {
            case 0:
                lw6Var.m0(new uv6(lw6Var, (byte) 1));
                break;
            default:
                lw6Var.p0();
                break;
        }
    }
}
