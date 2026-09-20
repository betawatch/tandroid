package q9;

import hg.k0;
import w7.t6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class j {
    public final s a;
    public final int b;
    public final int c;

    public j(int i10, int i11, Class cls) {
        this(s.a(cls), i10, i11);
    }

    public static j a(Class cls) {
        return new j(1, 0, cls);
    }

    public static j b(s sVar) {
        return new j(sVar, 1, 0);
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
                throw new AssertionError(k0.h(i11, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return a4.a.s(sb2, str, "}");
    }

    public j(s sVar, int i10, int i11) {
        t6.a(sVar, "Null dependency anInterface.");
        this.a = sVar;
        this.b = i10;
        this.c = i11;
    }
}
