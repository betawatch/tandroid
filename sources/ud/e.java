package ud;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
