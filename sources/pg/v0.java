package pg;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class v0 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public v0(double d, double d10, double d11) {
        this.a = d;
        this.b = d10;
        this.c = d11;
    }

    public final float a(v0 v0Var) {
        return (float) Math.sqrt(Math.pow(this.c - v0Var.c, 2.0d) + Math.pow(this.b - v0Var.b, 2.0d) + Math.pow(this.a - v0Var.a, 2.0d));
    }

    public final v0 b(v0 v0Var) {
        return new v0((this.a + v0Var.a) * 0.5d, (this.b + v0Var.b) * 0.5d, (this.c + v0Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a == v0Var.a && this.b == v0Var.b && this.c == v0Var.c;
    }

    public v0(double d, double d10, double d11, int i10) {
        this.a = d;
        this.b = d10;
        this.c = d11;
        this.d = true;
    }
}
