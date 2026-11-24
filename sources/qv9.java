// default package

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qv9 extends ov9 {
    public final vk9 j;
    public final vk9 k;
    public final long l;

    public qv9(az8 az8Var, long j, long j2, long j3, long j4, long j5, ArrayList arrayList, long j6, vk9 vk9Var, vk9 vk9Var2, long j7, long j8) {
        super(az8Var, j, j2, j3, j5, arrayList, j6, j7, j8);
        this.j = vk9Var;
        this.k = vk9Var2;
        this.l = j4;
    }

    @Override // tv9
    public final tv9 a() {
        return new qv9(this.a, this.b, 0L, this.d, this.l, this.e, this.f, this.i, this.j, this.k, this.g, this.h);
    }

    @Override // tv9
    public final az8 b(i89 i89Var) {
        vk9 vk9Var = this.j;
        if (vk9Var == null) {
            return this.a;
        }
        fm4 fm4Var = i89Var.a;
        return new az8(0L, vk9Var.g(fm4Var.k, 0L, 0L, fm4Var.a), -1L);
    }

    @Override // ov9
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
        int i = th0.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // ov9
    public final az8 i(g89 g89Var, long j) {
        ArrayList arrayList = this.f;
        long j2 = j - this.d;
        long j3 = arrayList != null ? ((rv9) arrayList.get((int) j2)).a : j2 * this.e;
        fm4 fm4Var = g89Var.a;
        return new az8(0L, this.k.g(fm4Var.k, j, j3, fm4Var.a), -1L);
    }
}
