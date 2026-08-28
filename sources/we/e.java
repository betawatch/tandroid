package we;

import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.q;
import f2.g1;
import gc.h;
import gc.k;
import j3.r0;
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
import m1.j;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import v0.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends k {
    public static final f l;
    public static final HashMap m;
    public final ExtendedDefaultDataSourceFactory e;
    public final l f;
    public final wa.a g;
    public final HashMap h;
    public Pair i;
    public boolean j;
    public final AtomicInteger k;

    static {
        f fVar = new f(new g1(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        l = fVar;
        f[] fVarArr = {fVar};
        HashMap hashMap = new HashMap();
        m = hashMap;
        f fVar2 = fVarArr[0];
        hashMap.put(fVar2.d, fVar2);
    }

    public e() {
        this.c = new f2.d(2);
        this.h = new HashMap();
        this.i = null;
        this.j = false;
        this.k = new AtomicInteger();
        this.f = new l(3);
        this.g = new wa.a(4);
        this.e = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static String i() {
        int ipAddress = ((WifiManager) ApplicationLoader.applicationContext.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (nextElement.isSiteLocalAddress()) {
                            byte[] address = nextElement.getAddress();
                            ipAddress = (((address[3] + 256) % 256) << 24) + ((address[0] + 256) % 256) + (((address[1] + 256) % 256) << 8) + (((address[2] + 256) % 256) << 16);
                        }
                    }
                }
            } catch (SocketException e10) {
                FileLog.e(e10);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255));
        sb2.append(":61578");
        return sb2.toString();
    }

    public static String j(String str, String str2) {
        return aa.d.o("http://", str, str2);
    }

    @Override // gc.k
    public final h e(gc.d dVar) {
        String str;
        int incrementAndGet = this.k.incrementAndGet();
        StringBuilder p6 = r0.p(incrementAndGet, "Request ", " ");
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
                str = BuildConfig.BETA_URL;
                break;
        }
        p6.append(str);
        p6.append(" ");
        p6.append(dVar.f);
        p6.append(" ");
        p6.append((String) dVar.i.get("range"));
        Log.d("CAST_SERVER", p6.toString());
        try {
            h k10 = k(dVar);
            gc.e eVar = k10.e;
            eVar.put("Access-Control-Allow-Origin", "*");
            eVar.put("Access-Control-Max-Age", "3628800");
            eVar.put("Access-Control-Allow-Methods", "*");
            eVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            h c10 = k.c(gc.g.n, "text/plain", "Error reading file");
            gc.e eVar2 = c10.e;
            eVar2.put("Access-Control-Allow-Origin", "*");
            eVar2.put("Access-Control-Max-Age", "3628800");
            eVar2.put("Access-Control-Allow-Methods", "*");
            eVar2.put("Access-Control-Allow-Headers", "*");
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
                k.d(this.a);
                f2.d dVar = this.c;
                dVar.getClass();
                ArrayList arrayList = new ArrayList((List) dVar.c);
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    gc.a aVar = (gc.a) obj;
                    k.d(aVar.a);
                    k.d(aVar.b);
                }
                Thread thread = this.b;
                if (thread != null) {
                    thread.join();
                }
            } catch (Exception e11) {
                k.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e11);
            }
            this.j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h k(gc.d dVar) {
        boolean z10;
        long j10;
        d dVar2;
        long j11;
        h c10;
        long parseLong;
        long parseLong2;
        String str = (String) dVar.i.get("host");
        String path = Uri.parse("http://" + str + dVar.f).getPath();
        boolean a2 = j.a(6, dVar.g);
        gc.g gVar = gc.g.c;
        if (a2) {
            return k.c(gVar, "text/plain", "");
        }
        boolean equals = TextUtils.equals(path, "/");
        HashMap hashMap = this.h;
        HashMap hashMap2 = m;
        int i9 = 0;
        if (equals) {
            StringBuilder sb2 = new StringBuilder();
            if (this.i != null) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(j(str, (String) this.i.first));
            }
            while (i9 < 2) {
                for (Map.Entry entry : (i9 == 0 ? hashMap2 : hashMap).entrySet()) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(j(str, (String) entry.getKey()));
                    m5.l lVar = ((f) entry.getValue()).b;
                    if (lVar != null) {
                        Bundle bundle = lVar.b;
                        m5.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                        String string = bundle.getString("com.google.android.gms.cast.metadata.TITLE");
                        m5.l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
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
                i9++;
            }
            return k.c(gVar, "text/plain", sb2.toString());
        }
        f fVar = (f) hashMap2.get(path);
        if (fVar == null) {
            fVar = (f) hashMap.get(path);
        }
        if (fVar == null) {
            Pair pair = this.i;
            File file = (pair == null || !((String) pair.first).equalsIgnoreCase(path)) ? null : (File) this.i.second;
            return file != null ? new h(gVar, "image/jpeg", new BufferedInputStream(new FileInputStream(file)), file.length()) : k.c(gc.g.h, "text/plain", "file not found");
        }
        Uri uri = fVar.c;
        String str2 = (String) dVar.i.get("host");
        String str3 = fVar.a;
        if (uri.toString().startsWith("data:application/x-mpegurl;base64,")) {
            return k.c(gVar, str3, new String(Base64.decode(uri.toString().substring(34), 0)).replaceAll("mtproto:", j(str2, "/mtproto_")));
        }
        m createDataSource = (uri.toString().startsWith("file://") ? uri.toString().startsWith("file:///android_asset/") ? this.f : this.g : this.e).createDataSource();
        Map map = Collections.EMPTY_MAP;
        long j12 = 0;
        long j13 = -1;
        long open = createDataSource.open(new q(uri, 1, null, map, 0L, -1L, null, 0));
        createDataSource.close();
        boolean equals2 = TextUtils.equals(str3, "application/x-mpegURL");
        if (!equals2) {
            String str4 = (String) dVar.i.get("range");
            if (!TextUtils.isEmpty(str4)) {
                String substring = str4.trim().substring(6);
                if (substring.startsWith("-")) {
                    parseLong2 = open - 1;
                    parseLong = parseLong2 - Long.parseLong(substring.substring(1));
                    z10 = equals2;
                } else {
                    String[] split = substring.split("-");
                    parseLong = Long.parseLong(split[0]);
                    z10 = equals2;
                    parseLong2 = split.length > 1 ? Long.parseLong(split[1]) : open - 1;
                }
                long j14 = parseLong;
                j10 = open;
                long j15 = j10 - 1;
                dVar2 = new d(j14, parseLong2 > j15 ? j15 : parseLong2);
                long j16 = dVar2 == null ? (dVar2.b - dVar2.a) + 1 : j10;
                if (dVar2 != null) {
                    j13 = j16;
                    j12 = dVar2.a;
                }
                if (!z10) {
                    int i10 = (int) j16;
                    byte[] bArr = new byte[i10];
                    createDataSource.open(new q(uri, 1, null, map, j12, j13, null, 0));
                    createDataSource.read(bArr, 0, i10);
                    createDataSource.close();
                    return k.c(gVar, str3, new String(bArr).replaceAll("mtproto:", j(str2, "/mtproto_")));
                }
                if (j16 != 0) {
                    j11 = j10;
                    c cVar = new c(createDataSource, new q(uri, 1, null, map, j12, j13, null, 0));
                    if (dVar2 != null) {
                        gVar = gc.g.e;
                    }
                    c10 = new h(gVar, fVar.a, cVar, j16);
                } else {
                    j11 = j10;
                    c10 = k.c(gc.g.d, str3, "");
                }
                h hVar = c10;
                if (dVar2 != null) {
                    hVar.e.put("Content-Range", "bytes " + dVar2.a + "-" + dVar2.b + "/" + j11);
                }
                return hVar;
            }
        }
        z10 = equals2;
        j10 = open;
        dVar2 = null;
        if (dVar2 == null) {
        }
        if (dVar2 != null) {
        }
        if (!z10) {
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
