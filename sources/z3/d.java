package z3;

import a4.k;
import f5.d0;
import o3.s;
import o3.t;
import o3.u;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d implements t {
    public final k a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public d(k kVar, int i10, long j10, long j11) {
        this.a = kVar;
        this.b = i10;
        this.c = j10;
        long j12 = (j11 - j10) / kVar.c;
        this.d = j12;
        this.e = d0.O(j12 * i10, 1000000L, kVar.b);
    }

    @Override // o3.t
    public final boolean c() {
        return true;
    }

    @Override // o3.t
    public final s g(long j10) {
        k kVar = this.a;
        int i10 = this.b;
        long j11 = this.d - 1;
        long i11 = d0.i((kVar.b * j10) / (i10 * 1000000), 0L, j11);
        int i12 = kVar.c;
        long j12 = this.c;
        long O = d0.O(i11 * i10, 1000000L, kVar.b);
        u uVar = new u(O, (i12 * i11) + j12);
        if (O >= j10 || i11 == j11) {
            return new s(uVar, uVar);
        }
        long j13 = i11 + 1;
        return new s(uVar, new u(d0.O(j13 * i10, 1000000L, kVar.b), (i12 * j13) + j12));
    }

    @Override // o3.t
    public final long h() {
        return this.e;
    }
}
