package u2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class g extends s {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public g(b2.p1 p1Var, long j10, long j11, boolean z10) {
        super(p1Var);
        if (j11 != Long.MIN_VALUE && j11 < j10) {
            throw new h(2, j10, j11);
        }
        boolean z11 = false;
        if (p1Var.h() != 1) {
            throw new h(0);
        }
        b2.o1 m10 = p1Var.m(0, new b2.o1(), 0L);
        long max = Math.max(0L, j10);
        if (!z10 && !m10.k && max != 0 && !m10.h) {
            throw new h(1);
        }
        long max2 = j11 == Long.MIN_VALUE ? m10.m : Math.max(0L, j11);
        long j12 = m10.m;
        if (j12 != -9223372036854775807L) {
            max2 = max2 > j12 ? j12 : max2;
            if (max > max2) {
                max = max2;
            }
        }
        this.f = max;
        this.g = max2;
        this.h = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (m10.i && (max2 == -9223372036854775807L || (j12 != -9223372036854775807L && max2 == j12))) {
            z11 = true;
        }
        this.i = z11;
    }

    @Override // u2.s, b2.p1
    public final b2.m1 f(int i10, b2.m1 m1Var, boolean z10) {
        this.e.f(0, m1Var, z10);
        long j10 = m1Var.e - this.f;
        long j11 = this.h;
        m1Var.h(m1Var.a, m1Var.b, 0, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, j10, b2.c.c, false);
        return m1Var;
    }

    @Override // u2.s, b2.p1
    public final b2.o1 m(int i10, b2.o1 o1Var, long j10) {
        this.e.m(0, o1Var, 0L);
        long j11 = o1Var.p;
        long j12 = this.f;
        o1Var.p = j11 + j12;
        o1Var.m = this.h;
        o1Var.i = this.i;
        long j13 = o1Var.l;
        if (j13 != -9223372036854775807L) {
            long max = Math.max(j13, j12);
            o1Var.l = max;
            long j14 = this.g;
            if (j14 != -9223372036854775807L) {
                max = Math.min(max, j14);
            }
            o1Var.l = max - j12;
        }
        long h02 = e2.m0.h0(j12);
        long j15 = o1Var.e;
        if (j15 != -9223372036854775807L) {
            o1Var.e = j15 + h02;
        }
        long j16 = o1Var.f;
        if (j16 != -9223372036854775807L) {
            o1Var.f = j16 + h02;
        }
        return o1Var;
    }
}
