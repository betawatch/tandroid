package x3;

import c2.b1;
import d5.f0;
import m3.s;
import m3.t;
import m3.u;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements t {
    public final b1 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public d(b1 b1Var, int i9, long j10, long j11) {
        this.a = b1Var;
        this.b = i9;
        this.c = j10;
        long j12 = (j11 - j10) / b1Var.c;
        this.d = j12;
        this.e = f0.O(j12 * i9, 1000000L, b1Var.b);
    }

    @Override // m3.t
    public final boolean e() {
        return true;
    }

    @Override // m3.t
    public final s h(long j10) {
        b1 b1Var = this.a;
        int i9 = this.b;
        long j11 = this.d - 1;
        long i10 = f0.i((b1Var.b * j10) / (i9 * 1000000), 0L, j11);
        int i11 = b1Var.c;
        long j12 = this.c;
        long O = f0.O(i10 * i9, 1000000L, b1Var.b);
        u uVar = new u(O, (i11 * i10) + j12);
        if (O >= j10 || i10 == j11) {
            return new s(uVar, uVar);
        }
        long j13 = i10 + 1;
        return new s(uVar, new u(f0.O(j13 * i9, 1000000L, b1Var.b), (i11 * j13) + j12));
    }

    @Override // m3.t
    public final long i() {
        return this.e;
    }
}
