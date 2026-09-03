package u4;

import java.util.List;
import java.util.Map;
import s8.v;
import s8.x;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class i extends m {
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
    public final o3.g q;
    public final v r;
    public final v s;
    public final x t;
    public final long u;
    public final h v;

    public i(int i10, String str, List list, long j10, boolean z4, long j11, boolean z10, int i11, long j12, int i12, long j13, long j14, boolean z11, boolean z12, boolean z13, o3.g gVar, List list2, List list3, h hVar, Map map) {
        super(str, list, z11);
        this.d = i10;
        this.h = j11;
        this.g = z4;
        this.i = z10;
        this.j = i11;
        this.k = j12;
        this.l = i12;
        this.m = j13;
        this.n = j14;
        this.o = z12;
        this.p = z13;
        this.q = gVar;
        this.r = v.t(list2);
        this.s = v.t(list3);
        this.t = x.a(map);
        if (!list3.isEmpty()) {
            d dVar = (d) s8.l.h(list3);
            this.u = dVar.e + dVar.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            f fVar = (f) s8.l.h(list2);
            this.u = fVar.e + fVar.c;
        }
        this.e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.u, j10) : Math.max(0L, this.u + j10) : -9223372036854775807L;
        this.f = j10 >= 0;
        this.v = hVar;
    }

    @Override // n4.a
    public final Object a(List list) {
        return this;
    }
}
