package p2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class k implements Comparable {
    public final String a;
    public final j b;
    public final long c;
    public final int d;
    public final long e;
    public final b2.t f;
    public final String h;
    public final String n;
    public final long r;
    public final long s;
    public final boolean v;

    public k(String str, j jVar, long j10, int i10, long j11, b2.t tVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.a = str;
        this.b = jVar;
        this.c = j10;
        this.d = i10;
        this.e = j11;
        this.f = tVar;
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
