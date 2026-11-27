// default package

import android.net.Uri;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class pyc implements io4 {
    public static pyc A;
    public static final Object y = new Object();
    public static pyc z;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final ServerSocket i;
    public WebView o;
    public cv5 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public jyc x;
    public final Object a = new Object();
    public final ExecutorService j = Executors.newCachedThreadPool();
    public final ExecutorService k = Executors.newSingleThreadExecutor();
    public final AtomicInteger l = new AtomicInteger(1);
    public final HashMap m = new HashMap();
    public final ArrayDeque n = new ArrayDeque();

    public pyc(ko9 ko9Var, String str, byte[] bArr) {
        this.b = (String) ko9Var.d;
        String str2 = (String) ko9Var.b;
        this.c = str2;
        String str3 = (String) ko9Var.c;
        String y2 = str3.isEmpty() ? "/" : qd4.y("/", str3, "/");
        this.d = y2;
        this.e = str;
        String concat = "https://".concat(str2);
        this.f = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.h = encodeToString;
        String concat2 = str3.isEmpty() ? "tdesktop-web-proxy-bridge-v1\n".concat(str2) : qd4.q("tdesktop-web-proxy-bridge-v2\n", str2, "\n", str3);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        StringBuilder l = xnb.l(concat, y2, "?bridge=", Base64.encodeToString(mac.doFinal(concat2.getBytes(StandardCharsets.UTF_8)), 11), "#android=");
        l.append(encodeToString);
        this.g = l.toString();
        this.i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
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
            for (int i = 0; i < length; i++) {
                int i2 = i << 1;
                bArr[i] = (byte) Integer.parseInt(trim.substring(i2, i2 + 2), 16);
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

    public static ko9 k(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        String l = l(indexOf >= 0 ? str.substring(0, indexOf) : str);
        String substring = indexOf >= 0 ? str.substring(indexOf + 1) : "";
        if (TextUtils.isEmpty(l) || substring.length() > 128) {
            return null;
        }
        if (!substring.isEmpty()) {
            for (String str2 : substring.split("/", -1)) {
                if (str2.isEmpty() || !Character.isLetterOrDigit(str2.charAt(0))) {
                    return null;
                }
                for (int i = 0; i < str2.length(); i++) {
                    char charAt = str2.charAt(i);
                    if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-'))) {
                        return null;
                    }
                }
            }
        }
        return new ko9(l, substring);
    }

    public static String l(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.endsWith(".")) {
            trim = bs2.n(1, 0, trim);
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
        boolean z2;
        ko9 k = k(str);
        byte[] f = f(str2);
        if (k != null && f != null) {
            byte b = 1;
            try {
                z2 = czc.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th) {
                cc4.g(th, true);
                z2 = false;
            }
            if (z2) {
                synchronized (y) {
                    pyc pycVar = z;
                    if (pycVar != null && !pycVar.i.isClosed() && z.b.equals((String) k.d) && z.e.equals(str2)) {
                        return z.i.getLocalPort();
                    }
                    pyc pycVar2 = z;
                    if (pycVar2 != null) {
                        pycVar2.q();
                        z = null;
                    }
                    try {
                        pyc pycVar3 = new pyc(k, str2, f);
                        z = pycVar3;
                        vr vrVar = vr.f;
                        if (vrVar != null) {
                            vrVar.d.add(pycVar3);
                        }
                        pycVar3.j.execute(new myc(pycVar3, b));
                        hl.c3(new myc(pycVar3, (byte) 2));
                        return z.i.getLocalPort();
                    } catch (Exception e) {
                        cc4.g(e, true);
                        pyc pycVar4 = z;
                        if (pycVar4 != null) {
                            pycVar4.q();
                            z = null;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static void p() {
        synchronized (y) {
            pyc pycVar = z;
            if (pycVar != null) {
                pycVar.q();
                z = null;
            }
        }
    }

    @Override // io4
    public final void b() {
        hl.c3(new myc(this, (byte) 2));
    }

    public final void c() {
        int andUpdate;
        while (true) {
            try {
                Socket accept = this.i.accept();
                accept.setTcpNoDelay(true);
                synchronized (this.a) {
                    if (this.u || this.m.size() >= 64) {
                        try {
                            accept.close();
                        } catch (Exception unused) {
                        }
                    } else {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(this.l, new nyc());
                            if (andUpdate != 0 && !this.m.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        oyc oycVar = new oyc(andUpdate, accept);
                        this.m.put(Integer.valueOf(andUpdate), oycVar);
                        if (this.t) {
                            oycVar.e = true;
                            n(1, andUpdate, null);
                        }
                        this.j.execute(new cxc((Object) this, (Object) oycVar, (byte) 5));
                    }
                }
            } catch (Exception e) {
                synchronized (this.a) {
                    if (this.u) {
                        return;
                    }
                    cc4.g(e, true);
                    h();
                    return;
                }
            }
        }
    }

    public final void d(oyc oycVar, boolean z2) {
        synchronized (this.a) {
            if (this.m.get(Integer.valueOf(oycVar.a)) != oycVar) {
                return;
            }
            this.m.remove(Integer.valueOf(oycVar.a));
            boolean z3 = z2 && this.t && oycVar.e;
            this.a.notifyAll();
            try {
                oycVar.b.close();
            } catch (Exception unused) {
            }
            if (z3) {
                n(3, oycVar.a, null);
            }
        }
    }

    public final void e() {
        synchronized (this.a) {
            if (this.u || this.o != null) {
                return;
            }
            vr vrVar = vr.f;
            if (vrVar != null) {
                if (vrVar.a == 0) {
                    this.v = true;
                    return;
                }
            }
            this.v = false;
            g();
            try {
                WebView webView = new WebView(a.b);
                this.o = webView;
                this.q = czc.a("WEB_MESSAGE_ARRAY_BUFFER");
                this.r = false;
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
                webView.setWebViewClient(new tu(this, (byte) 3));
                HashSet hashSet = new HashSet();
                hashSet.add(this.f);
                zyc.a(webView, "TelegramWebProxy", hashSet, new ftb(this, (byte) 20));
                webView.loadUrl(this.g);
            } catch (Exception e) {
                cc4.g(e, true);
                h();
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
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void h() {
        synchronized (this.a) {
            if (this.u || this.v) {
                return;
            }
            this.v = true;
            int i = 0;
            this.t = false;
            this.p = null;
            this.n.clear();
            this.w = 0;
            ArrayList arrayList = new ArrayList(this.m.values());
            this.m.clear();
            this.a.notifyAll();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                try {
                    ((oyc) obj).b.close();
                } catch (Exception unused) {
                }
            }
            hl.c3(new myc(this, (byte) 3));
        }
    }

    public final void i(String str, cv5 cv5Var) {
        pyc pycVar;
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
                try {
                    if (this.u || this.p != null) {
                        return;
                    }
                    this.p = cv5Var;
                    if (this.q) {
                        this.r = true;
                        n(16, 0, new byte[]{1});
                        return;
                    }
                    WebView webView = this.o;
                    jwc jwcVar = new jwc(this, webView, cv5Var, (byte) 2);
                    hl.d3(jwcVar, 5000L);
                    try {
                        pycVar = this;
                    } catch (Exception e) {
                        e = e;
                        pycVar = this;
                    }
                    try {
                        webView.evaluateJavascript("(function(){\n'use strict';\ntry {\n var bridge=window.TelegramWebProxy;\n if(!bridge||typeof bridge.postMessage!=='function'||typeof bridge.onmessage!=='function')return false;\n var nativePost=bridge.postMessage;\n var receive=bridge.onmessage;\n var prefix='tproxy-base64:';\n var maxBytes=1048584;\n var maxChars=1398112;\n function post(value){\n  if(value instanceof ArrayBuffer){\n   if(value.byteLength>maxBytes)throw new Error('WEB proxy frame too large');\n   var bytes=new Uint8Array(value),parts=[];\n   for(var i=0;i<bytes.length;i+=8192){\n    parts.push(String.fromCharCode.apply(null,bytes.subarray(i,Math.min(i+8192,bytes.length))));\n   }\n   nativePost.call(bridge,prefix+btoa(parts.join('')));\n  }else nativePost.call(bridge,value);\n }\n function onmessage(event){\n  var data=event.data;\n  if(typeof data==='string'&&data.indexOf(prefix)===0){\n   try {\n    var encoded=data.substring(prefix.length);\n    if(encoded.length>maxChars)throw new Error('WEB proxy frame too large');\n    var binary=atob(encoded);\n    if(binary.length>maxBytes)throw new Error('WEB proxy frame too large');\n    var bytes=new Uint8Array(binary.length);\n    for(var i=0;i<binary.length;i++)bytes[i]=binary.charCodeAt(i);\n    receive.call(bridge,{data:bytes.buffer});\n   }catch(error){nativePost.call(bridge,'{\"t\":\"close\"}');}\n  }else receive.call(bridge,event);\n }\n bridge.postMessage=post;\n bridge.onmessage=onmessage;\n return bridge.postMessage===post&&bridge.onmessage===onmessage;\n}catch(error){return false;}\n})()\n", new lxc(pycVar, jwcVar, webView, cv5Var, (byte) 2));
                    } catch (Exception e2) {
                        e = e2;
                        Exception exc = e;
                        hl.r(jwcVar);
                        cc4.g(exc, true);
                        cc4.d("WEB proxy: Base64 bridge installation threw an exception; transport stopped");
                        pycVar.q();
                    }
                } catch (Throwable th) {
                    throw th;
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

    /* JADX WARN: Removed duplicated region for block: B:31:0x017b A[LOOP:0: B:2:0x0002->B:31:0x017b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0177 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            if (bArr.length - i < 8) {
                h();
                return;
            }
            int i2 = bArr[i] & 255;
            int i3 = ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
            long j = ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i + 7] & 255);
            int i4 = i + 8;
            long j2 = i4 + j;
            if (j > 1048576 || j2 > bArr.length) {
                h();
                return;
            }
            int i5 = (int) j;
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            boolean z2 = true;
            if (i3 != 0) {
                synchronized (this.a) {
                    oyc oycVar = (oyc) this.m.get(Integer.valueOf(i3));
                    if (oycVar == null) {
                        if (i2 != 2 && i2 != 4 && i2 != 3) {
                            z2 = false;
                        }
                    } else if (i2 == 2) {
                        if (i5 != 0) {
                            synchronized (this.a) {
                                long j3 = oycVar.d;
                                long j4 = i5;
                                if (j3 >= j4) {
                                    oycVar.d = j3 - j4;
                                    try {
                                        oycVar.b.getOutputStream().write(bArr2);
                                        synchronized (this.a) {
                                            if (this.m.get(Integer.valueOf(oycVar.a)) == oycVar) {
                                                oycVar.d += j4;
                                                n(4, oycVar.a, ByteBuffer.allocate(4).putInt(i5).array());
                                            }
                                        }
                                    } catch (Exception unused) {
                                        d(oycVar, true);
                                    }
                                }
                            }
                        }
                    } else if (i2 == 4 && i5 == 4) {
                        long j5 = ByteBuffer.wrap(bArr2).getInt() & 4294967295L;
                        if (j5 != 0) {
                            synchronized (this.a) {
                                long j6 = oycVar.c;
                                if (j6 <= 4294967295L - j5) {
                                    oycVar.c = j6 + j5;
                                    this.a.notifyAll();
                                }
                            }
                        }
                    } else if (i2 == 3 && i5 == 0) {
                        d(oycVar, false);
                    }
                }
                if (z2) {
                }
            } else if (i2 == 17 && i5 == 0) {
                synchronized (this.a) {
                    if (!this.u && !this.t) {
                        this.t = true;
                        ArrayList arrayList = new ArrayList(this.m.values());
                        int size = arrayList.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj = arrayList.get(i6);
                            i6++;
                            oyc oycVar2 = (oyc) obj;
                            oycVar2.e = true;
                            n(1, oycVar2.a, null);
                        }
                        jyc jycVar = this.x;
                        this.a.notifyAll();
                        if (jycVar != null) {
                            hl.c3(new olc(jycVar, (byte) 22));
                        }
                    }
                }
                if (z2) {
                }
            } else if (i2 == 5 && i5 <= 64) {
                n(6, 0, bArr2);
                if (z2) {
                    h();
                    return;
                }
                i = (int) j2;
            }
            z2 = false;
            if (z2) {
            }
        }
    }

    public final void n(int i, int i2, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i).put((byte) (i2 >> 16)).put((byte) (i2 >> 8)).put((byte) i2).putInt(bArr.length).put(bArr).array();
        synchronized (this.a) {
            if (this.u || this.n.size() >= 8192 || this.w > 67108864 - array.length) {
                h();
                return;
            }
            this.n.add(array);
            this.w += array.length;
            hl.c3(new myc(this, (byte) 4));
        }
    }

    public final void q() {
        synchronized (this.a) {
            if (this.u) {
                return;
            }
            this.u = true;
            byte b = 0;
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
            vr vrVar = vr.f;
            if (vrVar != null) {
                vrVar.d.remove(this);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                try {
                    ((oyc) obj).b.close();
                } catch (Exception unused2) {
                }
            }
            hl.c3(new myc(this, b));
            this.j.shutdownNow();
            this.k.shutdownNow();
        }
    }

    @Override // io4
    public final void a() {
    }
}
