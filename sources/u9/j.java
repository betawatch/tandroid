package u9;

import a8.p0;
import c8.tc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class j {
    public final r a;
    public final int b;
    public final int c;

    public j(int i7, int i10, Class cls) {
        this(r.a(cls), i7, i10);
    }

    public static j a(Class cls) {
        return new j(1, 0, cls);
    }

    public static j b(r rVar) {
        return new j(rVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a.equals(jVar.a) && this.b == jVar.b && this.c == jVar.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.a);
        sb2.append(", type=");
        int i7 = this.b;
        sb2.append(i7 == 1 ? "required" : i7 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i10 = this.c;
        if (i10 == 0) {
            str = "direct";
        } else if (i10 == 1) {
            str = "provider";
        } else {
            if (i10 != 2) {
                throw new AssertionError(jg.g.j(i10, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return p0.s(sb2, str, "}");
    }

    public j(r rVar, int i7, int i10) {
        tc.a(rVar, "Null dependency anInterface.");
        this.a = rVar;
        this.b = i7;
        this.c = i10;
    }
}
