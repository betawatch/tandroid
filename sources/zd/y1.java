package zd;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
