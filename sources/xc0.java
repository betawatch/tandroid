// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
