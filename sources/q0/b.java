package q0;

import j$.util.Objects;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
