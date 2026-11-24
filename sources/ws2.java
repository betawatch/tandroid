// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ws2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ it2 b;

    public /* synthetic */ ws2(it2 it2Var, byte b) {
        this.a = b;
        this.b = it2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        it2 it2Var = this.b;
        switch (b) {
            case 0:
                it2Var.d0();
                break;
            case 1:
                if (it2Var.K) {
                    it2Var.d.d.requestFocus();
                    gl.F3(it2Var.d.d);
                    break;
                }
                break;
            default:
                it2Var.presentFragment(mu1.U9(it2Var.I), true);
                break;
        }
    }
}
