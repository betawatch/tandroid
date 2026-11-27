// default package

import android.os.Build;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tr {
    public final String a;
    public final yj b;

    public tr(String str, yj yjVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = yjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr)) {
            return false;
        }
        tr trVar = (tr) obj;
        if (!ur5.a(this.a, trVar.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!ur5.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return ur5.a(str2, str2) && this.b.equals(trVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((zd6.b.hashCode() + bs2.j((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517567) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.8, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + zd6.b + ", androidAppInfo=" + this.b + ')';
    }
}
