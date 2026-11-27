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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class q0c {
    public final Context a;
    public final tf7 b;
    public final ko9 c;
    public final ScheduledThreadPoolExecutor e;
    public final o0c g;
    public final qs d = new qs(0);
    public boolean f = false;

    public q0c(tf7 tf7Var, o0c o0cVar, ko9 ko9Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = tf7Var;
        this.g = o0cVar;
        this.c = ko9Var;
        this.a = context;
        this.e = scheduledThreadPoolExecutor;
    }

    public static boolean a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(yxb yxbVar) {
        synchronized (this.d) {
            String str = yxbVar.c;
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
        yxb a;
        while (true) {
            synchronized (this) {
                a = this.g.a();
                if (a == null) {
                    break;
                }
            }
            ko9 ko9Var = this.c;
            try {
                String str = a.b;
                String str2 = a.a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        qi4 qi4Var = (qi4) ((ri4) ko9Var.b);
                        String str3 = ((z90) ko9.f(qi4Var.f())).a;
                        ((FirebaseMessaging) ko9Var.d).a();
                        ko9Var.x(str2, str3, (String) ko9.f(qi4Var.e()), "unsubscribe");
                        if (a()) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                    }
                    if (!a()) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + a + ".");
                    }
                } else {
                    if (str.equals("S")) {
                        qi4 qi4Var2 = (qi4) ((ri4) ko9Var.b);
                        String str4 = ((z90) ko9.f(qi4Var2.f())).a;
                        ((FirebaseMessaging) ko9Var.d).a();
                        ko9Var.x(str2, str4, (String) ko9.f(qi4Var2.e()), "subscribe");
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
        this.e.schedule(new s0c(this, this.a, this.b, Math.min(Math.max(30L, j << 1), 28800L)), j, TimeUnit.SECONDS);
        c(true);
    }
}
