// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xy5 {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = gcc.a;
        c = "0";
        d = "1";
    }

    public xy5(String str, String str2) {
        this.a = gcc.U(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xy5.class == obj.getClass()) {
            xy5 xy5Var = (xy5) obj;
            if (Objects.equals(this.a, xy5Var.a) && Objects.equals(this.b, xy5Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{ lang=");
        sb.append(this.a);
        sb.append(", '");
        return c00.k(sb, this.b, "' }");
    }
}
