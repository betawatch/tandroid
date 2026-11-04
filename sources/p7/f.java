package p7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends e {
    public final e7.x a;

    public f(e7.x xVar) {
        this.a = xVar;
    }

    @Override // p7.e
    public final Object a() {
        return this.a;
    }

    @Override // p7.e
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.a.equals(((f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a1.g.q("Optional.of(", this.a.toString(), ")");
    }
}
