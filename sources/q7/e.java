package q7;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
