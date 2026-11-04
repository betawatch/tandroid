package tf;

import a1.g;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import b8.ig;
import c3.x;
import e6.l;
import i2.h;
import i2.n;
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
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.hs;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.messenger.t0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.eg;
import vc.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends i {
    public static final f l;
    public static final HashMap m;
    public final ExtendedDefaultDataSourceFactory e;
    public final s0.b f;
    public final ra.e g;
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
        this.c = new ig(8);
        this.h = new HashMap();
        this.i = null;
        this.j = false;
        this.k = new AtomicInteger();
        this.f = new s0.b(19);
        this.g = new ra.e(10);
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
        sb2.append(String.valueOf(ipAddress & hs.e4) + '.' + ((ipAddress >> 8) & hs.e4) + '.' + ((ipAddress >> 16) & hs.e4) + '.' + ((ipAddress >> 24) & hs.e4));
        sb2.append(":61578");
        return sb2.toString();
    }

    public static String j(String str, String str2) {
        return g.q("http://", str, str2);
    }

    @Override // vc.i
    public final vc.g e(vc.d dVar) {
        String str;
        int incrementAndGet = this.k.incrementAndGet();
        StringBuilder m10 = p1.m(incrementAndGet, "Request ", " ");
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
        m10.append(str);
        m10.append(" ");
        m10.append(dVar.f);
        m10.append(" ");
        m10.append((String) dVar.i.get("range"));
        Log.d("CAST_SERVER", m10.toString());
        try {
            vc.g k10 = k(dVar);
            eg egVar = k10.e;
            egVar.put("Access-Control-Allow-Origin", "*");
            egVar.put("Access-Control-Max-Age", "3628800");
            egVar.put("Access-Control-Allow-Methods", "*");
            egVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            vc.g c2 = i.c(vc.f.n, "text/plain", "Error reading file");
            eg egVar2 = c2.e;
            egVar2.put("Access-Control-Allow-Origin", "*");
            egVar2.put("Access-Control-Max-Age", "3628800");
            egVar2.put("Access-Control-Allow-Methods", "*");
            egVar2.put("Access-Control-Allow-Headers", "*");
            return c2;
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
                ig igVar = this.c;
                igVar.getClass();
                ArrayList arrayList = new ArrayList((List) igVar.c);
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    vc.a aVar = (vc.a) obj;
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
    public final vc.g k(vc.d dVar) {
        boolean z10;
        long j10;
        x xVar;
        long j11;
        vc.g c2;
        long parseLong;
        long parseLong2;
        String str = (String) dVar.i.get("host");
        String path = Uri.parse("http://" + str + dVar.f).getPath();
        boolean b10 = o1.g.b(6, dVar.g);
        vc.f fVar = vc.f.c;
        if (b10) {
            return i.c(fVar, "text/plain", "");
        }
        boolean equals = TextUtils.equals(path, "/");
        HashMap hashMap = this.h;
        HashMap hashMap2 = m;
        int i3 = 0;
        if (equals) {
            StringBuilder sb2 = new StringBuilder();
            if (this.i != null) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(j(str, (String) this.i.first));
            }
            while (i3 < 2) {
                for (Map.Entry entry : (i3 == 0 ? hashMap2 : hashMap).entrySet()) {
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
                i3++;
            }
            return i.c(fVar, "text/plain", sb2.toString());
        }
        f fVar2 = (f) hashMap2.get(path);
        if (fVar2 == null) {
            fVar2 = (f) hashMap.get(path);
        }
        if (fVar2 == null) {
            Pair pair = this.i;
            File file = (pair == null || !((String) pair.first).equalsIgnoreCase(path)) ? null : (File) this.i.second;
            return file != null ? new vc.g(fVar, "image/jpeg", new BufferedInputStream(new FileInputStream(file)), file.length()) : i.c(vc.f.h, "text/plain", "file not found");
        }
        Uri uri = fVar2.c;
        String str2 = (String) dVar.i.get("host");
        String str3 = fVar2.a;
        if (uri.toString().startsWith("data:application/x-mpegurl;base64,")) {
            return i.c(fVar, str3, new String(Base64.decode(uri.toString().substring(34), 0)).replaceAll("mtproto:", j(str2, "/mtproto_")));
        }
        h createDataSource = (uri.toString().startsWith("file://") ? uri.toString().startsWith("file:///android_asset/") ? this.f : this.g : this.e).createDataSource();
        Map map = Collections.EMPTY_MAP;
        long j12 = 0;
        long j13 = -1;
        long open = createDataSource.open(new n(uri, 1, null, map, 0L, -1L, null, 0));
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
                xVar = new x(j14, parseLong2 > j15 ? j15 : parseLong2);
                long j16 = xVar == null ? (xVar.b - xVar.a) + 1 : j10;
                if (xVar != null) {
                    j13 = j16;
                    j12 = xVar.a;
                }
                if (!z10) {
                    int i10 = (int) j16;
                    byte[] bArr = new byte[i10];
                    createDataSource.open(new n(uri, 1, null, map, j12, j13, null, 0));
                    createDataSource.read(bArr, 0, i10);
                    createDataSource.close();
                    return i.c(fVar, str3, new String(bArr).replaceAll("mtproto:", j(str2, "/mtproto_")));
                }
                if (j16 != 0) {
                    j11 = j10;
                    c cVar = new c(createDataSource, new n(uri, 1, null, map, j12, j13, null, 0));
                    if (xVar != null) {
                        fVar = vc.f.e;
                    }
                    c2 = new vc.g(fVar, fVar2.a, cVar, j16);
                } else {
                    j11 = j10;
                    c2 = i.c(vc.f.d, str3, "");
                }
                vc.g gVar = c2;
                if (xVar != null) {
                    gVar.e.put("Content-Range", "bytes " + xVar.a + "-" + xVar.b + "/" + j11);
                }
                return gVar;
            }
        }
        z10 = equals2;
        j10 = open;
        xVar = null;
        if (xVar == null) {
        }
        if (xVar != null) {
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
