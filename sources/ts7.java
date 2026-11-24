// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt7 b;
    public final /* synthetic */ am9 c;

    public /* synthetic */ ts7(wt7 wt7Var, am9 am9Var, byte b) {
        this.a = b;
        this.b = wt7Var;
        this.c = am9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        am9 am9Var = this.c;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                wt7Var.D0(am9Var, true);
                break;
            default:
                wt7Var.B0(am9Var);
                break;
        }
    }
}
