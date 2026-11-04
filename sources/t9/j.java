package t9;

import k2.p1;
import x7.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j {
    public final r a;
    public final int b;
    public final int c;

    public j(int i3, int i10, Class cls) {
        this(r.a(cls), i3, i10);
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
        int i3 = this.b;
        sb2.append(i3 == 1 ? "required" : i3 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i10 = this.c;
        if (i10 == 0) {
            str = "direct";
        } else if (i10 == 1) {
            str = "provider";
        } else {
            if (i10 != 2) {
                throw new AssertionError(p1.i(i10, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return a1.g.s(sb2, str, "}");
    }

    public j(r rVar, int i3, int i10) {
        b0.a(rVar, "Null dependency anInterface.");
        this.a = rVar;
        this.b = i3;
        this.c = i10;
    }
}
