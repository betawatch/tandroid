// default package

import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ss {
    public final String a;
    public final xk b;

    public ss(String str, xk xkVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = xkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss)) {
            return false;
        }
        ss ssVar = (ss) obj;
        if (!rr5.a(this.a, ssVar.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!rr5.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return rr5.a(str2, str2) && this.b.equals(ssVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((ud6.b.hashCode() + ts2.j((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517567) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.8, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + ud6.b + ", androidAppInfo=" + this.b + ')';
    }
}
