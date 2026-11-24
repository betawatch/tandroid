// default package

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q39 extends iwc {
    public boolean b;
    public gwc c;
    public final ArrayList d;
    public final f58 e;
    public final Object f;
    public Timer h;
    public lx3 n;
    public short r;
    public boolean s;

    public q39(cwc cwcVar) {
        super("ReadingThread", cwcVar, 1);
        this.d = new ArrayList();
        this.f = new Object();
        this.e = cwcVar.u;
    }

    @Override // iwc
    public final void a() {
        try {
            g();
        } catch (Throwable th) {
            dwc dwcVar = new dwc(38, "An uncaught throwable was detected in the reading thread: " + th.getMessage(), th);
            yh4 yh4Var = this.a.d;
            yh4Var.f(dwcVar);
            ArrayList arrayList = (ArrayList) yh4Var.u();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o35 o35Var = (o35) obj;
                try {
                    try {
                        o35Var.getClass();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    o35Var.getClass();
                }
            }
        }
        cwc cwcVar = this.a;
        gwc gwcVar = this.c;
        synchronized (cwcVar.g) {
            cwcVar.q = true;
            cwcVar.s = gwcVar;
            if (cwcVar.r) {
                cwcVar.d();
            }
        }
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.a.d.u();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o35 o35Var = (o35) obj;
            try {
                try {
                    o35Var.getClass();
                } catch (Throwable unused) {
                    o35Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public final void c(byte[] bArr) {
        cwc cwcVar = this.a;
        cwcVar.getClass();
        yh4 yh4Var = cwcVar.d;
        int i = 0;
        try {
            SecureRandom secureRandom = ag7.a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            ArrayList arrayList = (ArrayList) yh4Var.u();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                o35 o35Var = (o35) obj;
                try {
                    try {
                        o35Var.b((cwc) yh4Var.b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    o35Var.getClass();
                }
            }
        } catch (Throwable th) {
            cwcVar.d.f(new dwc(37, "Failed to convert payload data into a string: " + th.getMessage(), th));
            ArrayList arrayList2 = (ArrayList) yh4Var.u();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                o35 o35Var2 = (o35) obj2;
                try {
                    try {
                        o35Var2.getClass();
                    } catch (Throwable unused4) {
                    }
                } catch (Throwable unused5) {
                    o35Var2.getClass();
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
            lx3 lx3Var = this.n;
            if (lx3Var != null) {
                lx3Var.cancel();
                this.n = null;
            }
        }
    }

    public final byte[] e(byte[] bArr) {
        try {
            return this.e.c(bArr);
        } catch (dwc e) {
            cwc cwcVar = this.a;
            cwcVar.d.f(e);
            ArrayList arrayList = (ArrayList) cwcVar.d.u();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o35 o35Var = (o35) obj;
                try {
                    try {
                        o35Var.getClass();
                    } catch (Throwable unused) {
                        o35Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
            cwcVar.g(gwc.a(1003, e.getMessage()));
            return null;
        }
    }

    public final boolean f(gwc gwcVar) {
        byte[] bArr;
        ArrayList arrayList = (ArrayList) this.a.d.u();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            o35 o35Var = (o35) obj;
            try {
                try {
                    o35Var.getClass();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                o35Var.getClass();
            }
        }
        int i3 = gwcVar.e;
        boolean z = true;
        if (i3 == 0) {
            ArrayList arrayList2 = this.d;
            cwc cwcVar = this.a;
            ArrayList arrayList3 = (ArrayList) cwcVar.d.u();
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                o35 o35Var2 = (o35) obj2;
                try {
                    try {
                        o35Var2.getClass();
                    } catch (Throwable unused3) {
                        o35Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
            arrayList2.add(gwcVar);
            if (gwcVar.a) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int size3 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj3 = arrayList2.get(i5);
                        i5++;
                        byte[] bArr2 = ((gwc) obj3).g;
                        if (bArr2 != null && bArr2.length != 0) {
                            byteArrayOutputStream.write(bArr2);
                        }
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (IOException | OutOfMemoryError e) {
                    dwc dwcVar = new dwc(36, "Failed to concatenate payloads of multiple frames to construct a message: " + e.getMessage(), e);
                    this.a.d.f(dwcVar);
                    ArrayList arrayList4 = (ArrayList) cwcVar.d.u();
                    int size4 = arrayList4.size();
                    int i6 = 0;
                    while (i6 < size4) {
                        Object obj4 = arrayList4.get(i6);
                        i6++;
                        o35 o35Var3 = (o35) obj4;
                        try {
                            try {
                                o35Var3.getClass();
                            } catch (Throwable unused5) {
                            }
                        } catch (Throwable unused6) {
                            o35Var3.getClass();
                        }
                    }
                    cwcVar.g(gwc.a(1009, dwcVar.getMessage()));
                    bArr = null;
                }
                byte[] e2 = bArr != null ? (this.e == null || !((gwc) arrayList2.get(0)).b) ? bArr : e(bArr) : null;
                if (e2 == null) {
                    return false;
                }
                if (((gwc) arrayList2.get(0)).e == 1) {
                    c(e2);
                } else {
                    b();
                }
                arrayList2.clear();
            }
            return true;
        }
        if (i3 == 1) {
            ArrayList arrayList5 = (ArrayList) this.a.d.u();
            int size5 = arrayList5.size();
            while (i < size5) {
                Object obj5 = arrayList5.get(i);
                i++;
                o35 o35Var4 = (o35) obj5;
                try {
                    try {
                        o35Var4.getClass();
                    } catch (Throwable unused7) {
                        o35Var4.getClass();
                    }
                } catch (Throwable unused8) {
                }
            }
            if (gwcVar.a) {
                byte[] bArr3 = gwcVar.g;
                if (this.e != null && gwcVar.b) {
                    bArr3 = e(bArr3);
                }
                c(bArr3);
            } else {
                this.d.add(gwcVar);
            }
        } else if (i3 != 2) {
            switch (i3) {
                case 8:
                    az8 az8Var = this.a.b;
                    this.c = gwcVar;
                    synchronized (az8Var) {
                        int i7 = az8Var.b;
                        if (i7 == 4 || i7 == 5) {
                            z = false;
                        } else {
                            az8Var.b = 4;
                            if (az8Var.c == 1) {
                                az8Var.c = 2;
                            }
                            this.a.g(gwcVar);
                        }
                    }
                    if (z) {
                        this.a.d.g();
                    }
                    ArrayList arrayList6 = (ArrayList) this.a.d.u();
                    int size6 = arrayList6.size();
                    int i8 = 0;
                    while (i8 < size6) {
                        Object obj6 = arrayList6.get(i8);
                        i8++;
                        o35 o35Var5 = (o35) obj6;
                        try {
                            try {
                                o35Var5.getClass();
                            } catch (Throwable unused9) {
                                o35Var5.getClass();
                            }
                        } catch (Throwable unused10) {
                        }
                    }
                    return false;
                case 9:
                    cwc cwcVar2 = this.a;
                    ArrayList arrayList7 = (ArrayList) cwcVar2.d.u();
                    int size7 = arrayList7.size();
                    while (i < size7) {
                        Object obj7 = arrayList7.get(i);
                        i++;
                        o35 o35Var6 = (o35) obj7;
                        try {
                            try {
                                o35Var6.getClass();
                            } catch (Throwable unused11) {
                                o35Var6.getClass();
                            }
                        } catch (Throwable unused12) {
                        }
                    }
                    byte[] bArr4 = gwcVar.g;
                    gwc gwcVar2 = new gwc();
                    gwcVar2.a = true;
                    gwcVar2.e = 10;
                    gwcVar2.c(bArr4);
                    cwcVar2.g(gwcVar2);
                    return true;
                case 10:
                    ArrayList arrayList8 = (ArrayList) this.a.d.u();
                    int size8 = arrayList8.size();
                    while (i < size8) {
                        Object obj8 = arrayList8.get(i);
                        i++;
                        o35 o35Var7 = (o35) obj8;
                        try {
                            try {
                                o35Var7.getClass();
                            } catch (Throwable unused13) {
                                o35Var7.getClass();
                            }
                        } catch (Throwable unused14) {
                        }
                    }
                default:
                    return true;
            }
        } else {
            ArrayList arrayList9 = (ArrayList) this.a.d.u();
            int size9 = arrayList9.size();
            while (i < size9) {
                Object obj9 = arrayList9.get(i);
                i++;
                o35 o35Var8 = (o35) obj9;
                try {
                    try {
                        o35Var8.getClass();
                    } catch (Throwable unused15) {
                    }
                } catch (Throwable unused16) {
                    o35Var8.getClass();
                }
            }
            if (gwcVar.a) {
                byte[] bArr5 = gwcVar.g;
                if (this.e != null && gwcVar.b) {
                    e(bArr5);
                }
                b();
            } else {
                this.d.add(gwcVar);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        dwc dwcVar;
        dwc e;
        int F;
        this.a.e();
        while (true) {
            synchronized (this) {
                if (!this.b) {
                    cwc cwcVar = this.a;
                    gwc gwcVar = null;
                    try {
                        gwc c = cwcVar.h.c();
                        j(c);
                        gwcVar = c;
                    } catch (dwc e2) {
                        e = e2;
                        if (e instanceof tl7) {
                            this.s = true;
                            cwcVar.getClass();
                        } else {
                            this.a.d.f(e);
                            ArrayList arrayList = (ArrayList) cwcVar.d.u();
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                o35 o35Var = (o35) obj;
                                try {
                                    try {
                                        o35Var.getClass();
                                    } catch (Throwable unused) {
                                        o35Var.getClass();
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                        F = wi8.F(e.a);
                        int i2 = 1002;
                        if (F != 47) {
                            switch (F) {
                                case 19:
                                case 20:
                                    break;
                                case 21:
                                case 22:
                                    i2 = 1009;
                                    break;
                                default:
                                    switch (F) {
                                    }
                                case 23:
                                case 24:
                                    i2 = 1008;
                                    break;
                            }
                        }
                        cwcVar.g(gwc.a(i2, e.getMessage()));
                    } catch (InterruptedIOException e3) {
                        if (!this.b) {
                            dwcVar = new dwc(24, "Interruption occurred while a frame was being read from the web socket: " + e3.getMessage(), e3);
                            e = dwcVar;
                            if (e instanceof tl7) {
                            }
                            F = wi8.F(e.a);
                            int i22 = 1002;
                            if (F != 47) {
                            }
                            cwcVar.g(gwc.a(i22, e.getMessage()));
                        }
                    } catch (IOException e4) {
                        if (!this.b || !isInterrupted()) {
                            dwcVar = new dwc(25, "An I/O error occurred while a frame was being read from the web socket: " + e4.getMessage(), e4);
                            e = dwcVar;
                            if (e instanceof tl7) {
                            }
                            F = wi8.F(e.a);
                            int i222 = 1002;
                            if (F != 47) {
                            }
                            cwcVar.g(gwc.a(i222, e.getMessage()));
                        }
                    }
                    if (gwcVar != null && f(gwcVar)) {
                    }
                }
            }
        }
        if (!this.s && this.c == null) {
            i();
            while (true) {
                try {
                    gwc c2 = this.a.h.c();
                    if (c2.e == 8) {
                        this.c = c2;
                    } else if (isInterrupted()) {
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        d();
    }

    public final void h() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            interrupt();
            this.r = (short) 10000;
            i();
        }
    }

    public final void i() {
        synchronized (this.f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            lx3 lx3Var = this.n;
            if (lx3Var != null) {
                lx3Var.cancel();
                this.n = null;
            }
            this.n = new lx3(this, (byte) 3);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.n, this.r);
        }
    }

    public final void j(gwc gwcVar) {
        byte[] bArr;
        int i;
        this.a.getClass();
        if ((this.e == null || !((i = gwcVar.e) == 1 || i == 2)) && gwcVar.b) {
            throw new dwc(29, "The RSV1 bit of a frame is set unexpectedly.");
        }
        if (gwcVar.c) {
            throw new dwc(29, "The RSV2 bit of a frame is set unexpectedly.");
        }
        if (gwcVar.d) {
            throw new dwc(29, "The RSV3 bit of a frame is set unexpectedly.");
        }
        int i2 = gwcVar.e;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            switch (i2) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new dwc(31, "A frame has an unknown opcode: 0x" + Integer.toHexString(gwcVar.e));
            }
        }
        if (gwcVar.f) {
            throw new dwc(30, "A frame from the server is masked.");
        }
        if (8 > i2 || i2 > 15) {
            boolean z = this.d.size() != 0;
            i2 = gwcVar.e;
            if (i2 == 0) {
                if (!z) {
                    throw new dwc(33, "A continuation frame was detected although a continuation had not started.");
                }
            } else if (z) {
                throw new dwc(34, "A non-control frame was detected although the existing continuation had not been closed.");
            }
        } else if (!gwcVar.a) {
            throw new dwc(32, "A control frame is fragmented.");
        }
        if (8 > i2 || i2 > 15 || (bArr = gwcVar.g) == null || 125 >= bArr.length) {
            return;
        }
        throw new dwc(35, "The payload size of a control frame exceeds the maximum size (125 bytes): " + bArr.length);
    }
}
