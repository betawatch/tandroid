package zd;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class c1 implements d1 {
    public final rd.l a;

    public c1(rd.l lVar) {
        this.a = lVar;
    }

    @Override // zd.d1
    public final void a(Throwable th2) {
        this.a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
