package p4;

import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o extends n {
    public final List j;

    public o(j jVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        super(jVar, j10, j11, j12, j13, list, j14, j15, j16);
        this.j = list2;
    }

    @Override // p4.n
    public final long d(long j10) {
        return this.j.size();
    }

    @Override // p4.n
    public final j h(k kVar, long j10) {
        return (j) this.j.get((int) (j10 - this.d));
    }

    @Override // p4.n
    public final boolean i() {
        return true;
    }
}
