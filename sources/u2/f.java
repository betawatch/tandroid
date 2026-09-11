package u2;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class f extends r {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public f(b2.k1 k1Var, long j3, long j10, boolean z10) {
        super(k1Var);
        if (j10 != Long.MIN_VALUE && j10 < j3) {
            throw new g(2, j3, j10);
        }
        boolean z11 = false;
        if (k1Var.h() != 1) {
            throw new g(0);
        }
        b2.j1 m10 = k1Var.m(0, new b2.j1(), 0L);
        long max = Math.max(0L, j3);
        if (!z10 && !m10.k && max != 0 && !m10.h) {
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
        this.h = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
        if (m10.i && (max2 == -9223372036854775807L || (j11 != -9223372036854775807L && max2 == j11))) {
            z11 = true;
        }
        this.i = z11;
    }

    @Override // u2.r, b2.k1
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        this.e.f(0, h1Var, z10);
        long j3 = h1Var.e - this.f;
        long j10 = this.h;
        h1Var.h(h1Var.a, h1Var.b, 0, j10 != -9223372036854775807L ? j10 - j3 : -9223372036854775807L, j3, b2.b.c, false);
        return h1Var;
    }

    @Override // u2.r, b2.k1
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        this.e.m(0, j1Var, 0L);
        long j10 = j1Var.p;
        long j11 = this.f;
        j1Var.p = j10 + j11;
        j1Var.m = this.h;
        j1Var.i = this.i;
        long j12 = j1Var.l;
        if (j12 != -9223372036854775807L) {
            long max = Math.max(j12, j11);
            j1Var.l = max;
            long j13 = this.g;
            if (j13 != -9223372036854775807L) {
                max = Math.min(max, j13);
            }
            j1Var.l = max - j11;
        }
        long e02 = e2.d0.e0(j11);
        long j14 = j1Var.e;
        if (j14 != -9223372036854775807L) {
            j1Var.e = j14 + e02;
        }
        long j15 = j1Var.f;
        if (j15 != -9223372036854775807L) {
            j1Var.f = j15 + e02;
        }
        return j1Var;
    }
}
