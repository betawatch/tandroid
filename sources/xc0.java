// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
