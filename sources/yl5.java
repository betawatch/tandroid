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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yl5 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = "\\Q/\\E";
    public final sc3 a;
    public final Context b;
    public final String c;
    public final ri4 d;
    public final p63 e;
    public x90 f;

    public yl5(Context context, String str, ri4 ri4Var, p63 p63Var) {
        if (context == null) {
            lq5.j("appContext must not be null");
            throw null;
        }
        if (str == null) {
            lq5.j("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = ri4Var;
        this.e = p63Var;
        this.a = new sc3();
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
    public final ni4 b(boolean z) {
        String str;
        String str2 = null;
        if (!((Boolean) new j03(0, rx6.s, k03.class, "isNotMainThread", "isNotMainThread()Z", 0, (byte) 2).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ri4 ri4Var = this.d;
        if (z) {
            try {
                str = ((z90) Tasks.await(((qi4) ri4Var).f(), 10000L, timeUnit)).a;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
            }
            str2 = (String) Tasks.await(((qi4) ri4Var).e(), 10000L, timeUnit);
            return new ni4(str2, str);
        }
        str = null;
        str2 = (String) Tasks.await(((qi4) ri4Var).e(), 10000L, timeUnit);
        return new ni4(str2, str);
    }

    public final synchronized x90 c() {
        String str;
        x90 x90Var = this.f;
        if (x90Var != null && (x90Var.b != null || !this.e.a())) {
            return this.f;
        }
        sae saeVar = sae.b;
        saeVar.k("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        saeVar.k("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            ni4 b = b(false);
            saeVar.k("Fetched Firebase Installation ID: " + b.a);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new ni4(str, null);
            }
            if (Objects.equals(b.a, string)) {
                this.f = new x90(sharedPreferences.getString("crashlytics.installation.id", null), b.a, b.b);
            } else {
                this.f = new x90(a(b.a, sharedPreferences), b.a, b.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new x90(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null, null);
        } else {
            this.f = new x90(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        saeVar.k("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        sc3 sc3Var = this.a;
        Context context = this.b;
        synchronized (sc3Var) {
            String str2 = sc3Var.a;
            if (str2 == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                str2 = installerPackageName;
                sc3Var.a = str2;
            }
            str = "".equals(str2) ? null : sc3Var.a;
        }
        return str;
    }
}
