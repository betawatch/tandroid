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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class owb {
    public final Context a;
    public final kd7 b;
    public final vk9 c;
    public final ScheduledThreadPoolExecutor e;
    public final mwb g;
    public final ps d = new ps(0);
    public boolean f = false;

    public owb(kd7 kd7Var, mwb mwbVar, vk9 vk9Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = kd7Var;
        this.g = mwbVar;
        this.c = vk9Var;
        this.a = context;
        this.e = scheduledThreadPoolExecutor;
    }

    public static boolean a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(xtb xtbVar) {
        synchronized (this.d) {
            String str = xtbVar.c;
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
        xtb a;
        while (true) {
            synchronized (this) {
                a = this.g.a();
                if (a == null) {
                    break;
                }
            }
            vk9 vk9Var = this.c;
            try {
                String str = a.b;
                String str2 = a.a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        qg4 qg4Var = (qg4) ((rg4) vk9Var.b);
                        String str3 = ((x90) vk9.e(qg4Var.f())).a;
                        ((FirebaseMessaging) vk9Var.d).a();
                        vk9Var.x(str2, str3, (String) vk9.e(qg4Var.e()), "unsubscribe");
                        if (a()) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                    }
                    if (!a()) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + a + ".");
                    }
                } else {
                    if (str.equals("S")) {
                        qg4 qg4Var2 = (qg4) ((rg4) vk9Var.b);
                        String str4 = ((x90) vk9.e(qg4Var2.f())).a;
                        ((FirebaseMessaging) vk9Var.d).a();
                        vk9Var.x(str2, str4, (String) vk9.e(qg4Var2.e()), "subscribe");
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
        this.e.schedule(new qwb(this, this.a, this.b, Math.min(Math.max(30L, j << 1), 28800L)), j, TimeUnit.SECONDS);
        c(true);
    }
}
