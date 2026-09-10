package qa;

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
import n6.l;
import n7.a1;
import org.json.JSONException;
import org.json.JSONObject;
import q9.n;
import qg.m0;
import t7.u;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c implements d {
    public static final Object m = new Object();
    public final k9.h a;
    public final sa.c b;
    public final a1 c;
    public final j d;
    public final n e;
    public final h f;
    public final Object g;
    public final ExecutorService h;
    public final r9.i i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public c(k9.h hVar, pa.b bVar, ExecutorService executorService, r9.i iVar) {
        hVar.a();
        sa.c cVar = new sa.c(hVar.a, bVar);
        a1 a1Var = new a1(hVar, 15);
        if (u.b == null) {
            u.b = new u();
        }
        u uVar = u.b;
        if (j.d == null) {
            j.d = new j(uVar);
        }
        j jVar = j.d;
        n nVar = new n(new q9.c(hVar, 2));
        h hVar2 = new h();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = hVar;
        this.b = cVar;
        this.c = a1Var;
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
        r4.V(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        ra.a g02;
        synchronized (m) {
            try {
                k9.h hVar = this.a;
                hVar.a();
                a1 h = a1.h(hVar.a);
                try {
                    g02 = this.c.g0();
                    int i10 = g02.b;
                    boolean z10 = true;
                    if (i10 != 2 && i10 != 1) {
                        z10 = false;
                    }
                    if (h != null) {
                        h.j0();
                    }
                } catch (Throwable th2) {
                    if (h != null) {
                        h.j0();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        k(g02);
        this.i.execute(new b(this, 1));
    }

    public final ra.a c(ra.a aVar) {
        int responseCode;
        sa.b f7;
        k9.h hVar = this.a;
        hVar.a();
        String str = hVar.c.a;
        String str2 = aVar.a;
        hVar.a();
        String str3 = hVar.c.g;
        String str4 = aVar.d;
        sa.c cVar = this.b;
        sa.d dVar = cVar.c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a2 = sa.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c10 = cVar.c(a2, str);
            try {
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c10.setDoOutput(true);
                    sa.c.h(c10);
                    responseCode = c10.getResponseCode();
                    dVar.d(responseCode);
                } finally {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f7 = sa.c.f(c10);
            } else {
                sa.c.b(c10, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    a5.a a10 = sa.b.a();
                    a10.b = 3;
                    f7 = a10.b();
                } else {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        a5.a a11 = sa.b.a();
                        a11.b = 2;
                        f7 = a11.b();
                    }
                }
            }
            int c11 = m1.j.c(f7.c);
            if (c11 != 0) {
                if (c11 == 1) {
                    m0 a12 = aVar.a();
                    a12.h = "BAD CONFIG";
                    a12.b = 5;
                    return a12.a();
                }
                if (c11 != 2) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                l(null);
                m0 a13 = aVar.a();
                a13.b = 2;
                return a13.a();
            }
            String str5 = f7.a;
            long j3 = f7.b;
            j jVar = this.d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            m0 a14 = aVar.a();
            a14.d = str5;
            a14.f = Long.valueOf(j3);
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
    public final void f(ra.a aVar) {
        synchronized (m) {
            try {
                k9.h hVar = this.a;
                hVar.a();
                a1 h = a1.h(hVar.a);
                try {
                    this.c.V(aVar);
                    if (h != null) {
                        h.j0();
                    }
                } catch (Throwable th2) {
                    if (h != null) {
                        h.j0();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g() {
        k9.h hVar = this.a;
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
    public final String h(ra.a aVar) {
        String a2;
        k9.h hVar = this.a;
        hVar.a();
        if (!hVar.b.equals("CHIME_ANDROID_SDK")) {
            k9.h hVar2 = this.a;
            hVar2.a();
        }
        if (aVar.b == 1) {
            ra.b bVar = (ra.b) this.e.get();
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
    /* JADX WARN: Type inference failed for: r2v2, types: [sa.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [sa.a] */
    public final ra.a i(ra.a aVar) {
        int responseCode;
        String str = aVar.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            ra.b bVar = (ra.b) this.e.get();
            synchronized (bVar.a) {
                try {
                    String[] strArr = ra.b.c;
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
        sa.c cVar = this.b;
        k9.h hVar = this.a;
        hVar.a();
        String str4 = hVar.c.a;
        String str5 = aVar.a;
        k9.h hVar2 = this.a;
        hVar2.a();
        String str6 = hVar2.c.g;
        k9.h hVar3 = this.a;
        hVar3.a();
        String str7 = hVar3.c.b;
        sa.d dVar = cVar.c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a2 = sa.c.a("projects/" + str6 + "/installations");
        int i11 = 0;
        sa.a aVar2 = cVar;
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
                    sa.c.g(c10, str5, str7);
                    responseCode = c10.getResponseCode();
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    sa.a e = sa.c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar2 = e;
                } else {
                    try {
                        sa.c.b(c10, str7, str4, str6);
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
                        sa.a aVar3 = new sa.a(null, null, null, null, 2);
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
                    m0 a10 = aVar.a();
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
                sa.b bVar2 = aVar2.d;
                String str10 = bVar2.a;
                long j3 = bVar2.b;
                m0 a11 = aVar.a();
                a11.c = str8;
                a11.b = 4;
                a11.d = str10;
                a11.e = str9;
                a11.f = Long.valueOf(j3);
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

    public final void k(ra.a aVar) {
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

    public final synchronized void m(ra.a aVar, ra.a aVar2) {
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
