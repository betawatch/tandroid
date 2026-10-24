package tc;

import b2.u0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.ui.Wallet.y0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class q extends z {
    public boolean b;
    public x c;
    public final ArrayList d;
    public final o e;
    public final Object f;
    public Timer h;
    public e6.r n;
    public long r;
    public boolean s;

    public q(u uVar) {
        super("ReadingThread", uVar, 1);
        this.d = new ArrayList();
        this.f = new Object();
        this.e = uVar.u;
    }

    @Override // tc.z
    public final void a() {
        try {
            h();
        } catch (Throwable th2) {
            v vVar = new v(38, "An uncaught throwable was detected in the reading thread: " + th2.getMessage(), th2);
            c2.b bVar = this.a.d;
            bVar.d(vVar);
            ArrayList arrayList = (ArrayList) bVar.n();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                y0 y0Var = (y0) obj;
                try {
                    try {
                        y0Var.getClass();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    y0Var.getClass();
                }
            }
        }
        u uVar = this.a;
        x xVar = this.c;
        synchronized (uVar.g) {
            try {
                uVar.q = true;
                uVar.s = xVar;
                if (uVar.r) {
                    uVar.d();
                }
            } finally {
            }
        }
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.a.d.n();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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

    public final void c(byte[] bArr) {
        u uVar = this.a;
        uVar.getClass();
        c2.b bVar = uVar.d;
        int i10 = 0;
        try {
            SecureRandom secureRandom = k.a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            ArrayList arrayList = (ArrayList) bVar.n();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                y0 y0Var = (y0) obj;
                try {
                    try {
                        y0Var.b((u) bVar.b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    y0Var.getClass();
                }
            }
        } catch (Throwable th2) {
            uVar.d.d(new v(37, "Failed to convert payload data into a string: " + th2.getMessage(), th2));
            ArrayList arrayList2 = (ArrayList) bVar.n();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                y0 y0Var2 = (y0) obj2;
                try {
                    try {
                        y0Var2.getClass();
                    } catch (Throwable unused4) {
                        y0Var2.getClass();
                    }
                } catch (Throwable unused5) {
                }
            }
        }
    }

    public final void d() {
        synchronized (this.f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            e6.r rVar = this.n;
            if (rVar != null) {
                rVar.cancel();
                this.n = null;
            }
        }
    }

    public final byte[] f(byte[] bArr) {
        try {
            return this.e.c(bArr);
        } catch (v e) {
            u uVar = this.a;
            uVar.d.d(e);
            ArrayList arrayList = (ArrayList) uVar.d.n();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
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
            uVar.g(x.a(1003, e.getMessage()));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(x xVar) {
        int size;
        int i10;
        byte[] bArr;
        byte[] f7;
        ArrayList arrayList = (ArrayList) this.a.d.n();
        int size2 = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size2) {
            Object obj = arrayList.get(i12);
            i12++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    y0Var.getClass();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                y0Var.getClass();
            }
        }
        int i13 = xVar.e;
        boolean z10 = true;
        if (i13 == 0) {
            ArrayList arrayList2 = this.d;
            u uVar = this.a;
            ArrayList arrayList3 = (ArrayList) uVar.d.n();
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj2 = arrayList3.get(i14);
                i14++;
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
            arrayList2.add(xVar);
            if (xVar.a) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int size4 = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size4) {
                        Object obj3 = arrayList2.get(i15);
                        i15++;
                        byte[] bArr2 = ((x) obj3).g;
                        if (bArr2 != null && bArr2.length != 0) {
                            byteArrayOutputStream.write(bArr2);
                        }
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (IOException e) {
                    e = e;
                    v vVar = new v(36, "Failed to concatenate payloads of multiple frames to construct a message: " + e.getMessage(), e);
                    this.a.d.d(vVar);
                    ArrayList arrayList4 = (ArrayList) uVar.d.n();
                    size = arrayList4.size();
                    i10 = 0;
                    while (i10 < size) {
                        Object obj4 = arrayList4.get(i10);
                        i10++;
                        y0 y0Var3 = (y0) obj4;
                        try {
                            try {
                                y0Var3.getClass();
                            } catch (Throwable unused5) {
                            }
                        } catch (Throwable unused6) {
                            y0Var3.getClass();
                        }
                    }
                    uVar.g(x.a(1009, vVar.getMessage()));
                    bArr = null;
                    if (bArr != null) {
                    }
                    if (f7 == null) {
                    }
                } catch (OutOfMemoryError e7) {
                    e = e7;
                    v vVar2 = new v(36, "Failed to concatenate payloads of multiple frames to construct a message: " + e.getMessage(), e);
                    this.a.d.d(vVar2);
                    ArrayList arrayList42 = (ArrayList) uVar.d.n();
                    size = arrayList42.size();
                    i10 = 0;
                    while (i10 < size) {
                    }
                    uVar.g(x.a(1009, vVar2.getMessage()));
                    bArr = null;
                    if (bArr != null) {
                    }
                    if (f7 == null) {
                    }
                }
                f7 = bArr != null ? (this.e == null || !((x) arrayList2.get(0)).b) ? bArr : f(bArr) : null;
                if (f7 == null) {
                    return false;
                }
                if (((x) arrayList2.get(0)).e == 1) {
                    c(f7);
                } else {
                    b();
                }
                arrayList2.clear();
            }
            return true;
        }
        if (i13 == 1) {
            ArrayList arrayList5 = (ArrayList) this.a.d.n();
            int size5 = arrayList5.size();
            while (i11 < size5) {
                Object obj5 = arrayList5.get(i11);
                i11++;
                y0 y0Var4 = (y0) obj5;
                try {
                    try {
                        y0Var4.getClass();
                    } catch (Throwable unused7) {
                        y0Var4.getClass();
                    }
                } catch (Throwable unused8) {
                }
            }
            if (xVar.a) {
                byte[] bArr3 = xVar.g;
                if (this.e != null && xVar.b) {
                    bArr3 = f(bArr3);
                }
                c(bArr3);
            } else {
                this.d.add(xVar);
            }
        } else if (i13 != 2) {
            switch (i13) {
                case 8:
                    u0 u0Var = this.a.b;
                    this.c = xVar;
                    synchronized (u0Var) {
                        try {
                            int i16 = u0Var.a;
                            if (i16 == 4 || i16 == 5) {
                                z10 = false;
                            } else {
                                u0Var.a = 4;
                                if (u0Var.b == 1) {
                                    u0Var.b = 2;
                                }
                                this.a.g(xVar);
                            }
                        } finally {
                        }
                    }
                    if (z10) {
                        this.a.d.e();
                    }
                    ArrayList arrayList6 = (ArrayList) this.a.d.n();
                    int size6 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size6) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        y0 y0Var5 = (y0) obj6;
                        try {
                            try {
                                y0Var5.getClass();
                            } catch (Throwable unused9) {
                                y0Var5.getClass();
                            }
                        } catch (Throwable unused10) {
                        }
                    }
                    return false;
                case 9:
                    u uVar2 = this.a;
                    ArrayList arrayList7 = (ArrayList) uVar2.d.n();
                    int size7 = arrayList7.size();
                    while (i11 < size7) {
                        Object obj7 = arrayList7.get(i11);
                        i11++;
                        y0 y0Var6 = (y0) obj7;
                        try {
                            try {
                                y0Var6.getClass();
                            } catch (Throwable unused11) {
                                y0Var6.getClass();
                            }
                        } catch (Throwable unused12) {
                        }
                    }
                    byte[] bArr4 = xVar.g;
                    x xVar2 = new x();
                    xVar2.a = true;
                    xVar2.e = 10;
                    xVar2.c(bArr4);
                    uVar2.g(xVar2);
                    return true;
                case 10:
                    ArrayList arrayList8 = (ArrayList) this.a.d.n();
                    int size8 = arrayList8.size();
                    while (i11 < size8) {
                        Object obj8 = arrayList8.get(i11);
                        i11++;
                        y0 y0Var7 = (y0) obj8;
                        try {
                            try {
                                y0Var7.getClass();
                            } catch (Throwable unused13) {
                                y0Var7.getClass();
                            }
                        } catch (Throwable unused14) {
                        }
                    }
                default:
                    return true;
            }
        } else {
            ArrayList arrayList9 = (ArrayList) this.a.d.n();
            int size9 = arrayList9.size();
            while (i11 < size9) {
                Object obj9 = arrayList9.get(i11);
                i11++;
                y0 y0Var8 = (y0) obj9;
                try {
                    try {
                        y0Var8.getClass();
                    } catch (Throwable unused15) {
                    }
                } catch (Throwable unused16) {
                    y0Var8.getClass();
                }
            }
            if (xVar.a) {
                byte[] bArr5 = xVar.g;
                if (this.e != null && xVar.b) {
                    f(bArr5);
                }
                b();
            } else {
                this.d.add(xVar);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        v vVar;
        int c10;
        this.a.e();
        while (true) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        u uVar = this.a;
                        x xVar = null;
                        try {
                            x c11 = uVar.h.c();
                            k(c11);
                            xVar = c11;
                        } catch (InterruptedIOException e) {
                            if (!this.b) {
                                vVar = new v(24, "Interruption occurred while a frame was being read from the web socket: " + e.getMessage(), e);
                                e = vVar;
                                if (e instanceof l) {
                                    this.s = true;
                                    uVar.getClass();
                                } else {
                                    this.a.d.d(e);
                                    ArrayList arrayList = (ArrayList) uVar.d.n();
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    while (i10 < size) {
                                        Object obj = arrayList.get(i10);
                                        i10++;
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
                                c10 = m1.j.c(e.a);
                                int i11 = 1002;
                                if (c10 != 47) {
                                    switch (c10) {
                                        case 19:
                                        case 20:
                                            break;
                                        case 21:
                                        case 22:
                                            i11 = 1009;
                                            break;
                                        default:
                                            switch (c10) {
                                            }
                                        case 23:
                                        case 24:
                                            i11 = 1008;
                                            break;
                                    }
                                }
                                uVar.g(x.a(i11, e.getMessage()));
                            }
                        } catch (IOException e7) {
                            if (!this.b || !isInterrupted()) {
                                vVar = new v(25, "An I/O error occurred while a frame was being read from the web socket: " + e7.getMessage(), e7);
                                e = vVar;
                                if (e instanceof l) {
                                }
                                c10 = m1.j.c(e.a);
                                int i112 = 1002;
                                if (c10 != 47) {
                                }
                                uVar.g(x.a(i112, e.getMessage()));
                            }
                        } catch (v e10) {
                            e = e10;
                            if (e instanceof l) {
                            }
                            c10 = m1.j.c(e.a);
                            int i1122 = 1002;
                            if (c10 != 47) {
                            }
                            uVar.g(x.a(i1122, e.getMessage()));
                        }
                        if (xVar != null && g(xVar)) {
                        }
                    }
                } finally {
                }
            }
        }
        if (!this.s && this.c == null) {
            j();
            while (true) {
                try {
                    x c12 = this.a.h.c();
                    if (c12.e == 8) {
                        this.c = c12;
                    } else if (isInterrupted()) {
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        d();
    }

    public final void i() {
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                interrupt();
                this.r = 10000L;
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        synchronized (this.f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            e6.r rVar = this.n;
            if (rVar != null) {
                rVar.cancel();
                this.n = null;
            }
            this.n = new e6.r(this, 5);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.n, this.r);
        }
    }

    public final void k(x xVar) {
        byte[] bArr;
        int i10;
        this.a.getClass();
        if ((this.e == null || !((i10 = xVar.e) == 1 || i10 == 2)) && xVar.b) {
            throw new v(29, "The RSV1 bit of a frame is set unexpectedly.");
        }
        if (xVar.c) {
            throw new v(29, "The RSV2 bit of a frame is set unexpectedly.");
        }
        if (xVar.d) {
            throw new v(29, "The RSV3 bit of a frame is set unexpectedly.");
        }
        int i11 = xVar.e;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            switch (i11) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new v(31, "A frame has an unknown opcode: 0x" + Integer.toHexString(xVar.e));
            }
        }
        if (xVar.f) {
            throw new v(30, "A frame from the server is masked.");
        }
        if (8 > i11 || i11 > 15) {
            boolean z10 = this.d.size() != 0;
            if (xVar.e == 0) {
                if (!z10) {
                    throw new v(33, "A continuation frame was detected although a continuation had not started.");
                }
            } else if (z10) {
                throw new v(34, "A non-control frame was detected although the existing continuation had not been closed.");
            }
        } else if (!xVar.a) {
            throw new v(32, "A control frame is fragmented.");
        }
        int i12 = xVar.e;
        if (8 > i12 || i12 > 15 || (bArr = xVar.g) == null || 125 >= bArr.length) {
            return;
        }
        throw new v(35, "The payload size of a control frame exceeds the maximum size (125 bytes): " + bArr.length);
    }
}
