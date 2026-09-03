package s4;

import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o extends n {
    public final List j;

    public o(j jVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        super(jVar, j10, j11, j12, j13, list, j14, j15, j16);
        this.j = list2;
    }

    @Override // s4.n
    public final long d(long j10) {
        return this.j.size();
    }

    @Override // s4.n
    public final j h(k kVar, long j10) {
        return (j) this.j.get((int) (j10 - this.d));
    }

    @Override // s4.n
    public final boolean i() {
        return true;
    }
}
