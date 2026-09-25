package za;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class c0 {
    public final l0 a;
    public final b b;

    public c0(l0 l0Var, b bVar) {
        this.a = l0Var;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.a.equals(c0Var.a) && this.b.equals(c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (l.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.b + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
