package z9;

import a9.q;
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
import w3.b0;
import y5.l;
import z8.m;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements d {
    public static final Object m = new Object();
    public final t8.h a;
    public final ba.c b;
    public final xe.b c;
    public final j d;
    public final m e;
    public final h f;
    public final Object g;
    public final ExecutorService h;
    public final q i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public c(t8.h hVar, y9.b bVar, ExecutorService executorService, q qVar) {
        hVar.a();
        ba.c cVar = new ba.c(hVar.a, bVar);
        xe.b bVar2 = new xe.b(hVar);
        if (xa.a.b == null) {
            xa.a.b = new xa.a(3);
        }
        xa.a aVar = xa.a.b;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        j jVar = j.d;
        m mVar = new m(new z8.c(hVar, 2));
        h hVar2 = new h();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = hVar;
        this.b = cVar;
        this.c = bVar2;
        this.d = jVar;
        this.e = mVar;
        this.f = hVar2;
        this.h = executorService;
        this.i = qVar;
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
        r4.G(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        aa.b M;
        synchronized (m) {
            try {
                t8.h hVar = this.a;
                hVar.a();
                b0 d = b0.d(hVar.a);
                try {
                    M = this.c.M();
                    int i10 = M.b;
                    boolean z10 = true;
                    if (i10 != 2 && i10 != 1) {
                        z10 = false;
                    }
                    if (d != null) {
                        d.l();
                    }
                } catch (Throwable th) {
                    if (d != null) {
                        d.l();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k(M);
        this.i.execute(new b(this, 1));
    }

    public final aa.b c(aa.b bVar) {
        int responseCode;
        ba.b f10;
        t8.h hVar = this.a;
        hVar.a();
        String str = hVar.c.a;
        String str2 = bVar.a;
        hVar.a();
        String str3 = hVar.c.g;
        String str4 = bVar.d;
        ba.c cVar = this.b;
        ba.d dVar = cVar.c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a2 = ba.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c10 = cVar.c(a2, str);
            try {
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c10.setDoOutput(true);
                    ba.c.h(c10);
                    responseCode = c10.getResponseCode();
                    dVar.d(responseCode);
                } finally {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f10 = ba.c.f(c10);
            } else {
                ba.c.b(c10, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    b6.a a3 = ba.b.a();
                    a3.c = 3;
                    f10 = a3.b();
                } else {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        b6.a a10 = ba.b.a();
                        a10.c = 2;
                        f10 = a10.b();
                    }
                }
            }
            int b10 = m1.j.b(f10.c);
            if (b10 != 0) {
                if (b10 == 1) {
                    aa.a a11 = bVar.a();
                    a11.f = "BAD CONFIG";
                    a11.b = 5;
                    return a11.a();
                }
                if (b10 != 2) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                l(null);
                aa.a a12 = bVar.a();
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
            aa.a a13 = bVar.a();
            a13.d = str5;
            a13.g = Long.valueOf(j10);
            a13.h = Long.valueOf(seconds);
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
    public final void f(aa.b bVar) {
        synchronized (m) {
            try {
                t8.h hVar = this.a;
                hVar.a();
                b0 d = b0.d(hVar.a);
                try {
                    this.c.G(bVar);
                    if (d != null) {
                        d.l();
                    }
                } catch (Throwable th) {
                    if (d != null) {
                        d.l();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        t8.h hVar = this.a;
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
    public final String h(aa.b bVar) {
        String a2;
        t8.h hVar = this.a;
        hVar.a();
        if (!hVar.b.equals("CHIME_ANDROID_SDK")) {
            t8.h hVar2 = this.a;
            hVar2.a();
        }
        if (bVar.b == 1) {
            aa.c cVar = (aa.c) this.e.get();
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
    /* JADX WARN: Type inference failed for: r2v2, types: [ba.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ba.a] */
    public final aa.b i(aa.b bVar) {
        int responseCode;
        String str = bVar.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            aa.c cVar = (aa.c) this.e.get();
            synchronized (cVar.a) {
                try {
                    String[] strArr = aa.c.c;
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
        ba.c cVar2 = this.b;
        t8.h hVar = this.a;
        hVar.a();
        String str4 = hVar.c.a;
        String str5 = bVar.a;
        t8.h hVar2 = this.a;
        hVar2.a();
        String str6 = hVar2.c.g;
        t8.h hVar3 = this.a;
        hVar3.a();
        String str7 = hVar3.c.b;
        ba.d dVar = cVar2.c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a2 = ba.c.a("projects/" + str6 + "/installations");
        int i11 = 0;
        ba.a aVar = cVar2;
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
                    ba.c.g(c10, str5, str7);
                    responseCode = c10.getResponseCode();
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    ba.a e9 = ba.c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = e9;
                } else {
                    try {
                        ba.c.b(c10, str7, str4, str6);
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
                        ba.a aVar2 = new ba.a(null, null, null, null, 2);
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
                int b10 = m1.j.b(aVar.e);
                if (b10 != 0) {
                    if (b10 != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    aa.a a3 = bVar.a();
                    a3.f = "BAD CONFIG";
                    a3.b = 5;
                    return a3.a();
                }
                String str8 = aVar.b;
                String str9 = aVar.c;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                ba.b bVar2 = aVar.d;
                String str10 = bVar2.a;
                long j10 = bVar2.b;
                aa.a a10 = bVar.a();
                a10.c = str8;
                a10.b = 4;
                a10.d = str10;
                a10.e = str9;
                a10.g = Long.valueOf(j10);
                a10.h = Long.valueOf(seconds);
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
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(aa.b bVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(bVar)) {
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

    public final synchronized void m(aa.b bVar, aa.b bVar2) {
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
