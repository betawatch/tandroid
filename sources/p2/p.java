package p2;

import e2.u;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class p extends n {
    public final hy0 j;
    public final hy0 k;
    public final long l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, hy0 hy0Var, hy0 hy0Var2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.j = hy0Var;
        this.k = hy0Var2;
        this.l = j12;
    }

    @Override // p2.s
    public final j a(m mVar) {
        hy0 hy0Var = this.j;
        if (hy0Var == null) {
            return this.a;
        }
        u uVar = mVar.a;
        return new j(0L, hy0Var.m(uVar.j, 0L, 0L, uVar.a), -1L);
    }

    @Override // p2.n
    public final long d(long j3) {
        if (this.f != null) {
            return r0.size();
        }
        long j10 = this.l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i7 = j9.a.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // p2.n
    public final j h(k kVar, long j3) {
        long j10 = this.d;
        List list = this.f;
        long j11 = list != null ? ((q) list.get((int) (j3 - j10))).a : (j3 - j10) * this.e;
        u uVar = kVar.a;
        return new j(0L, this.k.m(uVar.j, j3, j11, uVar.a), -1L);
    }
}
