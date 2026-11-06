package zd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
