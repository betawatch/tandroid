package u8;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import v5.n;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        int i10 = g6.e.a;
        l.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static i a(Context context) {
        n nVar = new n(context, 12);
        String o10 = nVar.o("google_app_id");
        if (TextUtils.isEmpty(o10)) {
            return null;
        }
        return new i(o10, nVar.o("google_api_key"), nVar.o("firebase_database_url"), nVar.o("ga_trackingId"), nVar.o("gcm_defaultSenderId"), nVar.o("google_storage_bucket"), nVar.o("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.l(this.b, iVar.b) && l.l(this.a, iVar.a) && l.l(this.c, iVar.c) && l.l(this.d, iVar.d) && l.l(this.e, iVar.e) && l.l(this.f, iVar.f) && l.l(this.g, iVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        n nVar = new n(this);
        nVar.g(this.b, "applicationId");
        nVar.g(this.a, "apiKey");
        nVar.g(this.c, "databaseUrl");
        nVar.g(this.e, "gcmSenderId");
        nVar.g(this.f, "storageBucket");
        nVar.g(this.g, "projectId");
        return nVar.toString();
    }
}
