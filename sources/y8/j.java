package y8;

import g7.t8;
import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j {
    public final r a;
    public final int b;
    public final int c;

    public j(int i9, int i10, Class cls) {
        this(r.a(cls), i9, i10);
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
        int i9 = this.b;
        sb2.append(i9 == 1 ? "required" : i9 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i10 = this.c;
        if (i10 == 0) {
            str = "direct";
        } else if (i10 == 1) {
            str = "provider";
        } else {
            if (i10 != 2) {
                throw new AssertionError(r0.l(i10, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return aa.d.r(sb2, str, "}");
    }

    public j(r rVar, int i9, int i10) {
        t8.a(rVar, "Null dependency anInterface.");
        this.a = rVar;
        this.b = i9;
        this.c = i10;
    }
}
