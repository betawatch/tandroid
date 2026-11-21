package sg;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class m0 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public m0(double d, double d2, double d10) {
        this.a = d;
        this.b = d2;
        this.c = d10;
    }

    public final float a(m0 m0Var) {
        return (float) Math.sqrt(Math.pow(this.c - m0Var.c, 2.0d) + Math.pow(this.b - m0Var.b, 2.0d) + Math.pow(this.a - m0Var.a, 2.0d));
    }

    public final m0 b(m0 m0Var) {
        return new m0((this.a + m0Var.a) * 0.5d, (this.b + m0Var.b) * 0.5d, (this.c + m0Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.a == m0Var.a && this.b == m0Var.b && this.c == m0Var.c;
    }

    public m0(double d, double d2, double d10, int i7) {
        this.a = d;
        this.b = d2;
        this.c = d10;
        this.d = true;
    }
}
