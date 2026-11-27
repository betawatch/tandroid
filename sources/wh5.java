// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wh5 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public wh5(int i, String str, int i2, String str2, String str3, String str4) {
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
        if (obj != null && wh5.class == obj.getClass()) {
            wh5 wh5Var = (wh5) obj;
            if (this.a == wh5Var.a && this.b == wh5Var.b && TextUtils.equals(this.c, wh5Var.c) && TextUtils.equals(this.d, wh5Var.d) && TextUtils.equals(this.e, wh5Var.e) && TextUtils.equals(this.f, wh5Var.f)) {
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
