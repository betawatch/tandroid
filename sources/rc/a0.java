package rc;

import e2.r0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.telegram.ui.Wallet.z0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a0 extends z {
    public final LinkedList b;
    public final o c;
    public boolean d;
    public x e;
    public boolean f;

    public a0(u uVar) {
        super("WritingThread", uVar, 2);
        this.b = new LinkedList();
        this.c = uVar.u;
    }

    @Override // rc.z
    public final void a() {
        try {
            c();
        } catch (Throwable th2) {
            v vVar = new v(39, "An uncaught throwable was detected in the writing thread: " + th2.getMessage(), th2);
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
        } catch (IOException e10) {
            v vVar = new v(27, "Flushing frames to the server failed: " + e10.getMessage(), e10);
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
                        z0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
            throw vVar;
        }
    }

    public final void c() {
        boolean z9;
        u uVar = this.a;
        synchronized (uVar.g) {
            uVar.p = true;
            z9 = uVar.o;
        }
        uVar.a();
        if (z9) {
            uVar.f();
        }
        while (true) {
            int j3 = j();
            if (j3 != 1) {
                if (j3 == 3) {
                    try {
                        this.a.i.flush();
                    } catch (IOException unused) {
                    }
                } else if (j3 == 2) {
                    continue;
                } else {
                    try {
                        i(false);
                    } catch (v unused2) {
                    }
                }
            }
            try {
                i(true);
                return;
            } catch (v unused3) {
                return;
            }
        }
    }

    public final void d() {
        u uVar = this.a;
        x xVar = this.e;
        synchronized (uVar.g) {
            try {
                uVar.r = true;
                uVar.t = xVar;
                if (uVar.q) {
                    uVar.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003a A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x0010, B:13:0x0015, B:20:0x0025, B:22:0x002a, B:27:0x003a, B:28:0x0041, B:30:0x0047, B:35:0x005a, B:38:0x005d, B:39:0x0066, B:40:0x0069, B:45:0x0061), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a A[Catch: all -> 0x0007, LOOP:0: B:28:0x0041->B:35:0x005a, LOOP_END, TryCatch #0 {all -> 0x0007, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x0010, B:13:0x0015, B:20:0x0025, B:22:0x002a, B:27:0x003a, B:28:0x0041, B:30:0x0047, B:35:0x005a, B:38:0x005d, B:39:0x0066, B:40:0x0069, B:45:0x0061), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0061 A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x0010, B:13:0x0015, B:20:0x0025, B:22:0x002a, B:27:0x003a, B:28:0x0041, B:30:0x0047, B:35:0x005a, B:38:0x005d, B:39:0x0066, B:40:0x0069, B:45:0x0061), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(x xVar) {
        boolean z9;
        boolean z10;
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                if (!this.d && this.e == null) {
                    int i7 = xVar.e;
                    if (!(8 <= i7 && i7 <= 15)) {
                        this.a.getClass();
                    }
                }
                int i10 = xVar.e;
                if (i10 != 9 && i10 != 10) {
                    z9 = false;
                    if (z9) {
                        this.b.addLast(xVar);
                    } else {
                        LinkedList linkedList = this.b;
                        Iterator it = linkedList.iterator();
                        int i11 = 0;
                        while (it.hasNext()) {
                            int i12 = ((x) it.next()).e;
                            if (i12 != 9 && i12 != 10) {
                                z10 = false;
                                if (z10) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                            z10 = true;
                            if (z10) {
                            }
                        }
                        linkedList.add(i11, xVar);
                    }
                    notifyAll();
                }
                z9 = true;
                if (z9) {
                }
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        synchronized (this) {
            this.d = true;
            notifyAll();
        }
    }

    public final void h(x xVar) {
        int i7;
        byte[] bArr;
        byte[] bArr2;
        o oVar = this.c;
        boolean z9 = true;
        if (oVar != null && (((i7 = xVar.e) == 1 || i7 == 2) && xVar.a && !xVar.b && (bArr = xVar.g) != null && bArr.length != 0)) {
            try {
                bArr2 = oVar.b(bArr);
            } catch (v unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                xVar.c(bArr2);
                xVar.b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.a.d.p();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z0 z0Var = (z0) obj;
            try {
                try {
                    z0Var.getClass();
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                z0Var.getClass();
            }
        }
        if (this.e != null) {
            ArrayList arrayList2 = (ArrayList) this.a.d.p();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
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
            return;
        }
        int i12 = xVar.e;
        if (i12 == 8) {
            this.e = xVar;
        }
        if (i12 == 8) {
            r0 r0Var = this.a.b;
            synchronized (r0Var) {
                int i13 = r0Var.a;
                if (i13 == 4 || i13 == 5) {
                    z9 = false;
                } else {
                    r0Var.a = 4;
                    if (r0Var.b == 1) {
                        r0Var.b = 3;
                    }
                }
            }
            if (z9) {
                this.a.d.g();
            }
        }
        try {
            this.a.i.a(xVar);
            ArrayList arrayList3 = (ArrayList) this.a.d.p();
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                z0 z0Var3 = (z0) obj3;
                try {
                    try {
                        z0Var3.getClass();
                    } catch (Throwable unused6) {
                        z0Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e10) {
            v vVar = new v(26, "An I/O error occurred when a frame was tried to be sent: " + e10.getMessage(), e10);
            ab.q qVar = this.a.d;
            qVar.d(vVar);
            ArrayList arrayList4 = (ArrayList) qVar.p();
            int size4 = arrayList4.size();
            while (i10 < size4) {
                Object obj4 = arrayList4.get(i10);
                i10++;
                z0 z0Var4 = (z0) obj4;
                try {
                    try {
                        z0Var4.getClass();
                    } catch (Throwable unused8) {
                        z0Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw vVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r2 != 10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        b();
        r0 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r9 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        r8.a.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        r2 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (1000 >= (r2 - r0)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        b();
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        h(r2);
        r2 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r2 != 9) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z9) {
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            synchronized (this) {
                x xVar = (x) this.b.poll();
                notifyAll();
                if (xVar == null) {
                    break;
                }
            }
        }
        if (!z9) {
            this.a.getClass();
        }
        b();
    }

    public final int j() {
        synchronized (this) {
            try {
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
