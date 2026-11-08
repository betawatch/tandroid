package y3;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e {
    public final int a;
    public final int b;
    public final float c;

    public e(float f10, int i7, int i10) {
        this.a = i7;
        this.b = i10;
        this.c = f10;
    }

    public static e a(int i7) {
        int i10 = (i7 >> 13) & 7;
        if (i10 == 0) {
            return null;
        }
        return new e(((i7 & 511) * ((i7 & 512) != 0 ? -1 : 1)) / 10.0f, i10, (i7 >> 10) & 7);
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
