package p2;

import j$.util.Objects;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class w {
    public final b2.w a;
    public final String b;
    public final String c;

    public w(b2.w wVar, String str, String str2) {
        b2.v a2 = wVar.a();
        a2.a = null;
        a2.k = null;
        this.a = new b2.w(a2);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Objects.equals(this.a, wVar.a) && Objects.equals(this.b, wVar.b) && Objects.equals(this.c, wVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
