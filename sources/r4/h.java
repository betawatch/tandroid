package r4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class h implements Comparable {
    public final String a;
    public final g b;
    public final long c;
    public final int d;
    public final long e;
    public final n3.c f;
    public final String h;
    public final String n;
    public final long r;
    public final long s;
    public final boolean v;

    public h(String str, g gVar, long j10, int i10, long j11, n3.c cVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.a = str;
        this.b = gVar;
        this.c = j10;
        this.d = i10;
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
