package p2;

import e2.u;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import org.telegram.ui.ly0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p extends n {
    public final ly0 j;
    public final ly0 k;
    public final long l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, ly0 ly0Var, ly0 ly0Var2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.j = ly0Var;
        this.k = ly0Var2;
        this.l = j12;
    }

    @Override // p2.s
    public final j a(m mVar) {
        ly0 ly0Var = this.j;
        if (ly0Var == null) {
            return this.a;
        }
        u uVar = mVar.a;
        return new j(0L, ly0Var.m(uVar.j, 0L, 0L, uVar.a), -1L);
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
