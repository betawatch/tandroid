package p2;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public abstract class l implements Comparable {
    public final String a;
    public final k b;
    public final long c;
    public final int d;
    public final long e;
    public final b2.s f;
    public final String h;
    public final String n;
    public final long r;
    public final long s;
    public final boolean v;

    public l(String str, k kVar, long j10, int i10, long j11, b2.s sVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.a = str;
        this.b = kVar;
        this.c = j10;
        this.d = i10;
        this.e = j11;
        this.f = sVar;
        this.h = str2;
        this.n = str3;
        this.r = j12;
        this.s = j13;
        this.v = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j10 = this.e;
        if (j10 > longValue) {
            return 1;
        }
        return j10 < l4.longValue() ? -1 : 0;
    }
}
