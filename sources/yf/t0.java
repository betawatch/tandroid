package yf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t0 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public t0(double d, double d10, double d11) {
        this.a = d;
        this.b = d10;
        this.c = d11;
    }

    public final float a(t0 t0Var) {
        return (float) Math.sqrt(Math.pow(this.c - t0Var.c, 2.0d) + Math.pow(this.b - t0Var.b, 2.0d) + Math.pow(this.a - t0Var.a, 2.0d));
    }

    public final t0 b(t0 t0Var) {
        return new t0((this.a + t0Var.a) * 0.5d, (this.b + t0Var.b) * 0.5d, (this.c + t0Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.a == t0Var.a && this.b == t0Var.b && this.c == t0Var.c;
    }

    public t0(double d, double d10, double d11, int i10) {
        this.a = d;
        this.b = d10;
        this.c = d11;
        this.d = true;
    }
}
