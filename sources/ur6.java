// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ur6 {
    public final rx6 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ur6(rx6 rx6Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        gre.f(!z4 || z2);
        gre.f(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        gre.f(z5);
        this.a = rx6Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final ur6 a(long j) {
        if (j == this.d) {
            return this;
        }
        return new ur6(this.a, this.b, this.c, j, this.e, this.f, this.g, this.h, this.i);
    }

    public final ur6 b(long j, long j2) {
        if (j == this.b && j2 == this.c) {
            return this;
        }
        return new ur6(this.a, j, j2, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ur6.class != obj.getClass()) {
            return false;
        }
        ur6 ur6Var = (ur6) obj;
        return this.b == ur6Var.b && this.d == ur6Var.d && this.e == ur6Var.e && this.f == ur6Var.f && this.g == ur6Var.g && this.h == ur6Var.h && this.i == ur6Var.i && this.a.equals(ur6Var.a);
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
