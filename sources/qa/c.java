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
import n7.z0;
import org.json.JSONException;
import org.json.JSONObject;
import q9.n;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class c implements d {
    public static final Object m = new Object();
    public final k9.h a;
    public final sa.c b;
    public final z0 c;
    public final j d;
    public final n e;
    public final h f;
    public final Object g;
    public final ExecutorService h;
    public final r9.j i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public c(k9.h hVar, pa.b bVar, ExecutorService executorService, r9.j jVar) {
        hVar.a();
        sa.c cVar = new sa.c(hVar.a, bVar);
        z0 z0Var = new z0(hVar);
        if (na.d.a == null) {
            na.d.a = new na.d();
        }
        na.d dVar = na.d.a;
        if (j.d == null) {
            j.d = new j(dVar);
        }
        j jVar2 = j.d;
        n nVar = new n(new q9.c(hVar, 2));
        h hVar2 = new h();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = hVar;
        this.b = cVar;
        this.c = z0Var;
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
        r4.A(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        ra.b F;
        synchronized (m) {
            try {
                k9.h hVar = this.a;
                hVar.a();
                o0.a d = o0.a.d(hVar.a);
                try {
                    F = this.c.F();
                    int i10 = F.b;
                    boolean z10 = true;
                    if (i10 != 2 && i10 != 1) {
                        z10 = false;
                    }
                    if (d != null) {
                        d.J();
                    }
                } catch (Throwable th2) {
                    if (d != null) {
                        d.J();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        k(F);
        this.i.execute(new b(this, 1));
    }

    public final ra.b c(ra.b bVar) {
        int responseCode;
        sa.b f7;
        k9.h hVar = this.a;
        hVar.a();
        String str = hVar.c.a;
        String str2 = bVar.a;
        hVar.a();
        String str3 = hVar.c.g;
        String str4 = bVar.d;
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
                    ra.a a12 = bVar.a();
                    a12.f = "BAD CONFIG";
                    a12.b = 5;
                    return a12.a();
                }
                if (c11 != 2) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                l(null);
                ra.a a13 = bVar.a();
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
            ra.a a14 = bVar.a();
            a14.d = str5;
            a14.g = Long.valueOf(j3);
            a14.h = Long.valueOf(seconds);
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
    public final void f(ra.b bVar) {
        synchronized (m) {
            try {
                k9.h hVar = this.a;
                hVar.a();
                o0.a d = o0.a.d(hVar.a);
                try {
                    this.c.A(bVar);
                    if (d != null) {
                        d.J();
                    }
                } catch (Throwable th2) {
                    if (d != null) {
                        d.J();
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
    public final String h(ra.b bVar) {
        String a2;
        k9.h hVar = this.a;
        hVar.a();
        if (!hVar.b.equals("CHIME_ANDROID_SDK")) {
            k9.h hVar2 = this.a;
            hVar2.a();
        }
        if (bVar.b == 1) {
            ra.c cVar = (ra.c) this.e.get();
            synchronized (cVar.a) {
                try {
                    a2 = cVar.a();
                    if (a2 == null) {
                        a2 = cVar.b();
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
    public final ra.b i(ra.b bVar) {
        int responseCode;
        String str = bVar.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            ra.c cVar = (ra.c) this.e.get();
            synchronized (cVar.a) {
                try {
                    String[] strArr = ra.c.c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String string = cVar.a.getString("|T|" + cVar.b + "|" + str3, null);
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
        sa.c cVar2 = this.b;
        k9.h hVar = this.a;
        hVar.a();
        String str4 = hVar.c.a;
        String str5 = bVar.a;
        k9.h hVar2 = this.a;
        hVar2.a();
        String str6 = hVar2.c.g;
        k9.h hVar3 = this.a;
        hVar3.a();
        String str7 = hVar3.c.b;
        sa.d dVar = cVar2.c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a2 = sa.c.a("projects/" + str6 + "/installations");
        int i11 = 0;
        sa.a aVar = cVar2;
        while (i11 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c10 = aVar.c(a2, str4);
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
                    sa.a e7 = sa.c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = e7;
                } else {
                    try {
                        sa.c.b(c10, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar = aVar;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        sa.a aVar2 = new sa.a(null, null, null, null, 2);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = aVar2;
                    } else {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar = aVar;
                    }
                }
                int c11 = m1.j.c(aVar.e);
                if (c11 != 0) {
                    if (c11 != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    ra.a a10 = bVar.a();
                    a10.f = "BAD CONFIG";
                    a10.b = 5;
                    return a10.a();
                }
                String str8 = aVar.b;
                String str9 = aVar.c;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                sa.b bVar2 = aVar.d;
                String str10 = bVar2.a;
                long j3 = bVar2.b;
                ra.a a11 = bVar.a();
                a11.c = str8;
                a11.b = 4;
                a11.d = str10;
                a11.e = str9;
                a11.g = Long.valueOf(j3);
                a11.h = Long.valueOf(seconds);
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

    public final void k(ra.b bVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(bVar)) {
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

    public final synchronized void m(ra.b bVar, ra.b bVar2) {
        try {
            if (this.k.size() != 0 && !TextUtils.equals(bVar.a, bVar2.a)) {
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
