package zd;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class y1 extends ee.q implements Runnable {
    public final long e;

    public y1(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.e = j3;
    }

    @Override // zd.n1
    public final String E() {
        return super.E() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0.i(this.c);
        j(new x1("Timed out waiting for " + this.e + " ms", this));
    }
}
