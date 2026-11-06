package x2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends s {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public f(e2.l1 l1Var, long j3, long j10, boolean z9) {
        super(l1Var);
        if (j10 != Long.MIN_VALUE && j10 < j3) {
            throw new g(j3, 2, j10);
        }
        boolean z10 = false;
        if (l1Var.h() != 1) {
            throw new g(0);
        }
        e2.k1 m10 = l1Var.m(0, new e2.k1(), 0L);
        long max = Math.max(0L, j3);
        if (!z9 && !m10.k && max != 0 && !m10.h) {
            throw new g(1);
        }
        long max2 = j10 == Long.MIN_VALUE ? m10.m : Math.max(0L, j10);
        long j11 = m10.m;
        if (j11 != -9223372036854775807L) {
            max2 = max2 > j11 ? j11 : max2;
            if (max > max2) {
                max = max2;
            }
        }
        this.f = max;
        this.g = max2;
        this.h = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (m10.i && (max2 == -9223372036854775807L || (j11 != -9223372036854775807L && max2 == j11))) {
            z10 = true;
        }
        this.i = z10;
    }

    @Override // x2.s, e2.l1
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z9) {
        this.e.f(0, i1Var, z9);
        long j3 = i1Var.e - this.f;
        long j10 = this.h;
        i1Var.h(i1Var.a, i1Var.b, 0, j10 != -9223372036854775807L ? j10 - j3 : -9223372036854775807L, j3, e2.c.c, false);
        return i1Var;
    }

    @Override // x2.s, e2.l1
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        this.e.m(0, k1Var, 0L);
        long j10 = k1Var.p;
        long j11 = this.f;
        k1Var.p = j10 + j11;
        k1Var.m = this.h;
        k1Var.i = this.i;
        long j12 = k1Var.l;
        if (j12 != -9223372036854775807L) {
            long max = Math.max(j12, j11);
            k1Var.l = max;
            long j13 = this.g;
            if (j13 != -9223372036854775807L) {
                max = Math.min(max, j13);
            }
            k1Var.l = max - j11;
        }
        long h02 = h2.m0.h0(j11);
        long j14 = k1Var.e;
        if (j14 != -9223372036854775807L) {
            k1Var.e = j14 + h02;
        }
        long j15 = k1Var.f;
        if (j15 != -9223372036854775807L) {
            k1Var.f = j15 + h02;
        }
        return k1Var;
    }
}
