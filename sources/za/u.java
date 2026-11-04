package za;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.ActionBar.h4;
import z7.q0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u {
    public static final long h = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int i = 0;
    public final Context a;
    public final h4 b;
    public final q0 c;
    public final ScheduledThreadPoolExecutor e;
    public final t g;
    public final a0.f d = new a0.f(0);
    public boolean f = false;

    public u(h4 h4Var, t tVar, q0 q0Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = h4Var;
        this.g = tVar;
        this.c = q0Var;
        this.a = context;
        this.e = scheduledThreadPoolExecutor;
    }

    public static boolean a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(s sVar) {
        synchronized (this.d) {
            try {
                String str = sVar.c;
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void c(boolean z10) {
        this.f = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6 A[Catch: IOException -> 0x0085, TRY_LEAVE, TryCatch #0 {IOException -> 0x0085, blocks: (B:8:0x002a, B:13:0x00d0, B:15:0x00d6, B:19:0x003c, B:21:0x0044, B:23:0x0072, B:26:0x0087, B:28:0x008f, B:30:0x00bd), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        s a10;
        while (true) {
            synchronized (this) {
                try {
                    a10 = this.g.a();
                    if (a10 == null) {
                        break;
                    }
                } finally {
                }
            }
            q0 q0Var = this.c;
            try {
                String str = a10.b;
                String str2 = a10.a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        ua.d dVar = (ua.d) ((ua.e) q0Var.b);
                        String str3 = ((ua.a) q0.a(dVar.f())).a;
                        ((FirebaseMessaging) q0Var.a).a();
                        q0Var.d(str2, str3, (String) q0.a(dVar.e()), "unsubscribe");
                        if (a()) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                        this.g.c(a10);
                        b(a10);
                    }
                    if (!a()) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + a10 + ".");
                    }
                    this.g.c(a10);
                    b(a10);
                } else {
                    if (str.equals("S")) {
                        ua.d dVar2 = (ua.d) ((ua.e) q0Var.b);
                        String str4 = ((ua.a) q0.a(dVar2.f())).a;
                        ((FirebaseMessaging) q0Var.a).a();
                        q0Var.d(str2, str4, (String) q0.a(dVar2.e()), "subscribe");
                        if (a()) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                        }
                        this.g.c(a10);
                        b(a10);
                    }
                    if (!a()) {
                    }
                    this.g.c(a10);
                    b(a10);
                }
            } catch (IOException e10) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
                    if (e10.getMessage() != null) {
                        throw e10;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (a()) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void e(long j10) {
        this.e.schedule(new w(this, this.a, this.b, Math.min(Math.max(30L, 2 * j10), h)), j10, TimeUnit.SECONDS);
        c(true);
    }
}
