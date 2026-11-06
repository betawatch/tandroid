package s2;

import a8.ia;
import j$.util.Objects;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class e {
    public final String a;
    public final int b;
    public final double c;
    public final String d;

    public e(String str, double d) {
        this.a = str;
        this.b = 2;
        this.c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.b == eVar.b && Double.compare(this.c, eVar.c) == 0 && Objects.equals(this.a, eVar.a) && Objects.equals(this.d, eVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public e(int i7, String str, String str2) {
        boolean z9 = true;
        if (i7 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z9 = false;
        }
        ia.p(z9);
        this.a = str;
        this.b = i7;
        this.d = str2;
        this.c = 0.0d;
    }
}
