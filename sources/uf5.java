// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class uf5 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public uf5(int i, String str, int i2, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uf5.class == obj.getClass()) {
            uf5 uf5Var = (uf5) obj;
            if (this.a == uf5Var.a && this.b == uf5Var.b && TextUtils.equals(this.c, uf5Var.c) && TextUtils.equals(this.d, uf5Var.d) && TextUtils.equals(this.e, uf5Var.e) && TextUtils.equals(this.f, uf5Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
