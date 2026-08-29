package z6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends d {
    public final o6.x a;

    public e(o6.x xVar) {
        this.a = xVar;
    }

    @Override // z6.d
    public final Object a() {
        return this.a;
    }

    @Override // z6.d
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
        return a4.w.n("Optional.of(", this.a.toString(), ")");
    }
}
