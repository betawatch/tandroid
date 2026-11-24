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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vl5 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = "\\Q/\\E";
    public final ld3 a;
    public final Context b;
    public final String c;
    public final ti4 d;
    public final i73 e;
    public va0 f;

    public vl5(Context context, String str, ti4 ti4Var, i73 i73Var) {
        if (context == null) {
            u36.j("appContext must not be null");
            throw null;
        }
        if (str == null) {
            u36.j("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = ti4Var;
        this.e = i73Var;
        this.a = new ld3((byte) 1);
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
    public final pi4 b(boolean z) {
        String str;
        String str2 = null;
        if (!((Boolean) new b13(0, mx6.s, c13.class, "isNotMainThread", "isNotMainThread()Z", 0, (byte) 2).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ti4 ti4Var = this.d;
        if (z) {
            try {
                str = ((xa0) Tasks.await(((si4) ti4Var).f(), 10000L, timeUnit)).a;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
            }
            str2 = (String) Tasks.await(((si4) ti4Var).e(), 10000L, timeUnit);
            return new pi4(str2, str);
        }
        str = null;
        str2 = (String) Tasks.await(((si4) ti4Var).e(), 10000L, timeUnit);
        return new pi4(str2, str);
    }

    public final synchronized va0 c() {
        String str;
        va0 va0Var = this.f;
        if (va0Var != null && (va0Var.b != null || !this.e.a())) {
            return this.f;
        }
        f8e f8eVar = f8e.b;
        f8eVar.k("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        f8eVar.k("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            pi4 b = b(false);
            f8eVar.k("Fetched Firebase Installation ID: " + b.a);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new pi4(str, null);
            }
            if (Objects.equals(b.a, string)) {
                this.f = new va0(sharedPreferences.getString("crashlytics.installation.id", null), b.a, b.b);
            } else {
                this.f = new va0(a(b.a, sharedPreferences), b.a, b.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new va0(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null, null);
        } else {
            this.f = new va0(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        f8eVar.k("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        ld3 ld3Var = this.a;
        Context context = this.b;
        synchronized (ld3Var) {
            String str2 = ld3Var.b;
            if (str2 == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                str2 = installerPackageName;
                ld3Var.b = str2;
            }
            str = "".equals(str2) ? null : ld3Var.b;
        }
        return str;
    }
}
