package zd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
