// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wj5 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = "\\Q/\\E";
    public final lo5 a;
    public final Context b;
    public final String c;
    public final rg4 d;
    public final w53 e;
    public v90 f;

    public wj5(Context context, String str, rg4 rg4Var, w53 w53Var) {
        if (context == null) {
            w26.j("appContext must not be null");
            throw null;
        }
        if (str == null) {
            w26.j("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = rg4Var;
        this.e = w53Var;
        this.a = new lo5((byte) 0);
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
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ng4 b(boolean z) {
        String str;
        String str2 = null;
        if (!((Boolean) new qz2(0, mv6.s, rz2.class, "isNotMainThread", "isNotMainThread()Z", 0, (byte) 2).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        rg4 rg4Var = this.d;
        if (z) {
            try {
                str = ((x90) Tasks.await(((qg4) rg4Var).f(), 10000L, timeUnit)).a;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
            }
            str2 = (String) Tasks.await(((qg4) rg4Var).e(), 10000L, timeUnit);
            return new ng4(str2, str);
        }
        str = null;
        str2 = (String) Tasks.await(((qg4) rg4Var).e(), 10000L, timeUnit);
        return new ng4(str2, str);
    }

    public final synchronized v90 c() {
        String str;
        v90 v90Var = this.f;
        if (v90Var != null && (v90Var.b != null || !this.e.a())) {
            return this.f;
        }
        c6e c6eVar = c6e.b;
        c6eVar.k("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        c6eVar.k("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            ng4 b = b(false);
            c6eVar.k("Fetched Firebase Installation ID: " + b.a);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new ng4(str, null);
            }
            if (Objects.equals(b.a, string)) {
                this.f = new v90(sharedPreferences.getString("crashlytics.installation.id", null), b.a, b.b);
            } else {
                this.f = new v90(a(b.a, sharedPreferences), b.a, b.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new v90(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null, null);
        } else {
            this.f = new v90(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        c6eVar.k("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        lo5 lo5Var = this.a;
        Context context = this.b;
        synchronized (lo5Var) {
            String str2 = lo5Var.b;
            if (str2 == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                str2 = installerPackageName;
                lo5Var.b = str2;
            }
            str = "".equals(str2) ? null : lo5Var.b;
        }
        return str;
    }
}
