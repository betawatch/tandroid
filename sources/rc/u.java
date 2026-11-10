package rc;

import a8.p0;
import bi.f9;
import com.google.android.gms.internal.clearcut.z0;
import e2.r0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.web.e1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class u {
    public final s a;
    public final r0 b;
    public final h c;
    public final ab.q d;
    public final p e;
    public final p f;
    public e1 h;
    public y i;
    public q j;
    public a0 k;
    public ArrayList l;
    public boolean m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public x s;
    public x t;
    public o u;
    public final Object g = new Object();
    public final Object n = new Object();

    public u(boolean z9, String str, String str2, String str3, s sVar) {
        this.a = sVar;
        r0 r0Var = new r0();
        r0Var.b = 1;
        r0Var.a = 1;
        this.b = r0Var;
        h hVar = new h();
        hVar.a = str;
        hVar.b = str2;
        hVar.c = str3;
        URI.create((z9 ? "wss" : "ws") + "://" + str2 + str3);
        this.c = hVar;
        ab.q qVar = new ab.q();
        qVar.c = new ArrayList();
        qVar.a = true;
        qVar.b = this;
        this.d = qVar;
        this.e = new p(this, "PingSender", new sa.d(22));
        this.f = new p(this, "PongSender", new sa.d(22));
    }

    public final void a() {
        synchronized (this.n) {
            try {
                if (this.m) {
                    return;
                }
                this.m = true;
                ab.q qVar = this.d;
                ArrayList arrayList = (ArrayList) qVar.p();
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    x0 x0Var = (x0) obj;
                    try {
                        try {
                            int i10 = 5;
                            g0.h3(new f9(x0Var.a, i10, x0Var.b, x0Var, (u) qVar.b));
                        } catch (Throwable unused) {
                            x0Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            r0 r0Var = this.b;
            if (r0Var.a != 1) {
                throw new v(1, "The current state of the WebSocket is not CREATED.");
            }
            r0Var.a = 2;
        }
        this.d.g();
        try {
            s sVar = this.a;
            try {
                sVar.a();
                h(sVar.g);
                ArrayList arrayList = this.l;
                o oVar = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i7);
                        i7++;
                        w wVar = (w) obj;
                        if (wVar instanceof o) {
                            oVar = (o) wVar;
                            break;
                        }
                    }
                }
                this.u = oVar;
                this.b.a = 3;
                this.d.g();
                i();
            } catch (v e10) {
                Socket socket = sVar.g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e10;
            }
        } catch (v e11) {
            Socket socket2 = this.a.g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.b.a = 5;
            this.d.g();
            throw e11;
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                int c10 = p1.g.c(this.b.a);
                int i7 = 4;
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    r0 r0Var = this.b;
                    r0Var.a = 4;
                    if (r0Var.b == 1) {
                        r0Var.b = 3;
                    }
                    g(x.a(1000, null));
                    this.d.g();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, i7, 1);
                ab.q qVar = bVar.a.d;
                if (qVar != null) {
                    ArrayList arrayList = (ArrayList) qVar.p();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        x0 x0Var = (x0) obj;
                        try {
                            try {
                                x0Var.getClass();
                            } catch (Throwable unused) {
                                x0Var.getClass();
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
                bVar.start();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        this.e.stop();
        this.f.stop();
        Socket socket = this.a.g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.b) {
            this.b.a = 5;
        }
        this.d.g();
        ab.q qVar = this.d;
        x xVar = this.s;
        x xVar2 = this.t;
        int i7 = 0;
        boolean z9 = this.b.b == 2;
        ArrayList arrayList = (ArrayList) qVar.p();
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            x0 x0Var = (x0) obj;
            try {
                try {
                    x0Var.a((u) qVar.b, xVar, xVar2, z9);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                x0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z9;
        synchronized (this.g) {
            this.o = true;
            z9 = this.p;
        }
        a();
        if (z9) {
            f();
        }
    }

    public final void f() {
        p pVar = this.e;
        synchronized (pVar) {
        }
        pVar.c1();
        this.f.d1();
    }

    public final void finalize() {
        boolean z9;
        synchronized (this.b) {
            z9 = this.b.a == 1;
        }
        if (z9) {
            d();
        }
        super.finalize();
    }

    public final void g(x xVar) {
        if (xVar == null) {
            return;
        }
        synchronized (this.b) {
            try {
                int i7 = this.b.a;
                if (i7 == 3 || i7 == 4) {
                    a0 a0Var = this.k;
                    if (a0Var == null) {
                        return;
                    }
                    a0Var.f(xVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeMap h(Socket socket) {
        int i7;
        int i10;
        w wVar;
        w wVar2;
        String str;
        try {
            e1 e1Var = new e1(new BufferedInputStream(socket.getInputStream()), 1);
            try {
                y yVar = new y(new BufferedOutputStream(socket.getOutputStream()));
                byte[] bArr = new byte[16];
                k.a.nextBytes(bArr);
                String a10 = d.a(bArr);
                h hVar = this.c;
                hVar.d = a10;
                String p10 = p0.p("GET ", (String) hVar.c, " HTTP/1.1");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new String[]{"Host", (String) hVar.b});
                arrayList.add(h.e);
                arrayList.add(h.f);
                arrayList.add(h.g);
                arrayList.add(new String[]{"Sec-WebSocket-Key", (String) hVar.d});
                String str2 = (String) hVar.a;
                if (str2 != null && str2.length() != 0) {
                    arrayList.add(new String[]{"Authorization", "Basic " + d.a(k.a(str2))});
                }
                StringBuilder j3 = rf.b.j(p10, "\r\n");
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    i7 = 1;
                    if (i12 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i12);
                    i12++;
                    String[] strArr = (String[]) obj;
                    j3.append(strArr[0]);
                    j3.append(": ");
                    j3.append(strArr[1]);
                    j3.append("\r\n");
                }
                j3.append("\r\n");
                String sb2 = j3.toString();
                ArrayList arrayList2 = (ArrayList) this.d.p();
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    x0 x0Var = (x0) obj2;
                    try {
                        try {
                            x0Var.getClass();
                        } catch (Throwable unused) {
                            x0Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                try {
                    yVar.write(k.a(sb2));
                    yVar.flush();
                    uy uyVar = new uy(this, 13);
                    try {
                        String b10 = k.b(e1Var);
                        if (b10 == null || b10.length() == 0) {
                            throw new v(6, "The status line of the opening handshake response is empty.");
                        }
                        try {
                            z0 z0Var = new z0(b10, 4);
                            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                            StringBuilder sb3 = null;
                            while (true) {
                                try {
                                    String b11 = k.b(e1Var);
                                    if (b11 == null || b11.length() == 0) {
                                        break;
                                    }
                                    char charAt = b11.charAt(0);
                                    if (charAt != ' ' && charAt != '\t') {
                                        if (sb3 != null) {
                                            uy.K(sb3.toString(), treeMap);
                                        }
                                        sb3 = new StringBuilder(b11);
                                    } else if (sb3 != null) {
                                        sb3.append(b11.replaceAll("^[ \t]+", " "));
                                    }
                                } catch (IOException e10) {
                                    throw new v(9, "An error occurred while HTTP header section was being read: " + e10.getMessage(), e10);
                                }
                            }
                            if (sb3 != null) {
                                uy.K(sb3.toString(), treeMap);
                            }
                            if (z0Var.b != 101) {
                                try {
                                    i10 = Integer.parseInt((String) ((List) treeMap.get("Content-Length")).get(0));
                                } catch (Exception unused3) {
                                    i10 = -1;
                                }
                                if (i10 > 0) {
                                    try {
                                        e1Var.b(i10, new byte[i10]);
                                    } catch (Throwable unused4) {
                                    }
                                }
                                throw new n(8, "The status code of the opening handshake response is not '101 Switching Protocols'. The status line is: " + z0Var, z0Var);
                            }
                            List list = (List) treeMap.get("Upgrade");
                            if (list == null || list.size() == 0) {
                                throw new n(10, "The opening handshake response does not contain 'Upgrade' header.", z0Var);
                            }
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String[] split = ((String) it.next()).split("\\s*,\\s*");
                                int length = split.length;
                                int i14 = 0;
                                while (i14 < length) {
                                    if ("websocket".equalsIgnoreCase(split[i14])) {
                                        List list2 = (List) treeMap.get("Connection");
                                        if (list2 == null || list2.size() == 0) {
                                            throw new n(12, "The opening handshake response does not contain 'Connection' header.", z0Var);
                                        }
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            String[] split2 = ((String) it2.next()).split("\\s*,\\s*");
                                            int length2 = split2.length;
                                            int i15 = 0;
                                            while (i15 < length2) {
                                                if ("Upgrade".equalsIgnoreCase(split2[i15])) {
                                                    List list3 = (List) treeMap.get("Sec-WebSocket-Accept");
                                                    if (list3 == null) {
                                                        throw new n(14, "The opening handshake response does not contain 'Sec-WebSocket-Accept' header.", z0Var);
                                                    }
                                                    try {
                                                        if (!d.a(MessageDigest.getInstance("SHA-1").digest(k.a(rf.b.r(a10, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")))).equals((String) list3.get(0))) {
                                                            throw new n(15, "The value of 'Sec-WebSocket-Accept' header is different from the expected one.", z0Var);
                                                        }
                                                    } catch (Exception unused5) {
                                                    }
                                                    List list4 = (List) treeMap.get("Sec-WebSocket-Extensions");
                                                    if (list4 != null && list4.size() != 0) {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        Iterator it3 = list4.iterator();
                                                        while (it3.hasNext()) {
                                                            String[] split3 = ((String) it3.next()).split("\\s*,\\s*");
                                                            if (split3.length > 0) {
                                                                String str3 = split3[0];
                                                                if (str3 != null) {
                                                                    String[] split4 = str3.trim().split("\\s*;\\s*");
                                                                    if (split4.length != 0) {
                                                                        String str4 = split4[0];
                                                                        if (d.b(str4)) {
                                                                            if ("permessage-deflate".equals(str4)) {
                                                                                o oVar = new o(str4);
                                                                                oVar.c = 32768;
                                                                                wVar = oVar;
                                                                            } else {
                                                                                wVar = new w(str4);
                                                                            }
                                                                            int i16 = i7;
                                                                            while (i16 < split4.length) {
                                                                                String[] split5 = split4[i16].split("\\s*=\\s*", 2);
                                                                                if (split5.length != 0 && split5[0].length() != 0) {
                                                                                    String str5 = split5[0];
                                                                                    if (d.b(str5)) {
                                                                                        if (split5.length == 2 && (str = split5[i7]) != null) {
                                                                                            int length3 = str.length();
                                                                                            if (length3 >= 2 && str.charAt(0) == '\"') {
                                                                                                int i17 = length3 - 1;
                                                                                                if (str.charAt(i17) == '\"') {
                                                                                                    str = str.substring(i7, i17);
                                                                                                    if (str != null) {
                                                                                                        if (str.indexOf(92) >= 0) {
                                                                                                            int length4 = str.length();
                                                                                                            StringBuilder sb4 = new StringBuilder();
                                                                                                            boolean z9 = false;
                                                                                                            for (int i18 = 0; i18 < length4; i18++) {
                                                                                                                char charAt2 = str.charAt(i18);
                                                                                                                if (charAt2 != '\\' || z9) {
                                                                                                                    sb4.append(charAt2);
                                                                                                                    z9 = false;
                                                                                                                } else {
                                                                                                                    z9 = true;
                                                                                                                }
                                                                                                            }
                                                                                                            str = sb4.toString();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (str != null || d.b(str)) {
                                                                                                if (d.b(str5)) {
                                                                                                    throw new IllegalArgumentException("'key' is not a valid token.");
                                                                                                }
                                                                                                if (str != null && !d.b(str)) {
                                                                                                    throw new IllegalArgumentException("'value' is not a valid token.");
                                                                                                }
                                                                                                wVar.b.put(str5, str);
                                                                                            }
                                                                                        }
                                                                                        str = null;
                                                                                        if (str != null) {
                                                                                        }
                                                                                        if (d.b(str5)) {
                                                                                        }
                                                                                    } else {
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                                i16++;
                                                                                i7 = 1;
                                                                            }
                                                                            wVar2 = wVar;
                                                                            if (wVar2 != null) {
                                                                                throw new n(16, rf.b.i("The value in 'Sec-WebSocket-Extensions' failed to be parsed: ", str3), z0Var);
                                                                            }
                                                                            String str6 = wVar2.a;
                                                                            h hVar2 = ((u) uyVar.b).c;
                                                                            if (str6 == null) {
                                                                                hVar2.getClass();
                                                                            }
                                                                            throw new n(17, rf.b.i("The extension contained in the Sec-WebSocket-Extensions header is not supported: ", str6), z0Var);
                                                                        }
                                                                    }
                                                                }
                                                                wVar2 = null;
                                                                if (wVar2 != null) {
                                                                }
                                                            }
                                                        }
                                                        int size3 = arrayList3.size();
                                                        w wVar3 = null;
                                                        while (i11 < size3) {
                                                            Object obj3 = arrayList3.get(i11);
                                                            i11++;
                                                            w wVar4 = (w) obj3;
                                                            if (wVar4 instanceof o) {
                                                                if (wVar3 != null) {
                                                                    throw new n(18, f1.m("'", wVar3.a, "' extension and '", wVar4.a, "' extension conflict with each other."), z0Var);
                                                                }
                                                                wVar3 = wVar4;
                                                            }
                                                        }
                                                        ((u) uyVar.b).l = arrayList3;
                                                    }
                                                    uyVar.S(z0Var, treeMap);
                                                    this.h = e1Var;
                                                    this.i = yVar;
                                                    return treeMap;
                                                }
                                                i15++;
                                                i7 = 1;
                                            }
                                        }
                                        throw new n(13, "'Upgrade' was not found in 'Connection' header.", z0Var);
                                    }
                                    i14++;
                                    i7 = 1;
                                }
                            }
                            throw new n(11, "'websocket' was not found in 'Upgrade' header.", z0Var);
                        } catch (Exception unused6) {
                            throw new v(7, "The status line of the opening handshake response is badly formatted. The status line is: ".concat(b10));
                        }
                    } catch (IOException e11) {
                        throw new v(5, "Failed to read an opening handshake response from the server: " + e11.getMessage(), e11);
                    }
                } catch (IOException e12) {
                    throw new v(4, "Failed to send an opening handshake request to the server: " + e12.getMessage(), e12);
                }
            } catch (IOException e13) {
                throw new v(3, "Failed to get the output stream from the raw socket: " + e13.getMessage(), e13);
            }
        } catch (IOException e14) {
            throw new v(2, "Failed to get the input stream of the raw socket: " + e14.getMessage(), e14);
        }
    }

    public final void i() {
        q qVar = new q(this);
        a0 a0Var = new a0(this);
        synchronized (this.g) {
            this.j = qVar;
            this.k = a0Var;
        }
        ab.q qVar2 = qVar.a.d;
        int i7 = 0;
        if (qVar2 != null) {
            ArrayList arrayList = (ArrayList) qVar2.p();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                x0 x0Var = (x0) obj;
                try {
                    try {
                        x0Var.getClass();
                    } catch (Throwable unused) {
                        x0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        ab.q qVar3 = a0Var.a.d;
        if (qVar3 != null) {
            ArrayList arrayList2 = (ArrayList) qVar3.p();
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                x0 x0Var2 = (x0) obj2;
                try {
                    try {
                        x0Var2.getClass();
                    } catch (Throwable unused3) {
                        x0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        qVar.start();
        a0Var.start();
    }

    public final void j() {
        q qVar;
        a0 a0Var;
        synchronized (this.g) {
            qVar = this.j;
            a0Var = this.k;
            this.j = null;
            this.k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (a0Var != null) {
            a0Var.g();
        }
    }
}
