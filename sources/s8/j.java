package s8;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i9 = e6.e.a;
        l.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static j a(Context context) {
        w4.e eVar = new w4.e(context, 5);
        String i9 = eVar.i("google_app_id");
        if (TextUtils.isEmpty(i9)) {
            return null;
        }
        return new j(i9, eVar.i("google_api_key"), eVar.i("firebase_database_url"), eVar.i("ga_trackingId"), eVar.i("gcm_defaultSenderId"), eVar.i("google_storage_bucket"), eVar.i("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.l(this.b, jVar.b) && l.l(this.a, jVar.a) && l.l(this.c, jVar.c) && l.l(this.d, jVar.d) && l.l(this.e, jVar.e) && l.l(this.f, jVar.f) && l.l(this.g, jVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        w4.e eVar = new w4.e(this);
        eVar.c(this.b, "applicationId");
        eVar.c(this.a, "apiKey");
        eVar.c(this.c, "databaseUrl");
        eVar.c(this.e, "gcmSenderId");
        eVar.c(this.f, "storageBucket");
        eVar.c(this.g, "projectId");
        return eVar.toString();
    }
}
