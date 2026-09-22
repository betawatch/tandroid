package zd;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
