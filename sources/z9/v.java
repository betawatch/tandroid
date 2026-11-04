package z9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final com.google.android.gms.internal.clearcut.e a;
    public final Context b;
    public final String c;
    public final ua.e d;
    public final s e;
    public c f;

    public v(Context context, String str, ua.e eVar, s sVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = eVar;
        this.e = sVar;
        this.a = new com.google.android.gms.internal.clearcut.e();
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(1:5))|6|(7:18|19|9|10|11|12|13)|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u b(boolean z10) {
        String str;
        String str2 = null;
        if (!((Boolean) new aa.e(0, aa.g.d, aa.f.class, "isNotMainThread", "isNotMainThread()Z", 0, 2).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        ua.e eVar = this.d;
        if (z10) {
            try {
                str = ((ua.a) Tasks.await(((ua.d) eVar).f(), 10000L, TimeUnit.MILLISECONDS)).a;
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e10);
            }
            str2 = (String) Tasks.await(((ua.d) eVar).e(), 10000L, TimeUnit.MILLISECONDS);
            return new u(str2, str);
        }
        str = null;
        str2 = (String) Tasks.await(((ua.d) eVar).e(), 10000L, TimeUnit.MILLISECONDS);
        return new u(str2, str);
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f;
        if (cVar != null && (cVar.b != null || !this.e.a())) {
            return this.f;
        }
        w9.c cVar2 = w9.c.a;
        cVar2.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cVar2.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            u b10 = b(false);
            cVar2.c("Fetched Firebase Installation ID: " + b10.a);
            if (b10.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b10 = new u(str, null);
            }
            if (Objects.equals(b10.a, string)) {
                this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), b10.a, b10.b);
            } else {
                this.f = new c(a(b10.a, sharedPreferences), b10.a, b10.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null, null);
        } else {
            this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        cVar2.c("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        com.google.android.gms.internal.clearcut.e eVar = this.a;
        Context context = this.b;
        synchronized (eVar) {
            try {
                if (eVar.a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    eVar.a = installerPackageName;
                }
                str = "".equals(eVar.a) ? null : eVar.a;
            } finally {
            }
        }
        return str;
    }
}
