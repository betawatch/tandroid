// default package

import java.math.BigInteger;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rb3 implements fv9 {
    public final /* synthetic */ sb3 a;

    public rb3(sb3 sb3Var) {
        this.a = sb3Var;
    }

    @Override // fv9
    public final boolean c() {
        return true;
    }

    @Override // fv9
    public final boolean d() {
        return false;
    }

    @Override // fv9
    public final ev9 f(long j) {
        sb3 sb3Var = this.a;
        long j2 = sb3Var.b;
        BigInteger valueOf = BigInteger.valueOf((sb3Var.d.i * j) / 1000000);
        long j3 = sb3Var.c;
        hv9 hv9Var = new hv9(j, g8c.j((valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(sb3Var.f)).longValue() + j2) - 30000, sb3Var.b, j3 - 1));
        return new ev9(hv9Var, hv9Var);
    }

    @Override // fv9
    public final long h() {
        return (this.a.f * 1000000) / r5.d.i;
    }
}
