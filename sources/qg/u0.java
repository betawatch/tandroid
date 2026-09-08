package qg;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
