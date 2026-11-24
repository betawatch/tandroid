// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class oy6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xy6 b;

    public /* synthetic */ oy6(xy6 xy6Var, byte b) {
        this.a = b;
        this.b = xy6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xy6 xy6Var = this.b;
        switch (b) {
            case 0:
                xy6Var.e();
                break;
            case 1:
                xy6.k(xy6Var.q, true, true);
                break;
            default:
                xy6Var.e();
                break;
        }
    }
}
