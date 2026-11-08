package ud;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class e extends d {
    public static final e d = new e(1, 0, 1);

    @Override // ud.d
    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    @Override // ud.d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // ud.d
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // ud.d
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
