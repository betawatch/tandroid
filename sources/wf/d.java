package wf;

import a8.p0;
import a8.ua;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import d3.x;
import f6.l;
import j2.h;
import j2.m;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import org.telegram.messenger.a8;
import org.telegram.messenger.qs;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.messenger.t0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.gg;
import v0.j;
import v4.v0;
import yc.f;
import yc.g;
import yc.i;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d extends i {
    public static final e l;
    public static final HashMap m;
    public final ExtendedDefaultDataSourceFactory e;
    public final j f;
    public final sa.d g;
    public final HashMap h;
    public Pair i;
    public boolean j;
    public final AtomicInteger k;

    static {
        e eVar = new e(new v0(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        l = eVar;
        e[] eVarArr = {eVar};
        HashMap hashMap = new HashMap();
        m = hashMap;
        e eVar2 = eVarArr[0];
        hashMap.put(eVar2.d, eVar2);
    }

    public d() {
        this.c = new ua(11);
        this.h = new HashMap();
        this.i = null;
        this.j = false;
        this.k = new AtomicInteger();
        this.f = new j(13);
        this.g = new sa.d(11);
        this.e = new ExtendedDefaultDataSourceFactory(t0.b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static String i() {
        int ipAddress = ((WifiManager) t0.b.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (nextElement.isSiteLocalAddress()) {
                            byte[] address = nextElement.getAddress();
                            ipAddress = (((address[3] + ConnectionsManager.USE_IPV4_ONLY) % 256) << 24) + ((address[0] + ConnectionsManager.USE_IPV4_ONLY) % 256) + (((address[1] + ConnectionsManager.USE_IPV4_ONLY) % 256) << 8) + (((address[2] + ConnectionsManager.USE_IPV4_ONLY) % 256) << 16);
                        }
                    }
                }
            } catch (SocketException e10) {
                a8.g(e10, true);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(ipAddress & qs.e4) + '.' + ((ipAddress >> 8) & qs.e4) + '.' + ((ipAddress >> 16) & qs.e4) + '.' + ((ipAddress >> 24) & qs.e4));
        sb2.append(":61578");
        return sb2.toString();
    }

    public static String j(String str, String str2) {
        return p0.p("http://", str, str2);
    }

    @Override // yc.i
    public final g e(yc.d dVar) {
        String str;
        int incrementAndGet = this.k.incrementAndGet();
        StringBuilder n10 = jg.g.n(incrementAndGet, "Request ", " ");
        switch (dVar.g) {
            case 1:
                str = "GET";
                break;
            case 2:
                str = "PUT";
                break;
            case 3:
                str = "POST";
                break;
            case 4:
                str = "DELETE";
                break;
            case 5:
                str = "HEAD";
                break;
            case 6:
                str = "OPTIONS";
                break;
            case 7:
                str = "TRACE";
                break;
            case 8:
                str = "CONNECT";
                break;
            case 9:
                str = "PATCH";
                break;
            case 10:
                str = "PROPFIND";
                break;
            case 11:
                str = "PROPPATCH";
                break;
            case 12:
                str = "MKCOL";
                break;
            case 13:
                str = "MOVE";
                break;
            case 14:
                str = "COPY";
                break;
            case 15:
                str = "LOCK";
                break;
            case 16:
                str = "UNLOCK";
                break;
            default:
                str = "null";
                break;
        }
        n10.append(str);
        n10.append(" ");
        n10.append(dVar.f);
        n10.append(" ");
        n10.append((String) dVar.i.get("range"));
        Log.d("CAST_SERVER", n10.toString());
        try {
            g k10 = k(dVar);
            gg ggVar = k10.e;
            ggVar.put("Access-Control-Allow-Origin", "*");
            ggVar.put("Access-Control-Max-Age", "3628800");
            ggVar.put("Access-Control-Allow-Methods", "*");
            ggVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            g c10 = i.c(f.n, "text/plain", "Error reading file");
            gg ggVar2 = c10.e;
            ggVar2.put("Access-Control-Allow-Origin", "*");
            ggVar2.put("Access-Control-Max-Age", "3628800");
            ggVar2.put("Access-Control-Allow-Methods", "*");
            ggVar2.put("Access-Control-Allow-Headers", "*");
            return c10;
        }
    }

    public final void h() {
        if (!this.h.isEmpty()) {
            if (this.j) {
                return;
            }
            try {
                f();
                this.j = true;
                return;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        if (this.j) {
            try {
                i.d(this.a);
                ua uaVar = this.c;
                uaVar.getClass();
                ArrayList arrayList = new ArrayList((List) uaVar.c);
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    yc.a aVar = (yc.a) obj;
                    i.d(aVar.a);
                    i.d(aVar.b);
                }
                Thread thread = this.b;
                if (thread != null) {
                    thread.join();
                }
            } catch (Exception e11) {
                i.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e11);
            }
            this.j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g k(yc.d dVar) {
        boolean z9;
        long j3;
        x xVar;
        long j10;
        g c10;
        long parseLong;
        long parseLong2;
        String str = (String) dVar.i.get("host");
        String path = Uri.parse("http://" + str + dVar.f).getPath();
        boolean b10 = p1.g.b(6, dVar.g);
        f fVar = f.c;
        if (b10) {
            return i.c(fVar, "text/plain", "");
        }
        boolean equals = TextUtils.equals(path, "/");
        HashMap hashMap = this.h;
        HashMap hashMap2 = m;
        int i7 = 0;
        if (equals) {
            StringBuilder sb2 = new StringBuilder();
            if (this.i != null) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(j(str, (String) this.i.first));
            }
            while (i7 < 2) {
                for (Map.Entry entry : (i7 == 0 ? hashMap2 : hashMap).entrySet()) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(j(str, (String) entry.getKey()));
                    l lVar = ((e) entry.getValue()).b;
                    if (lVar != null) {
                        Bundle bundle = lVar.b;
                        l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                        String string = bundle.getString("com.google.android.gms.cast.metadata.TITLE");
                        l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                        String string2 = bundle.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                        if (string != null) {
                            sb2.append(' ');
                            sb2.append(string);
                        }
                        if (string2 != null) {
                            sb2.append(" [");
                            sb2.append(string2);
                            sb2.append(']');
                        }
                    }
                }
                i7++;
            }
            return i.c(fVar, "text/plain", sb2.toString());
        }
        e eVar = (e) hashMap2.get(path);
        if (eVar == null) {
            eVar = (e) hashMap.get(path);
        }
        if (eVar == null) {
            Pair pair = this.i;
            File file = (pair == null || !((String) pair.first).equalsIgnoreCase(path)) ? null : (File) this.i.second;
            return file != null ? new g(fVar, "image/jpeg", new BufferedInputStream(new FileInputStream(file)), file.length()) : i.c(f.h, "text/plain", "file not found");
        }
        Uri uri = eVar.c;
        String str2 = (String) dVar.i.get("host");
        String str3 = eVar.a;
        if (uri.toString().startsWith("data:application/x-mpegurl;base64,")) {
            return i.c(fVar, str3, new String(Base64.decode(uri.toString().substring(34), 0)).replaceAll("mtproto:", j(str2, "/mtproto_")));
        }
        h createDataSource = (uri.toString().startsWith("file://") ? uri.toString().startsWith("file:///android_asset/") ? this.f : this.g : this.e).createDataSource();
        Map map = Collections.EMPTY_MAP;
        long j11 = 0;
        long j12 = -1;
        long open = createDataSource.open(new m(uri, 1, null, map, 0L, -1L, null, 0));
        createDataSource.close();
        boolean equals2 = TextUtils.equals(str3, "application/x-mpegURL");
        if (!equals2) {
            String str4 = (String) dVar.i.get("range");
            if (!TextUtils.isEmpty(str4)) {
                String substring = str4.trim().substring(6);
                if (substring.startsWith("-")) {
                    parseLong2 = open - 1;
                    parseLong = parseLong2 - Long.parseLong(substring.substring(1));
                    z9 = equals2;
                } else {
                    String[] split = substring.split("-");
                    parseLong = Long.parseLong(split[0]);
                    z9 = equals2;
                    parseLong2 = split.length > 1 ? Long.parseLong(split[1]) : open - 1;
                }
                long j13 = parseLong;
                j3 = open;
                long j14 = j3 - 1;
                xVar = new x(j13, parseLong2 > j14 ? j14 : parseLong2);
                long j15 = xVar == null ? (xVar.b - xVar.a) + 1 : j3;
                if (xVar != null) {
                    j12 = j15;
                    j11 = xVar.a;
                }
                if (!z9) {
                    int i10 = (int) j15;
                    byte[] bArr = new byte[i10];
                    createDataSource.open(new m(uri, 1, null, map, j11, j12, null, 0));
                    createDataSource.read(bArr, 0, i10);
                    createDataSource.close();
                    return i.c(fVar, str3, new String(bArr).replaceAll("mtproto:", j(str2, "/mtproto_")));
                }
                if (j15 != 0) {
                    j10 = j3;
                    c cVar = new c(createDataSource, new m(uri, 1, null, map, j11, j12, null, 0));
                    if (xVar != null) {
                        fVar = f.e;
                    }
                    c10 = new g(fVar, eVar.a, cVar, j15);
                } else {
                    j10 = j3;
                    c10 = i.c(f.d, str3, "");
                }
                g gVar = c10;
                if (xVar != null) {
                    gVar.e.put("Content-Range", "bytes " + xVar.a + "-" + xVar.b + "/" + j10);
                }
                return gVar;
            }
        }
        z9 = equals2;
        j3 = open;
        xVar = null;
        if (xVar == null) {
        }
        if (xVar != null) {
        }
        if (!z9) {
        }
    }

    public final void l(File file, String str) {
        if (str == null || file == null) {
            Pair pair = this.i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.i = null;
        } else {
            this.i = new Pair(str, file);
        }
        h();
    }
}
