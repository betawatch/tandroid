// default package

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
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
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qi4 implements ri4 {
    public static final Object l = new Object();
    public final ji4 a;
    public final oi4 b;
    public final ym4 c;
    public final tcc d;
    public final i26 e;
    public final Object f;
    public final ExecutorService g;
    public final n8a h;
    public String i;
    public final HashSet j;
    public final ArrayList k;

    static {
        new AtomicInteger(1);
    }

    public qi4(ji4 ji4Var, vw8 vw8Var, ExecutorService executorService, n8a n8aVar) {
        ji4Var.a();
        oi4 oi4Var = new oi4(ji4Var.a, vw8Var);
        ym4 ym4Var = new ym4(ji4Var);
        sae saeVar = sae.E;
        if (saeVar == null) {
            saeVar = new sae();
            sae.E = saeVar;
        }
        tcc tccVar = tcc.c;
        if (tccVar == null) {
            tccVar = new tcc(saeVar);
            tcc.c = tccVar;
        }
        i26 i26Var = new i26(new sq2(ji4Var, (byte) 2));
        this.f = new Object();
        this.j = new HashSet();
        this.k = new ArrayList();
        this.a = ji4Var;
        this.b = oi4Var;
        this.c = ym4Var;
        this.d = tccVar;
        this.e = i26Var;
        this.g = executorService;
        this.h = n8aVar;
    }

    public final void a(m0b m0bVar) {
        synchronized (this.f) {
            this.k.add(m0bVar);
        }
    }

    public final synchronized void b(ia0 ia0Var, ia0 ia0Var2) {
        boolean z = ia0Var2.b == 4;
        String str = ia0Var2.a;
        if (z && !TextUtils.isEmpty(str)) {
            if (TextUtils.equals(ia0Var.a, str)) {
                r2 = !(ia0Var.b == 4);
            } else {
                r2 = true;
            }
        }
        if (r2) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                FirebaseMessaging firebaseMessaging = ((ui4) it.next()).a;
                if (firebaseMessaging.d() != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "FID Change detected! Triggering re-sync");
                    }
                    firebaseMessaging.h();
                }
            }
        }
    }

    public final void c() {
        ia0 F0;
        byte b;
        synchronized (l) {
            ji4 ji4Var = this.a;
            ji4Var.a();
            lh2 e = lh2.e(ji4Var.a);
            try {
                F0 = this.c.F0();
                int i = F0.b;
                b = 2;
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                if (z) {
                    String i2 = i(F0);
                    ym4 ym4Var = this.c;
                    ha0 a = F0.a();
                    a.a = i2;
                    a.b = 3;
                    F0 = a.a();
                    ym4Var.J(F0);
                }
            } finally {
                if (e != null) {
                    e.Q();
                }
            }
        }
        l(F0);
        this.h.execute(new pi4(this, b));
    }

    public final ia0 d(ia0 ia0Var) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        String str;
        sa0 sa0Var;
        ji4 ji4Var = this.a;
        ji4Var.a();
        String str2 = ji4Var.c.a;
        String str3 = ia0Var.a;
        ji4Var.a();
        String str4 = ji4Var.c.h;
        String str5 = ia0Var.d;
        oi4 oi4Var = this.b;
        sd1 sd1Var = oi4Var.c;
        if (!sd1Var.c()) {
            throw new si4("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a = oi4.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c = oi4Var.c(a, str2);
            try {
                try {
                    c.setRequestMethod("POST");
                    c.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    c.setDoOutput(true);
                    oi4.h(c);
                    responseCode = c.getResponseCode();
                    sd1Var.e(responseCode);
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = c;
                }
            } catch (IOException | AssertionError unused) {
                httpURLConnection = c;
            }
            if (responseCode >= 200 && responseCode < 300) {
                sa0Var = oi4.f(c);
                c.disconnect();
                TrafficStats.clearThreadStatsTag();
                str = null;
            } else {
                oi4.b(c, null, str2, str4);
                httpURLConnection = c;
                try {
                    try {
                    } catch (IOException | AssertionError unused2) {
                        continue;
                    }
                    if (responseCode == 401 || responseCode == 404) {
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        str = null;
                        sa0 sa0Var2 = new sa0(null, 0L, 3);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        sa0Var = sa0Var2;
                    } else {
                        if (responseCode == 429) {
                            throw new si4("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            sa0 sa0Var3 = new sa0(null, 0L, 2);
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            sa0Var = sa0Var3;
                            str = null;
                        } else {
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            int F = ik8.F(sa0Var.c);
            if (F != 0) {
                if (F == 1) {
                    ha0 a2 = ia0Var.a();
                    a2.g = "BAD CONFIG";
                    a2.b = 5;
                    return a2.a();
                }
                if (F != 2) {
                    throw new si4("Firebase Installations Service is unavailable. Please try again later.");
                }
                m(str);
                ha0 a3 = ia0Var.a();
                a3.b = 2;
                return a3.a();
            }
            String str6 = sa0Var.a;
            long j = sa0Var.b;
            this.d.a.getClass();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            ha0 a4 = ia0Var.a();
            a4.c = str6;
            a4.e = j;
            byte b = (byte) (a4.h | 1);
            a4.f = currentTimeMillis;
            a4.h = (byte) (b | 2);
            return a4.a();
        }
        throw new si4("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task e() {
        String str;
        h();
        synchronized (this) {
            str = this.i;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new dv4(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.g.execute(new pi4(this, (byte) 0));
        return task;
    }

    public final Task f() {
        h();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new uu4(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.g.execute(new pi4(this, (byte) 1));
        return task;
    }

    public final void g(ia0 ia0Var) {
        synchronized (l) {
            ji4 ji4Var = this.a;
            ji4Var.a();
            lh2 e = lh2.e(ji4Var.a);
            try {
                this.c.J(ia0Var);
            } finally {
                if (e != null) {
                    e.Q();
                }
            }
        }
    }

    public final void h() {
        ji4 ji4Var = this.a;
        ji4Var.a();
        xve.g(ji4Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ji4Var.a();
        xve.g(ji4Var.c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ji4Var.a();
        xve.g(ji4Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ji4Var.a();
        String str = ji4Var.c.b;
        Pattern pattern = tcc.b;
        xve.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        ji4Var.a();
        xve.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", tcc.b.matcher(ji4Var.c.a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if ("[DEFAULT]".equals(r1) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String i(ia0 ia0Var) {
        PublicKey publicKey;
        ji4 ji4Var = this.a;
        ji4Var.a();
        String str = ji4Var.b;
        if (!str.equals("CHIME_ANDROID_SDK")) {
            ji4Var.a();
        }
        if (ia0Var.b == 1) {
            av5 av5Var = ((dm5) this.e.get()).a;
            String str2 = null;
            String str3 = (String) av5Var.b(dm5.d, null);
            if (str3 != null) {
                str2 = str3;
            } else {
                String str4 = (String) av5Var.b(dm5.c, null);
                if (str4 != null) {
                    try {
                        publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str4, 8)));
                    } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                        Log.w("ContentValues", "Invalid key stored " + e);
                        publicKey = null;
                    }
                    if (publicKey != null) {
                        try {
                            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                            digest[0] = (byte) (((digest[0] & 15) + jn7.w1) & jn7.d4);
                            str2 = Base64.encodeToString(digest, 0, 8, 11);
                        } catch (NoSuchAlgorithmException unused) {
                            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
                        }
                    }
                }
            }
            return TextUtils.isEmpty(str2) ? faf.x0() : str2;
        }
        return faf.x0();
    }

    public final ia0 j(ia0 ia0Var) {
        int responseCode;
        y90 e;
        String str = ia0Var.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            dm5 dm5Var = (dm5) this.e.get();
            dm5Var.getClass();
            String[] strArr = dm5.e;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str3 = (String) dm5Var.a.b(new zj8(qd4.q("|T|", dm5Var.b, "|", strArr[i])), null);
                if (str3 == null || str3.isEmpty()) {
                    i++;
                } else if (str3.startsWith("{")) {
                    try {
                        str2 = new JSONObject(str3).getString("token");
                    } catch (JSONException unused) {
                    }
                } else {
                    str2 = str3;
                }
            }
        }
        ji4 ji4Var = this.a;
        ji4Var.a();
        String str4 = ji4Var.c.a;
        ji4Var.a();
        String str5 = ji4Var.c.h;
        ji4Var.a();
        String str6 = ji4Var.c.b;
        oi4 oi4Var = this.b;
        sd1 sd1Var = oi4Var.c;
        if (!sd1Var.c()) {
            throw new si4("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a = oi4.a("projects/" + str5 + "/installations");
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c = oi4Var.c(a, str4);
            try {
                try {
                    c.setRequestMethod("POST");
                    c.setDoOutput(true);
                    if (str2 != null) {
                        c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    oi4.g(c, str, str6);
                    responseCode = c.getResponseCode();
                    sd1Var.e(responseCode);
                } finally {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                e = oi4.e(c);
            } else {
                oi4.b(c, str6, str4, str5);
                if (responseCode == 429) {
                    throw new si4("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    y90 y90Var = new y90(null, null, null, null, 2);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    e = y90Var;
                } else {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            int F = ik8.F(e.e);
            if (F != 0) {
                if (F != 1) {
                    throw new si4("Firebase Installations Service is unavailable. Please try again later.");
                }
                ha0 a2 = ia0Var.a();
                a2.g = "BAD CONFIG";
                a2.b = 5;
                return a2.a();
            }
            String str7 = e.b;
            String str8 = e.c;
            this.d.a.getClass();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            sa0 sa0Var = e.d;
            String str9 = sa0Var.a;
            long j = sa0Var.b;
            ha0 a3 = ia0Var.a();
            a3.a = str7;
            a3.b = 4;
            a3.c = str9;
            a3.d = str8;
            a3.e = j;
            byte b = (byte) (a3.h | 1);
            a3.f = currentTimeMillis;
            a3.h = (byte) (b | 2);
            return a3.a();
        }
        throw new si4("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void k(Exception exc) {
        synchronized (this.f) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                if (((m0b) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void l(ia0 ia0Var) {
        synchronized (this.f) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                if (((m0b) it.next()).b(ia0Var)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void m(String str) {
        this.i = str;
    }
}
