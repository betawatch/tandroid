package q7;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e extends d {
    public final f7.x a;

    public e(f7.x xVar) {
        this.a = xVar;
    }

    @Override // q7.d
    public final Object a() {
        return this.a;
    }

    @Override // q7.d
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
        return a8.p0.p("Optional.of(", this.a.toString(), ")");
    }
}
