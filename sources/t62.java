// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t62 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e72 b;

    public /* synthetic */ t62(e72 e72Var, byte b) {
        this.a = b;
        this.b = e72Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e72 e72Var = this.b;
        switch (b) {
            case 0:
                e72 e72Var2 = this.b;
                e72Var2.M(true, 2147483646, 0, 0L, false);
                j47 j47Var = e72Var2.P;
                if (j47Var != null) {
                    j47Var.f(false);
                    e72Var2.P = null;
                    break;
                }
                break;
            case 1:
                e72 e72Var3 = this.b;
                e72Var3.M(false, 0, 0, 0L, false);
                j47 j47Var2 = e72Var3.P;
                if (j47Var2 != null) {
                    j47Var2.f(true);
                    e72Var3.P = null;
                    break;
                }
                break;
            case 2:
                if (!y6c.h(e72Var.n).p()) {
                    new jh8(e72Var.b.Z1, e72Var.getContext(), e72Var.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                df9 df9Var = e72Var.s;
                if (df9Var != null) {
                    df9Var.setSendEnabled(e72Var.r.I3());
                    break;
                }
                break;
            default:
                e72Var.f0();
                break;
        }
    }
}
