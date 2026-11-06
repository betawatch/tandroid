package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
    public final e2.r q;
    public final i0 r;
    public final i0 s;
    public final l0 t;
    public final long u;
    public final l v;
    public final i0 w;
    public final j x;

    public m(int i7, String str, List list, long j3, boolean z9, long j10, boolean z10, int i10, long j11, int i11, long j12, long j13, boolean z11, boolean z12, boolean z13, e2.r rVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z11);
        this.d = i7;
        this.h = j10;
        this.g = z9;
        this.i = z10;
        this.j = i10;
        this.k = j11;
        this.l = i11;
        this.m = j12;
        this.n = j13;
        this.o = z12;
        this.p = z13;
        this.q = rVar;
        this.r = i0.q(list2);
        this.s = i0.q(list3);
        this.t = l0.b(map);
        this.w = i0.q(list4);
        this.x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) h9.o.n(list3);
            this.u = hVar.e + hVar.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            j jVar2 = (j) h9.o.n(list2);
            this.u = jVar2.e + jVar2.c;
        }
        this.e = j3 != -9223372036854775807L ? j3 >= 0 ? Math.min(this.u, j3) : Math.max(0L, this.u + j3) : -9223372036854775807L;
        this.f = j3 >= 0;
        this.v = lVar;
    }

    @Override // w2.a
    public final Object a(List list) {
        return this;
    }
}
