package w4;

import v4.j;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
