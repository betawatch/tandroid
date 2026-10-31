package ra;

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
import kg.s0;
import n6.l;
import org.json.JSONException;
import org.json.JSONObject;
import r9.n;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements d {
    public static final Object m = new Object();
    public final l9.h a;
    public final ta.c b;
    public final m4.c c;
    public final j d;
    public final n e;
    public final h f;
    public final Object g;
    public final ExecutorService h;
    public final s9.j i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public c(l9.h hVar, qa.b bVar, ExecutorService executorService, s9.j jVar) {
        hVar.a();
        ta.c cVar = new ta.c(hVar.a, bVar);
        m4.c cVar2 = new m4.c(hVar);
        if (hb.a.d == null) {
            hb.a.d = new hb.a(22);
        }
        hb.a aVar = hb.a.d;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        j jVar2 = j.d;
        n nVar = new n(new r9.c(hVar, 2));
        h hVar2 = new h();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = hVar;
        this.b = cVar;
        this.c = cVar2;
        this.d = jVar2;
        this.e = nVar;
        this.f = hVar2;
        this.h = executorService;
        this.i = jVar;
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
        r4.K(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        sa.a t02;
        synchronized (m) {
            try {
                l9.h hVar = this.a;
                hVar.a();
                m4.c r10 = m4.c.r(hVar.a);
                try {
                    t02 = this.c.t0();
                    int i10 = t02.b;
                    boolean z10 = true;
                    if (i10 != 2 && i10 != 1) {
                        z10 = false;
                    }
                    if (r10 != null) {
                        r10.u0();
                    }
                } catch (Throwable th2) {
                    if (r10 != null) {
                        r10.u0();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        k(t02);
        this.i.execute(new b(this, 1));
    }

    public final sa.a c(sa.a aVar) {
        int responseCode;
        ta.b f7;
        l9.h hVar = this.a;
        hVar.a();
        String str = hVar.c.a;
        String str2 = aVar.a;
        hVar.a();
        String str3 = hVar.c.g;
        String str4 = aVar.d;
        ta.c cVar = this.b;
        ta.d dVar = cVar.c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a2 = ta.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c10 = cVar.c(a2, str);
            try {
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c10.setDoOutput(true);
                    ta.c.h(c10);
                    responseCode = c10.getResponseCode();
                    dVar.d(responseCode);
                } finally {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f7 = ta.c.f(c10);
            } else {
                ta.c.b(c10, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    a5.a a10 = ta.b.a();
                    a10.b = 3;
                    f7 = a10.f();
                } else {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        a5.a a11 = ta.b.a();
                        a11.b = 2;
                        f7 = a11.f();
                    }
                }
            }
            int c11 = m1.j.c(f7.c);
            if (c11 != 0) {
                if (c11 == 1) {
                    s0 a12 = aVar.a();
                    a12.h = "BAD CONFIG";
                    a12.b = 5;
                    return a12.a();
                }
                if (c11 != 2) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                l(null);
                s0 a13 = aVar.a();
                a13.b = 2;
                return a13.a();
            }
            String str5 = f7.a;
            long j10 = f7.b;
            j jVar = this.d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            s0 a14 = aVar.a();
            a14.d = str5;
            a14.f = Long.valueOf(j10);
            a14.g = Long.valueOf(seconds);
            return a14.a();
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
    public final void f(sa.a aVar) {
        synchronized (m) {
            try {
                l9.h hVar = this.a;
                hVar.a();
                m4.c r10 = m4.c.r(hVar.a);
                try {
                    this.c.K(aVar);
                    if (r10 != null) {
                        r10.u0();
                    }
                } catch (Throwable th2) {
                    if (r10 != null) {
                        r10.u0();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g() {
        l9.h hVar = this.a;
        hVar.a();
        l.f(hVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.f(hVar.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.f(hVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
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
    public final String h(sa.a aVar) {
        String a2;
        l9.h hVar = this.a;
        hVar.a();
        if (!hVar.b.equals("CHIME_ANDROID_SDK")) {
            l9.h hVar2 = this.a;
            hVar2.a();
        }
        if (aVar.b == 1) {
            sa.b bVar = (sa.b) this.e.get();
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
    /* JADX WARN: Type inference failed for: r2v2, types: [ta.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ta.a] */
    public final sa.a i(sa.a aVar) {
        int responseCode;
        String str = aVar.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            sa.b bVar = (sa.b) this.e.get();
            synchronized (bVar.a) {
                try {
                    String[] strArr = sa.b.c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String string = bVar.a.getString("|T|" + bVar.b + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i10++;
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
        ta.c cVar = this.b;
        l9.h hVar = this.a;
        hVar.a();
        String str4 = hVar.c.a;
        String str5 = aVar.a;
        l9.h hVar2 = this.a;
        hVar2.a();
        String str6 = hVar2.c.g;
        l9.h hVar3 = this.a;
        hVar3.a();
        String str7 = hVar3.c.b;
        ta.d dVar = cVar.c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a2 = ta.c.a("projects/" + str6 + "/installations");
        int i11 = 0;
        ta.a aVar2 = cVar;
        while (i11 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c10 = aVar2.c(a2, str4);
            try {
                try {
                    c10.setRequestMethod("POST");
                    c10.setDoOutput(true);
                    if (str2 != null) {
                        c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    ta.c.g(c10, str5, str7);
                    responseCode = c10.getResponseCode();
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    ta.a e = ta.c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar2 = e;
                } else {
                    try {
                        ta.c.b(c10, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar2 = aVar2;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        ta.a aVar3 = new ta.a(null, null, null, null, 2);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar2 = aVar3;
                    } else {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar2 = aVar2;
                    }
                }
                int c11 = m1.j.c(aVar2.e);
                if (c11 != 0) {
                    if (c11 != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    s0 a10 = aVar.a();
                    a10.h = "BAD CONFIG";
                    a10.b = 5;
                    return a10.a();
                }
                String str8 = aVar2.b;
                String str9 = aVar2.c;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                ta.b bVar2 = aVar2.d;
                String str10 = bVar2.a;
                long j10 = bVar2.b;
                s0 a11 = aVar.a();
                a11.c = str8;
                a11.b = 4;
                a11.d = str10;
                a11.e = str9;
                a11.f = Long.valueOf(j10);
                a11.g = Long.valueOf(seconds);
                return a11.a();
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
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(sa.a aVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(sa.a aVar, sa.a aVar2) {
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
