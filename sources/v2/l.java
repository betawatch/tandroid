package v2;

import b2.x;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
