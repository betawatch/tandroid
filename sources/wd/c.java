package wd;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        c cVar;
        char c10;
        char c11;
        if (!(obj instanceof c)) {
            return false;
        }
        char c12 = this.a;
        char c13 = this.b;
        if (c12 >= c13 && c12 != c13 && (c10 = (cVar = (c) obj).a) >= (c11 = cVar.b) && c10 != c11) {
            return true;
        }
        c cVar2 = (c) obj;
        return c12 == cVar2.a && c13 == cVar2.b;
    }

    public final int hashCode() {
        char c10 = this.a;
        char c11 = this.b;
        if (c10 >= c11 && c10 != c11) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
