package sg;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l0 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public l0(double d, double d2, double d10) {
        this.a = d;
        this.b = d2;
        this.c = d10;
    }

    public final float a(l0 l0Var) {
        return (float) Math.sqrt(Math.pow(this.c - l0Var.c, 2.0d) + Math.pow(this.b - l0Var.b, 2.0d) + Math.pow(this.a - l0Var.a, 2.0d));
    }

    public final l0 b(l0 l0Var) {
        return new l0((this.a + l0Var.a) * 0.5d, (this.b + l0Var.b) * 0.5d, (this.c + l0Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.a == l0Var.a && this.b == l0Var.b && this.c == l0Var.c;
    }

    public l0(double d, double d2, double d10, int i7) {
        this.a = d;
        this.b = d2;
        this.c = d10;
        this.d = true;
    }
}
