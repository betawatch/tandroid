package w2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends s {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public f(d2.n1 n1Var, long j10, long j11, boolean z10) {
        super(n1Var);
        if (j11 != Long.MIN_VALUE && j11 < j10) {
            throw new g(j10, 2, j11);
        }
        boolean z11 = false;
        if (n1Var.h() != 1) {
            throw new g(0);
        }
        d2.m1 m10 = n1Var.m(0, new d2.m1(), 0L);
        long max = Math.max(0L, j10);
        if (!z10 && !m10.k && max != 0 && !m10.h) {
            throw new g(1);
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

    @Override // w2.s, d2.n1
    public final d2.k1 f(int i3, d2.k1 k1Var, boolean z10) {
        this.e.f(0, k1Var, z10);
        long j10 = k1Var.e - this.f;
        long j11 = this.h;
        k1Var.h(k1Var.a, k1Var.b, 0, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, j10, d2.c.c, false);
        return k1Var;
    }

    @Override // w2.s, d2.n1
    public final d2.m1 m(int i3, d2.m1 m1Var, long j10) {
        this.e.m(0, m1Var, 0L);
        long j11 = m1Var.p;
        long j12 = this.f;
        m1Var.p = j11 + j12;
        m1Var.m = this.h;
        m1Var.i = this.i;
        long j13 = m1Var.l;
        if (j13 != -9223372036854775807L) {
            long max = Math.max(j13, j12);
            m1Var.l = max;
            long j14 = this.g;
            if (j14 != -9223372036854775807L) {
                max = Math.min(max, j14);
            }
            m1Var.l = max - j12;
        }
        long h02 = g2.n0.h0(j12);
        long j15 = m1Var.e;
        if (j15 != -9223372036854775807L) {
            m1Var.e = j15 + h02;
        }
        long j16 = m1Var.f;
        if (j16 != -9223372036854775807L) {
            m1Var.f = j16 + h02;
        }
        return m1Var;
    }
}
