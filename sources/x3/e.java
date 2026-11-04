package x3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e {
    public final int a;
    public final int b;
    public final float c;

    public e(float f10, int i3, int i10) {
        this.a = i3;
        this.b = i10;
        this.c = f10;
    }

    public static e a(int i3) {
        int i10 = (i3 >> 13) & 7;
        if (i10 == 0) {
            return null;
        }
        return new e(((i3 & 511) * ((i3 & 512) != 0 ? -1 : 1)) / 10.0f, i10, (i3 >> 10) & 7);
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
