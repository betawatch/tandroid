package q0;

import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public final Object a;
    public final Object b;

    public b(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.a, this.a) && Objects.equals(bVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
