package x6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends d {
    public final m6.x a;

    public e(m6.x xVar) {
        this.a = xVar;
    }

    @Override // x6.d
    public final Object a() {
        return this.a;
    }

    @Override // x6.d
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.a.equals(((e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return aa.d.o("Optional.of(", this.a.toString(), ")");
    }
}
