// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class r0a {
    public static final /* synthetic */ AtomicLongFieldUpdater b;
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final ma1 a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = ex.a;
        f = unsafe.objectFieldOffset(r0a.class.getDeclaredField("head$volatile"));
        b = AtomicLongFieldUpdater.newUpdater(r0a.class, "deqIdx$volatile");
        g = unsafe.objectFieldOffset(r0a.class.getDeclaredField("tail$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(r0a.class, "enqIdx$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(r0a.class, "_availablePermits$volatile");
        e = unsafe.objectFieldOffset(r0a.class.getDeclaredField("_availablePermits$volatile"));
    }

    public r0a() {
        t0a t0aVar = new t0a(0L, null, 2);
        this.head$volatile = t0aVar;
        this.tail$volatile = t0aVar;
        this._availablePermits$volatile = 1;
        this.a = new ma1((Object) this, (byte) 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r5.f() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        r5.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(mh7 mh7Var) {
        Object b2;
        g5c g5cVar;
        long j;
        p0a p0aVar;
        long j2;
        long j3;
        na1 na1Var = mh7Var.a;
        nh7 nh7Var = mh7Var.b;
        while (true) {
            int andDecrement = d.getAndDecrement(this);
            if (andDecrement <= 1) {
                byte b3 = 0;
                g5c g5cVar2 = g5c.a;
                if (andDecrement > 0) {
                    nh7.h.set(nh7Var, null);
                    na1Var.B(g5cVar2, na1Var.c, new ma1(new z1(nh7Var, mh7Var), b3));
                    return;
                }
                Unsafe unsafe = ex.a;
                long j4 = g;
                t0a t0aVar = (t0a) unsafe.getObjectVolatile(this, j4);
                long andIncrement = c.getAndIncrement(this);
                p0a p0aVar2 = p0a.a;
                long j5 = andIncrement / s0a.f;
                while (true) {
                    b2 = bd3.b(t0aVar, j5, p0aVar2);
                    if (ste.b(b2)) {
                        g5cVar = g5cVar2;
                        break;
                    }
                    nv9 a = ste.a(b2);
                    while (true) {
                        nv9 nv9Var = (nv9) ex.a.getObjectVolatile(this, j4);
                        g5cVar = g5cVar2;
                        j = j4;
                        if (nv9Var.d >= a.d) {
                            break;
                        }
                        if (!a.j()) {
                            break;
                        }
                        p0aVar = p0aVar2;
                        while (true) {
                            Unsafe unsafe2 = ex.a;
                            j2 = j5;
                            if (!unsafe2.compareAndSwapObject(this, g, nv9Var, a)) {
                                j3 = j;
                                if (unsafe2.getObjectVolatile(this, j3) != nv9Var) {
                                    break;
                                }
                                j = j3;
                                j5 = j2;
                            } else if (nv9Var.f()) {
                                nv9Var.e();
                            }
                        }
                        j4 = j3;
                        p0aVar2 = p0aVar;
                        j5 = j2;
                        g5cVar2 = g5cVar;
                    }
                    g5cVar2 = g5cVar;
                    j4 = j;
                }
                t0a t0aVar2 = (t0a) ste.a(b2);
                AtomicReferenceArray atomicReferenceArray = t0aVar2.g;
                int i = (int) (andIncrement % s0a.f);
                while (!atomicReferenceArray.compareAndSet(i, null, mh7Var)) {
                    if (atomicReferenceArray.get(i) != null) {
                        lo5 lo5Var = s0a.b;
                        lo5 lo5Var2 = s0a.c;
                        while (!atomicReferenceArray.compareAndSet(i, lo5Var, lo5Var2)) {
                            g5c g5cVar3 = g5cVar;
                            if (atomicReferenceArray.get(i) == lo5Var) {
                                g5cVar = g5cVar3;
                            }
                        }
                        nh7.h.set(nh7Var, null);
                        na1Var.B(g5cVar, na1Var.c, new ma1((Object) new z1(nh7Var, mh7Var), (byte) 0));
                        return;
                    }
                }
                mh7Var.a(t0aVar2, i);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (r5.f() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        r5.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        Object b2;
        boolean z;
        boolean z2;
        long j;
        long j2;
        r0a r0aVar = this;
        do {
            int andIncrement = d.getAndIncrement(r0aVar);
            boolean z3 = true;
            if (andIncrement >= 1) {
                while (true) {
                    Unsafe unsafe = ex.a;
                    long j3 = e;
                    int intVolatile = unsafe.getIntVolatile(r0aVar, j3);
                    if (intVolatile <= 1 || unsafe.compareAndSwapInt(r0aVar, j3, intVolatile, 1)) {
                        break;
                    } else {
                        r0aVar = this;
                    }
                }
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe2 = ex.a;
            long j4 = f;
            t0a t0aVar = (t0a) unsafe2.getObjectVolatile(r0aVar, j4);
            long andIncrement2 = b.getAndIncrement(r0aVar);
            long j5 = andIncrement2 / s0a.f;
            q0a q0aVar = q0a.a;
            while (true) {
                b2 = bd3.b(t0aVar, j5, q0aVar);
                if (ste.b(b2)) {
                    z = z3;
                    break;
                }
                nv9 a = ste.a(b2);
                while (true) {
                    nv9 nv9Var = (nv9) ex.a.getObjectVolatile(r0aVar, j4);
                    z = z3;
                    j = j4;
                    if (nv9Var.d >= a.d) {
                        break;
                    }
                    if (!a.j()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe3 = ex.a;
                        if (!unsafe3.compareAndSwapObject(r0aVar, f, nv9Var, a)) {
                            j2 = j;
                            if (unsafe3.getObjectVolatile(r0aVar, j2) != nv9Var) {
                                break;
                            } else {
                                j = j2;
                            }
                        } else if (nv9Var.f()) {
                            nv9Var.e();
                        }
                    }
                    j4 = j2;
                    z3 = z;
                }
                z3 = z;
                j4 = j;
            }
            t0a t0aVar2 = (t0a) ste.a(b2);
            AtomicReferenceArray atomicReferenceArray = t0aVar2.g;
            t0aVar2.b();
            boolean z4 = false;
            if (t0aVar2.d <= j5) {
                int i = (int) (andIncrement2 % s0a.f);
                Object andSet = atomicReferenceArray.getAndSet(i, s0a.b);
                if (andSet == null) {
                    int i2 = s0a.a;
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (atomicReferenceArray.get(i) != s0a.c) {
                        }
                    }
                    lo5 lo5Var = s0a.b;
                    lo5 lo5Var2 = s0a.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i, lo5Var, lo5Var2)) {
                            if (atomicReferenceArray.get(i) != lo5Var) {
                                break;
                            }
                        } else {
                            z4 = z;
                            break;
                        }
                    }
                    z2 = !z4;
                } else if (andSet != s0a.e) {
                    if (!(andSet instanceof la1)) {
                        wn4.n(andSet, "unexpected: ");
                        return;
                    }
                    la1 la1Var = (la1) andSet;
                    lo5 b3 = la1Var.b(g5c.a, r0aVar.a);
                    if (b3 != null) {
                        la1Var.e(b3);
                    }
                }
                z2 = z;
                break;
            }
            z2 = false;
        } while (!z2);
    }
}
