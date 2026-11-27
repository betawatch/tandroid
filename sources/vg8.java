// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vg8 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public vg8(double d, double d2, double d3, int i) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = true;
    }

    public final float a(vg8 vg8Var) {
        return (float) Math.sqrt(Math.pow(this.c - vg8Var.c, 2.0d) + Math.pow(this.b - vg8Var.b, 2.0d) + Math.pow(this.a - vg8Var.a, 2.0d));
    }

    public final vg8 b(vg8 vg8Var) {
        return new vg8((this.a + vg8Var.a) * 0.5d, (this.b + vg8Var.b) * 0.5d, (this.c + vg8Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vg8)) {
            return false;
        }
        vg8 vg8Var = (vg8) obj;
        return this.a == vg8Var.a && this.b == vg8Var.b && this.c == vg8Var.c;
    }

    public vg8(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }
}
