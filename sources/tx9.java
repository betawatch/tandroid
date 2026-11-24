// default package

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tx9 extends rx9 {
    public final wm9 j;
    public final wm9 k;
    public final long l;

    public tx9(b19 b19Var, long j, long j2, long j3, long j4, long j5, ArrayList arrayList, long j6, wm9 wm9Var, wm9 wm9Var2, long j7, long j8) {
        super(b19Var, j, j2, j3, j5, arrayList, j6, j7, j8);
        this.j = wm9Var;
        this.k = wm9Var2;
        this.l = j4;
    }

    @Override // wx9
    public final wx9 a() {
        return new tx9(this.a, this.b, 0L, this.d, this.l, this.e, this.f, this.i, this.j, this.k, this.g, this.h);
    }

    @Override // wx9
    public final b19 b(ka9 ka9Var) {
        wm9 wm9Var = this.j;
        if (wm9Var == null) {
            return this.a;
        }
        go4 go4Var = ka9Var.a;
        return new b19(0L, wm9Var.e(go4Var.k, 0L, 0L, go4Var.a), -1L);
    }

    @Override // rx9
    public final long e(long j) {
        if (this.f != null) {
            return r0.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = ti0.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // rx9
    public final b19 i(ia9 ia9Var, long j) {
        ArrayList arrayList = this.f;
        long j2 = j - this.d;
        long j3 = arrayList != null ? ((ux9) arrayList.get((int) j2)).a : j2 * this.e;
        go4 go4Var = ia9Var.a;
        return new b19(0L, this.k.e(go4Var.k, j, j3, go4Var.a), -1L);
    }
}
