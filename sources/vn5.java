// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vn5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yn5 b;

    public /* synthetic */ vn5(yn5 yn5Var, byte b) {
        this.a = b;
        this.b = yn5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yn5 yn5Var = this.b;
        switch (b) {
            case 0:
                m01 m01Var = yn5Var.A;
                if (m01Var != null) {
                    yn5Var.a.g(m01Var);
                    yn5Var.A = null;
                    break;
                }
                break;
            default:
                yn5Var.a(null, true, null);
                break;
        }
    }
}
