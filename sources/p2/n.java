package p2;

import e9.n0;
import e9.q0;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class n extends r {
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
    public final b2.s q;
    public final n0 r;
    public final n0 s;
    public final q0 t;
    public final long u;
    public final m v;
    public final n0 w;
    public final k x;

    public n(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.s sVar, List list2, List list3, m mVar, Map map, List list4, k kVar) {
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
        this.q = sVar;
        this.r = n0.u(list2);
        this.s = n0.u(list3);
        this.t = q0.a(map);
        this.w = n0.u(list4);
        this.x = kVar;
        if (!list3.isEmpty()) {
            i iVar = (i) e9.s.m(list3);
            this.u = iVar.e + iVar.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            k kVar2 = (k) e9.s.m(list2);
            this.u = kVar2.e + kVar2.c;
        }
        this.e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.u, j10) : Math.max(0L, this.u + j10) : -9223372036854775807L;
        this.f = j10 >= 0;
        this.v = mVar;
    }

    @Override // t2.a
    public final Object a(List list) {
        return this;
    }
}
