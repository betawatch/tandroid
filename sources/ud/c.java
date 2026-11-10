package ud;

import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
