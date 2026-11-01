package td;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
