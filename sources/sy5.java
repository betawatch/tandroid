// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sy5 {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = hac.a;
        c = "0";
        d = "1";
    }

    public sy5(String str, String str2) {
        this.a = hac.U(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sy5.class == obj.getClass()) {
            sy5 sy5Var = (sy5) obj;
            if (Objects.equals(this.a, sy5Var.a) && Objects.equals(this.b, sy5Var.b)) {
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
        return b10.j(sb, this.b, "' }");
    }
}
