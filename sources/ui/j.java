package ui;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b8.p9;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.r0;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.o1;
import r4.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class j implements uz {
    public static j A;
    public static final Object y = new Object();
    public static j z;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final ServerSocket i;
    public WebView o;
    public d5.g p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public d x;
    public final Object a = new Object();
    public final ExecutorService j = Executors.newCachedThreadPool();
    public final ExecutorService k = Executors.newSingleThreadExecutor();
    public final AtomicInteger l = new AtomicInteger(1);
    public final HashMap m = new HashMap();
    public final ArrayDeque n = new ArrayDeque();

    public j(p7.d dVar, String str, byte[] bArr) {
        this.b = (String) dVar.c;
        String str2 = (String) dVar.b;
        this.c = str2;
        String str3 = (String) dVar.d;
        String q10 = str3.isEmpty() ? "/" : a1.g.q("/", str3, "/");
        this.d = q10;
        this.e = str;
        String concat = "https://".concat(str2);
        this.f = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.h = encodeToString;
        String concat2 = str3.isEmpty() ? "tdesktop-web-proxy-bridge-v1\n".concat(str2) : com.google.android.recaptcha.internal.a.k("tdesktop-web-proxy-bridge-v2\n", str2, "\n", str3);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        this.g = concat + q10 + "?bridge=" + Base64.encodeToString(mac.doFinal(concat2.getBytes(StandardCharsets.UTF_8)), 11) + "#android=" + encodeToString;
        this.i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void c(j jVar) {
        synchronized (jVar.a) {
            try {
                if (!jVar.u && jVar.o == null) {
                    r0 r0Var = r0.f;
                    if (r0Var != null) {
                        if (r0Var.a == 0) {
                            jVar.v = true;
                            return;
                        }
                    }
                    jVar.v = false;
                    jVar.g();
                    try {
                        WebView webView = new WebView(t0.b);
                        jVar.o = webView;
                        jVar.q = p9.a("WEB_MESSAGE_ARRAY_BUFFER");
                        jVar.r = false;
                        webView.setBackgroundColor(0);
                        WebSettings settings = webView.getSettings();
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(false);
                        settings.setDatabaseEnabled(false);
                        settings.setAllowFileAccess(false);
                        settings.setAllowContentAccess(false);
                        settings.setCacheMode(2);
                        settings.setJavaScriptCanOpenWindowsAutomatically(false);
                        settings.setSupportMultipleWindows(false);
                        settings.setGeolocationEnabled(false);
                        settings.setMediaPlaybackRequiresUserGesture(true);
                        settings.setMixedContentMode(1);
                        if (Build.VERSION.SDK_INT >= 26) {
                            settings.setSafeBrowsingEnabled(true);
                        }
                        webView.setWebViewClient(new o1(jVar, 4));
                        HashSet hashSet = new HashSet();
                        hashSet.add(jVar.f);
                        c5.a.a(webView, "TelegramWebProxy", hashSet, new e3(jVar, 25));
                        webView.loadUrl(jVar.g);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        jVar.h();
                    }
                }
            } finally {
            }
        }
    }

    public static void d(j jVar) {
        int andUpdate;
        while (true) {
            try {
                Socket accept = jVar.i.accept();
                accept.setTcpNoDelay(true);
                synchronized (jVar.a) {
                    try {
                        if (!jVar.u && jVar.m.size() < 64) {
                            while (true) {
                                andUpdate = DesugarAtomicInteger.getAndUpdate(jVar.l, new h());
                                if (andUpdate != 0 && !jVar.m.containsKey(Integer.valueOf(andUpdate))) {
                                    break;
                                }
                            }
                            i iVar = new i(andUpdate, accept);
                            jVar.m.put(Integer.valueOf(andUpdate), iVar);
                            if (jVar.t) {
                                iVar.e = true;
                                jVar.n(1, andUpdate, null);
                            }
                            jVar.j.execute(new u9.a(5, jVar, iVar));
                        }
                        try {
                            accept.close();
                        } catch (Exception unused) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                synchronized (jVar.a) {
                    try {
                        if (jVar.u) {
                            return;
                        }
                        a8.g(e10, true);
                        jVar.h();
                        return;
                    } finally {
                    }
                }
            }
        }
    }

    public static byte[] f(String str) {
        byte[] bArr;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if ((trim.length() == 32 || trim.length() == 34) && trim.matches("[0-9a-fA-F]+")) {
            int length = trim.length() / 2;
            bArr = new byte[length];
            for (int i3 = 0; i3 < length; i3++) {
                int i10 = i3 * 2;
                bArr[i3] = (byte) Integer.parseInt(trim.substring(i10, i10 + 2), 16);
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

    public static p7.d k(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        String l10 = l(indexOf >= 0 ? str.substring(0, indexOf) : str);
        String substring = indexOf >= 0 ? str.substring(indexOf + 1) : "";
        if (TextUtils.isEmpty(l10) || substring.length() > 128) {
            return null;
        }
        if (!substring.isEmpty()) {
            for (String str2 : substring.split("/", -1)) {
                if (str2.isEmpty() || !Character.isLetterOrDigit(str2.charAt(0))) {
                    return null;
                }
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    char charAt = str2.charAt(i3);
                    if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-'))) {
                        return null;
                    }
                }
            }
        }
        return new p7.d(l10, substring);
    }

    public static String l(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.endsWith(".")) {
            trim = com.google.android.recaptcha.internal.a.j(trim, 1, 0);
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

    public static int o(String str, String str2) {
        boolean z10;
        p7.d k10 = k(str);
        byte[] f10 = f(str2);
        if (k10 != null && f10 != null) {
            try {
                z10 = p9.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                a8.g(th2, true);
                z10 = false;
            }
            if (z10) {
                synchronized (y) {
                    try {
                        j jVar = z;
                        if (jVar != null && !jVar.i.isClosed() && z.b.equals((String) k10.c) && z.e.equals(str2)) {
                            return z.i.getLocalPort();
                        }
                        j jVar2 = z;
                        if (jVar2 != null) {
                            jVar2.q();
                            z = null;
                        }
                        try {
                            j jVar3 = new j(k10, str2, f10);
                            z = jVar3;
                            r0 r0Var = r0.f;
                            if (r0Var != null) {
                                r0Var.d.add(jVar3);
                            }
                            jVar3.j.execute(new g(jVar3, 1));
                            g0.h3(new g(jVar3, 2));
                            return z.i.getLocalPort();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            j jVar4 = z;
                            if (jVar4 != null) {
                                jVar4.q();
                                z = null;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        return 0;
    }

    public static void p() {
        synchronized (y) {
            try {
                j jVar = z;
                if (jVar != null) {
                    jVar.q();
                    z = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.uz
    public final void b() {
        g0.h3(new g(this, 2));
    }

    public final void e(i iVar, boolean z10) {
        synchronized (this.a) {
            try {
                if (this.m.get(Integer.valueOf(iVar.a)) != iVar) {
                    return;
                }
                this.m.remove(Integer.valueOf(iVar.a));
                boolean z11 = z10 && this.t && iVar.e;
                this.a.notifyAll();
                try {
                    iVar.b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    n(3, iVar.a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        WebView webView = this.o;
        this.o = null;
        this.p = null;
        this.r = false;
        if (webView != null) {
            try {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final void h() {
        synchronized (this.a) {
            if (!this.u && !this.v) {
                this.v = true;
                int i3 = 0;
                this.t = false;
                this.p = null;
                this.n.clear();
                this.w = 0;
                ArrayList arrayList = new ArrayList(this.m.values());
                this.m.clear();
                this.a.notifyAll();
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    try {
                        ((i) obj).b.close();
                    } catch (Exception unused) {
                    }
                }
                g0.h3(new g(this, 3));
            }
        }
    }

    public final void i(String str, d5.g gVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if (!"tproxy-android-init".equals(optString) || jSONObject.optInt("v") != 1 || !this.h.equals(jSONObject.optString("nonce"))) {
                if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                    h();
                    return;
                }
                return;
            }
            synchronized (this.a) {
                if (!this.u && this.p == null) {
                    this.p = gVar;
                    if (this.q) {
                        this.r = true;
                        n(16, 0, new byte[]{1});
                        return;
                    }
                    WebView webView = this.o;
                    iv0 iv0Var = new iv0(this, webView, gVar, 19);
                    g0.i3(iv0Var, 5000L);
                    try {
                        webView.evaluateJavascript("(function(){\n'use strict';\ntry {\n var bridge=window.TelegramWebProxy;\n if(!bridge||typeof bridge.postMessage!=='function'||typeof bridge.onmessage!=='function')return false;\n var nativePost=bridge.postMessage;\n var receive=bridge.onmessage;\n var prefix='tproxy-base64:';\n var maxBytes=1048584;\n var maxChars=1398112;\n function post(value){\n  if(value instanceof ArrayBuffer){\n   if(value.byteLength>maxBytes)throw new Error('WEB proxy frame too large');\n   var bytes=new Uint8Array(value),parts=[];\n   for(var i=0;i<bytes.length;i+=8192){\n    parts.push(String.fromCharCode.apply(null,bytes.subarray(i,Math.min(i+8192,bytes.length))));\n   }\n   nativePost.call(bridge,prefix+btoa(parts.join('')));\n  }else nativePost.call(bridge,value);\n }\n function onmessage(event){\n  var data=event.data;\n  if(typeof data==='string'&&data.indexOf(prefix)===0){\n   try {\n    var encoded=data.substring(prefix.length);\n    if(encoded.length>maxChars)throw new Error('WEB proxy frame too large');\n    var binary=atob(encoded);\n    if(binary.length>maxBytes)throw new Error('WEB proxy frame too large');\n    var bytes=new Uint8Array(binary.length);\n    for(var i=0;i<binary.length;i++)bytes[i]=binary.charCodeAt(i);\n    receive.call(bridge,{data:bytes.buffer});\n   }catch(error){nativePost.call(bridge,'{\"t\":\"close\"}');}\n  }else receive.call(bridge,event);\n }\n bridge.postMessage=post;\n bridge.onmessage=onmessage;\n return bridge.postMessage===post&&bridge.onmessage===onmessage;\n}catch(error){return false;}\n})()\n", new org.telegram.ui.web.o1(this, iv0Var, webView, gVar));
                    } catch (Exception e10) {
                        g0.r(iv0Var);
                        a8.g(e10, true);
                        a8.d("WEB proxy: Base64 bridge installation threw an exception; transport stopped");
                        q();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final boolean j(WebView webView) {
        String url = webView.getUrl();
        if (url == null) {
            return false;
        }
        Uri parse = Uri.parse(url);
        return "https".equalsIgnoreCase(parse.getScheme()) && this.c.equalsIgnoreCase(parse.getHost()) && parse.getUserInfo() == null && parse.getPort() == -1 && this.d.equals(parse.getPath());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0185 A[LOOP:0: B:2:0x0002->B:32:0x0185, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0181 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(byte[] bArr) {
        int i3 = 0;
        while (i3 < bArr.length) {
            if (bArr.length - i3 < 8) {
                h();
                return;
            }
            int i10 = bArr[i3] & 255;
            int i11 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3 + 2] & 255) << 8) | (bArr[i3 + 3] & 255);
            long j10 = ((bArr[i3 + 4] & 255) << 24) | ((bArr[i3 + 5] & 255) << 16) | ((bArr[i3 + 6] & 255) << 8) | (255 & bArr[i3 + 7]);
            int i12 = i3 + 8;
            long j11 = i12 + j10;
            if (j10 > 1048576 || j11 > bArr.length) {
                h();
                return;
            }
            int i13 = (int) j10;
            byte[] bArr2 = new byte[i13];
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            boolean z10 = true;
            if (i11 != 0) {
                synchronized (this.a) {
                    try {
                        i iVar = (i) this.m.get(Integer.valueOf(i11));
                        if (iVar == null) {
                            if (i10 != 2 && i10 != 4 && i10 != 3) {
                                z10 = false;
                            }
                        } else if (i10 == 2) {
                            if (i13 != 0) {
                                synchronized (this.a) {
                                    try {
                                        long j12 = iVar.d;
                                        long j13 = i13;
                                        if (j12 >= j13) {
                                            iVar.d = j12 - j13;
                                            try {
                                                iVar.b.getOutputStream().write(bArr2);
                                                synchronized (this.a) {
                                                    try {
                                                        if (this.m.get(Integer.valueOf(iVar.a)) == iVar) {
                                                            iVar.d += j13;
                                                            n(4, iVar.a, ByteBuffer.allocate(4).putInt(i13).array());
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Exception unused) {
                                                e(iVar, true);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else if (i10 == 4 && i13 == 4) {
                            long j14 = ByteBuffer.wrap(bArr2).getInt() & 4294967295L;
                            if (j14 != 0) {
                                synchronized (this.a) {
                                    try {
                                        long j15 = iVar.c;
                                        if (j15 <= 4294967295L - j14) {
                                            iVar.c = j15 + j14;
                                            this.a.notifyAll();
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else if (i10 == 3 && i13 == 0) {
                            e(iVar, false);
                        }
                    } finally {
                    }
                }
                if (z10) {
                }
            } else if (i10 == 17 && i13 == 0) {
                synchronized (this.a) {
                    try {
                        if (!this.u && !this.t) {
                            this.t = true;
                            ArrayList arrayList = new ArrayList(this.m.values());
                            int size = arrayList.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj = arrayList.get(i14);
                                i14++;
                                i iVar2 = (i) obj;
                                iVar2.e = true;
                                n(1, iVar2.a, null);
                            }
                            d dVar = this.x;
                            this.a.notifyAll();
                            if (dVar != null) {
                                g0.h3(new u(dVar, 17));
                            }
                        }
                    } finally {
                    }
                }
                if (z10) {
                }
            } else if (i10 == 5 && i13 <= 64) {
                n(6, 0, bArr2);
                if (z10) {
                    h();
                    return;
                }
                i3 = (int) j11;
            }
            z10 = false;
            if (z10) {
            }
        }
    }

    public final void n(int i3, int i10, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i3).put((byte) (i10 >> 16)).put((byte) (i10 >> 8)).put((byte) i10).putInt(bArr.length).put(bArr).array();
        synchronized (this.a) {
            if (!this.u && this.n.size() < 8192 && this.w <= 67108864 - array.length) {
                this.n.add(array);
                this.w += array.length;
                g0.h3(new g(this, 4));
                return;
            }
            h();
        }
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.u) {
                    return;
                }
                this.u = true;
                int i3 = 0;
                this.t = false;
                this.v = false;
                ArrayList arrayList = new ArrayList(this.m.values());
                this.m.clear();
                this.n.clear();
                this.w = 0;
                this.a.notifyAll();
                try {
                    this.i.close();
                } catch (Exception unused) {
                }
                r0 r0Var = r0.f;
                if (r0Var != null) {
                    r0Var.d.remove(this);
                }
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    try {
                        ((i) obj).b.close();
                    } catch (Exception unused2) {
                    }
                }
                g0.h3(new g(this, 0));
                this.j.shutdownNow();
                this.k.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.uz
    public final void a() {
    }
}
