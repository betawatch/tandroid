// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ur8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xr8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ur8(xr8 xr8Var, int i, byte b) {
        this.a = b;
        this.b = xr8Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        xr8 xr8Var = this.b;
        switch (b) {
            case 0:
                xr8Var.b.e(i, xr8Var.d.i(i));
                break;
            default:
                xr8Var.b.e(i, xr8Var.d.i(i));
                break;
        }
    }
}
