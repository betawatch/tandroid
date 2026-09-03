package w4;

import v4.j;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g extends j implements Comparable {
    public long v;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (d(4) != gVar.d(4)) {
            return d(4) ? 1 : -1;
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
