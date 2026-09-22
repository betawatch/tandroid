package pg;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class u0 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.a = d;
        this.b = d10;
        this.c = d11;
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

    public u0(double d, double d10, double d11, int i10) {
        this.a = d;
        this.b = d10;
        this.c = d11;
        this.d = true;
    }
}
