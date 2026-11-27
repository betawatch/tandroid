// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xc0 implements ra1 {
    public final wc0[] a;

    public xc0(wc0[] wc0VarArr) {
        this.a = wc0VarArr;
    }

    @Override // ra1
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (wc0 wc0Var : this.a) {
            ep3 ep3Var = wc0Var.f;
            if (ep3Var == null) {
                ur5.e("handle");
                throw null;
            }
            ep3Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
