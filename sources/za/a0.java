package za;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class a0 {
    public final j0 a;
    public final b b;

    public a0(j0 j0Var, b bVar) {
        this.a = j0Var;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a.equals(a0Var.a) && this.b.equals(a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (k.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.b + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
