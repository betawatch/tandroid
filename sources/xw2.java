// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import org.telegram.tgnet.ConnectionsManager;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xw2 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(xw2.class, "workerCtl$volatile");
    public static final /* synthetic */ long s = ex.a.objectFieldOffset(xw2.class.getDeclaredField("workerCtl$volatile"));
    public final pyc a;
    public final c59 b;
    public yw2 c;
    public long d;
    public long e;
    public int f;
    public boolean h;
    private volatile int indexInArray;
    public final /* synthetic */ zw2 n;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public xw2(zw2 zw2Var, int i) {
        this.n = zw2Var;
        setDaemon(true);
        setContextClassLoader(zw2.class.getClassLoader());
        this.a = new pyc();
        this.b = new c59();
        this.c = yw2.d;
        this.nextParkedWorker = zw2.w;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final zfb a(boolean z) {
        zfb e;
        zfb e2;
        long j;
        Unsafe unsafe;
        Unsafe unsafe2;
        yw2 yw2Var = this.c;
        zw2 zw2Var = this.n;
        zfb zfbVar = null;
        pyc pycVar = this.a;
        yw2 yw2Var2 = yw2.a;
        if (yw2Var != yw2Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = zw2.r;
            do {
                j = atomicLongFieldUpdater.get(zw2Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    pycVar.getClass();
                    long j2 = pyc.f;
                    loop1: while (true) {
                        unsafe = ex.a;
                        zfb zfbVar2 = (zfb) unsafe.getObjectVolatile(pycVar, j2);
                        if (zfbVar2 == null || !zfbVar2.b) {
                            break;
                        }
                        do {
                            unsafe2 = ex.a;
                            if (unsafe2.compareAndSwapObject(pycVar, pyc.f, zfbVar2, (Object) null)) {
                                zfbVar = zfbVar2;
                                break loop1;
                            }
                        } while (unsafe2.getObjectVolatile(pycVar, j2) == zfbVar2);
                    }
                    int intVolatile = unsafe.getIntVolatile(pycVar, pyc.e);
                    int intVolatile2 = unsafe.getIntVolatile(pycVar, pyc.g);
                    while (true) {
                        if (intVolatile == intVolatile2 || ex.a.getIntVolatile(pycVar, pyc.d) == 0) {
                            break;
                        }
                        intVolatile2--;
                        zfb c = pycVar.c(intVolatile2, true);
                        if (c != null) {
                            zfbVar = c;
                            break;
                        }
                    }
                    if (zfbVar != null) {
                        return zfbVar;
                    }
                    zfb zfbVar3 = (zfb) zw2Var.f.d();
                    return zfbVar3 == null ? i(1) : zfbVar3;
                }
            } while (!zw2.r.compareAndSet(zw2Var, j, j - 4398046511104L));
            this.c = yw2Var2;
        }
        if (z) {
            boolean z2 = d(zw2Var.a << 1) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            pycVar.getClass();
            zfb zfbVar4 = (zfb) ex.a(pycVar, pyc.f, null);
            if (zfbVar4 == null) {
                zfbVar4 = pycVar.b();
            }
            if (zfbVar4 != null) {
                return zfbVar4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            zfb e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & ConnectionsManager.DEFAULT_DATACENTER_ID) % i;
    }

    public final zfb e() {
        int d = d(2);
        zw2 zw2Var = this.n;
        wx4 wx4Var = zw2Var.f;
        wx4 wx4Var2 = zw2Var.e;
        if (d == 0) {
            zfb zfbVar = (zfb) wx4Var2.d();
            return zfbVar != null ? zfbVar : (zfb) wx4Var.d();
        }
        zfb zfbVar2 = (zfb) wx4Var.d();
        return zfbVar2 != null ? zfbVar2 : (zfb) wx4Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.n.d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(yw2 yw2Var) {
        yw2 yw2Var2 = this.c;
        boolean z = yw2Var2 == yw2.a;
        if (z) {
            zw2.r.addAndGet(this.n, 4398046511104L);
        }
        if (yw2Var2 != yw2Var) {
            this.c = yw2Var;
        }
        return z;
    }

    public final zfb i(int i) {
        int i2;
        long j;
        zfb zfbVar;
        long j2;
        long j3;
        Unsafe unsafe;
        int i3 = i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = zw2.r;
        zw2 zw2Var = this.n;
        int i4 = (int) (atomicLongFieldUpdater.get(zw2Var) & 2097151);
        zfb zfbVar2 = null;
        if (i4 < 2) {
            return null;
        }
        int d = d(i4);
        int i5 = 0;
        long j4 = Long.MAX_VALUE;
        while (i5 < i4) {
            d++;
            if (d > i4) {
                d = 1;
            }
            xw2 xw2Var = (xw2) zw2Var.h.b(d);
            if (xw2Var == null || xw2Var == this) {
                i2 = i4;
            } else {
                pyc pycVar = xw2Var.a;
                if (i3 == 3) {
                    zfbVar = pycVar.b();
                    i2 = i4;
                    j = 0;
                } else {
                    pycVar.getClass();
                    Unsafe unsafe2 = ex.a;
                    int intVolatile = unsafe2.getIntVolatile(pycVar, pyc.e);
                    j = 0;
                    int intVolatile2 = unsafe2.getIntVolatile(pycVar, pyc.g);
                    boolean z = i3 == 1;
                    while (true) {
                        if (intVolatile == intVolatile2) {
                            i2 = i4;
                            break;
                        }
                        if (z) {
                            i2 = i4;
                            if (ex.a.getIntVolatile(pycVar, pyc.d) == 0) {
                                break;
                            }
                        } else {
                            i2 = i4;
                        }
                        int i6 = intVolatile + 1;
                        zfb c = pycVar.c(intVolatile, z);
                        if (c != null) {
                            zfbVar = c;
                            break;
                        }
                        intVolatile = i6;
                        i4 = i2;
                    }
                    zfbVar = zfbVar2;
                }
                c59 c59Var = this.b;
                if (zfbVar != null) {
                    c59Var.a = zfbVar;
                    j3 = -1;
                    j2 = -1;
                } else {
                    j2 = -1;
                    long j5 = pyc.f;
                    while (true) {
                        zfb zfbVar3 = (zfb) ex.a.getObjectVolatile(pycVar, j5);
                        if (zfbVar3 == null) {
                            break;
                        }
                        if (((zfbVar3.b ? 1 : 2) & i) == 0) {
                            break;
                        }
                        dgb.f.getClass();
                        pyc pycVar2 = pycVar;
                        long nanoTime = System.nanoTime() - zfbVar3.a;
                        long j6 = dgb.b;
                        if (nanoTime < j6) {
                            j3 = j6 - nanoTime;
                            break;
                        }
                        do {
                            unsafe = ex.a;
                            if (unsafe.compareAndSwapObject(pycVar2, pyc.f, zfbVar3, (Object) null)) {
                                c59Var.a = zfbVar3;
                                j3 = -1;
                                break;
                            }
                        } while (unsafe.getObjectVolatile(pycVar2, j5) == zfbVar3);
                        pycVar = pycVar2;
                    }
                    j3 = -2;
                }
                if (j3 == j2) {
                    zfb zfbVar4 = (zfb) c59Var.a;
                    c59Var.a = null;
                    return zfbVar4;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
            zfbVar2 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.e = j4;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        yw2 yw2Var;
        loop0: while (true) {
            boolean z = false;
            while (zw2.s.get(this.n) == 0) {
                yw2 yw2Var2 = this.c;
                yw2 yw2Var3 = yw2.e;
                if (yw2Var2 == yw2Var3) {
                    break loop0;
                }
                zfb a = a(this.h);
                if (a != null) {
                    this.e = 0L;
                    zw2 zw2Var = this.n;
                    this.d = 0L;
                    if (this.c == yw2.c) {
                        this.c = yw2.b;
                    }
                    if (a.b) {
                        if (h(yw2.b) && !zw2Var.e() && !zw2Var.d(zw2.r.get(zw2Var))) {
                            zw2Var.e();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        zw2.r.addAndGet(zw2Var, -2097152L);
                        if (this.c != yw2Var3) {
                            this.c = yw2.d;
                        }
                    } else {
                        try {
                            a.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.h = false;
                    if (this.e == 0) {
                        Object obj = this.nextParkedWorker;
                        lo5 lo5Var = zw2.w;
                        if (obj != lo5Var) {
                            int i = -1;
                            ex.a.putIntVolatile(this, s, -1);
                            while (this.nextParkedWorker != zw2.w) {
                                Unsafe unsafe = ex.a;
                                long j = s;
                                if (unsafe.getIntVolatile(this, j) == i) {
                                    zw2 zw2Var2 = this.n;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = zw2.s;
                                    if (atomicIntegerFieldUpdater.get(zw2Var2) == 0) {
                                        yw2 yw2Var4 = this.c;
                                        yw2 yw2Var5 = yw2.e;
                                        if (yw2Var4 != yw2Var5) {
                                            h(yw2.c);
                                            Thread.interrupted();
                                            if (this.d == 0) {
                                                yw2Var = yw2Var5;
                                                this.d = System.nanoTime() + this.n.c;
                                            } else {
                                                yw2Var = yw2Var5;
                                            }
                                            LockSupport.parkNanos(this.n.c);
                                            if (System.nanoTime() - this.d >= 0) {
                                                this.d = 0L;
                                                zw2 zw2Var3 = this.n;
                                                synchronized (zw2Var3.h) {
                                                    if (!(atomicIntegerFieldUpdater.get(zw2Var3) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater = zw2.r;
                                                        if (((int) (atomicLongFieldUpdater.get(zw2Var3) & 2097151)) > zw2Var3.a) {
                                                            if (unsafe.compareAndSwapInt(this, j, -1, 1)) {
                                                                int i2 = this.indexInArray;
                                                                f(0);
                                                                zw2Var3.c(this, i2, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(zw2Var3) & 2097151);
                                                                if (andDecrement != i2) {
                                                                    Object b = zw2Var3.h.b(andDecrement);
                                                                    b.getClass();
                                                                    xw2 xw2Var = (xw2) b;
                                                                    zw2Var3.h.c(i2, xw2Var);
                                                                    xw2Var.f(i2);
                                                                    zw2Var3.c(xw2Var, andDecrement, i2);
                                                                }
                                                                zw2Var3.h.c(andDecrement, null);
                                                                this.c = yw2Var;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i = -1;
                                        }
                                    }
                                }
                            }
                        } else {
                            zw2 zw2Var4 = this.n;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = zw2.n;
                            if (this.nextParkedWorker == lo5Var) {
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(zw2Var4);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = zw2Var4.h.b((int) (j2 & 2097151));
                                    zw2 zw2Var5 = zw2Var4;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                    if (!atomicLongFieldUpdater3.compareAndSet(zw2Var5, j2, ((j2 + 2097152) & (-2097152)) | i3)) {
                                        atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                        zw2Var4 = zw2Var5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(yw2.c);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.e);
                        this.e = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(yw2.e);
    }
}
