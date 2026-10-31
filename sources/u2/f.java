package u2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends s {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public f(b2.o1 o1Var, long j10, long j11, boolean z10) {
        super(o1Var);
        if (j11 != Long.MIN_VALUE && j11 < j10) {
            throw new g(j10, 2, j11);
        }
        boolean z11 = false;
        if (o1Var.h() != 1) {
            throw new g(0);
        }
        b2.n1 m10 = o1Var.m(0, new b2.n1(), 0L);
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

    @Override // u2.s, b2.o1
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        this.e.f(0, l1Var, z10);
        long j10 = l1Var.e - this.f;
        long j11 = this.h;
        l1Var.h(l1Var.a, l1Var.b, 0, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, j10, b2.c.c, false);
        return l1Var;
    }

    @Override // u2.s, b2.o1
    public final b2.n1 m(int i10, b2.n1 n1Var, long j10) {
        this.e.m(0, n1Var, 0L);
        long j11 = n1Var.p;
        long j12 = this.f;
        n1Var.p = j11 + j12;
        n1Var.m = this.h;
        n1Var.i = this.i;
        long j13 = n1Var.l;
        if (j13 != -9223372036854775807L) {
            long max = Math.max(j13, j12);
            n1Var.l = max;
            long j14 = this.g;
            if (j14 != -9223372036854775807L) {
                max = Math.min(max, j14);
            }
            n1Var.l = max - j12;
        }
        long h02 = e2.l0.h0(j12);
        long j15 = n1Var.e;
        if (j15 != -9223372036854775807L) {
            n1Var.e = j15 + h02;
        }
        long j16 = n1Var.f;
        if (j16 != -9223372036854775807L) {
            n1Var.f = j16 + h02;
        }
        return n1Var;
    }
}
