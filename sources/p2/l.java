package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l extends p {
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
    public final b2.o q;
    public final i0 r;
    public final i0 s;
    public final k0 t;
    public final long u;
    public final k v;
    public final i0 w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        this.d = i10;
        this.h = j10;
        this.g = z10;
        this.i = z11;
        this.j = i11;
        this.k = j11;
        this.l = i12;
        this.m = j12;
        this.n = j13;
        this.o = z13;
        this.p = z14;
        this.q = oVar;
        this.r = i0.v(list2);
        this.s = i0.v(list3);
        this.t = k0.a(map);
        this.w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.u = gVar.e + gVar.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            i iVar = (i) e9.q.l(list2);
            this.u = iVar.e + iVar.c;
        }
        this.e = j3 != -9223372036854775807L ? j3 >= 0 ? Math.min(this.u, j3) : Math.max(0L, this.u + j3) : -9223372036854775807L;
        this.f = j3 >= 0;
        this.v = kVar;
    }

    @Override // t2.a
    public final Object a(List list) {
        return this;
    }
}
