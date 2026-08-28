package y9;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import x5.l;
import y8.n;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements d {
    public static final Object m = new Object();
    public final s8.h a;
    public final aa.c b;
    public final w4.e c;
    public final j d;
    public final n e;
    public final h f;
    public final Object g;
    public final ExecutorService h;
    public final z8.i i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public c(s8.h hVar, x9.b bVar, ExecutorService executorService, z8.i iVar) {
        hVar.a();
        aa.c cVar = new aa.c(hVar.a, bVar);
        w4.e eVar = new w4.e(hVar);
        if (ya.b.b == null) {
            ya.b.b = new ya.b(3);
        }
        ya.b bVar2 = ya.b.b;
        if (j.d == null) {
            j.d = new j(bVar2);
        }
        j jVar = j.d;
        n nVar = new n(new y8.c(hVar, 2));
        h hVar2 = new h();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = hVar;
        this.b = cVar;
        this.c = eVar;
        this.d = jVar;
        this.e = nVar;
        this.f = hVar2;
        this.h = executorService;
        this.i = iVar;
    }

    public final void a(i iVar) {
        synchronized (this.g) {
            this.l.add(iVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = h(r2);
        r4 = r6.c;
        r2 = r2.a();
        r2.c = r3;
        r2.b = 3;
        r2 = r2.a();
        r4.j(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        z9.a k10;
        synchronized (m) {
            try {
                s8.h hVar = this.a;
                hVar.a();
                w4.e a2 = w4.e.a(hVar.a);
                try {
                    k10 = this.c.k();
                    int i9 = k10.b;
                    boolean z10 = true;
                    if (i9 != 2 && i9 != 1) {
                        z10 = false;
                    }
                    if (a2 != null) {
                        a2.l();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        a2.l();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k(k10);
        this.i.execute(new b(this, 1));
    }

    public final z9.a c(z9.a aVar) {
        int responseCode;
        aa.b f10;
        s8.h hVar = this.a;
        hVar.a();
        String str = hVar.c.a;
        String str2 = aVar.a;
        hVar.a();
        String str3 = hVar.c.g;
        String str4 = aVar.d;
        aa.c cVar = this.b;
        aa.e eVar = cVar.c;
        if (!eVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a2 = aa.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i9 = 0; i9 <= 1; i9++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c10 = cVar.c(a2, str);
            try {
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c10.setDoOutput(true);
                    aa.c.h(c10);
                    responseCode = c10.getResponseCode();
                    eVar.d(responseCode);
                } finally {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f10 = aa.c.f(c10);
            } else {
                aa.c.b(c10, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    a6.a a3 = aa.b.a();
                    a3.c = 3;
                    f10 = a3.b();
                } else {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        a6.a a10 = aa.b.a();
                        a10.c = 2;
                        f10 = a10.b();
                    }
                }
            }
            int b10 = m1.j.b(f10.c);
            if (b10 != 0) {
                if (b10 == 1) {
                    f2.b a11 = aVar.a();
                    a11.h = "BAD CONFIG";
                    a11.b = 5;
                    return a11.a();
                }
                if (b10 != 2) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                l(null);
                f2.b a12 = aVar.a();
                a12.b = 2;
                return a12.a();
            }
            String str5 = f10.a;
            long j10 = f10.b;
            j jVar = this.d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            f2.b a13 = aVar.a();
            a13.d = str5;
            a13.f = Long.valueOf(j10);
            a13.g = Long.valueOf(seconds);
            return a13.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new g(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 0));
        return task;
    }

    public final Task e() {
        g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new f(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 2));
        return task;
    }

    /* JADX WARN: Finally extract failed */
    public final void f(z9.a aVar) {
        synchronized (m) {
            try {
                s8.h hVar = this.a;
                hVar.a();
                w4.e a2 = w4.e.a(hVar.a);
                try {
                    this.c.j(aVar);
                    if (a2 != null) {
                        a2.l();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        a2.l();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        s8.h hVar = this.a;
        hVar.a();
        l.g(hVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        String str = hVar.c.b;
        Pattern pattern = j.c;
        l.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        hVar.a();
        l.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.c.matcher(hVar.c.a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String h(z9.a aVar) {
        String a2;
        s8.h hVar = this.a;
        hVar.a();
        if (!hVar.b.equals("CHIME_ANDROID_SDK")) {
            s8.h hVar2 = this.a;
            hVar2.a();
        }
        if (aVar.b == 1) {
            z9.b bVar = (z9.b) this.e.get();
            synchronized (bVar.a) {
                try {
                    a2 = bVar.a();
                    if (a2 == null) {
                        a2 = bVar.b();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
            this.f.getClass();
            return h.a();
        }
        this.f.getClass();
        return h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [aa.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [aa.a] */
    public final z9.a i(z9.a aVar) {
        int responseCode;
        String str = aVar.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            z9.b bVar = (z9.b) this.e.get();
            synchronized (bVar.a) {
                try {
                    String[] strArr = z9.b.c;
                    int i9 = 0;
                    while (true) {
                        if (i9 < 4) {
                            String str3 = strArr[i9];
                            String string = bVar.a.getString("|T|" + bVar.b + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i9++;
                            } else if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        aa.c cVar = this.b;
        s8.h hVar = this.a;
        hVar.a();
        String str4 = hVar.c.a;
        String str5 = aVar.a;
        s8.h hVar2 = this.a;
        hVar2.a();
        String str6 = hVar2.c.g;
        s8.h hVar3 = this.a;
        hVar3.a();
        String str7 = hVar3.c.b;
        aa.e eVar = cVar.c;
        if (!eVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a2 = aa.c.a("projects/" + str6 + "/installations");
        int i10 = 0;
        aa.a aVar2 = cVar;
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c10 = aVar2.c(a2, str4);
            try {
                try {
                    c10.setRequestMethod("POST");
                    c10.setDoOutput(true);
                    if (str2 != null) {
                        c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    aa.c.g(c10, str5, str7);
                    responseCode = c10.getResponseCode();
                    eVar.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    aa.a e10 = aa.c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar2 = e10;
                } else {
                    try {
                        aa.c.b(c10, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        aVar2 = aVar2;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        aa.a aVar3 = new aa.a(null, null, null, null, 2);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar2 = aVar3;
                    } else {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        aVar2 = aVar2;
                    }
                }
                int b10 = m1.j.b(aVar2.e);
                if (b10 != 0) {
                    if (b10 != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    f2.b a3 = aVar.a();
                    a3.h = "BAD CONFIG";
                    a3.b = 5;
                    return a3.a();
                }
                String str8 = aVar2.b;
                String str9 = aVar2.c;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                aa.b bVar2 = aVar2.d;
                String str10 = bVar2.a;
                long j10 = bVar2.b;
                f2.b a10 = aVar.a();
                a10.c = str8;
                a10.b = 4;
                a10.d = str10;
                a10.e = str9;
                a10.f = Long.valueOf(j10);
                a10.g = Long.valueOf(seconds);
                return a10.a();
            } finally {
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(z9.a aVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(z9.a aVar, z9.a aVar2) {
        try {
            if (this.k.size() != 0 && !TextUtils.equals(aVar.a, aVar2.a)) {
                Iterator it = this.k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } finally {
        }
    }
}
