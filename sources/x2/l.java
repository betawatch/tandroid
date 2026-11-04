package x2;

import d2.v;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class l extends f {
    public final long s;

    public l(i2.h hVar, i2.n nVar, v vVar, int i3, Object obj, long j10, long j11, long j12) {
        super(hVar, nVar, 1, vVar, i3, obj, j10, j11);
        vVar.getClass();
        this.s = j12;
    }

    public long b() {
        long j10 = this.s;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean c();
}
