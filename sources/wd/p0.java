package wd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p0 extends q0 {
    public final y1 c;

    public p0(long j10, y1 y1Var) {
        super(j10);
        this.c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // wd.q0
    public final String toString() {
        return super.toString() + this.c;
    }
}
