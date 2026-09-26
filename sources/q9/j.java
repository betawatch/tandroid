package q9;

import w7.s6;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class j {
    public final r a;
    public final int b;
    public final int c;

    public j(int i10, int i11, Class cls) {
        this(r.a(cls), i10, i11);
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
        int i10 = this.b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i11 = this.c;
        if (i11 == 0) {
            str = "direct";
        } else if (i11 == 1) {
            str = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(hg.c.h(i11, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return a4.a.t(sb2, str, "}");
    }

    public j(r rVar, int i10, int i11) {
        s6.a(rVar, "Null dependency anInterface.");
        this.a = rVar;
        this.b = i10;
        this.c = i11;
    }
}
