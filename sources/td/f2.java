package td;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f2 extends yd.s implements Runnable {
    public final long e;

    public f2(long j10, cd.c cVar) {
        super(cVar, cVar.getContext());
        this.e = j10;
    }

    @Override // td.u1
    public final String C() {
        return super.C() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0.j(this.c);
        i(new e2("Timed out waiting for " + this.e + " ms", this));
    }
}
