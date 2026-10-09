package sc;

import b2.q0;
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
import m.f3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.h7;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.web.m1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class u {
    public final s a;
    public final q0 b;
    public final h c;
    public final com.google.firebase.messaging.m d;
    public final p e;
    public final p f;
    public m1 h;
    public z i;
    public q j;
    public b0 k;
    public ArrayList l;
    public boolean m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public y s;
    public y t;
    public o u;
    public final Object g = new Object();
    public final Object n = new Object();

    public u(boolean z10, String str, String str2, String str3, s sVar) {
        this.a = sVar;
        q0 q0Var = new q0();
        q0Var.b = 1;
        q0Var.a = 1;
        this.b = q0Var;
        h hVar = new h();
        hVar.a = str;
        hVar.b = str2;
        hVar.c = str3;
        URI.create((z10 ? "wss" : "ws") + "://" + str2 + str3);
        this.c = hVar;
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
        mVar.c = new ArrayList();
        mVar.a = true;
        mVar.b = this;
        this.d = mVar;
        this.e = new p(this, "PingSender", new ob.a(22));
        this.f = new p(this, "PongSender", new ob.a(22));
    }

    public final void a() {
        synchronized (this.n) {
            try {
                if (this.m) {
                    return;
                }
                this.m = true;
                com.google.firebase.messaging.m mVar = this.d;
                ArrayList arrayList = (ArrayList) mVar.n();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    y0 y0Var = (y0) obj;
                    try {
                        try {
                            AndroidUtilities.runOnUIThread(new h7(y0Var, (u) mVar.b, y0Var.a, y0Var.b, 15));
                        } catch (Throwable unused) {
                            y0Var.getClass();
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
            q0 q0Var = this.b;
            if (q0Var.a != 1) {
                throw new w(1, "The current state of the WebSocket is not CREATED.");
            }
            q0Var.a = 2;
        }
        this.d.e();
        try {
            s sVar = this.a;
            try {
                sVar.a();
                h(sVar.g);
                ArrayList arrayList = this.l;
                o oVar = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i10);
                        i10++;
                        x xVar = (x) obj;
                        if (xVar instanceof o) {
                            oVar = (o) xVar;
                            break;
                        }
                    }
                }
                this.u = oVar;
                this.b.a = 3;
                this.d.e();
                i();
            } catch (w e7) {
                Socket socket = sVar.g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e7;
            }
        } catch (w e10) {
            Socket socket2 = this.a.g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.b.a = 5;
            this.d.e();
            throw e10;
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                int c10 = m1.j.c(this.b.a);
                int i10 = 4;
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    q0 q0Var = this.b;
                    q0Var.a = 4;
                    if (q0Var.b == 1) {
                        q0Var.b = 3;
                    }
                    g(y.a(MediaDataController.MAX_STYLE_RUNS_COUNT, null));
                    this.d.e();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, i10, 1);
                com.google.firebase.messaging.m mVar = bVar.a.d;
                if (mVar != null) {
                    ArrayList arrayList = (ArrayList) mVar.n();
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        y0 y0Var = (y0) obj;
                        try {
                            try {
                                y0Var.getClass();
                            } catch (Throwable unused) {
                                y0Var.getClass();
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
        this.d.e();
        com.google.firebase.messaging.m mVar = this.d;
        y yVar = this.s;
        y yVar2 = this.t;
        int i10 = 0;
        boolean z10 = this.b.b == 2;
        ArrayList arrayList = (ArrayList) mVar.n();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    y0Var.a((u) mVar.b, yVar, yVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                y0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z10;
        synchronized (this.g) {
            this.o = true;
            z10 = this.p;
        }
        a();
        if (z10) {
            f();
        }
    }

    public final void f() {
        p pVar = this.e;
        synchronized (pVar) {
        }
        pVar.Z0();
        this.f.a1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.b) {
            z10 = this.b.a == 1;
        }
        if (z10) {
            d();
        }
        super.finalize();
    }

    public final void g(y yVar) {
        if (yVar == null) {
            return;
        }
        synchronized (this.b) {
            try {
                int i10 = this.b.a;
                if (i10 == 3 || i10 == 4) {
                    b0 b0Var = this.k;
                    if (b0Var == null) {
                        return;
                    }
                    b0Var.f(yVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0301 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeMap h(Socket socket) {
        int i10;
        int i11;
        x xVar;
        x xVar2;
        String str;
        try {
            m1 m1Var = new m1(new BufferedInputStream(socket.getInputStream()), 1);
            try {
                z zVar = new z(new BufferedOutputStream(socket.getOutputStream()));
                byte[] bArr = new byte[16];
                k.a.nextBytes(bArr);
                String a2 = d.a(bArr);
                h hVar = this.c;
                hVar.d = a2;
                String q6 = a1.g.q("GET ", (String) hVar.c, " HTTP/1.1");
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
                StringBuilder j3 = v.j(q6, "\r\n");
                int size = arrayList.size();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    i10 = 1;
                    if (i13 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i13);
                    i13++;
                    String[] strArr = (String[]) obj;
                    j3.append(strArr[0]);
                    j3.append(": ");
                    j3.append(strArr[1]);
                    j3.append("\r\n");
                }
                j3.append("\r\n");
                String sb2 = j3.toString();
                ArrayList arrayList2 = (ArrayList) this.d.n();
                int size2 = arrayList2.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayList2.get(i14);
                    i14++;
                    y0 y0Var = (y0) obj2;
                    try {
                        try {
                            y0Var.getClass();
                        } catch (Throwable unused) {
                            y0Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                try {
                    zVar.write(k.a(sb2));
                    zVar.flush();
                    f3 f3Var = new f3(this, 21);
                    try {
                        String b10 = k.b(m1Var);
                        if (b10 == null || b10.length() == 0) {
                            throw new w(6, "The status line of the opening handshake response is empty.");
                        }
                        try {
                            aa.b bVar = new aa.b(b10, 3);
                            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                            StringBuilder sb3 = null;
                            while (true) {
                                try {
                                    String b11 = k.b(m1Var);
                                    if (b11 == null || b11.length() == 0) {
                                        break;
                                    }
                                    char charAt = b11.charAt(0);
                                    if (charAt != ' ' && charAt != '\t') {
                                        if (sb3 != null) {
                                            f3.o(sb3.toString(), treeMap);
                                        }
                                        sb3 = new StringBuilder(b11);
                                    } else if (sb3 != null) {
                                        sb3.append(b11.replaceAll("^[ \t]+", " "));
                                    }
                                } catch (IOException e7) {
                                    throw new w(9, "An error occurred while HTTP header section was being read: " + e7.getMessage(), e7);
                                }
                            }
                            if (sb3 != null) {
                                f3.o(sb3.toString(), treeMap);
                            }
                            if (bVar.c != 101) {
                                try {
                                    i11 = Integer.parseInt((String) ((List) treeMap.get("Content-Length")).get(0));
                                } catch (Exception unused3) {
                                    i11 = -1;
                                }
                                if (i11 > 0) {
                                    try {
                                        m1Var.b(i11, new byte[i11]);
                                    } catch (Throwable unused4) {
                                    }
                                }
                                throw new n(8, "The status code of the opening handshake response is not '101 Switching Protocols'. The status line is: " + bVar, bVar);
                            }
                            List list = (List) treeMap.get("Upgrade");
                            if (list == null || list.size() == 0) {
                                throw new n(10, "The opening handshake response does not contain 'Upgrade' header.", bVar);
                            }
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String[] split = ((String) it.next()).split("\\s*,\\s*");
                                int length = split.length;
                                int i15 = 0;
                                while (i15 < length) {
                                    if ("websocket".equalsIgnoreCase(split[i15])) {
                                        List list2 = (List) treeMap.get("Connection");
                                        if (list2 == null || list2.size() == 0) {
                                            throw new n(12, "The opening handshake response does not contain 'Connection' header.", bVar);
                                        }
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            String[] split2 = ((String) it2.next()).split("\\s*,\\s*");
                                            int length2 = split2.length;
                                            int i16 = 0;
                                            while (i16 < length2) {
                                                if ("Upgrade".equalsIgnoreCase(split2[i16])) {
                                                    List list3 = (List) treeMap.get("Sec-WebSocket-Accept");
                                                    if (list3 == null) {
                                                        throw new n(14, "The opening handshake response does not contain 'Sec-WebSocket-Accept' header.", bVar);
                                                    }
                                                    try {
                                                        if (!d.a(MessageDigest.getInstance("SHA-1").digest(k.a(v.v(a2, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")))).equals((String) list3.get(0))) {
                                                            throw new n(15, "The value of 'Sec-WebSocket-Accept' header is different from the expected one.", bVar);
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
                                                                                xVar = oVar;
                                                                            } else {
                                                                                xVar = new x(str4);
                                                                            }
                                                                            int i17 = i10;
                                                                            while (i17 < split4.length) {
                                                                                String[] split5 = split4[i17].split("\\s*=\\s*", 2);
                                                                                if (split5.length != 0 && split5[0].length() != 0) {
                                                                                    String str5 = split5[0];
                                                                                    if (d.b(str5)) {
                                                                                        if (split5.length == 2 && (str = split5[i10]) != null) {
                                                                                            int length3 = str.length();
                                                                                            if (length3 >= 2 && str.charAt(0) == '\"') {
                                                                                                int i18 = length3 - 1;
                                                                                                if (str.charAt(i18) == '\"') {
                                                                                                    str = str.substring(i10, i18);
                                                                                                    if (str != null) {
                                                                                                        if (str.indexOf(92) >= 0) {
                                                                                                            int length4 = str.length();
                                                                                                            StringBuilder sb4 = new StringBuilder();
                                                                                                            boolean z10 = false;
                                                                                                            for (int i19 = 0; i19 < length4; i19++) {
                                                                                                                char charAt2 = str.charAt(i19);
                                                                                                                if (charAt2 != '\\' || z10) {
                                                                                                                    sb4.append(charAt2);
                                                                                                                    z10 = false;
                                                                                                                } else {
                                                                                                                    z10 = true;
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
                                                                                                xVar.b.put(str5, str);
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
                                                                                i17++;
                                                                                i10 = 1;
                                                                            }
                                                                            xVar2 = xVar;
                                                                            if (xVar2 != null) {
                                                                                throw new n(16, v.i("The value in 'Sec-WebSocket-Extensions' failed to be parsed: ", str3), bVar);
                                                                            }
                                                                            String str6 = xVar2.a;
                                                                            h hVar2 = ((u) f3Var.b).c;
                                                                            if (str6 == null) {
                                                                                hVar2.getClass();
                                                                            }
                                                                            throw new n(17, v.i("The extension contained in the Sec-WebSocket-Extensions header is not supported: ", str6), bVar);
                                                                        }
                                                                    }
                                                                }
                                                                xVar2 = null;
                                                                if (xVar2 != null) {
                                                                }
                                                            }
                                                        }
                                                        int size3 = arrayList3.size();
                                                        x xVar3 = null;
                                                        while (i12 < size3) {
                                                            Object obj3 = arrayList3.get(i12);
                                                            i12++;
                                                            x xVar4 = (x) obj3;
                                                            if (xVar4 instanceof o) {
                                                                if (xVar3 != null) {
                                                                    throw new n(18, c1.i("'", xVar3.a, "' extension and '", xVar4.a, "' extension conflict with each other."), bVar);
                                                                }
                                                                xVar3 = xVar4;
                                                            }
                                                        }
                                                        ((u) f3Var.b).l = arrayList3;
                                                    }
                                                    f3Var.r(bVar, treeMap);
                                                    this.h = m1Var;
                                                    this.i = zVar;
                                                    return treeMap;
                                                }
                                                i16++;
                                                i10 = 1;
                                            }
                                        }
                                        throw new n(13, "'Upgrade' was not found in 'Connection' header.", bVar);
                                    }
                                    i15++;
                                    i10 = 1;
                                }
                            }
                            throw new n(11, "'websocket' was not found in 'Upgrade' header.", bVar);
                        } catch (Exception unused6) {
                            throw new w(7, "The status line of the opening handshake response is badly formatted. The status line is: ".concat(b10));
                        }
                    } catch (IOException e10) {
                        throw new w(5, "Failed to read an opening handshake response from the server: " + e10.getMessage(), e10);
                    }
                } catch (IOException e11) {
                    throw new w(4, "Failed to send an opening handshake request to the server: " + e11.getMessage(), e11);
                }
            } catch (IOException e12) {
                throw new w(3, "Failed to get the output stream from the raw socket: " + e12.getMessage(), e12);
            }
        } catch (IOException e13) {
            throw new w(2, "Failed to get the input stream of the raw socket: " + e13.getMessage(), e13);
        }
    }

    public final void i() {
        q qVar = new q(this);
        b0 b0Var = new b0(this);
        synchronized (this.g) {
            this.j = qVar;
            this.k = b0Var;
        }
        com.google.firebase.messaging.m mVar = qVar.a.d;
        int i10 = 0;
        if (mVar != null) {
            ArrayList arrayList = (ArrayList) mVar.n();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                y0 y0Var = (y0) obj;
                try {
                    try {
                        y0Var.getClass();
                    } catch (Throwable unused) {
                        y0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        com.google.firebase.messaging.m mVar2 = b0Var.a.d;
        if (mVar2 != null) {
            ArrayList arrayList2 = (ArrayList) mVar2.n();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                y0 y0Var2 = (y0) obj2;
                try {
                    try {
                        y0Var2.getClass();
                    } catch (Throwable unused3) {
                        y0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        qVar.start();
        b0Var.start();
    }

    public final void j() {
        q qVar;
        b0 b0Var;
        synchronized (this.g) {
            qVar = this.j;
            b0Var = this.k;
            this.j = null;
            this.k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (b0Var != null) {
            b0Var.g();
        }
    }
}
