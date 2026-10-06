package zd;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
