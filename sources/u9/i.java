package u9;

import a8.p0;
import c8.sc;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class i {
    public final q a;
    public final int b;
    public final int c;

    public i(int i7, int i10, Class cls) {
        this(q.a(cls), i7, i10);
    }

    public static i a(Class cls) {
        return new i(1, 0, cls);
    }

    public static i b(q qVar) {
        return new i(qVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b == iVar.b && this.c == iVar.c;
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

    public i(q qVar, int i7, int i10) {
        sc.a(qVar, "Null dependency anInterface.");
        this.a = qVar;
        this.b = i7;
        this.c = i10;
    }
}
