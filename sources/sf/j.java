package sf;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import j$.util.concurrent.atomic.DesugarAtomicInteger;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import k7.y;
import o2.k;
import o2.l;
import o2.m;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.tf0;
import qh.d6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class j implements g10 {
    public static final Object t = new Object();
    public static j u;
    public static j v;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ServerSocket g;
    public WebView m;
    public o2.f n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public c s;
    public final Object a = new Object();
    public final ExecutorService h = Executors.newCachedThreadPool();
    public final ExecutorService i = Executors.newSingleThreadExecutor();
    public final AtomicInteger j = new AtomicInteger(1);
    public final HashMap k = new HashMap();
    public final ArrayDeque l = new ArrayDeque();

    public j(String str, String str2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        String concat = "https://".concat(str);
        this.d = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.f = encodeToString;
        String concat2 = "tdesktop-web-proxy-bridge-v1\n".concat(str);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        this.e = concat + "/?bridge=" + Base64.encodeToString(mac.doFinal(concat2.getBytes(StandardCharsets.UTF_8)), 11) + "#android=" + encodeToString;
        this.g = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(j jVar) {
        m mVar;
        synchronized (jVar.a) {
            try {
                if (!jVar.p && jVar.m == null) {
                    h10 h10Var = h10.getInstance();
                    if (h10Var != null && h10Var.isBackground()) {
                        jVar.q = true;
                        return;
                    }
                    int i10 = 0;
                    jVar.q = false;
                    jVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        jVar.m = webView;
                        webView.setBackgroundColor(0);
                        WebSettings settings = webView.getSettings();
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(false);
                        settings.setDatabaseEnabled(false);
                        settings.setAllowFileAccess(false);
                        settings.setAllowContentAccess(false);
                        int i11 = 2;
                        settings.setCacheMode(2);
                        settings.setJavaScriptCanOpenWindowsAutomatically(false);
                        settings.setSupportMultipleWindows(false);
                        settings.setGeolocationEnabled(false);
                        settings.setMediaPlaybackRequiresUserGesture(true);
                        settings.setMixedContentMode(1);
                        if (Build.VERSION.SDK_INT >= 26) {
                            settings.setSafeBrowsingEnabled(true);
                        }
                        webView.setWebViewClient(new tf0(jVar, i11));
                        HashSet hashSet = new HashSet();
                        hashSet.add(jVar.d);
                        g gVar = new g(jVar, i10);
                        boolean z4 = n2.a.a;
                        if (!k.c.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        if (k.d.b() && n2.a.a) {
                            WeakHashMap weakHashMap = n2.a.b;
                            mVar = (m) weakHashMap.get(webView);
                            if (mVar == null) {
                                mVar = new m(l.a.createWebView(webView));
                                weakHashMap.put(webView, mVar);
                            }
                        } else {
                            mVar = new m(l.a.createWebView(webView));
                        }
                        mVar.a.addWebMessageListener("TelegramWebProxy", (String[]) hashSet.toArray(new String[0]), new ee.a(new o5.i(gVar, 25)));
                        webView.loadUrl(jVar.e);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        jVar.f();
                    }
                }
            } finally {
            }
        }
    }

    public static void b(j jVar) {
        int andUpdate;
        while (true) {
            try {
                Socket accept = jVar.g.accept();
                accept.setTcpNoDelay(true);
                synchronized (jVar.a) {
                    try {
                        if (!jVar.p && jVar.k.size() < 64) {
                            while (true) {
                                andUpdate = DesugarAtomicInteger.getAndUpdate(jVar.j, new h());
                                if (andUpdate != 0 && !jVar.k.containsKey(Integer.valueOf(andUpdate))) {
                                    break;
                                }
                            }
                            i iVar = new i(andUpdate, accept);
                            jVar.k.put(Integer.valueOf(andUpdate), iVar);
                            if (jVar.o) {
                                iVar.e = true;
                                jVar.j(1, andUpdate, null);
                            }
                            jVar.h.execute(new d6(10, jVar, iVar));
                        }
                        try {
                            accept.close();
                        } catch (Exception unused) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e6) {
                synchronized (jVar.a) {
                    try {
                        if (jVar.p) {
                            return;
                        }
                        FileLog.e(e6);
                        jVar.f();
                        return;
                    } finally {
                    }
                }
            }
        }
    }

    public static byte[] d(String str) {
        byte[] bArr;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if ((trim.length() == 32 || trim.length() == 34) && trim.matches("[0-9a-fA-F]+")) {
            int length = trim.length() / 2;
            bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) Integer.parseInt(trim.substring(i11, i11 + 2), 16);
            }
        } else {
            try {
                bArr = Base64.decode(trim, 10);
            } catch (Exception unused) {
                return null;
            }
        }
        if (bArr.length == 16 || (bArr.length == 17 && (bArr[0] & 255) == 221)) {
            return bArr;
        }
        return null;
    }

    public static boolean h() {
        try {
            if (y.a("WEB_MESSAGE_LISTENER")) {
                if (y.a("WEB_MESSAGE_ARRAY_BUFFER")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return false;
        }
    }

    public static String i(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.endsWith(".")) {
            trim = e2.c.j(trim, 1, 0);
        }
        try {
            String lowerCase = IDN.toASCII(trim, 2).toLowerCase(Locale.US);
            if (lowerCase.length() <= 253 && lowerCase.indexOf(46) > 0 && !lowerCase.contains(":") && !lowerCase.matches("[0-9.]+")) {
                for (String str2 : lowerCase.split("\\.", -1)) {
                    if (str2.isEmpty() || str2.length() > 63 || str2.startsWith("-") || str2.endsWith("-")) {
                        return "";
                    }
                }
                return lowerCase;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static int k(String str, String str2) {
        String i10 = i(str);
        byte[] d = d(str2);
        if (TextUtils.isEmpty(i10) || d == null || !h()) {
            return 0;
        }
        synchronized (t) {
            try {
                j jVar = u;
                if (jVar != null && jVar.b.equals(i10) && u.c.equals(str2)) {
                    return u.g.getLocalPort();
                }
                j jVar2 = u;
                if (jVar2 != null) {
                    jVar2.m();
                    u = null;
                }
                try {
                    j jVar3 = new j(i10, str2, d);
                    u = jVar3;
                    h10 h10Var = h10.getInstance();
                    if (h10Var != null) {
                        h10Var.addListener(jVar3);
                    }
                    jVar3.h.execute(new f(jVar3, 2));
                    AndroidUtilities.runOnUIThread(new f(jVar3, 1));
                    return u.g.getLocalPort();
                } catch (Exception e6) {
                    FileLog.e(e6);
                    j jVar4 = u;
                    if (jVar4 != null) {
                        jVar4.m();
                        u = null;
                    }
                    return 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void l() {
        synchronized (t) {
            try {
                j jVar = u;
                if (jVar != null) {
                    jVar.m();
                    u = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(i iVar, boolean z4) {
        synchronized (this.a) {
            try {
                if (this.k.get(Integer.valueOf(iVar.a)) != iVar) {
                    return;
                }
                this.k.remove(Integer.valueOf(iVar.a));
                boolean z10 = z4 && this.o && iVar.e;
                this.a.notifyAll();
                try {
                    iVar.b.close();
                } catch (Exception unused) {
                }
                if (z10) {
                    j(3, iVar.a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.m;
        this.m = null;
        this.n = null;
        if (webView != null) {
            try {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public final void f() {
        synchronized (this.a) {
            if (!this.p && !this.q) {
                this.q = true;
                int i10 = 0;
                this.o = false;
                this.n = null;
                this.l.clear();
                this.r = 0;
                ArrayList arrayList = new ArrayList(this.k.values());
                this.k.clear();
                this.a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((i) obj).b.close();
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(new f(this, 3));
            }
        }
    }

    public final void g(String str, o2.f fVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if (!"tproxy-android-init".equals(optString) || jSONObject.optInt("v") != 1 || !this.f.equals(jSONObject.optString("nonce"))) {
                if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                    f();
                    return;
                }
                return;
            }
            synchronized (this.a) {
                if (!this.p && this.n == null) {
                    this.n = fVar;
                    j(16, 0, new byte[]{1});
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void j(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.a) {
            if (!this.p && this.l.size() < 8192 && this.r <= 67108864 - array.length) {
                this.l.add(array);
                this.r += array.length;
                AndroidUtilities.runOnUIThread(new f(this, 4));
                return;
            }
            f();
        }
    }

    public final void m() {
        synchronized (this.a) {
            try {
                if (this.p) {
                    return;
                }
                this.p = true;
                int i10 = 0;
                this.o = false;
                this.q = false;
                ArrayList arrayList = new ArrayList(this.k.values());
                this.k.clear();
                this.l.clear();
                this.r = 0;
                this.a.notifyAll();
                try {
                    this.g.close();
                } catch (Exception unused) {
                }
                h10 h10Var = h10.getInstance();
                if (h10Var != null) {
                    h10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((i) obj).b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new f(this, 0));
                this.h.shutdownNow();
                this.i.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.g10
    public final void onBecameForeground() {
        AndroidUtilities.runOnUIThread(new f(this, 1));
    }

    @Override // org.telegram.ui.Components.g10
    public final void onBecameBackground() {
    }
}
