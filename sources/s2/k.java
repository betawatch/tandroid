package s2;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class k implements Comparable {
    public final String a;
    public final j b;
    public final long c;
    public final int d;
    public final long e;
    public final e2.r f;
    public final String h;
    public final String n;
    public final long r;
    public final long s;
    public final boolean w;

    public k(String str, j jVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z9) {
        this.a = str;
        this.b = jVar;
        this.c = j3;
        this.d = i7;
        this.e = j10;
        this.f = rVar;
        this.h = str2;
        this.n = str3;
        this.r = j11;
        this.s = j12;
        this.w = z9;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.e;
        if (j3 > longValue) {
            return 1;
        }
        return j3 < l10.longValue() ? -1 : 0;
    }
}
