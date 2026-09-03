package w8;

import android.content.Context;
import android.text.TextUtils;
import b6.m;
import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        af.c cVar = new af.c(context);
        String Q = cVar.Q("google_app_id");
        if (TextUtils.isEmpty(Q)) {
            return null;
        }
        return new i(Q, cVar.Q("google_api_key"), cVar.Q("firebase_database_url"), cVar.Q("ga_trackingId"), cVar.Q("gcm_defaultSenderId"), cVar.Q("google_storage_bucket"), cVar.Q("project_id"));
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
        af.c cVar = new af.c(this);
        cVar.s(this.b, "applicationId");
        cVar.s(this.a, "apiKey");
        cVar.s(this.c, "databaseUrl");
        cVar.s(this.e, "gcmSenderId");
        cVar.s(this.f, "storageBucket");
        cVar.s(this.g, "projectId");
        return cVar.toString();
    }
}
