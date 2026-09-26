package zd;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
