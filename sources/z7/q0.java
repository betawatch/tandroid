package z7;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q0 {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ q0(Object obj, Object obj2, Object obj3) {
        this.b = obj3;
        this.c = obj;
        this.a = obj2;
    }

    public static Object a(Task task) {
        try {
            return Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e11);
        }
    }

    public static boolean c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b() {
        za.m mVar;
        if (((y00) this.a).j("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String u10 = ((y00) this.a).u("gcm.n.image");
        if (!TextUtils.isEmpty(u10)) {
            try {
                mVar = new za.m(new URL(u10));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + u10);
            }
            if (mVar != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                mVar.b = executorService.submit(new xh.i(6, mVar, taskCompletionSource));
                mVar.c = taskCompletionSource.getTask();
            }
            za.g a10 = za.d.a((FirebaseMessagingService) this.c, (y00) this.a);
            e0.q qVar = (e0.q) a10.a;
            if (mVar != null) {
                try {
                    Task task = mVar.c;
                    p6.m.g(task);
                    Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                    qVar.j(bitmap);
                    e0.k kVar = new e0.k();
                    kVar.e = bitmap == null ? null : IconCompat.c(bitmap);
                    kVar.f = null;
                    kVar.g = true;
                    qVar.n(kVar);
                } catch (InterruptedException unused2) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    mVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e10) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
                } catch (TimeoutException unused3) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    mVar.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a10.b, 0, ((e0.q) a10.a).b());
            return true;
        }
        mVar = null;
        if (mVar != null) {
        }
        za.g a102 = za.d.a((FirebaseMessagingService) this.c, (y00) this.a);
        e0.q qVar2 = (e0.q) a102.a;
        if (mVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a102.b, 0, ((e0.q) a102.a).b());
        return true;
    }

    /* JADX WARN: Finally extract failed */
    public void d(String str, String str2, String str3, String str4) {
        n9.h hVar = (n9.h) this.c;
        if (str2 == null || str3 == null) {
            throw new IOException("FIS auth token or FIS ID is empty");
        }
        hVar.a();
        n9.k kVar = hVar.c;
        String str5 = kVar.h;
        hVar.a();
        String str6 = kVar.a;
        if (str5 == null) {
            throw new IOException("Project ID or API Key is missing");
        }
        URL url = new URL(org.telegram.ui.Cells.f1.r(str, ":", str4, com.google.android.recaptcha.internal.a.n("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/")));
        if (c()) {
            StringBuilder n4 = com.google.android.recaptcha.internal.a.n("Topic ", str4, " for: ", str, " with url: ");
            n4.append(url);
            Log.d("FirebaseMessaging", n4.toString());
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("x-goog-api-key", str6);
        httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
        httpURLConnection.setDoOutput(false);
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                try {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                } catch (IOException unused2) {
                }
                httpURLConnection.disconnect();
                if (responseCode >= 200 && responseCode < 300) {
                    if (c()) {
                        Log.d("FirebaseMessaging", org.telegram.ui.Cells.f1.q("Topic ", str4, " for: ", str, " succeeded."));
                        return;
                    }
                    return;
                }
                if (responseCode == 404 || responseCode == 403) {
                    if (c()) {
                        Log.d("FirebaseMessaging", "Topic " + str4 + " failed: " + responseMessage);
                    }
                    throw new IOException(com.google.android.recaptcha.internal.a.k("Topic ", str4, " failed: ", responseMessage));
                }
                if (responseCode >= 500) {
                    throw new IOException("INTERNAL_SERVER_ERROR");
                }
                throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
            } catch (IOException e10) {
                throw new IOException("SERVICE_NOT_AVAILABLE", e10);
            }
        } catch (Throwable th2) {
            try {
                InputStream inputStream2 = httpURLConnection.getInputStream();
                if (inputStream2 != null) {
                    inputStream2.close();
                }
            } catch (IOException unused3) {
            }
            try {
                InputStream errorStream2 = httpURLConnection.getErrorStream();
                if (errorStream2 != null) {
                    errorStream2.close();
                }
            } catch (IOException unused4) {
            }
            httpURLConnection.disconnect();
            throw th2;
        }
    }
}
