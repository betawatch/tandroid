package s4;

import j3.n0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class p extends n {
    public final x5.k j;
    public final x5.k k;
    public final long l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, x5.k kVar, x5.k kVar2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.j = kVar;
        this.k = kVar2;
        this.l = j13;
    }

    @Override // s4.s
    public final j a(m mVar) {
        x5.k kVar = this.j;
        if (kVar == null) {
            return this.a;
        }
        n0 n0Var = mVar.a;
        return new j(0L, -1L, kVar.b(n0Var.n, n0Var.a, 0L, 0L));
    }

    @Override // s4.n
    public final long d(long j10) {
        if (this.f != null) {
            return r0.size();
        }
        long j11 = this.l;
        if (j11 != -1) {
            return (j11 - this.d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = t8.a.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // s4.n
    public final j h(k kVar, long j10) {
        long j11 = this.d;
        List list = this.f;
        long j12 = list != null ? ((q) list.get((int) (j10 - j11))).a : (j10 - j11) * this.e;
        n0 n0Var = kVar.a;
        return new j(0L, -1L, this.k.b(n0Var.n, n0Var.a, j10, j12));
    }
}
