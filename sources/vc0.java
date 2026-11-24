// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class vc0 implements ja1 {
    public final uc0[] a;

    public vc0(uc0[] uc0VarArr) {
        this.a = uc0VarArr;
    }

    @Override // ja1
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (uc0 uc0Var : this.a) {
            no3 no3Var = uc0Var.f;
            if (no3Var == null) {
                rp5.e("handle");
                throw null;
            }
            no3Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
