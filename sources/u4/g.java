package u4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class g implements Comparable {
    public final String a;
    public final f b;
    public final long c;
    public final int d;
    public final long e;
    public final o3.h f;
    public final String h;
    public final String n;
    public final long r;
    public final long s;
    public final boolean v;

    public g(String str, f fVar, long j10, int i10, long j11, o3.h hVar, String str2, String str3, long j12, long j13, boolean z4) {
        this.a = str;
        this.b = fVar;
        this.c = j10;
        this.d = i10;
        this.e = j11;
        this.f = hVar;
        this.h = str2;
        this.n = str3;
        this.r = j12;
        this.s = j13;
        this.v = z4;
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
