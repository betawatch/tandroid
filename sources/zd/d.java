package zd;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
            o0 o0Var = cVar.f;
            if (o0Var == null) {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
            o0Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
