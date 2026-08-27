package y6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends d {
    public final n6.x a;

    public e(n6.x xVar) {
        this.a = xVar;
    }

    @Override // y6.d
    public final Object a() {
        return this.a;
    }

    @Override // y6.d
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
        return a9.p.m("Optional.of(", this.a.toString(), ")");
    }
}
