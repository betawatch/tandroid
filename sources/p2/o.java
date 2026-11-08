package p2;

import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class o extends n {
    public final List j;

    public o(j jVar, long j3, long j10, long j11, long j12, List list, long j13, List list2, long j14, long j15) {
        super(jVar, j3, j10, j11, j12, list, j13, j14, j15);
        this.j = list2;
    }

    @Override // p2.n
    public final long d(long j3) {
        return this.j.size();
    }

    @Override // p2.n
    public final j h(k kVar, long j3) {
        return (j) this.j.get((int) (j3 - this.d));
    }

    @Override // p2.n
    public final boolean i() {
        return true;
    }
}
