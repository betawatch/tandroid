// default package

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xk {
    public final String a;
    public final String b;
    public final String c;
    public final bn8 d;
    public final ArrayList e;

    public xk(String str, String str2, String str3, bn8 bn8Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bn8Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk)) {
            return false;
        }
        xk xkVar = (xk) obj;
        if (!this.a.equals(xkVar.a) || !rr5.a(this.b, xkVar.b) || !rr5.a(this.c, xkVar.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return rr5.a(str, str) && this.d.equals(xkVar.d) && this.e.equals(xkVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ts2.j(ts2.j(ts2.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
