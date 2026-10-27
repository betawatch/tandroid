package s9;

import com.google.android.gms.internal.play_billing.s1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k {
    public final s a;
    public final int b;
    public final int c;

    public k(int i10, int i11, Class cls) {
        this(s.a(cls), i10, i11);
    }

    public static k a(Class cls) {
        return new k(1, 0, cls);
    }

    public static k b(s sVar) {
        return new k(sVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a.equals(kVar.a) && this.b == kVar.b && this.c == kVar.c;
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
                throw new AssertionError(ic.a.i(i11, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return a1.g.s(sb2, str, "}");
    }

    public k(s sVar, int i10, int i11) {
        s1.a(sVar, "Null dependency anInterface.");
        this.a = sVar;
        this.b = i10;
        this.c = i11;
    }
}
