// default package

import android.net.Uri;
import java.net.URL;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class p69 {
    public final sr a;
    public final sw2 b;

    public p69(sr srVar, sw2 sw2Var) {
        srVar.getClass();
        sw2Var.getClass();
        this.a = srVar;
        this.b = sw2Var;
    }

    public final URL a() {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        sr srVar = this.a;
        Uri.Builder appendPath2 = appendPath.appendPath(srVar.a).appendPath("settings");
        xj xjVar = srVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", xjVar.c).appendQueryParameter("display_version", xjVar.b).build().toString());
    }
}
