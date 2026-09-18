package pg;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class w0 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.a = d;
        this.b = d10;
        this.c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.c - w0Var.c, 2.0d) + Math.pow(this.b - w0Var.b, 2.0d) + Math.pow(this.a - w0Var.a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.a + w0Var.a) * 0.5d, (this.b + w0Var.b) * 0.5d, (this.c + w0Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a == w0Var.a && this.b == w0Var.b && this.c == w0Var.c;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.a = d;
        this.b = d10;
        this.c = d11;
        this.d = true;
    }
}
