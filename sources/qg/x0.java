package qg;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class x0 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public x0(double d, double d10, double d11) {
        this.a = d;
        this.b = d10;
        this.c = d11;
    }

    public final float a(x0 x0Var) {
        return (float) Math.sqrt(Math.pow(this.c - x0Var.c, 2.0d) + Math.pow(this.b - x0Var.b, 2.0d) + Math.pow(this.a - x0Var.a, 2.0d));
    }

    public final x0 b(x0 x0Var) {
        return new x0((this.a + x0Var.a) * 0.5d, (this.b + x0Var.b) * 0.5d, (this.c + x0Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.a == x0Var.a && this.b == x0Var.b && this.c == x0Var.c;
    }

    public x0(double d, double d10, double d11, int i10) {
        this.a = d;
        this.b = d10;
        this.c = d11;
        this.d = true;
    }
}
