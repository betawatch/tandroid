package y2;

import e2.u;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class l extends f {
    public final long s;

    public l(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, long j3, long j10, long j11) {
        super(hVar, mVar, 1, uVar, i7, obj, j3, j10);
        uVar.getClass();
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
