package xf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u0 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public u0(double d, double d9, double d10) {
        this.a = d;
        this.b = d9;
        this.c = d10;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.c - u0Var.c, 2.0d) + Math.pow(this.b - u0Var.b, 2.0d) + Math.pow(this.a - u0Var.a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.a + u0Var.a) * 0.5d, (this.b + u0Var.b) * 0.5d, (this.c + u0Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.a == u0Var.a && this.b == u0Var.b && this.c == u0Var.c;
    }

    public u0(double d, double d9, double d10, int i9) {
        this.a = d;
        this.b = d9;
        this.c = d10;
        this.d = true;
    }
}
