package w9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class u {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final c5.i a;
    public final Context b;
    public final String c;
    public final qa.d d;
    public final r e;
    public c f;

    public u(Context context, String str, qa.d dVar, r rVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = dVar;
        this.e = rVar;
        this.a = new c5.i();
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
        t9.b bVar = t9.b.a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            try {
                str = (String) w.a(((qa.c) this.d).d());
            } catch (Exception e7) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e7);
                str = null;
            }
            bVar.c("Fetched Firebase Installation ID: " + str);
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
        bVar.c("Install IDs: " + this.f);
        return this.f;
    }

    public final String c() {
        String str;
        c5.i iVar = this.a;
        Context context = this.b;
        synchronized (iVar) {
            try {
                if (iVar.a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    iVar.a = installerPackageName;
                }
                str = "".equals(iVar.a) ? null : iVar.a;
            } finally {
            }
        }
        return str;
    }
}
