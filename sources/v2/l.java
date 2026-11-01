package v2;

import b2.x;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class l extends f {
    public final long s;

    public l(g2.h hVar, g2.n nVar, x xVar, int i10, Object obj, long j10, long j11, long j12) {
        super(hVar, nVar, 1, xVar, i10, obj, j10, j11);
        xVar.getClass();
        this.s = j12;
    }

    public long a() {
        long j10 = this.s;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean c();
}
