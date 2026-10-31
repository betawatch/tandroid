package v2;

import b2.x;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
