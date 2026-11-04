package ua;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b8.yf;
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
import mi.h0;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.he0;
import p6.m;
import t9.n;
import u9.l;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements e {
    public static final Object m = new Object();
    public final n9.h a;
    public final wa.c b;
    public final h0 c;
    public final k d;
    public final n e;
    public final i f;
    public final Object g;
    public final ExecutorService h;
    public final l i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public d(n9.h hVar, ta.b bVar, ExecutorService executorService, l lVar) {
        hVar.a();
        wa.c cVar = new wa.c(hVar.a, bVar);
        h0 h0Var = new h0(hVar);
        if (ra.e.c == null) {
            ra.e.c = new ra.e(27);
        }
        ra.e eVar = ra.e.c;
        if (k.d == null) {
            k.d = new k(eVar);
        }
        k kVar = k.d;
        n nVar = new n(new t9.c(hVar, 2));
        i iVar = new i();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = hVar;
        this.b = cVar;
        this.c = h0Var;
        this.d = kVar;
        this.e = nVar;
        this.f = iVar;
        this.h = executorService;
        this.i = lVar;
    }

    public final void a(j jVar) {
        synchronized (this.g) {
            this.l.add(jVar);
        }
    }

    public final synchronized void b(va.b bVar, va.b bVar2) {
        boolean z10 = bVar2.b == 4;
        String str = bVar2.a;
        if (z10 && !TextUtils.isEmpty(str)) {
            if (TextUtils.equals(bVar.a, str)) {
                r2 = !(bVar.b == 4);
            } else {
                r2 = true;
            }
        }
        if (r2) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                FirebaseMessaging firebaseMessaging = ((za.i) it.next()).a;
                he0 he0Var = FirebaseMessaging.m;
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
        r4.N(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        va.b e02;
        synchronized (m) {
            try {
                n9.h hVar = this.a;
                hVar.a();
                b a10 = b.a(hVar.a);
                try {
                    e02 = this.c.e0();
                    int i3 = e02.b;
                    boolean z10 = true;
                    if (i3 != 2 && i3 != 1) {
                        z10 = false;
                    }
                    if (a10 != null) {
                        a10.b();
                    }
                } catch (Throwable th2) {
                    if (a10 != null) {
                        a10.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        l(e02);
        this.i.execute(new c(this, 2));
    }

    public final va.b d(va.b bVar) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        String str;
        wa.b bVar2;
        n9.h hVar = this.a;
        hVar.a();
        String str2 = hVar.c.a;
        String str3 = bVar.a;
        hVar.a();
        String str4 = hVar.c.h;
        String str5 = bVar.d;
        wa.c cVar = this.b;
        wa.d dVar = cVar.c;
        if (!dVar.b()) {
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a10 = wa.c.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
        for (int i3 = 0; i3 <= 1; i3++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c2 = cVar.c(a10, str2);
            try {
                try {
                    c2.setRequestMethod("POST");
                    c2.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    c2.setDoOutput(true);
                    wa.c.h(c2);
                    responseCode = c2.getResponseCode();
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused) {
                    httpURLConnection = c2;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    bVar2 = wa.c.f(c2);
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    str = null;
                } else {
                    wa.c.b(c2, null, str2, str4);
                    httpURLConnection = c2;
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
                        wa.b bVar3 = new wa.b(null, 0L, 3);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        bVar2 = bVar3;
                    } else {
                        if (responseCode == 429) {
                            throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            wa.b bVar4 = new wa.b(null, 0L, 2);
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            bVar2 = bVar4;
                            str = null;
                        }
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                int c10 = o1.g.c(bVar2.c);
                if (c10 != 0) {
                    if (c10 == 1) {
                        va.a a11 = bVar.a();
                        a11.g = "BAD CONFIG";
                        a11.b = 5;
                        return a11.a();
                    }
                    if (c10 != 2) {
                        throw new f("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    m(str);
                    va.a a12 = bVar.a();
                    a12.b = 2;
                    return a12.a();
                }
                String str6 = bVar2.a;
                long j10 = bVar2.b;
                k kVar = this.d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                va.a a13 = bVar.a();
                a13.c = str6;
                a13.e = j10;
                byte b10 = (byte) (a13.h | 1);
                a13.f = seconds;
                a13.h = (byte) (b10 | 2);
                return a13.a();
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = c2;
            }
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
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
        a(new h(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new c(this, 0));
        return task;
    }

    public final Task f() {
        h();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new g(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new c(this, 1));
        return task;
    }

    /* JADX WARN: Finally extract failed */
    public final void g(va.b bVar) {
        synchronized (m) {
            try {
                n9.h hVar = this.a;
                hVar.a();
                b a10 = b.a(hVar.a);
                try {
                    this.c.N(bVar);
                    if (a10 != null) {
                        a10.b();
                    }
                } catch (Throwable th2) {
                    if (a10 != null) {
                        a10.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void h() {
        n9.h hVar = this.a;
        hVar.a();
        m.f(hVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        m.f(hVar.c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        m.f(hVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        String str = hVar.c.b;
        Pattern pattern = k.c;
        m.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        hVar.a();
        m.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.c.matcher(hVar.c.a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if ("[DEFAULT]".equals(r1) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String i(va.b bVar) {
        PublicKey publicKey;
        n9.h hVar = this.a;
        hVar.a();
        String str = hVar.b;
        boolean equals = str.equals("CHIME_ANDROID_SDK");
        i iVar = this.f;
        if (!equals) {
            hVar.a();
        }
        if (bVar.b == 1) {
            ja.d dVar = ((va.c) this.e.get()).a;
            String str2 = null;
            String str3 = (String) dVar.b(va.c.d, null);
            if (str3 != null) {
                str2 = str3;
            } else {
                String str4 = (String) dVar.b(va.c.c, null);
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
                            digest[0] = (byte) (((digest[0] & 15) + hs.x1) & hs.e4);
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
            iVar.getClass();
            return i.a();
        }
        iVar.getClass();
        return i.a();
    }

    public final va.b j(va.b bVar) {
        int responseCode;
        wa.a e10;
        String str = bVar.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            va.c cVar = (va.c) this.e.get();
            cVar.getClass();
            String[] strArr = va.c.e;
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                String str3 = strArr[i3];
                String str4 = (String) cVar.a.b(yf.a("|T|" + cVar.b + "|" + str3), null);
                if (str4 == null || str4.isEmpty()) {
                    i3++;
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
        n9.h hVar = this.a;
        hVar.a();
        String str5 = hVar.c.a;
        hVar.a();
        String str6 = hVar.c.h;
        hVar.a();
        String str7 = hVar.c.b;
        wa.c cVar2 = this.b;
        wa.d dVar = cVar2.c;
        if (!dVar.b()) {
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a10 = wa.c.a("projects/" + str6 + "/installations");
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c2 = cVar2.c(a10, str5);
            try {
                try {
                    c2.setRequestMethod("POST");
                    c2.setDoOutput(true);
                    if (str2 != null) {
                        c2.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    wa.c.g(c2, str, str7);
                    responseCode = c2.getResponseCode();
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    e10 = wa.c.e(c2);
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    wa.c.b(c2, str7, str5, str6);
                    if (responseCode == 429) {
                        throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        wa.a aVar = new wa.a(null, null, null, null, 2);
                        c2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        e10 = aVar;
                    }
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                int c10 = o1.g.c(e10.e);
                if (c10 != 0) {
                    if (c10 != 1) {
                        throw new f("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    va.a a11 = bVar.a();
                    a11.g = "BAD CONFIG";
                    a11.b = 5;
                    return a11.a();
                }
                String str8 = e10.b;
                String str9 = e10.c;
                k kVar = this.d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                wa.b bVar2 = e10.d;
                String str10 = bVar2.a;
                long j10 = bVar2.b;
                va.a a12 = bVar.a();
                a12.a = str8;
                a12.b = 4;
                a12.c = str10;
                a12.d = str9;
                a12.e = j10;
                byte b10 = (byte) (a12.h | 1);
                a12.f = seconds;
                a12.h = (byte) (b10 | 2);
                return a12.a();
            } catch (Throwable th2) {
                c2.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void k(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(va.b bVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(bVar)) {
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
