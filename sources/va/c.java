package va;

import ab.d0;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import c8.qb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.qs;
import q6.m;
import u9.n;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class c implements d {
    public static final Object m = new Object();
    public final o9.g a;
    public final xa.c b;
    public final v6.e c;
    public final j d;
    public final n e;
    public final h f;
    public final Object g;
    public final ExecutorService h;
    public final v9.i i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public c(o9.g gVar, ua.b bVar, ExecutorService executorService, v9.i iVar) {
        gVar.a();
        xa.c cVar = new xa.c(gVar.a, bVar);
        v6.e eVar = new v6.e();
        eVar.b = gVar;
        if (sa.d.b == null) {
            sa.d.b = new sa.d(28);
        }
        sa.d dVar = sa.d.b;
        if (j.d == null) {
            j.d = new j(dVar);
        }
        j jVar = j.d;
        n nVar = new n(new u9.c(gVar, 2));
        h hVar = new h();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = gVar;
        this.b = cVar;
        this.c = eVar;
        this.d = jVar;
        this.e = nVar;
        this.f = hVar;
        this.h = executorService;
        this.i = iVar;
    }

    public final void a(i iVar) {
        synchronized (this.g) {
            this.l.add(iVar);
        }
    }

    public final synchronized void b(wa.b bVar, wa.b bVar2) {
        boolean z9 = bVar2.b == 4;
        String str = bVar2.a;
        if (z9 && !TextUtils.isEmpty(str)) {
            if (TextUtils.equals(bVar.a, str)) {
                r2 = !(bVar.b == 4);
            } else {
                r2 = true;
            }
        }
        if (r2) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                FirebaseMessaging firebaseMessaging = ((ab.n) it.next()).a;
                d0 d0Var = FirebaseMessaging.m;
                if (firebaseMessaging.d() != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "FID Change detected! Triggering re-sync");
                    }
                    firebaseMessaging.h();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = i(r2);
        r4 = r6.c;
        r2 = r2.a();
        r2.a = r3;
        r2.b = 3;
        r2 = r2.a();
        r4.c(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        wa.b d;
        synchronized (m) {
            try {
                o9.g gVar = this.a;
                gVar.a();
                v6.e a10 = v6.e.a(gVar.a);
                try {
                    d = this.c.d();
                    int i7 = d.b;
                    boolean z9 = true;
                    if (i7 != 2 && i7 != 1) {
                        z9 = false;
                    }
                    if (a10 != null) {
                        a10.e();
                    }
                } catch (Throwable th2) {
                    if (a10 != null) {
                        a10.e();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        l(d);
        this.i.execute(new b(this, 2));
    }

    public final wa.b d(wa.b bVar) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        String str;
        xa.b bVar2;
        o9.g gVar = this.a;
        gVar.a();
        String str2 = gVar.c.a;
        String str3 = bVar.a;
        gVar.a();
        String str4 = gVar.c.h;
        String str5 = bVar.d;
        xa.c cVar = this.b;
        xa.d dVar = cVar.c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a10 = xa.c.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
        for (int i7 = 0; i7 <= 1; i7++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c10 = cVar.c(a10, str2);
            try {
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    c10.setDoOutput(true);
                    xa.c.h(c10);
                    responseCode = c10.getResponseCode();
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused) {
                    httpURLConnection = c10;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    bVar2 = xa.c.f(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    str = null;
                } else {
                    xa.c.b(c10, null, str2, str4);
                    httpURLConnection = c10;
                    try {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            throw th;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (responseCode == 401 || responseCode == 404) {
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        str = null;
                        xa.b bVar3 = new xa.b(null, 0L, 3);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        bVar2 = bVar3;
                    } else {
                        if (responseCode == 429) {
                            throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            xa.b bVar4 = new xa.b(null, 0L, 2);
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            bVar2 = bVar4;
                            str = null;
                        }
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                int c11 = p1.g.c(bVar2.c);
                if (c11 != 0) {
                    if (c11 == 1) {
                        wa.a a11 = bVar.a();
                        a11.g = "BAD CONFIG";
                        a11.b = 5;
                        return a11.a();
                    }
                    if (c11 != 2) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    m(str);
                    wa.a a12 = bVar.a();
                    a12.b = 2;
                    return a12.a();
                }
                String str6 = bVar2.a;
                long j3 = bVar2.b;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                wa.a a13 = bVar.a();
                a13.c = str6;
                a13.e = j3;
                byte b10 = (byte) (a13.h | 1);
                a13.f = seconds;
                a13.h = (byte) (b10 | 2);
                return a13.a();
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = c10;
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task e() {
        String str;
        h();
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

    public final Task f() {
        h();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new f(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 1));
        return task;
    }

    /* JADX WARN: Finally extract failed */
    public final void g(wa.b bVar) {
        synchronized (m) {
            try {
                o9.g gVar = this.a;
                gVar.a();
                v6.e a10 = v6.e.a(gVar.a);
                try {
                    this.c.c(bVar);
                    if (a10 != null) {
                        a10.e();
                    }
                } catch (Throwable th2) {
                    if (a10 != null) {
                        a10.e();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void h() {
        o9.g gVar = this.a;
        gVar.a();
        m.f(gVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        m.f(gVar.c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        m.f(gVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.c.b;
        Pattern pattern = j.c;
        m.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        m.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.c.matcher(gVar.c.a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if ("[DEFAULT]".equals(r1) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String i(wa.b bVar) {
        PublicKey publicKey;
        o9.g gVar = this.a;
        gVar.a();
        String str = gVar.b;
        boolean equals = str.equals("CHIME_ANDROID_SDK");
        h hVar = this.f;
        if (!equals) {
            gVar.a();
        }
        if (bVar.b == 1) {
            ka.d dVar = ((wa.c) this.e.get()).a;
            String str2 = null;
            String str3 = (String) dVar.b(wa.c.d, null);
            if (str3 != null) {
                str2 = str3;
            } else {
                String str4 = (String) dVar.b(wa.c.c, null);
                if (str4 != null) {
                    try {
                        publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str4, 8)));
                    } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                        Log.w("ContentValues", "Invalid key stored " + e10);
                        publicKey = null;
                    }
                    if (publicKey != null) {
                        try {
                            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                            digest[0] = (byte) (((digest[0] & 15) + qs.x1) & qs.e4);
                            str2 = Base64.encodeToString(digest, 0, 8, 11);
                        } catch (NoSuchAlgorithmException unused) {
                            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            hVar.getClass();
            return h.a();
        }
        hVar.getClass();
        return h.a();
    }

    public final wa.b j(wa.b bVar) {
        int responseCode;
        xa.a e10;
        String str = bVar.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            wa.c cVar = (wa.c) this.e.get();
            cVar.getClass();
            String[] strArr = wa.c.e;
            int length = strArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                String str3 = strArr[i7];
                String str4 = (String) cVar.a.b(qb.a("|T|" + cVar.b + "|" + str3), null);
                if (str4 == null || str4.isEmpty()) {
                    i7++;
                } else if (str4.startsWith("{")) {
                    try {
                        str2 = new JSONObject(str4).getString("token");
                    } catch (JSONException unused) {
                    }
                } else {
                    str2 = str4;
                }
            }
        }
        o9.g gVar = this.a;
        gVar.a();
        String str5 = gVar.c.a;
        gVar.a();
        String str6 = gVar.c.h;
        gVar.a();
        String str7 = gVar.c.b;
        xa.c cVar2 = this.b;
        xa.d dVar = cVar2.c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a10 = xa.c.a("projects/" + str6 + "/installations");
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c10 = cVar2.c(a10, str5);
            try {
                try {
                    c10.setRequestMethod("POST");
                    c10.setDoOutput(true);
                    if (str2 != null) {
                        c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    xa.c.g(c10, str, str7);
                    responseCode = c10.getResponseCode();
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    e10 = xa.c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    xa.c.b(c10, str7, str5, str6);
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        xa.a aVar = new xa.a(null, null, null, null, 2);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        e10 = aVar;
                    }
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                int c11 = p1.g.c(e10.e);
                if (c11 != 0) {
                    if (c11 != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    wa.a a11 = bVar.a();
                    a11.g = "BAD CONFIG";
                    a11.b = 5;
                    return a11.a();
                }
                String str8 = e10.b;
                String str9 = e10.c;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                xa.b bVar2 = e10.d;
                String str10 = bVar2.a;
                long j3 = bVar2.b;
                wa.a a12 = bVar.a();
                a12.a = str8;
                a12.b = 4;
                a12.c = str10;
                a12.d = str9;
                a12.e = j3;
                byte b10 = (byte) (a12.h | 1);
                a12.f = seconds;
                a12.h = (byte) (b10 | 2);
                return a12.a();
            } catch (Throwable th2) {
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void k(Exception exc) {
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

    public final void l(wa.b bVar) {
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

    public final synchronized void m(String str) {
        this.j = str;
    }
}
