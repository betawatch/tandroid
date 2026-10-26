package p2;

import f9.i0;
import f9.l0;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    public final b2.t q;
    public final i0 r;
    public final i0 s;
    public final l0 t;
    public final long u;
    public final l v;
    public final i0 w;
    public final j x;

    public m(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.t tVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        this.d = i10;
        this.h = j11;
        this.g = z10;
        this.i = z11;
        this.j = i11;
        this.k = j12;
        this.l = i12;
        this.m = j13;
        this.n = j14;
        this.o = z13;
        this.p = z14;
        this.q = tVar;
        this.r = i0.u(list2);
        this.s = i0.u(list3);
        this.t = l0.a(map);
        this.w = i0.u(list4);
        this.x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) f9.o.m(list3);
            this.u = hVar.e + hVar.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            j jVar2 = (j) f9.o.m(list2);
            this.u = jVar2.e + jVar2.c;
        }
        this.e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.u, j10) : Math.max(0L, this.u + j10) : -9223372036854775807L;
        this.f = j10 >= 0;
        this.v = lVar;
    }

    @Override // t2.a
    public final Object a(List list) {
        return this;
    }
}
