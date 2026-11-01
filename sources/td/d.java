package td;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class d implements k {
    public final c[] a;

    public d(c[] cVarArr) {
        this.a = cVarArr;
    }

    @Override // td.k
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
