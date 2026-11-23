package q7;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
