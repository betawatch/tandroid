// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import org.telegram.tgnet.ConnectionsManager;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class rx2 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(rx2.class, "workerCtl$volatile");
    public static final /* synthetic */ long s = fx.a.objectFieldOffset(rx2.class.getDeclaredField("workerCtl$volatile"));
    public final f3d a;
    public final p89 b;
    public sx2 c;
    public long d;
    public long e;
    public int f;
    public boolean h;
    private volatile int indexInArray;
    public final /* synthetic */ tx2 n;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public rx2(tx2 tx2Var, int i) {
        this.n = tx2Var;
        setDaemon(true);
        setContextClassLoader(tx2.class.getClassLoader());
        this.a = new f3d();
        this.b = new p89();
        this.c = sx2.d;
        this.nextParkedWorker = tx2.w;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final vjb a(boolean z) {
        vjb e;
        vjb e2;
        long j;
        Unsafe unsafe;
        Unsafe unsafe2;
        sx2 sx2Var = this.c;
        tx2 tx2Var = this.n;
        vjb vjbVar = null;
        f3d f3dVar = this.a;
        sx2 sx2Var2 = sx2.a;
        if (sx2Var != sx2Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = tx2.r;
            do {
                j = atomicLongFieldUpdater.get(tx2Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    f3dVar.getClass();
                    long j2 = f3d.f;
                    loop1: while (true) {
                        unsafe = fx.a;
                        vjb vjbVar2 = (vjb) unsafe.getObjectVolatile(f3dVar, j2);
                        if (vjbVar2 == null || !vjbVar2.b) {
                            break;
                        }
                        do {
                            unsafe2 = fx.a;
                            if (unsafe2.compareAndSwapObject(f3dVar, f3d.f, vjbVar2, (Object) null)) {
                                vjbVar = vjbVar2;
                                break loop1;
                            }
                        } while (unsafe2.getObjectVolatile(f3dVar, j2) == vjbVar2);
                    }
                    int intVolatile = unsafe.getIntVolatile(f3dVar, f3d.e);
                    int intVolatile2 = unsafe.getIntVolatile(f3dVar, f3d.g);
                    while (true) {
                        if (intVolatile == intVolatile2 || fx.a.getIntVolatile(f3dVar, f3d.d) == 0) {
                            break;
                        }
                        intVolatile2--;
                        vjb c = f3dVar.c(intVolatile2, true);
                        if (c != null) {
                            vjbVar = c;
                            break;
                        }
                    }
                    if (vjbVar != null) {
                        return vjbVar;
                    }
                    vjb vjbVar3 = (vjb) tx2Var.f.d();
                    return vjbVar3 == null ? i(1) : vjbVar3;
                }
            } while (!tx2.r.compareAndSet(tx2Var, j, j - 4398046511104L));
            this.c = sx2Var2;
        }
        if (z) {
            boolean z2 = d(tx2Var.a << 1) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            f3dVar.getClass();
            vjb vjbVar4 = (vjb) fx.a(f3d.f, f3dVar, null);
            if (vjbVar4 == null) {
                vjbVar4 = f3dVar.b();
            }
            if (vjbVar4 != null) {
                return vjbVar4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            vjb e3 = e();
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

    public final vjb e() {
        int d = d(2);
        tx2 tx2Var = this.n;
        c05 c05Var = tx2Var.f;
        c05 c05Var2 = tx2Var.e;
        if (d == 0) {
            vjb vjbVar = (vjb) c05Var2.d();
            return vjbVar != null ? vjbVar : (vjb) c05Var.d();
        }
        vjb vjbVar2 = (vjb) c05Var.d();
        return vjbVar2 != null ? vjbVar2 : (vjb) c05Var2.d();
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

    public final boolean h(sx2 sx2Var) {
        sx2 sx2Var2 = this.c;
        boolean z = sx2Var2 == sx2.a;
        if (z) {
            tx2.r.addAndGet(this.n, 4398046511104L);
        }
        if (sx2Var2 != sx2Var) {
            this.c = sx2Var;
        }
        return z;
    }

    public final vjb i(int i) {
        int i2;
        long j;
        vjb vjbVar;
        long j2;
        long j3;
        Unsafe unsafe;
        int i3 = i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = tx2.r;
        tx2 tx2Var = this.n;
        int i4 = (int) (atomicLongFieldUpdater.get(tx2Var) & 2097151);
        vjb vjbVar2 = null;
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
            rx2 rx2Var = (rx2) tx2Var.h.b(d);
            if (rx2Var == null || rx2Var == this) {
                i2 = i4;
            } else {
                f3d f3dVar = rx2Var.a;
                if (i3 == 3) {
                    vjbVar = f3dVar.b();
                    i2 = i4;
                    j = 0;
                } else {
                    f3dVar.getClass();
                    Unsafe unsafe2 = fx.a;
                    int intVolatile = unsafe2.getIntVolatile(f3dVar, f3d.e);
                    j = 0;
                    int intVolatile2 = unsafe2.getIntVolatile(f3dVar, f3d.g);
                    boolean z = i3 == 1;
                    while (true) {
                        if (intVolatile == intVolatile2) {
                            i2 = i4;
                            break;
                        }
                        if (z) {
                            i2 = i4;
                            if (fx.a.getIntVolatile(f3dVar, f3d.d) == 0) {
                                break;
                            }
                        } else {
                            i2 = i4;
                        }
                        int i6 = intVolatile + 1;
                        vjb c = f3dVar.c(intVolatile, z);
                        if (c != null) {
                            vjbVar = c;
                            break;
                        }
                        intVolatile = i6;
                        i4 = i2;
                    }
                    vjbVar = vjbVar2;
                }
                p89 p89Var = this.b;
                if (vjbVar != null) {
                    p89Var.a = vjbVar;
                    j3 = -1;
                    j2 = -1;
                } else {
                    j2 = -1;
                    long j5 = f3d.f;
                    while (true) {
                        vjb vjbVar3 = (vjb) fx.a.getObjectVolatile(f3dVar, j5);
                        if (vjbVar3 == null) {
                            break;
                        }
                        if (((vjbVar3.b ? 1 : 2) & i) == 0) {
                            break;
                        }
                        zjb.f.getClass();
                        f3d f3dVar2 = f3dVar;
                        long nanoTime = System.nanoTime() - vjbVar3.a;
                        long j6 = zjb.b;
                        if (nanoTime < j6) {
                            j3 = j6 - nanoTime;
                            break;
                        }
                        do {
                            unsafe = fx.a;
                            if (unsafe.compareAndSwapObject(f3dVar2, f3d.f, vjbVar3, (Object) null)) {
                                p89Var.a = vjbVar3;
                                j3 = -1;
                                break;
                            }
                        } while (unsafe.getObjectVolatile(f3dVar2, j5) == vjbVar3);
                        f3dVar = f3dVar2;
                    }
                    j3 = -2;
                }
                if (j3 == j2) {
                    vjb vjbVar4 = (vjb) p89Var.a;
                    p89Var.a = null;
                    return vjbVar4;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
            vjbVar2 = null;
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
        sx2 sx2Var;
        loop0: while (true) {
            boolean z = false;
            while (tx2.s.get(this.n) == 0) {
                sx2 sx2Var2 = this.c;
                sx2 sx2Var3 = sx2.e;
                if (sx2Var2 == sx2Var3) {
                    break loop0;
                }
                vjb a = a(this.h);
                if (a != null) {
                    this.e = 0L;
                    tx2 tx2Var = this.n;
                    this.d = 0L;
                    if (this.c == sx2.c) {
                        this.c = sx2.b;
                    }
                    if (a.b) {
                        if (h(sx2.b) && !tx2Var.e() && !tx2Var.d(tx2.r.get(tx2Var))) {
                            tx2Var.e();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        tx2.r.addAndGet(tx2Var, -2097152L);
                        if (this.c != sx2Var3) {
                            this.c = sx2.d;
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
                        ow5 ow5Var = tx2.w;
                        if (obj != ow5Var) {
                            int i = -1;
                            fx.a.putIntVolatile(this, s, -1);
                            while (this.nextParkedWorker != tx2.w) {
                                Unsafe unsafe = fx.a;
                                long j = s;
                                if (unsafe.getIntVolatile(this, j) == i) {
                                    tx2 tx2Var2 = this.n;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = tx2.s;
                                    if (atomicIntegerFieldUpdater.get(tx2Var2) == 0) {
                                        sx2 sx2Var4 = this.c;
                                        sx2 sx2Var5 = sx2.e;
                                        if (sx2Var4 != sx2Var5) {
                                            h(sx2.c);
                                            Thread.interrupted();
                                            if (this.d == 0) {
                                                sx2Var = sx2Var5;
                                                this.d = System.nanoTime() + this.n.c;
                                            } else {
                                                sx2Var = sx2Var5;
                                            }
                                            LockSupport.parkNanos(this.n.c);
                                            if (System.nanoTime() - this.d >= 0) {
                                                this.d = 0L;
                                                tx2 tx2Var3 = this.n;
                                                synchronized (tx2Var3.h) {
                                                    if (!(atomicIntegerFieldUpdater.get(tx2Var3) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater = tx2.r;
                                                        if (((int) (atomicLongFieldUpdater.get(tx2Var3) & 2097151)) > tx2Var3.a) {
                                                            if (unsafe.compareAndSwapInt(this, j, -1, 1)) {
                                                                int i2 = this.indexInArray;
                                                                f(0);
                                                                tx2Var3.c(this, i2, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(tx2Var3) & 2097151);
                                                                if (andDecrement != i2) {
                                                                    Object b = tx2Var3.h.b(andDecrement);
                                                                    b.getClass();
                                                                    rx2 rx2Var = (rx2) b;
                                                                    tx2Var3.h.c(i2, rx2Var);
                                                                    rx2Var.f(i2);
                                                                    tx2Var3.c(rx2Var, andDecrement, i2);
                                                                }
                                                                tx2Var3.h.c(andDecrement, null);
                                                                this.c = sx2Var;
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
                            tx2 tx2Var4 = this.n;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = tx2.n;
                            if (this.nextParkedWorker == ow5Var) {
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(tx2Var4);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = tx2Var4.h.b((int) (j2 & 2097151));
                                    tx2 tx2Var5 = tx2Var4;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                    if (!atomicLongFieldUpdater3.compareAndSet(tx2Var5, j2, ((j2 + 2097152) & (-2097152)) | i3)) {
                                        atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                        tx2Var4 = tx2Var5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(sx2.c);
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
        h(sx2.e);
    }
}
