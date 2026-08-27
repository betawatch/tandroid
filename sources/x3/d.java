package x3;

import c2.a1;
import d5.g0;
import m3.s;
import m3.t;
import m3.u;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements t {
    public final a1 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public d(a1 a1Var, int i10, long j10, long j11) {
        this.a = a1Var;
        this.b = i10;
        this.c = j10;
        long j12 = (j11 - j10) / a1Var.c;
        this.d = j12;
        this.e = g0.O(j12 * i10, 1000000L, a1Var.b);
    }

    @Override // m3.t
    public final boolean e() {
        return true;
    }

    @Override // m3.t
    public final s h(long j10) {
        a1 a1Var = this.a;
        int i10 = this.b;
        long j11 = this.d - 1;
        long i11 = g0.i((a1Var.b * j10) / (i10 * 1000000), 0L, j11);
        int i12 = a1Var.c;
        long j12 = this.c;
        long O = g0.O(i11 * i10, 1000000L, a1Var.b);
        u uVar = new u(O, (i12 * i11) + j12);
        if (O >= j10 || i11 == j11) {
            return new s(uVar, uVar);
        }
        long j13 = i11 + 1;
        return new s(uVar, new u(g0.O(j13 * i10, 1000000L, a1Var.b), (i12 * j13) + j12));
    }

    @Override // m3.t
    public final long i() {
        return this.e;
    }
}
