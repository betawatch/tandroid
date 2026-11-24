// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
