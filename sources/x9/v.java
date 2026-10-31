package x9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final f2.a a;
    public final Context b;
    public final String c;
    public final ra.d d;
    public final s e;
    public c f;

    public v(Context context, String str, ra.d dVar, s sVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = dVar;
        this.e = sVar;
        this.a = new f2.a();
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        lowerCase = uuid == null ? null : g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized c b() {
        String str;
        c cVar = this.f;
        if (cVar != null && (cVar.b != null || !this.e.a())) {
            return this.f;
        }
        u9.c cVar2 = u9.c.a;
        cVar2.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cVar2.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            try {
                str = (String) x.a(((ra.c) this.d).d());
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e);
                str = null;
            }
            cVar2.c("Fetched Firebase Installation ID: " + str);
            if (str == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
            }
            if (str.equals(string)) {
                this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f = new c(a(str, sharedPreferences), str);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        } else {
            this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        }
        cVar2.c("Install IDs: " + this.f);
        return this.f;
    }

    public final String c() {
        String str;
        f2.a aVar = this.a;
        Context context = this.b;
        synchronized (aVar) {
            try {
                if (aVar.a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    aVar.a = installerPackageName;
                }
                str = "".equals(aVar.a) ? null : aVar.a;
            } finally {
            }
        }
        return str;
    }
}
