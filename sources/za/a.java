package za;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final p d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.a = str;
        this.b = versionName;
        this.c = appBuildVersion;
        this.d = pVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.a.equals(aVar.a) || !kotlin.jvm.internal.i.a(this.b, aVar.b) || !kotlin.jvm.internal.i.a(this.c, aVar.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return kotlin.jvm.internal.i.a(str, str) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + a4.a.h(a4.a.h(a4.a.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
