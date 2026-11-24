// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class u93 {
    public final f31 a;
    public final i89 b;
    public final wg0 c;
    public final r53 d;
    public final long e;
    public final long f;

    public u93(long j, i89 i89Var, wg0 wg0Var, f31 f31Var, long j2, r53 r53Var) {
        this.e = j;
        this.b = i89Var;
        this.c = wg0Var;
        this.f = j2;
        this.a = f31Var;
        this.d = r53Var;
    }

    public final u93 a(long j, i89 i89Var) {
        long C;
        r53 b = this.b.b();
        r53 b2 = i89Var.b();
        if (b == null || b2 == null || !b.V() || b.f0(j) == 0 || b2.f0(j) == 0) {
            return new u93(j, i89Var, this.c, this.a, this.f, b2);
        }
        long f0 = b.f0(j);
        long b0 = b.b0();
        long e = b.e(b0);
        long j2 = f0 + b0;
        long j3 = j2 - 1;
        long k = b.k(j3, j) + b.e(j3);
        long b02 = b2.b0();
        long e2 = b2.e(b02);
        long j4 = this.f;
        if (k == e2) {
            C = (j2 - b02) + j4;
        } else {
            if (k < e2) {
                throw new jh0();
            }
            C = e2 < e ? j4 - (b2.C(e, j) - b0) : (b.C(e2, j) - b02) + j4;
        }
        return new u93(j, i89Var, this.c, this.a, C, b2);
    }

    public final long b(long j) {
        r53 r53Var = this.d;
        r53Var.getClass();
        long j2 = this.e;
        long r = r53Var.r(j2, j) + this.f;
        r53Var.getClass();
        return (r53Var.h0(j2, j) + r) - 1;
    }

    public final long c() {
        r53 r53Var = this.d;
        r53Var.getClass();
        return r53Var.f0(this.e);
    }

    public final long d(long j) {
        long e = e(j);
        r53 r53Var = this.d;
        r53Var.getClass();
        return r53Var.k(j - this.f, this.e) + e;
    }

    public final long e(long j) {
        r53 r53Var = this.d;
        r53Var.getClass();
        return r53Var.e(j - this.f);
    }

    public final boolean f(long j, long j2) {
        r53 r53Var = this.d;
        r53Var.getClass();
        return r53Var.V() || j2 == -9223372036854775807L || d(j) <= j2;
    }
}
