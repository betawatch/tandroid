package zd;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
