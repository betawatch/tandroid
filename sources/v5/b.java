package v5;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b {
    public final long a;
    public final o5.i b;
    public final o5.h c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.a = j3;
        this.b = iVar;
        this.c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b.equals(bVar.b) && this.c.equals(bVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
