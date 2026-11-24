// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zk1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tq9 b;

    public /* synthetic */ zk1(tq9 tq9Var, byte b) {
        this.a = b;
        this.b = tq9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tq9 tq9Var = this.b;
        switch (b) {
            case 0:
                if (!tq9Var.N) {
                    tq9Var.N = true;
                    tq9Var.a(new zk1(tq9Var, (byte) 2), false);
                    tq9Var.s.invalidate();
                    break;
                }
                break;
            case 1:
                tq9Var.dismiss();
                break;
            case 2:
                tq9Var.getClass();
                gl.d3(new zk1(tq9Var, (byte) 4));
                break;
            case 3:
                gl.d3(new zk1(tq9Var, (byte) 5));
                break;
            case 4:
                tq9Var.c();
                break;
            default:
                tq9Var.b();
                break;
        }
    }
}
