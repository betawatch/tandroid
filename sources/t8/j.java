package t8;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import w3.b0;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        int i10 = f6.e.a;
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
        b0 b0Var = new b0(context, 7);
        String k10 = b0Var.k("google_app_id");
        if (TextUtils.isEmpty(k10)) {
            return null;
        }
        return new j(k10, b0Var.k("google_api_key"), b0Var.k("firebase_database_url"), b0Var.k("ga_trackingId"), b0Var.k("gcm_defaultSenderId"), b0Var.k("google_storage_bucket"), b0Var.k("project_id"));
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
        b0 b0Var = new b0(this);
        b0Var.e(this.b, "applicationId");
        b0Var.e(this.a, "apiKey");
        b0Var.e(this.c, "databaseUrl");
        b0Var.e(this.e, "gcmSenderId");
        b0Var.e(this.f, "storageBucket");
        b0Var.e(this.g, "projectId");
        return b0Var.toString();
    }
}
