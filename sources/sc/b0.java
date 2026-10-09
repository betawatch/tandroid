package sc;

import b2.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.telegram.ui.Wallet.y0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class b0 extends a0 {
    public final LinkedList b;
    public final o c;
    public boolean d;
    public y e;
    public boolean f;

    public b0(u uVar) {
        super("WritingThread", uVar, 2);
        this.b = new LinkedList();
        this.c = uVar.u;
    }

    @Override // sc.a0
    public final void a() {
        try {
            c();
        } catch (Throwable th2) {
            w wVar = new w(39, "An uncaught throwable was detected in the writing thread: " + th2.getMessage(), th2);
            com.google.firebase.messaging.m mVar = this.a.d;
            mVar.d(wVar);
            ArrayList arrayList = (ArrayList) mVar.n();
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
        synchronized (this) {
            this.f = true;
            notifyAll();
        }
        e();
    }

    public final void b() {
        try {
            this.a.i.flush();
            synchronized (this) {
            }
        } catch (IOException e7) {
            w wVar = new w(27, "Flushing frames to the server failed: " + e7.getMessage(), e7);
            com.google.firebase.messaging.m mVar = this.a.d;
            mVar.d(wVar);
            ArrayList arrayList = (ArrayList) mVar.n();
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
            throw wVar;
        }
    }

    public final void c() {
        boolean z10;
        u uVar = this.a;
        synchronized (uVar.g) {
            uVar.p = true;
            z10 = uVar.o;
        }
        uVar.a();
        if (z10) {
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
                    } catch (w unused2) {
                    }
                }
            }
            try {
                i(true);
                return;
            } catch (w unused3) {
                return;
            }
        }
    }

    public final void e() {
        u uVar = this.a;
        y yVar = this.e;
        synchronized (uVar.g) {
            try {
                uVar.r = true;
                uVar.t = yVar;
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
    public final void f(y yVar) {
        boolean z10;
        boolean z11;
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                if (!this.d && this.e == null) {
                    int i10 = yVar.e;
                    if (!(8 <= i10 && i10 <= 15)) {
                        this.a.getClass();
                    }
                }
                int i11 = yVar.e;
                if (i11 != 9 && i11 != 10) {
                    z10 = false;
                    if (z10) {
                        this.b.addLast(yVar);
                    } else {
                        LinkedList linkedList = this.b;
                        Iterator it = linkedList.iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            int i13 = ((y) it.next()).e;
                            if (i13 != 9 && i13 != 10) {
                                z11 = false;
                                if (z11) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            z11 = true;
                            if (z11) {
                            }
                        }
                        linkedList.add(i12, yVar);
                    }
                    notifyAll();
                }
                z10 = true;
                if (z10) {
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

    public final void h(y yVar) {
        int i10;
        byte[] bArr;
        byte[] bArr2;
        o oVar = this.c;
        boolean z10 = true;
        if (oVar != null && (((i10 = yVar.e) == 1 || i10 == 2) && yVar.a && !yVar.b && (bArr = yVar.g) != null && bArr.length != 0)) {
            try {
                bArr2 = oVar.b(bArr);
            } catch (w unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                yVar.c(bArr2);
                yVar.b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.a.d.n();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    y0Var.getClass();
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                y0Var.getClass();
            }
        }
        if (this.e != null) {
            ArrayList arrayList2 = (ArrayList) this.a.d.n();
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
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
            return;
        }
        int i13 = yVar.e;
        if (i13 == 8) {
            this.e = yVar;
        }
        if (i13 == 8) {
            q0 q0Var = this.a.b;
            synchronized (q0Var) {
                int i14 = q0Var.a;
                if (i14 == 4 || i14 == 5) {
                    z10 = false;
                } else {
                    q0Var.a = 4;
                    if (q0Var.b == 1) {
                        q0Var.b = 3;
                    }
                }
            }
            if (z10) {
                this.a.d.e();
            }
        }
        try {
            this.a.i.a(yVar);
            ArrayList arrayList3 = (ArrayList) this.a.d.n();
            int size3 = arrayList3.size();
            while (i11 < size3) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                y0 y0Var3 = (y0) obj3;
                try {
                    try {
                        y0Var3.getClass();
                    } catch (Throwable unused6) {
                        y0Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e7) {
            w wVar = new w(26, "An I/O error occurred when a frame was tried to be sent: " + e7.getMessage(), e7);
            com.google.firebase.messaging.m mVar = this.a.d;
            mVar.d(wVar);
            ArrayList arrayList4 = (ArrayList) mVar.n();
            int size4 = arrayList4.size();
            while (i11 < size4) {
                Object obj4 = arrayList4.get(i11);
                i11++;
                y0 y0Var4 = (y0) obj4;
                try {
                    try {
                        y0Var4.getClass();
                    } catch (Throwable unused8) {
                        y0Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw wVar;
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
    public final void i(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            synchronized (this) {
                y yVar = (y) this.b.poll();
                notifyAll();
                if (yVar == null) {
                    break;
                }
            }
        }
        if (!z10) {
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
