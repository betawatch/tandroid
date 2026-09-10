package v2;

import b2.s;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class k extends e {
    public final long s;

    public k(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, long j3, long j10, long j11) {
        super(hVar, mVar, 1, sVar, i10, obj, j3, j10);
        sVar.getClass();
        this.s = j11;
    }

    public long b() {
        long j3 = this.s;
        if (j3 != -1) {
            return j3 + 1;
        }
        return -1L;
    }

    public abstract boolean c();
}
