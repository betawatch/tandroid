package zd;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
