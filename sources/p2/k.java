package p2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public abstract class k implements Comparable {
    public final String a;
    public final j b;
    public final long c;
    public final int d;
    public final long e;
    public final b2.o f;
    public final String h;
    public final String n;
    public final long r;
    public final long s;
    public final boolean v;

    public k(String str, j jVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.a = str;
        this.b = jVar;
        this.c = j3;
        this.d = i10;
        this.e = j10;
        this.f = oVar;
        this.h = str2;
        this.n = str3;
        this.r = j11;
        this.s = j12;
        this.v = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.e;
        if (j3 > longValue) {
            return 1;
        }
        return j3 < l4.longValue() ? -1 : 0;
    }
}
