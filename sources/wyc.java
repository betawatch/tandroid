// default package

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wyc extends huc {
    public final LinkedList b;
    public final d38 c;
    public boolean d;
    public fuc e;
    public boolean f;

    public wyc(buc bucVar) {
        super("WritingThread", bucVar, 2);
        this.b = new LinkedList();
        this.c = bucVar.u;
    }

    @Override // huc
    public final void a() {
        try {
            c();
        } catch (Throwable th) {
            cuc cucVar = new cuc(39, "An uncaught throwable was detected in the writing thread: " + th.getMessage(), th);
            xf4 xf4Var = this.a.d;
            xf4Var.f(cucVar);
            ArrayList arrayList = (ArrayList) xf4Var.u();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o15 o15Var = (o15) obj;
                try {
                    try {
                        o15Var.getClass();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    o15Var.getClass();
                }
            }
        }
        synchronized (this) {
            this.f = true;
            notifyAll();
        }
        d();
    }

    public final void b() {
        try {
            this.a.i.flush();
            synchronized (this) {
            }
        } catch (IOException e) {
            cuc cucVar = new cuc(27, "Flushing frames to the server failed: " + e.getMessage(), e);
            xf4 xf4Var = this.a.d;
            xf4Var.f(cucVar);
            ArrayList arrayList = (ArrayList) xf4Var.u();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o15 o15Var = (o15) obj;
                try {
                    try {
                        o15Var.getClass();
                    } catch (Throwable unused) {
                        o15Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
            throw cucVar;
        }
    }

    public final void c() {
        boolean z;
        buc bucVar = this.a;
        synchronized (bucVar.g) {
            bucVar.p = true;
            z = bucVar.o;
        }
        bucVar.a();
        if (z) {
            bucVar.f();
        }
        while (true) {
            int i = i();
            if (i != 1) {
                if (i == 3) {
                    try {
                        this.a.i.flush();
                    } catch (IOException unused) {
                    }
                } else if (i != 2) {
                    try {
                        h(false);
                    } catch (cuc unused2) {
                    }
                } else {
                    continue;
                }
            }
            try {
                h(true);
                return;
            } catch (cuc unused3) {
                return;
            }
        }
    }

    public final void d() {
        buc bucVar = this.a;
        fuc fucVar = this.e;
        synchronized (bucVar.g) {
            bucVar.r = true;
            bucVar.t = fucVar;
            if (bucVar.q) {
                bucVar.d();
            }
        }
    }

    public final void e(fuc fucVar) {
        synchronized (this) {
            if (this.f) {
                return;
            }
            if (!this.d && this.e == null) {
                int i = fucVar.e;
                if (!(8 <= i && i <= 15)) {
                    this.a.getClass();
                }
            }
            int i2 = fucVar.e;
            if (i2 == 9 || i2 == 10) {
                LinkedList linkedList = this.b;
                Iterator it = linkedList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    int i4 = ((fuc) it.next()).e;
                    if (!(i4 == 9 || i4 == 10)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                linkedList.add(i3, fucVar);
            } else {
                this.b.addLast(fucVar);
            }
            notifyAll();
        }
    }

    public final void f() {
        synchronized (this) {
            this.d = true;
            notifyAll();
        }
    }

    public final void g(fuc fucVar) {
        int i;
        byte[] bArr;
        byte[] bArr2;
        d38 d38Var = this.c;
        boolean z = true;
        if (d38Var != null && (((i = fucVar.e) == 1 || i == 2) && fucVar.a && !fucVar.b && (bArr = fucVar.g) != null && bArr.length != 0)) {
            try {
                bArr2 = d38Var.b(bArr);
            } catch (cuc unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                fucVar.c(bArr2);
                fucVar.b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.a.d.u();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            o15 o15Var = (o15) obj;
            try {
                try {
                    o15Var.getClass();
                } catch (Throwable unused2) {
                    o15Var.getClass();
                }
            } catch (Throwable unused3) {
            }
        }
        if (this.e != null) {
            ArrayList arrayList2 = (ArrayList) this.a.d.u();
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                o15 o15Var2 = (o15) obj2;
                try {
                    try {
                        o15Var2.getClass();
                    } catch (Throwable unused4) {
                        o15Var2.getClass();
                    }
                } catch (Throwable unused5) {
                }
            }
            return;
        }
        int i4 = fucVar.e;
        if (i4 == 8) {
            this.e = fucVar;
        }
        if (i4 == 8) {
            zw8 zw8Var = this.a.b;
            synchronized (zw8Var) {
                int i5 = zw8Var.b;
                if (i5 == 4 || i5 == 5) {
                    z = false;
                } else {
                    zw8Var.b = 4;
                    if (zw8Var.c == 1) {
                        zw8Var.c = 3;
                    }
                }
            }
            if (z) {
                this.a.d.g();
            }
        }
        try {
            this.a.i.a(fucVar);
            ArrayList arrayList3 = (ArrayList) this.a.d.u();
            int size3 = arrayList3.size();
            while (i2 < size3) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                o15 o15Var3 = (o15) obj3;
                try {
                    try {
                        o15Var3.getClass();
                    } catch (Throwable unused6) {
                        o15Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e) {
            cuc cucVar = new cuc(26, "An I/O error occurred when a frame was tried to be sent: " + e.getMessage(), e);
            xf4 xf4Var = this.a.d;
            xf4Var.f(cucVar);
            ArrayList arrayList4 = (ArrayList) xf4Var.u();
            int size4 = arrayList4.size();
            while (i2 < size4) {
                Object obj4 = arrayList4.get(i2);
                i2++;
                o15 o15Var4 = (o15) obj4;
                try {
                    try {
                        o15Var4.getClass();
                    } catch (Throwable unused8) {
                        o15Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw cucVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 != 10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        b();
        r0 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r9 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r8.a.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        r2 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (1000 >= (r2 - r0)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        b();
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        g(r2);
        r2 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r2 == 9) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            synchronized (this) {
                fuc fucVar = (fuc) this.b.poll();
                notifyAll();
                if (fucVar == null) {
                    break;
                }
            }
        }
        if (!z) {
            this.a.getClass();
        }
        b();
    }

    public final int i() {
        synchronized (this) {
            if (this.d) {
                return 1;
            }
            if (this.e != null) {
                return 1;
            }
            if (this.b.size() == 0) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.d) {
                return 1;
            }
            return this.b.size() == 0 ? 2 : 0;
        }
    }
}
