package s2;

import a8.ja;
import j$.util.Objects;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        boolean z10 = true;
        if (i7 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        ja.p(z10);
        this.a = str;
        this.b = i7;
        this.d = str2;
        this.c = 0.0d;
    }
}
