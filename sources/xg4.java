// default package

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xg4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public xg4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        int i = e9b.a;
        fre.j("ApplicationId must be set.", !(str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public static xg4 a(Context context) {
        sk4 sk4Var = new sk4(context, (byte) 27);
        String w = sk4Var.w("google_app_id");
        if (TextUtils.isEmpty(w)) {
            return null;
        }
        return new xg4(w, sk4Var.w("google_api_key"), sk4Var.w("firebase_database_url"), sk4Var.w("ga_trackingId"), sk4Var.w("gcm_defaultSenderId"), sk4Var.w("google_storage_bucket"), sk4Var.w("recaptcha_site_key"), sk4Var.w("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xg4)) {
            return false;
        }
        xg4 xg4Var = (xg4) obj;
        return Objects.equals(this.b, xg4Var.b) && Objects.equals(this.a, xg4Var.a) && Objects.equals(this.c, xg4Var.c) && Objects.equals(this.d, xg4Var.d) && Objects.equals(this.e, xg4Var.e) && Objects.equals(this.f, xg4Var.f) && Objects.equals(this.g, xg4Var.g) && Objects.equals(this.h, xg4Var.h);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final String toString() {
        wk4 wk4Var = new wk4(this);
        wk4Var.a(this.b, "applicationId");
        wk4Var.a(this.a, "apiKey");
        wk4Var.a(this.c, "databaseUrl");
        wk4Var.a(this.e, "gcmSenderId");
        wk4Var.a(this.f, "storageBucket");
        wk4Var.a(this.g, "recaptchaSiteKey");
        wk4Var.a(this.h, "projectId");
        return wk4Var.toString();
    }
}
