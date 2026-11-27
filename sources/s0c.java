// default package

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class s0c implements Runnable {
    public static final Object f = new Object();
    public static Boolean h;
    public static Boolean n;
    public final Context a;
    public final tf7 b;
    public final PowerManager.WakeLock c;
    public final q0c d;
    public final long e;

    public s0c(q0c q0cVar, Context context, tf7 tf7Var, long j) {
        this.d = q0cVar;
        this.a = context;
        this.e = j;
        this.b = tf7Var;
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f) {
            Boolean bool = n;
            Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            n = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f) {
            Boolean bool = h;
            Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z = activeNetworkInfo.isConnected();
        }
        return z;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        q0c q0cVar = this.d;
        Context context = this.a;
        boolean c = c(context);
        PowerManager.WakeLock wakeLock = this.c;
        if (c) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    q0cVar.c(true);
                    if (!this.b.e()) {
                        q0cVar.c(false);
                        if (!c(context)) {
                            return;
                        }
                    } else {
                        if (!a(context) || d()) {
                            if (q0cVar.d()) {
                                q0cVar.c(false);
                            } else {
                                q0cVar.e(this.e);
                            }
                            if (c(context)) {
                                wakeLock.release();
                                return;
                            }
                            return;
                        }
                        new r0c(this, this).a();
                        if (!c(context)) {
                            return;
                        }
                    }
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    q0cVar.c(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (Throwable th) {
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused3) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
