package zd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class d implements k {
    public final c[] a;

    public d(c[] cVarArr) {
        this.a = cVarArr;
    }

    @Override // zd.k
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.a) {
            l0 l0Var = cVar.f;
            if (l0Var == null) {
                kotlin.jvm.internal.j.h("handle");
                throw null;
            }
            l0Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
