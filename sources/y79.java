// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y79 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a89 b;

    public /* synthetic */ y79(a89 a89Var, byte b) {
        this.a = b;
        this.b = a89Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a89 a89Var = this.b;
        switch (b) {
            case 0:
                int i = a89Var.a;
                b89 b89Var = a89Var.w;
                if (i != 0) {
                    b89Var.onBackPressed();
                    break;
                } else {
                    b89Var.dismiss();
                    break;
                }
            default:
                gl.F3(a89Var.n.d);
                break;
        }
    }
}
