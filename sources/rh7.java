// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class rh7 {
    public final byte a;
    public final byte b;
    public final float c;

    /* JADX WARN: Multi-variable type inference failed */
    public rh7(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static rh7 a(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new rh7(((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f, i2, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rh7)) {
            return false;
        }
        rh7 rh7Var = (rh7) obj;
        return this.a == rh7Var.a && this.b == rh7Var.b && Float.compare(this.c, rh7Var.c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + ((int) this.a) + ", originator=" + ((int) this.b) + ", gain=" + this.c + '}';
    }
}
