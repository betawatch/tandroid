package v2;

import b2.w;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class l extends f {
    public final long s;

    public l(g2.h hVar, g2.m mVar, w wVar, int i10, Object obj, long j10, long j11, long j12) {
        super(hVar, mVar, 1, wVar, i10, obj, j10, j11);
        wVar.getClass();
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
