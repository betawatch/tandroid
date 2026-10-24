package v3;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class e {
    public final int a;
    public final int b;
    public final float c;

    public e(float f7, int i10, int i11) {
        this.a = i10;
        this.b = i11;
        this.c = f7;
    }

    public static e a(int i10) {
        int i11 = (i10 >> 13) & 7;
        if (i11 == 0) {
            return null;
        }
        return new e(((i10 & 511) * ((i10 & 512) != 0 ? -1 : 1)) / 10.0f, i11, (i10 >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && Float.compare(this.c, eVar.c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.a + ", originator=" + this.b + ", gain=" + this.c + '}';
    }
}
