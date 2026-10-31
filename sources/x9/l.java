package x9;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l implements Runnable {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public l(FirebaseMessaging firebaseMessaging, long j10) {
        this.a = 1;
        this.e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c5.s("firebase-iid-executor"));
        this.d = firebaseMessaging;
        this.b = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.d).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() {
        try {
            if (((FirebaseMessaging) this.d).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n nVar = (n) this.e;
                r rVar = nVar.n;
                if (rVar == null || !rVar.e.get()) {
                    long j10 = this.b / 1000;
                    String e = nVar.e();
                    if (e == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    j2.f fVar = nVar.m;
                    Throwable th2 = (Throwable) this.c;
                    Thread thread = (Thread) this.d;
                    fVar.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(e);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    fVar.u(th2, thread, e, "error", j10, false);
                    return;
                }
                return;
            default:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
                xa.n D = xa.n.D();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.d;
                if (D.I(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.j = true;
                        }
                        if (!firebaseMessaging.i.e()) {
                            firebaseMessaging.e(false);
                            if (!xa.n.D().I(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!xa.n.D().H(firebaseMessaging.b) || a()) {
                            if (b()) {
                                firebaseMessaging.e(false);
                            } else {
                                firebaseMessaging.f(this.b);
                            }
                            if (!xa.n.D().I(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            androidx.mediarouter.app.f fVar2 = new androidx.mediarouter.app.f();
                            fVar2.b = this;
                            fVar2.a();
                            if (!xa.n.D().I(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e7) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e7.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.e(false);
                        if (!xa.n.D().I(firebaseMessaging.b)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th3) {
                    if (xa.n.D().I(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th3;
                }
        }
    }

    public l(n nVar, long j10, Throwable th2, Thread thread) {
        this.a = 0;
        this.e = nVar;
        this.b = j10;
        this.c = th2;
        this.d = thread;
    }
}
