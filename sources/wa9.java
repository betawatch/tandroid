// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class wa9 {
    public final float a;
    public final float b;

    public wa9(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static float a(wa9 wa9Var, wa9 wa9Var2) {
        return loe.a(wa9Var.a, wa9Var.b, wa9Var2.a, wa9Var2.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wa9) {
            wa9 wa9Var = (wa9) obj;
            if (this.a == wa9Var.a && this.b == wa9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "(" + this.a + ',' + this.b + ')';
    }
}
