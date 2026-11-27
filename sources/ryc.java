// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ryc {
    public final xna a;
    public final m09 b;
    public final u8a c;
    public final vh4 d;
    public final ee8 e;
    public final ee8 f;
    public pi6 h;
    public wyc i;
    public c59 j;
    public m3d k;
    public ArrayList l;
    public boolean m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public vyc s;
    public vyc t;
    public t68 u;
    public final Object g = new Object();
    public final Object n = new Object();

    public ryc(boolean z, String str, String str2, String str3, xna xnaVar) {
        this.a = xnaVar;
        m09 m09Var = new m09((byte) 6);
        m09Var.c = 1;
        m09Var.b = 1;
        this.b = m09Var;
        u8a u8aVar = new u8a();
        u8aVar.a = str;
        u8aVar.b = str2;
        u8aVar.c = str3;
        URI.create((z ? "wss" : "ws") + "://" + str2 + str3);
        this.c = u8aVar;
        vh4 vh4Var = new vh4();
        vh4Var.c = new ArrayList();
        vh4Var.a = true;
        vh4Var.b = this;
        this.d = vh4Var;
        byte b = 16;
        this.e = new ee8(this, "PingSender", new qf5(b));
        this.f = new ee8(this, "PongSender", new qf5(b));
    }

    public final void a() {
        synchronized (this.n) {
            if (this.m) {
                return;
            }
            this.m = true;
            ArrayList arrayList = (ArrayList) this.d.s();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                s35 s35Var = (s35) obj;
                try {
                    try {
                        hl.c3(new r77((Object) s35Var, r11.b, s35Var.a, s35Var.b, (byte) 5));
                    } catch (Throwable unused) {
                        s35Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            m09 m09Var = this.b;
            if (m09Var.b != 1) {
                throw new syc(1, "The current state of the WebSocket is not CREATED.");
            }
            m09Var.b = 2;
        }
        this.d.e();
        try {
            xna xnaVar = this.a;
            try {
                xnaVar.a();
                h(xnaVar.g);
                ArrayList arrayList = this.l;
                t68 t68Var = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i);
                        i++;
                        tyc tycVar = (tyc) obj;
                        if (tycVar instanceof t68) {
                            t68Var = (t68) tycVar;
                            break;
                        }
                    }
                }
                this.u = t68Var;
                this.b.b = 3;
                this.d.e();
                i();
            } catch (syc e) {
                Socket socket = xnaVar.g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (syc e2) {
            Socket socket2 = this.a.g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.b.b = 5;
            this.d.e();
            throw e2;
        }
    }

    public final void c() {
        synchronized (this.b) {
            int F = ik8.F(this.b.b);
            byte b = 1;
            int i = 4;
            if (F != 0) {
                if (F != 2) {
                    return;
                }
                m09 m09Var = this.b;
                m09Var.b = 4;
                if (m09Var.c == 1) {
                    m09Var.c = 3;
                }
                g(vyc.a(1000, null));
                this.d.e();
                j();
                return;
            }
            qs2 qs2Var = new qs2("FinishThread", this, i, b);
            vh4 vh4Var = qs2Var.a.d;
            if (vh4Var != null) {
                ArrayList arrayList = (ArrayList) vh4Var.s();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    s35 s35Var = (s35) obj;
                    try {
                        try {
                            s35Var.getClass();
                        } catch (Throwable unused) {
                            s35Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            qs2Var.start();
        }
    }

    public final void d() {
        this.e.g();
        this.f.g();
        Socket socket = this.a.g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.b) {
            this.b.b = 5;
        }
        this.d.e();
        vh4 vh4Var = this.d;
        vyc vycVar = this.s;
        vyc vycVar2 = this.t;
        int i = 0;
        boolean z = this.b.c == 2;
        ArrayList arrayList = (ArrayList) vh4Var.s();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            s35 s35Var = (s35) obj;
            try {
                try {
                    s35Var.a((ryc) vh4Var.b, vycVar, vycVar2, z);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                s35Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z;
        synchronized (this.g) {
            this.o = true;
            z = this.p;
        }
        a();
        if (z) {
            f();
        }
    }

    public final void f() {
        ee8 ee8Var = this.e;
        synchronized (ee8Var) {
        }
        ee8Var.e();
        this.f.f();
    }

    public final void finalize() {
        boolean z;
        synchronized (this.b) {
            z = this.b.b == 1;
        }
        if (z) {
            d();
        }
        super.finalize();
    }

    public final void g(vyc vycVar) {
        if (vycVar != null) {
            synchronized (this.b) {
                int i = this.b.b;
                if (i == 3 || i == 4) {
                    m3d m3dVar = this.k;
                    if (m3dVar == null) {
                        return;
                    }
                    m3dVar.e(vycVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0317  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeMap h(Socket socket) {
        int i;
        tyc tycVar;
        tyc tycVar2;
        String str;
        try {
            byte b = 1;
            pi6 pi6Var = new pi6(new BufferedInputStream(socket.getInputStream()), b);
            try {
                wyc wycVar = new wyc(new BufferedOutputStream(socket.getOutputStream()));
                byte[] bArr = new byte[16];
                ig7.a.nextBytes(bArr);
                String a = e31.a(bArr);
                u8a u8aVar = this.c;
                u8aVar.d = a;
                String y = qd4.y("GET ", (String) u8aVar.c, " HTTP/1.1");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new String[]{"Host", (String) u8aVar.b});
                arrayList.add(u8a.f);
                arrayList.add(u8a.h);
                arrayList.add(u8a.n);
                arrayList.add(new String[]{"Sec-WebSocket-Key", (String) u8aVar.d});
                String str2 = (String) u8aVar.a;
                if (str2 != null && str2.length() != 0) {
                    arrayList.add(new String[]{"Authorization", "Basic " + e31.a(ig7.a(str2))});
                }
                StringBuilder l = c00.l(y, "\r\n");
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    String[] strArr = (String[]) obj;
                    l.append(strArr[0]);
                    l.append(": ");
                    l.append(strArr[1]);
                    l.append("\r\n");
                }
                l.append("\r\n");
                String sb = l.toString();
                ArrayList arrayList2 = (ArrayList) this.d.s();
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    s35 s35Var = (s35) obj2;
                    try {
                        try {
                            s35Var.getClass();
                        } catch (Throwable unused) {
                            s35Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                try {
                    wycVar.write(ig7.a(sb));
                    wycVar.flush();
                    aj3 aj3Var = new aj3((Object) this, (byte) 11);
                    try {
                        String b2 = ig7.b(pi6Var);
                        if (b2 == null || b2.length() == 0) {
                            throw new syc(6, "The status line of the opening handshake response is empty.");
                        }
                        try {
                            pi5 pi5Var = new pi5(b2, (byte) 2);
                            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                            StringBuilder sb2 = null;
                            while (true) {
                                try {
                                    String b3 = ig7.b(pi6Var);
                                    if (b3 == null || b3.length() == 0) {
                                        break;
                                    }
                                    char charAt = b3.charAt(0);
                                    if (charAt != ' ' && charAt != '\t') {
                                        if (sb2 != null) {
                                            aj3.b0(sb2.toString(), treeMap);
                                        }
                                        sb2 = new StringBuilder(b3);
                                    } else if (sb2 != null) {
                                        sb2.append(b3.replaceAll("^[ \t]+", " "));
                                    }
                                } catch (IOException e) {
                                    throw new syc(9, "An error occurred while HTTP header section was being read: " + e.getMessage(), e);
                                }
                            }
                            if (sb2 != null) {
                                aj3.b0(sb2.toString(), treeMap);
                            }
                            if (pi5Var.b != 101) {
                                try {
                                    i = Integer.parseInt((String) ((List) treeMap.get("Content-Length")).get(0));
                                } catch (Exception unused3) {
                                    i = -1;
                                }
                                if (i > 0) {
                                    try {
                                        pi6Var.b(i, new byte[i]);
                                    } catch (Throwable unused4) {
                                    }
                                }
                                throw new tt7(8, "The status code of the opening handshake response is not '101 Switching Protocols'. The status line is: " + pi5Var, pi5Var);
                            }
                            List list = (List) treeMap.get("Upgrade");
                            if (list == null || list.size() == 0) {
                                throw new tt7(10, "The opening handshake response does not contain 'Upgrade' header.", pi5Var);
                            }
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String[] split = ((String) it.next()).split("\\s*,\\s*");
                                int length = split.length;
                                int i5 = 0;
                                while (i5 < length) {
                                    if ("websocket".equalsIgnoreCase(split[i5])) {
                                        List list2 = (List) treeMap.get("Connection");
                                        if (list2 == null || list2.size() == 0) {
                                            throw new tt7(12, "The opening handshake response does not contain 'Connection' header.", pi5Var);
                                        }
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            String[] split2 = ((String) it2.next()).split("\\s*,\\s*");
                                            int length2 = split2.length;
                                            int i6 = 0;
                                            while (i6 < length2) {
                                                if ("Upgrade".equalsIgnoreCase(split2[i6])) {
                                                    List list3 = (List) treeMap.get("Sec-WebSocket-Accept");
                                                    if (list3 == null) {
                                                        throw new tt7(14, "The opening handshake response does not contain 'Sec-WebSocket-Accept' header.", pi5Var);
                                                    }
                                                    try {
                                                        if (!e31.a(MessageDigest.getInstance("SHA-1").digest(ig7.a(qd4.o(a, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")))).equals((String) list3.get(0))) {
                                                            throw new tt7(15, "The value of 'Sec-WebSocket-Accept' header is different from the expected one.", pi5Var);
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
                                                                        if (h0f.a(str4)) {
                                                                            if ("permessage-deflate".equals(str4)) {
                                                                                t68 t68Var = new t68(str4);
                                                                                t68Var.c = 32768;
                                                                                tycVar2 = t68Var;
                                                                            } else {
                                                                                tycVar2 = new tyc(str4);
                                                                            }
                                                                            int i7 = b;
                                                                            while (i7 < split4.length) {
                                                                                String[] split5 = split4[i7].split("\\s*=\\s*", 2);
                                                                                if (split5.length != 0 && split5[0].length() != 0) {
                                                                                    String str5 = split5[0];
                                                                                    if (h0f.a(str5)) {
                                                                                        if (split5.length != 2 || (str = split5[b]) == null) {
                                                                                            str = null;
                                                                                        } else {
                                                                                            int length3 = str.length();
                                                                                            if (length3 >= 2 && str.charAt(0) == '\"') {
                                                                                                int i8 = length3 - 1;
                                                                                                if (str.charAt(i8) == '\"') {
                                                                                                    str = str.substring(b, i8);
                                                                                                    if (str.indexOf(92) >= 0) {
                                                                                                        int length4 = str.length();
                                                                                                        StringBuilder sb3 = new StringBuilder();
                                                                                                        boolean z = false;
                                                                                                        for (int i9 = 0; i9 < length4; i9++) {
                                                                                                            char charAt2 = str.charAt(i9);
                                                                                                            if (charAt2 != '\\' || z) {
                                                                                                                sb3.append(charAt2);
                                                                                                                z = false;
                                                                                                            } else {
                                                                                                                z = true;
                                                                                                            }
                                                                                                        }
                                                                                                        str = sb3.toString();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (str == null || h0f.a(str)) {
                                                                                            if (!h0f.a(str5)) {
                                                                                                lq5.j("'key' is not a valid token.");
                                                                                                return null;
                                                                                            }
                                                                                            if (str != null && !h0f.a(str)) {
                                                                                                lq5.j("'value' is not a valid token.");
                                                                                                return null;
                                                                                            }
                                                                                            tycVar2.b.put(str5, str);
                                                                                        }
                                                                                    } else {
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                                i7++;
                                                                                b = 1;
                                                                            }
                                                                            tycVar = tycVar2;
                                                                            if (tycVar != null) {
                                                                                throw new tt7(16, c00.i("The value in 'Sec-WebSocket-Extensions' failed to be parsed: ", str3), pi5Var);
                                                                            }
                                                                            String str6 = tycVar.a;
                                                                            u8a u8aVar2 = ((ryc) aj3Var.b).c;
                                                                            if (str6 == null) {
                                                                                u8aVar2.getClass();
                                                                            }
                                                                            throw new tt7(17, c00.i("The extension contained in the Sec-WebSocket-Extensions header is not supported: ", str6), pi5Var);
                                                                        }
                                                                    }
                                                                }
                                                                tycVar = null;
                                                                if (tycVar != null) {
                                                                }
                                                            }
                                                        }
                                                        int size3 = arrayList3.size();
                                                        tyc tycVar3 = null;
                                                        while (i2 < size3) {
                                                            Object obj3 = arrayList3.get(i2);
                                                            i2++;
                                                            tyc tycVar4 = (tyc) obj3;
                                                            if (tycVar4 instanceof t68) {
                                                                if (tycVar3 != null) {
                                                                    throw new tt7(18, c00.j("'", tycVar3.a, "' extension and '", tycVar4.a, "' extension conflict with each other."), pi5Var);
                                                                }
                                                                tycVar3 = tycVar4;
                                                            }
                                                        }
                                                        ((ryc) aj3Var.b).l = arrayList3;
                                                    }
                                                    aj3Var.j0(pi5Var, treeMap);
                                                    this.h = pi6Var;
                                                    this.i = wycVar;
                                                    return treeMap;
                                                }
                                                i6++;
                                                b = 1;
                                            }
                                        }
                                        throw new tt7(13, "'Upgrade' was not found in 'Connection' header.", pi5Var);
                                    }
                                    i5++;
                                    b = 1;
                                }
                            }
                            throw new tt7(11, "'websocket' was not found in 'Upgrade' header.", pi5Var);
                        } catch (Exception unused6) {
                            throw new syc(7, "The status line of the opening handshake response is badly formatted. The status line is: ".concat(b2));
                        }
                    } catch (IOException e2) {
                        throw new syc(5, "Failed to read an opening handshake response from the server: " + e2.getMessage(), e2);
                    }
                } catch (IOException e3) {
                    throw new syc(4, "Failed to send an opening handshake request to the server: " + e3.getMessage(), e3);
                }
            } catch (IOException e4) {
                throw new syc(3, "Failed to get the output stream from the raw socket: " + e4.getMessage(), e4);
            }
        } catch (IOException e5) {
            throw new syc(2, "Failed to get the input stream of the raw socket: " + e5.getMessage(), e5);
        }
    }

    public final void i() {
        c59 c59Var = new c59(this);
        m3d m3dVar = new m3d(this);
        synchronized (this.g) {
            this.j = c59Var;
            this.k = m3dVar;
        }
        vh4 vh4Var = c59Var.a.d;
        int i = 0;
        if (vh4Var != null) {
            ArrayList arrayList = (ArrayList) vh4Var.s();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                s35 s35Var = (s35) obj;
                try {
                    try {
                        s35Var.getClass();
                    } catch (Throwable unused) {
                        s35Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        vh4 vh4Var2 = m3dVar.a.d;
        if (vh4Var2 != null) {
            ArrayList arrayList2 = (ArrayList) vh4Var2.s();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                s35 s35Var2 = (s35) obj2;
                try {
                    try {
                        s35Var2.getClass();
                    } catch (Throwable unused3) {
                        s35Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        c59Var.start();
        m3dVar.start();
    }

    public final void j() {
        c59 c59Var;
        m3d m3dVar;
        synchronized (this.g) {
            c59Var = this.j;
            m3dVar = this.k;
            this.j = null;
            this.k = null;
        }
        if (c59Var != null) {
            c59Var.h();
        }
        if (m3dVar != null) {
            m3dVar.f();
        }
    }
}
