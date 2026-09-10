package p2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class j implements Comparable {
    public final String a;
    public final i b;
    public final long c;
    public final int d;
    public final long e;
    public final b2.o f;
    public final String h;
    public final String n;
    public final long r;
    public final long s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.a = str;
        this.b = iVar;
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
