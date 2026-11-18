package ud;

import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        char c10 = this.a;
        char c11 = this.b;
        if (j.f(c10, c11) > 0) {
            c cVar = (c) obj;
            if (j.f(cVar.a, cVar.b) > 0) {
                return true;
            }
        }
        c cVar2 = (c) obj;
        return c10 == cVar2.a && c11 == cVar2.b;
    }

    public final int hashCode() {
        char c10 = this.a;
        char c11 = this.b;
        if (j.f(c10, c11) > 0) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
