// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wa0 {
    public final String a;
    public final String b;
    public final String c;
    public final qb0 d;
    public final int e;

    public wa0(String str, String str2, String str3, qb0 qb0Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qb0Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        String str = wa0Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = wa0Var.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = wa0Var.c;
        String str6 = this.c;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        qb0 qb0Var = wa0Var.d;
        qb0 qb0Var2 = this.d;
        if (qb0Var2 == null) {
            if (qb0Var != null) {
                return false;
            }
        } else if (!qb0Var2.equals(qb0Var)) {
            return false;
        }
        int i = wa0Var.e;
        int i2 = this.e;
        return i2 == 0 ? i == 0 : wi8.c(i2, i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        qb0 qb0Var = this.d;
        int hashCode4 = (hashCode3 ^ (qb0Var == null ? 0 : qb0Var.hashCode())) * 1000003;
        int i = this.e;
        return hashCode4 ^ (i != 0 ? wi8.F(i) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
