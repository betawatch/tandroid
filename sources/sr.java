// default package

import android.os.Build;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sr {
    public final String a;
    public final xj b;

    public sr(String str, xj xjVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = xjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr)) {
            return false;
        }
        sr srVar = (sr) obj;
        if (!rp5.a(this.a, srVar.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!rp5.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return rp5.a(str2, str2) && this.b.equals(srVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((vb6.b.hashCode() + ir2.j((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517567) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.8, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + vb6.b + ", androidAppInfo=" + this.b + ')';
    }
}
