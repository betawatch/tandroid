package rc;

import e2.r0;
import fi.h2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.ui.Wallet.z0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class q extends z {
    public boolean b;
    public x c;
    public final ArrayList d;
    public final o e;
    public final Object f;
    public Timer h;
    public h2 n;
    public long r;
    public boolean s;

    public q(u uVar) {
        super("ReadingThread", uVar, 1);
        this.d = new ArrayList();
        this.f = new Object();
        this.e = uVar.u;
    }

    @Override // rc.z
    public final void a() {
        try {
            h();
        } catch (Throwable th2) {
            v vVar = new v(38, "An uncaught throwable was detected in the reading thread: " + th2.getMessage(), th2);
            ab.q qVar = this.a.d;
            qVar.d(vVar);
            ArrayList arrayList = (ArrayList) qVar.p();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                z0 z0Var = (z0) obj;
                try {
                    try {
                        z0Var.getClass();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    z0Var.getClass();
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
        ArrayList arrayList = (ArrayList) this.a.d.p();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            z0 z0Var = (z0) obj;
            try {
                try {
                    z0Var.getClass();
                } catch (Throwable unused) {
                    z0Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public final void c(byte[] bArr) {
        u uVar = this.a;
        uVar.getClass();
        ab.q qVar = uVar.d;
        int i7 = 0;
        try {
            SecureRandom secureRandom = k.a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            ArrayList arrayList = (ArrayList) qVar.p();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                z0 z0Var = (z0) obj;
                try {
                    try {
                        z0Var.b((u) qVar.b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    z0Var.getClass();
                }
            }
        } catch (Throwable th2) {
            uVar.d.d(new v(37, "Failed to convert payload data into a string: " + th2.getMessage(), th2));
            ArrayList arrayList2 = (ArrayList) qVar.p();
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                z0 z0Var2 = (z0) obj2;
                try {
                    try {
                        z0Var2.getClass();
                    } catch (Throwable unused4) {
                        z0Var2.getClass();
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
            h2 h2Var = this.n;
            if (h2Var != null) {
                h2Var.cancel();
                this.n = null;
            }
        }
    }

    public final byte[] f(byte[] bArr) {
        try {
            return this.e.c(bArr);
        } catch (v e10) {
            u uVar = this.a;
            uVar.d.d(e10);
            ArrayList arrayList = (ArrayList) uVar.d.p();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                z0 z0Var = (z0) obj;
                try {
                    try {
                        z0Var.getClass();
                    } catch (Throwable unused) {
                        z0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
            uVar.g(x.a(1003, e10.getMessage()));
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
        int i7;
        byte[] bArr;
        byte[] f10;
        ArrayList arrayList = (ArrayList) this.a.d.p();
        int size2 = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            z0 z0Var = (z0) obj;
            try {
                try {
                    z0Var.getClass();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z0Var.getClass();
            }
        }
        int i12 = xVar.e;
        boolean z9 = true;
        if (i12 == 0) {
            ArrayList arrayList2 = this.d;
            u uVar = this.a;
            ArrayList arrayList3 = (ArrayList) uVar.d.p();
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj2 = arrayList3.get(i13);
                i13++;
                z0 z0Var2 = (z0) obj2;
                try {
                    try {
                        z0Var2.getClass();
                    } catch (Throwable unused3) {
                        z0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
            arrayList2.add(xVar);
            if (xVar.a) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int size4 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size4) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        byte[] bArr2 = ((x) obj3).g;
                        if (bArr2 != null && bArr2.length != 0) {
                            byteArrayOutputStream.write(bArr2);
                        }
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (IOException e10) {
                    e = e10;
                    v vVar = new v(36, "Failed to concatenate payloads of multiple frames to construct a message: " + e.getMessage(), e);
                    this.a.d.d(vVar);
                    ArrayList arrayList4 = (ArrayList) uVar.d.p();
                    size = arrayList4.size();
                    i7 = 0;
                    while (i7 < size) {
                        Object obj4 = arrayList4.get(i7);
                        i7++;
                        z0 z0Var3 = (z0) obj4;
                        try {
                            try {
                                z0Var3.getClass();
                            } catch (Throwable unused5) {
                            }
                        } catch (Throwable unused6) {
                            z0Var3.getClass();
                        }
                    }
                    uVar.g(x.a(1009, vVar.getMessage()));
                    bArr = null;
                    if (bArr != null) {
                    }
                    if (f10 == null) {
                    }
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    v vVar2 = new v(36, "Failed to concatenate payloads of multiple frames to construct a message: " + e.getMessage(), e);
                    this.a.d.d(vVar2);
                    ArrayList arrayList42 = (ArrayList) uVar.d.p();
                    size = arrayList42.size();
                    i7 = 0;
                    while (i7 < size) {
                    }
                    uVar.g(x.a(1009, vVar2.getMessage()));
                    bArr = null;
                    if (bArr != null) {
                    }
                    if (f10 == null) {
                    }
                }
                f10 = bArr != null ? (this.e == null || !((x) arrayList2.get(0)).b) ? bArr : f(bArr) : null;
                if (f10 == null) {
                    return false;
                }
                if (((x) arrayList2.get(0)).e == 1) {
                    c(f10);
                } else {
                    b();
                }
                arrayList2.clear();
            }
            return true;
        }
        if (i12 == 1) {
            ArrayList arrayList5 = (ArrayList) this.a.d.p();
            int size5 = arrayList5.size();
            while (i10 < size5) {
                Object obj5 = arrayList5.get(i10);
                i10++;
                z0 z0Var4 = (z0) obj5;
                try {
                    try {
                        z0Var4.getClass();
                    } catch (Throwable unused7) {
                        z0Var4.getClass();
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
        } else if (i12 != 2) {
            switch (i12) {
                case 8:
                    r0 r0Var = this.a.b;
                    this.c = xVar;
                    synchronized (r0Var) {
                        try {
                            int i15 = r0Var.a;
                            if (i15 == 4 || i15 == 5) {
                                z9 = false;
                            } else {
                                r0Var.a = 4;
                                if (r0Var.b == 1) {
                                    r0Var.b = 2;
                                }
                                this.a.g(xVar);
                            }
                        } finally {
                        }
                    }
                    if (z9) {
                        this.a.d.g();
                    }
                    ArrayList arrayList6 = (ArrayList) this.a.d.p();
                    int size6 = arrayList6.size();
                    int i16 = 0;
                    while (i16 < size6) {
                        Object obj6 = arrayList6.get(i16);
                        i16++;
                        z0 z0Var5 = (z0) obj6;
                        try {
                            try {
                                z0Var5.getClass();
                            } catch (Throwable unused9) {
                                z0Var5.getClass();
                            }
                        } catch (Throwable unused10) {
                        }
                    }
                    return false;
                case 9:
                    u uVar2 = this.a;
                    ArrayList arrayList7 = (ArrayList) uVar2.d.p();
                    int size7 = arrayList7.size();
                    while (i10 < size7) {
                        Object obj7 = arrayList7.get(i10);
                        i10++;
                        z0 z0Var6 = (z0) obj7;
                        try {
                            try {
                                z0Var6.getClass();
                            } catch (Throwable unused11) {
                                z0Var6.getClass();
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
                    ArrayList arrayList8 = (ArrayList) this.a.d.p();
                    int size8 = arrayList8.size();
                    while (i10 < size8) {
                        Object obj8 = arrayList8.get(i10);
                        i10++;
                        z0 z0Var7 = (z0) obj8;
                        try {
                            try {
                                z0Var7.getClass();
                            } catch (Throwable unused13) {
                                z0Var7.getClass();
                            }
                        } catch (Throwable unused14) {
                        }
                    }
                default:
                    return true;
            }
        } else {
            ArrayList arrayList9 = (ArrayList) this.a.d.p();
            int size9 = arrayList9.size();
            while (i10 < size9) {
                Object obj9 = arrayList9.get(i10);
                i10++;
                z0 z0Var8 = (z0) obj9;
                try {
                    try {
                        z0Var8.getClass();
                    } catch (Throwable unused15) {
                    }
                } catch (Throwable unused16) {
                    z0Var8.getClass();
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
                        } catch (InterruptedIOException e10) {
                            if (!this.b) {
                                vVar = new v(24, "Interruption occurred while a frame was being read from the web socket: " + e10.getMessage(), e10);
                                e = vVar;
                                if (e instanceof l) {
                                    this.s = true;
                                    uVar.getClass();
                                } else {
                                    this.a.d.d(e);
                                    ArrayList arrayList = (ArrayList) uVar.d.p();
                                    int size = arrayList.size();
                                    int i7 = 0;
                                    while (i7 < size) {
                                        Object obj = arrayList.get(i7);
                                        i7++;
                                        z0 z0Var = (z0) obj;
                                        try {
                                            try {
                                                z0Var.getClass();
                                            } catch (Throwable unused) {
                                                z0Var.getClass();
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                }
                                c10 = p1.g.c(e.a);
                                int i10 = 1002;
                                if (c10 != 47) {
                                    switch (c10) {
                                        case 19:
                                        case 20:
                                            break;
                                        case 21:
                                        case 22:
                                            i10 = 1009;
                                            break;
                                        default:
                                            switch (c10) {
                                            }
                                        case 23:
                                        case 24:
                                            i10 = 1008;
                                            break;
                                    }
                                }
                                uVar.g(x.a(i10, e.getMessage()));
                            }
                        } catch (IOException e11) {
                            if (!this.b || !isInterrupted()) {
                                vVar = new v(25, "An I/O error occurred while a frame was being read from the web socket: " + e11.getMessage(), e11);
                                e = vVar;
                                if (e instanceof l) {
                                }
                                c10 = p1.g.c(e.a);
                                int i102 = 1002;
                                if (c10 != 47) {
                                }
                                uVar.g(x.a(i102, e.getMessage()));
                            }
                        } catch (v e12) {
                            e = e12;
                            if (e instanceof l) {
                            }
                            c10 = p1.g.c(e.a);
                            int i1022 = 1002;
                            if (c10 != 47) {
                            }
                            uVar.g(x.a(i1022, e.getMessage()));
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
            h2 h2Var = this.n;
            if (h2Var != null) {
                h2Var.cancel();
                this.n = null;
            }
            this.n = new h2(this, 5);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.n, this.r);
        }
    }

    public final void k(x xVar) {
        byte[] bArr;
        int i7;
        this.a.getClass();
        if ((this.e == null || !((i7 = xVar.e) == 1 || i7 == 2)) && xVar.b) {
            throw new v(29, "The RSV1 bit of a frame is set unexpectedly.");
        }
        if (xVar.c) {
            throw new v(29, "The RSV2 bit of a frame is set unexpectedly.");
        }
        if (xVar.d) {
            throw new v(29, "The RSV3 bit of a frame is set unexpectedly.");
        }
        int i10 = xVar.e;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            switch (i10) {
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
        if (8 > i10 || i10 > 15) {
            boolean z9 = this.d.size() != 0;
            if (xVar.e == 0) {
                if (!z9) {
                    throw new v(33, "A continuation frame was detected although a continuation had not started.");
                }
            } else if (z9) {
                throw new v(34, "A non-control frame was detected although the existing continuation had not been closed.");
            }
        } else if (!xVar.a) {
            throw new v(32, "A control frame is fragmented.");
        }
        int i11 = xVar.e;
        if (8 > i11 || i11 > 15 || (bArr = xVar.g) == null || 125 >= bArr.length) {
            return;
        }
        throw new v(35, "The payload size of a control frame exceeds the maximum size (125 bytes): " + bArr.length);
    }
}
