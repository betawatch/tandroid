package r2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class k implements Comparable {
    public final String a;
    public final j b;
    public final long c;
    public final int d;
    public final long e;
    public final d2.s f;
    public final String h;
    public final String n;
    public final long r;
    public final long s;
    public final boolean w;

    public k(String str, j jVar, long j10, int i3, long j11, d2.s sVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.a = str;
        this.b = jVar;
        this.c = j10;
        this.d = i3;
        this.e = j11;
        this.f = sVar;
        this.h = str2;
        this.n = str3;
        this.r = j12;
        this.s = j13;
        this.w = z10;
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
