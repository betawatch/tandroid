package xa;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.telegram.ui.ActionBar.p4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final p4 b;
    public final j2.f c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final q h;
    public final a0.f e = new a0.f(0);
    public boolean g = false;

    public s(FirebaseMessaging firebaseMessaging, p4 p4Var, q qVar, j2.f fVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = p4Var;
        this.h = qVar;
        this.c = fVar;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e7);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(String str) {
        String a2 = this.d.a();
        j2.f fVar = this.c;
        fVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(fVar.n(fVar.C(a2, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a2 = this.d.a();
        j2.f fVar = this.c;
        fVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(fVar.n(fVar.C(a2, "/topics/" + str, bundle)));
    }

    public final void e(p pVar) {
        synchronized (this.e) {
            try {
                String str = pVar.c;
                if (this.e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.e.remove(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void f(boolean z10) {
        this.g = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089 A[Catch: IOException -> 0x005d, TRY_LEAVE, TryCatch #1 {IOException -> 0x005d, blocks: (B:8:0x0028, B:13:0x0083, B:15:0x0089, B:19:0x0039, B:21:0x0041, B:23:0x004a, B:26:0x005f, B:28:0x0067, B:30:0x0070), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        p a2;
        while (true) {
            synchronized (this) {
                try {
                    a2 = this.h.a();
                    if (a2 == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str = a2.b;
                String str2 = a2.a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c(str2);
                        if (d()) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                        this.h.c(a2);
                        e(a2);
                    }
                    if (!d()) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + a2 + ".");
                    }
                    this.h.c(a2);
                    e(a2);
                } else {
                    if (str.equals("S")) {
                        b(str2);
                        if (d()) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                        }
                        this.h.c(a2);
                        e(a2);
                    }
                    if (!d()) {
                    }
                    this.h.c(a2);
                    e(a2);
                }
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
        if (d()) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void h(long j10) {
        this.f.schedule(new u(this, this.a, this.b, Math.min(Math.max(30L, 2 * j10), i)), j10, TimeUnit.SECONDS);
        f(true);
    }
}
