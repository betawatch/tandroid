// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class y90 {
    public final String a;
    public final String b;
    public final String c;
    public final sa0 d;
    public final int e;

    public y90(String str, String str2, String str3, sa0 sa0Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = sa0Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y90)) {
            return false;
        }
        y90 y90Var = (y90) obj;
        String str = y90Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = y90Var.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = y90Var.c;
        String str6 = this.c;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        sa0 sa0Var = y90Var.d;
        sa0 sa0Var2 = this.d;
        if (sa0Var2 == null) {
            if (sa0Var != null) {
                return false;
            }
        } else if (!sa0Var2.equals(sa0Var)) {
            return false;
        }
        int i = y90Var.e;
        int i2 = this.e;
        return i2 == 0 ? i == 0 : ik8.c(i2, i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        sa0 sa0Var = this.d;
        int hashCode4 = (hashCode3 ^ (sa0Var == null ? 0 : sa0Var.hashCode())) * 1000003;
        int i = this.e;
        return hashCode4 ^ (i != 0 ? ik8.F(i) : 0);
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
