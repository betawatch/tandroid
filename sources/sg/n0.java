package sg;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n0 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public n0(double d, double d2, double d10) {
        this.a = d;
        this.b = d2;
        this.c = d10;
    }

    public final float a(n0 n0Var) {
        return (float) Math.sqrt(Math.pow(this.c - n0Var.c, 2.0d) + Math.pow(this.b - n0Var.b, 2.0d) + Math.pow(this.a - n0Var.a, 2.0d));
    }

    public final n0 b(n0 n0Var) {
        return new n0((this.a + n0Var.a) * 0.5d, (this.b + n0Var.b) * 0.5d, (this.c + n0Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.a == n0Var.a && this.b == n0Var.b && this.c == n0Var.c;
    }

    public n0(double d, double d2, double d10, int i7) {
        this.a = d;
        this.b = d2;
        this.c = d10;
        this.d = true;
    }
}
