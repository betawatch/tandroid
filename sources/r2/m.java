package r2;

import g9.i0;
import g9.l0;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends q {
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
    public final d2.s q;
    public final i0 r;
    public final i0 s;
    public final l0 t;
    public final long u;
    public final l v;
    public final i0 w;
    public final j x;

    public m(int i3, String str, List list, long j10, boolean z10, long j11, boolean z11, int i10, long j12, int i11, long j13, long j14, boolean z12, boolean z13, boolean z14, d2.s sVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        this.d = i3;
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
        this.q = sVar;
        this.r = i0.q(list2);
        this.s = i0.q(list3);
        this.t = l0.b(map);
        this.w = i0.q(list4);
        this.x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) g9.o.n(list3);
            this.u = hVar.e + hVar.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            j jVar2 = (j) g9.o.n(list2);
            this.u = jVar2.e + jVar2.c;
        }
        this.e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.u, j10) : Math.max(0L, this.u + j10) : -9223372036854775807L;
        this.f = j10 >= 0;
        this.v = lVar;
    }

    @Override // v2.a
    public final Object a(List list) {
        return this;
    }
}
