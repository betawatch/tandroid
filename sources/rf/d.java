package rf;

import a3.z;
import a8.lg;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import bd.h;
import bd.k;
import d6.l;
import g2.m;
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
import org.telegram.ui.ji1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d extends k {
    public static final f l;
    public static final HashMap m;
    public final ExtendedDefaultDataSourceFactory e;
    public final ji1 f;
    public final tb.a g;
    public final HashMap h;
    public Pair i;
    public boolean j;
    public final AtomicInteger k;

    static {
        f fVar = new f(new e(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        l = fVar;
        f[] fVarArr = {fVar};
        HashMap hashMap = new HashMap();
        m = hashMap;
        f fVar2 = fVarArr[0];
        hashMap.put(fVar2.d, fVar2);
    }

    public d() {
        this.c = new lg(1);
        this.h = new HashMap();
        this.i = null;
        this.j = false;
        this.k = new AtomicInteger();
        this.f = new ji1(13);
        this.g = new tb.a(8);
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
            } catch (SocketException e) {
                FileLog.e(e);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255));
        sb2.append(":61578");
        return sb2.toString();
    }

    public static String j(String str, String str2) {
        return a1.g.p("http://", str, str2);
    }

    @Override // bd.k
    public final h e(bd.d dVar) {
        String str;
        int incrementAndGet = this.k.incrementAndGet();
        StringBuilder k10 = ic.a.k(incrementAndGet, "Request ", " ");
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
        k10.append(str);
        k10.append(" ");
        k10.append(dVar.f);
        k10.append(" ");
        k10.append((String) dVar.i.get("range"));
        Log.d("CAST_SERVER", k10.toString());
        try {
            h k11 = k(dVar);
            bd.e eVar = k11.e;
            eVar.put("Access-Control-Allow-Origin", "*");
            eVar.put("Access-Control-Max-Age", "3628800");
            eVar.put("Access-Control-Allow-Methods", "*");
            eVar.put("Access-Control-Allow-Headers", "*");
            return k11;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            h c10 = k.c(bd.g.n, "text/plain", "Error reading file");
            bd.e eVar2 = c10.e;
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
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (this.j) {
            try {
                k.d(this.a);
                lg lgVar = this.c;
                lgVar.getClass();
                ArrayList arrayList = new ArrayList((List) lgVar.c);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    bd.a aVar = (bd.a) obj;
                    k.d(aVar.a);
                    k.d(aVar.b);
                }
                Thread thread = this.b;
                if (thread != null) {
                    thread.join();
                }
            } catch (Exception e10) {
                k.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e10);
            }
            this.j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h k(bd.d dVar) {
        boolean z10;
        long j10;
        z zVar;
        long j11;
        h c10;
        long parseLong;
        long parseLong2;
        String str = (String) dVar.i.get("host");
        String path = Uri.parse("http://" + str + dVar.f).getPath();
        boolean b10 = j.b(6, dVar.g);
        bd.g gVar = bd.g.c;
        if (b10) {
            return k.c(gVar, "text/plain", "");
        }
        boolean equals = TextUtils.equals(path, "/");
        HashMap hashMap = this.h;
        HashMap hashMap2 = m;
        int i10 = 0;
        if (equals) {
            StringBuilder sb2 = new StringBuilder();
            if (this.i != null) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(j(str, (String) this.i.first));
            }
            while (i10 < 2) {
                for (Map.Entry entry : (i10 == 0 ? hashMap2 : hashMap).entrySet()) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(j(str, (String) entry.getKey()));
                    l lVar = ((f) entry.getValue()).b;
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
                i10++;
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
            return file != null ? new h(gVar, "image/jpeg", new BufferedInputStream(new FileInputStream(file)), file.length()) : k.c(bd.g.h, "text/plain", "file not found");
        }
        Uri uri = fVar.c;
        String str2 = (String) dVar.i.get("host");
        String str3 = fVar.a;
        if (uri.toString().startsWith("data:application/x-mpegurl;base64,")) {
            return k.c(gVar, str3, new String(Base64.decode(uri.toString().substring(34), 0)).replaceAll("mtproto:", j(str2, "/mtproto_")));
        }
        g2.h createDataSource = (uri.toString().startsWith("file://") ? uri.toString().startsWith("file:///android_asset/") ? this.f : this.g : this.e).createDataSource();
        Map map = Collections.EMPTY_MAP;
        long j12 = 0;
        long j13 = -1;
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
                zVar = new z(j14, parseLong2 > j15 ? j15 : parseLong2);
                long j16 = zVar == null ? (zVar.b - zVar.a) + 1 : j10;
                if (zVar != null) {
                    j13 = j16;
                    j12 = zVar.a;
                }
                if (!z10) {
                    int i11 = (int) j16;
                    byte[] bArr = new byte[i11];
                    createDataSource.open(new m(uri, 1, null, map, j12, j13, null, 0));
                    createDataSource.read(bArr, 0, i11);
                    createDataSource.close();
                    return k.c(gVar, str3, new String(bArr).replaceAll("mtproto:", j(str2, "/mtproto_")));
                }
                if (j16 != 0) {
                    j11 = j10;
                    c cVar = new c(createDataSource, new m(uri, 1, null, map, j12, j13, null, 0));
                    if (zVar != null) {
                        gVar = bd.g.e;
                    }
                    c10 = new h(gVar, fVar.a, cVar, j16);
                } else {
                    j11 = j10;
                    c10 = k.c(bd.g.d, str3, "");
                }
                h hVar = c10;
                if (zVar != null) {
                    hVar.e.put("Content-Range", "bytes " + zVar.a + "-" + zVar.b + "/" + j11);
                }
                return hVar;
            }
        }
        z10 = equals2;
        j10 = open;
        zVar = null;
        if (zVar == null) {
        }
        if (zVar != null) {
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
