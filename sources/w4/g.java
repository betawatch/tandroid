package w4;

import v4.j;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g extends j implements Comparable {
    public long v;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (e(4) != gVar.e(4)) {
            return e(4) ? 1 : -1;
        }
        long j10 = this.f - gVar.f;
        if (j10 == 0) {
            j10 = this.v - gVar.v;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
