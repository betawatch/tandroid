// default package

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ryb {
    public final Context a;
    public final mf7 b;
    public final wm9 c;
    public final ScheduledThreadPoolExecutor e;
    public final pyb g;
    public final qt d = new qt(0);
    public boolean f = false;

    public ryb(mf7 mf7Var, pyb pybVar, wm9 wm9Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = mf7Var;
        this.g = pybVar;
        this.c = wm9Var;
        this.a = context;
        this.e = scheduledThreadPoolExecutor;
    }

    public static boolean a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(yvb yvbVar) {
        synchronized (this.d) {
            String str = yvbVar.c;
            if (this.d.containsKey(str)) {
                ArrayDeque arrayDeque = (ArrayDeque) this.d.get(str);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.d.remove(str);
                }
            }
        }
    }

    public final synchronized void c(boolean z) {
        this.f = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce A[Catch: IOException -> 0x00ec, TRY_LEAVE, TryCatch #1 {IOException -> 0x00ec, blocks: (B:8:0x0026, B:12:0x0036, B:14:0x003e, B:16:0x006c, B:20:0x00c8, B:22:0x00ce, B:25:0x007f, B:27:0x0087, B:29:0x00b5), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        yvb a;
        while (true) {
            synchronized (this) {
                a = this.g.a();
                if (a == null) {
                    break;
                }
            }
            wm9 wm9Var = this.c;
            try {
                String str = a.b;
                String str2 = a.a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        si4 si4Var = (si4) ((ti4) wm9Var.b);
                        String str3 = ((xa0) wm9.d(si4Var.f())).a;
                        ((FirebaseMessaging) wm9Var.d).a();
                        wm9Var.x(str2, str3, (String) wm9.d(si4Var.e()), "unsubscribe");
                        if (a()) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                    }
                    if (!a()) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + a + ".");
                    }
                } else {
                    if (str.equals("S")) {
                        si4 si4Var2 = (si4) ((ti4) wm9Var.b);
                        String str4 = ((xa0) wm9.d(si4Var2.f())).a;
                        ((FirebaseMessaging) wm9Var.d).a();
                        wm9Var.x(str2, str4, (String) wm9.d(si4Var2.e()), "subscribe");
                        if (a()) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                        }
                    }
                    if (!a()) {
                    }
                }
                this.g.c(a);
                b(a);
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (a()) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void e(long j) {
        this.e.schedule(new tyb(this, this.a, this.b, Math.min(Math.max(30L, j << 1), 28800L)), j, TimeUnit.SECONDS);
        c(true);
    }
}
