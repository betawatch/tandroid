package zd;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class p0 extends q0 {
    public final y1 c;

    public p0(long j3, y1 y1Var) {
        super(j3);
        this.c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // zd.q0
    public final String toString() {
        return super.toString() + this.c;
    }
}
