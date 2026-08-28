package p4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class h implements Comparable {
    public final String a;
    public final g b;
    public final long c;
    public final int d;
    public final long e;
    public final l3.c f;
    public final String h;
    public final String n;
    public final long r;
    public final long s;
    public final boolean v;

    public h(String str, g gVar, long j10, int i9, long j11, l3.c cVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.a = str;
        this.b = gVar;
        this.c = j10;
        this.d = i9;
        this.e = j11;
        this.f = cVar;
        this.h = str2;
        this.n = str3;
        this.r = j12;
        this.s = j13;
        this.v = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j10 = this.e;
        if (j10 > longValue) {
            return 1;
        }
        return j10 < l10.longValue() ? -1 : 0;
    }
}
