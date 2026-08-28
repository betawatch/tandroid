package p4;

import java.util.List;
import java.util.Map;
import o8.b0;
import o8.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends n {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final l3.c q;
    public final z r;
    public final z s;
    public final b0 t;
    public final long u;
    public final i v;

    public j(int i9, String str, List list, long j10, boolean z10, long j11, boolean z11, int i10, long j12, int i11, long j13, long j14, boolean z12, boolean z13, boolean z14, l3.c cVar, List list2, List list3, i iVar, Map map) {
        super(str, list, z12);
        this.d = i9;
        this.h = j11;
        this.g = z10;
        this.i = z11;
        this.j = i10;
        this.k = j12;
        this.l = i11;
        this.m = j13;
        this.n = j14;
        this.o = z13;
        this.p = z14;
        this.q = cVar;
        this.r = z.u(list2);
        this.s = z.u(list3);
        this.t = b0.a(map);
        if (!list3.isEmpty()) {
            e eVar = (e) o8.l.g(list3);
            this.u = eVar.e + eVar.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            g gVar = (g) o8.l.g(list2);
            this.u = gVar.e + gVar.c;
        }
        this.e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.u, j10) : Math.max(0L, this.u + j10) : -9223372036854775807L;
        this.f = j10 >= 0;
        this.v = iVar;
    }

    @Override // i4.a
    public final Object a(List list) {
        return this;
    }
}
