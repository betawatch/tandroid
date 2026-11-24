// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vt6 {
    public final rz6 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public vt6(rz6 rz6Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        jte.f(!z4 || z2);
        jte.f(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        jte.f(z5);
        this.a = rz6Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final vt6 a(long j) {
        if (j == this.d) {
            return this;
        }
        return new vt6(this.a, this.b, this.c, j, this.e, this.f, this.g, this.h, this.i);
    }

    public final vt6 b(long j, long j2) {
        if (j == this.b && j2 == this.c) {
            return this;
        }
        return new vt6(this.a, j, j2, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vt6.class != obj.getClass()) {
            return false;
        }
        vt6 vt6Var = (vt6) obj;
        return this.b == vt6Var.b && this.d == vt6Var.d && this.e == vt6Var.e && this.f == vt6Var.f && this.g == vt6Var.g && this.h == vt6Var.h && this.i == vt6Var.i && this.a.equals(vt6Var.a);
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
