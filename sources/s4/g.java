package s4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends r4.j implements Comparable {
    public long r;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (isEndOfStream() != gVar.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j10 = this.d - gVar.d;
        if (j10 == 0) {
            j10 = this.r - gVar.r;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
