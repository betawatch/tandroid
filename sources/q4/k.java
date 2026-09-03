package q4;

import g5.p;
import j3.n0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class k extends e {
    public final long s;

    public k(g5.m mVar, p pVar, n0 n0Var, int i10, Object obj, long j10, long j11, long j12) {
        super(mVar, pVar, 1, n0Var, i10, obj, j10, j11);
        n0Var.getClass();
        this.s = j12;
    }

    public long c() {
        long j10 = this.s;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean d();
}
