package zd;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
