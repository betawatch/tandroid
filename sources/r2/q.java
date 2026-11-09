package r2;

import android.text.TextUtils;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class q {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public q(int i7, String str, int i10, String str2, String str3, String str4) {
        this.a = i7;
        this.b = i10;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.a == qVar.a && this.b == qVar.b && TextUtils.equals(this.c, qVar.c) && TextUtils.equals(this.d, qVar.d) && TextUtils.equals(this.e, qVar.e) && TextUtils.equals(this.f, qVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
