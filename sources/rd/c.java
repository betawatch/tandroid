package rd;

import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        char c2 = this.a;
        char c10 = this.b;
        if (j.f(c2, c10) > 0) {
            c cVar = (c) obj;
            if (j.f(cVar.a, cVar.b) > 0) {
                return true;
            }
        }
        c cVar2 = (c) obj;
        return c2 == cVar2.a && c10 == cVar2.b;
    }

    public final int hashCode() {
        char c2 = this.a;
        char c10 = this.b;
        if (j.f(c2, c10) > 0) {
            return -1;
        }
        return (c2 * 31) + c10;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
