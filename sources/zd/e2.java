package zd;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class e2 extends ee.s implements Runnable {
    public final long e;

    public e2(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.e = j3;
    }

    @Override // zd.u1
    public final String C() {
        return super.C() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0.j(this.c);
        i(new d2("Timed out waiting for " + this.e + " ms", this));
    }
}
