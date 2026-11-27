// default package

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class tx2 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(tx2.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater r = AtomicLongFieldUpdater.newUpdater(tx2.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(tx2.class, "_isTerminated$volatile");
    public static final ow5 w = new ow5("NOT_IN_STACK", (byte) 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final c05 e;
    public final c05 f;
    public final qd9 h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public tx2(int i, long j, String str, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        if (i < 1) {
            bya.a(qd4.n(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            bya.a(c00.h(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            bya.a(qd4.n(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            bya.a(ik8.n(j, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.e = new c05();
        this.f = new c05();
        this.h = new qd9((i + 1) << 1);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.h) {
            if (s.get(this) != 0) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = r;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.a) {
                return 0;
            }
            if (i >= this.b) {
                return 0;
            }
            int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i3 <= 0 || this.h.b(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            rx2 rx2Var = new rx2(this, i3);
            this.h.c(i3, rx2Var);
            if (i3 != ((int) (atomicLongFieldUpdater.incrementAndGet(this) & 2097151))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i4 = i2 + 1;
            rx2Var.start();
            return i4;
        }
    }

    public final void b(Runnable runnable, boolean z) {
        vjb yjbVar;
        sx2 sx2Var;
        zjb.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof vjb) {
            yjbVar = (vjb) runnable;
            yjbVar.a = nanoTime;
            yjbVar.b = z;
        } else {
            yjbVar = new yjb(nanoTime, z, runnable);
        }
        boolean z2 = yjbVar.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = r;
        long addAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        rx2 rx2Var = currentThread instanceof rx2 ? (rx2) currentThread : null;
        if (rx2Var == null || rx2Var.n != this) {
            rx2Var = null;
        }
        if (rx2Var != null && (sx2Var = rx2Var.c) != sx2.e && (yjbVar.b || sx2Var != sx2.b)) {
            rx2Var.h = true;
            f3d f3dVar = rx2Var.a;
            f3dVar.getClass();
            yjbVar = (vjb) fx.a(f3d.f, f3dVar, yjbVar);
            if (yjbVar != null) {
                AtomicReferenceArray atomicReferenceArray = f3dVar.a;
                if (f3dVar.a() != 127) {
                    if (yjbVar.b) {
                        f3d.c.incrementAndGet(f3dVar);
                    }
                    int intVolatile = fx.a.getIntVolatile(f3dVar, f3d.g) & jn7.K1;
                    while (atomicReferenceArray.get(intVolatile) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(intVolatile, yjbVar);
                    f3d.b.incrementAndGet(f3dVar);
                }
            }
            yjbVar = null;
        }
        if (yjbVar != null) {
            if (!(yjbVar.b ? this.f.a(yjbVar) : this.e.a(yjbVar))) {
                throw new RejectedExecutionException(c00.k(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z2) {
            if (e() || d(addAndGet)) {
                return;
            }
            e();
            return;
        }
        if (e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(rx2 rx2Var, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = n;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = rx2Var.c();
                    while (true) {
                        if (c == w) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        rx2 rx2Var2 = (rx2) c;
                        int b = rx2Var2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = rx2Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | i3;
                tx2 tx2Var = this;
                if (atomicLongFieldUpdater.compareAndSet(tx2Var, j, j3)) {
                    return;
                } else {
                    this = tx2Var;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r1 == null) goto L37;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        vjb vjbVar;
        if (s.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            rx2 rx2Var = currentThread instanceof rx2 ? (rx2) currentThread : null;
            if (rx2Var == null || rx2Var.n != this) {
                rx2Var = null;
            }
            synchronized (this.h) {
                i = (int) (r.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object b = this.h.b(i2);
                    b.getClass();
                    rx2 rx2Var2 = (rx2) b;
                    if (rx2Var2 != rx2Var) {
                        while (rx2Var2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(rx2Var2);
                            rx2Var2.join(10000L);
                        }
                        f3d f3dVar = rx2Var2.a;
                        c05 c05Var = this.f;
                        f3dVar.getClass();
                        vjb vjbVar2 = (vjb) fx.a(f3d.f, f3dVar, null);
                        if (vjbVar2 != null) {
                            c05Var.a(vjbVar2);
                        }
                        while (true) {
                            vjb b2 = f3dVar.b();
                            if (b2 == null) {
                                break;
                            } else {
                                c05Var.a(b2);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f.b();
            this.e.b();
            while (true) {
                if (rx2Var != null) {
                    vjbVar = rx2Var.a(true);
                }
                vjbVar = (vjb) this.e.d();
                if (vjbVar == null && (vjbVar = (vjb) this.f.d()) == null) {
                    break;
                }
                try {
                    vjbVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (rx2Var != null) {
                rx2Var.h(sx2.e);
            }
            n.set(this, 0L);
            r.set(this, 0L);
        }
    }

    public final boolean d(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int a = a();
            if (a == 1 && i2 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        tx2 tx2Var;
        ow5 ow5Var;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = n;
            long j = atomicLongFieldUpdater.get(this);
            rx2 rx2Var = (rx2) this.h.b((int) (2097151 & j));
            if (rx2Var == null) {
                rx2Var = null;
                tx2Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = rx2Var.c();
                while (true) {
                    ow5Var = w;
                    if (c == ow5Var) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    rx2 rx2Var2 = (rx2) c;
                    i = rx2Var2.b();
                    if (i != 0) {
                        break;
                    }
                    c = rx2Var2.c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (i >= 0) {
                    tx2 tx2Var2 = this;
                    boolean compareAndSet = atomicLongFieldUpdater.compareAndSet(tx2Var2, j, j2 | i);
                    tx2Var = tx2Var2;
                    if (compareAndSet) {
                        rx2Var.g(ow5Var);
                    }
                    this = tx2Var;
                } else {
                    continue;
                }
            }
            if (rx2Var == null) {
                return false;
            }
            if (rx2.r.compareAndSet(rx2Var, -1, 0)) {
                LockSupport.unpark(rx2Var);
                return true;
            }
            this = tx2Var;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qd9 qd9Var = this.h;
        int a = qd9Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            rx2 rx2Var = (rx2) qd9Var.b(i6);
            if (rx2Var != null) {
                f3d f3dVar = rx2Var.a;
                f3dVar.getClass();
                Object objectVolatile = fx.a.getObjectVolatile(f3dVar, f3d.f);
                int a2 = f3dVar.a();
                if (objectVolatile != null) {
                    a2++;
                }
                int ordinal = rx2Var.c.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(a2);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a2);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (a2 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(a2);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new zp2();
                    }
                    i5++;
                }
            }
        }
        long j = r.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(l93.a(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.a;
        sb4.append(i7);
        sb4.append(", max = ");
        bs2.w(sb4, this.b, "}, Worker States {CPU = ", i, ", blocking = ");
        bs2.w(sb4, i2, ", parked = ", i3, ", dormant = ");
        bs2.w(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
