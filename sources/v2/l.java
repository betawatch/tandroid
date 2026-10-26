package v2;

import b2.x;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class l extends f {
    public final long s;

    public l(g2.h hVar, g2.m mVar, x xVar, int i10, Object obj, long j10, long j11, long j12) {
        super(hVar, mVar, 1, xVar, i10, obj, j10, j11);
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
