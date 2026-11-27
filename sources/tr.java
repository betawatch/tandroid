// default package

import android.os.Build;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
