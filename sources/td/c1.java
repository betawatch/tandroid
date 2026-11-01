package td;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class c1 implements d1 {
    public final ld.l a;

    public c1(ld.l lVar) {
        this.a = lVar;
    }

    @Override // td.d1
    public final void a(Throwable th2) {
        this.a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
