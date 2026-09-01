package w8;

import android.content.Context;
import android.text.TextUtils;
import b6.m;
import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = i6.e.a;
        m.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static i a(Context context) {
        bf.b bVar = new bf.b(context);
        String Q = bVar.Q("google_app_id");
        if (TextUtils.isEmpty(Q)) {
            return null;
        }
        return new i(Q, bVar.Q("google_api_key"), bVar.Q("firebase_database_url"), bVar.Q("ga_trackingId"), bVar.Q("gcm_defaultSenderId"), bVar.Q("google_storage_bucket"), bVar.Q("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m.l(this.b, iVar.b) && m.l(this.a, iVar.a) && m.l(this.c, iVar.c) && m.l(this.d, iVar.d) && m.l(this.e, iVar.e) && m.l(this.f, iVar.f) && m.l(this.g, iVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        bf.b bVar = new bf.b(this);
        bVar.r(this.b, "applicationId");
        bVar.r(this.a, "apiKey");
        bVar.r(this.c, "databaseUrl");
        bVar.r(this.e, "gcmSenderId");
        bVar.r(this.f, "storageBucket");
        bVar.r(this.g, "projectId");
        return bVar.toString();
    }
}
