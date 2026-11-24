// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class t2a {
    public static final /* synthetic */ AtomicLongFieldUpdater b;
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final ub1 a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = fy.a;
        f = unsafe.objectFieldOffset(t2a.class.getDeclaredField("head$volatile"));
        b = AtomicLongFieldUpdater.newUpdater(t2a.class, "deqIdx$volatile");
        g = unsafe.objectFieldOffset(t2a.class.getDeclaredField("tail$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(t2a.class, "enqIdx$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(t2a.class, "_availablePermits$volatile");
        e = unsafe.objectFieldOffset(t2a.class.getDeclaredField("_availablePermits$volatile"));
    }

    public t2a() {
        v2a v2aVar = new v2a(0L, null, 2);
        this.head$volatile = v2aVar;
        this.tail$volatile = v2aVar;
        this._availablePermits$volatile = 1;
        this.a = new ub1((Object) this, (byte) 2);
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
    public final void a(pj7 pj7Var) {
        Object b2;
        g7c g7cVar;
        long j;
        r2a r2aVar;
        long j2;
        long j3;
        vb1 vb1Var = pj7Var.a;
        qj7 qj7Var = pj7Var.b;
        while (true) {
            int andDecrement = d.getAndDecrement(this);
            if (andDecrement <= 1) {
                byte b3 = 0;
                g7c g7cVar2 = g7c.a;
                if (andDecrement > 0) {
                    qj7.h.set(qj7Var, null);
                    vb1Var.B(g7cVar2, vb1Var.c, new ub1(new z1(qj7Var, pj7Var), b3));
                    return;
                }
                Unsafe unsafe = fy.a;
                long j4 = g;
                v2a v2aVar = (v2a) unsafe.getObjectVolatile(this, j4);
                long andIncrement = c.getAndIncrement(this);
                r2a r2aVar2 = r2a.a;
                long j5 = andIncrement / u2a.f;
                while (true) {
                    b2 = ne3.b(v2aVar, j5, r2aVar2);
                    if (vve.b(b2)) {
                        g7cVar = g7cVar2;
                        break;
                    }
                    qx9 a = vve.a(b2);
                    while (true) {
                        qx9 qx9Var = (qx9) fy.a.getObjectVolatile(this, j4);
                        g7cVar = g7cVar2;
                        j = j4;
                        if (qx9Var.d >= a.d) {
                            break;
                        }
                        if (!a.j()) {
                            break;
                        }
                        r2aVar = r2aVar2;
                        while (true) {
                            Unsafe unsafe2 = fy.a;
                            j2 = j5;
                            if (!unsafe2.compareAndSwapObject(this, g, qx9Var, a)) {
                                j3 = j;
                                if (unsafe2.getObjectVolatile(this, j3) != qx9Var) {
                                    break;
                                }
                                j = j3;
                                j5 = j2;
                            } else if (qx9Var.f()) {
                                qx9Var.e();
                            }
                        }
                        j4 = j3;
                        r2aVar2 = r2aVar;
                        j5 = j2;
                        g7cVar2 = g7cVar;
                    }
                    g7cVar2 = g7cVar;
                    j4 = j;
                }
                v2a v2aVar2 = (v2a) vve.a(b2);
                AtomicReferenceArray atomicReferenceArray = v2aVar2.g;
                int i = (int) (andIncrement % u2a.f);
                while (!atomicReferenceArray.compareAndSet(i, null, pj7Var)) {
                    if (atomicReferenceArray.get(i) != null) {
                        du2 du2Var = u2a.b;
                        du2 du2Var2 = u2a.c;
                        while (!atomicReferenceArray.compareAndSet(i, du2Var, du2Var2)) {
                            g7c g7cVar3 = g7cVar;
                            if (atomicReferenceArray.get(i) == du2Var) {
                                g7cVar = g7cVar3;
                            }
                        }
                        qj7.h.set(qj7Var, null);
                        vb1Var.B(g7cVar, vb1Var.c, new ub1((Object) new z1(qj7Var, pj7Var), (byte) 0));
                        return;
                    }
                }
                pj7Var.a(v2aVar2, i);
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
        t2a t2aVar = this;
        do {
            int andIncrement = d.getAndIncrement(t2aVar);
            boolean z3 = true;
            if (andIncrement >= 1) {
                while (true) {
                    Unsafe unsafe = fy.a;
                    long j3 = e;
                    int intVolatile = unsafe.getIntVolatile(t2aVar, j3);
                    if (intVolatile <= 1 || unsafe.compareAndSwapInt(t2aVar, j3, intVolatile, 1)) {
                        break;
                    } else {
                        t2aVar = this;
                    }
                }
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe2 = fy.a;
            long j4 = f;
            v2a v2aVar = (v2a) unsafe2.getObjectVolatile(t2aVar, j4);
            long andIncrement2 = b.getAndIncrement(t2aVar);
            long j5 = andIncrement2 / u2a.f;
            s2a s2aVar = s2a.a;
            while (true) {
                b2 = ne3.b(v2aVar, j5, s2aVar);
                if (vve.b(b2)) {
                    z = z3;
                    break;
                }
                qx9 a = vve.a(b2);
                while (true) {
                    qx9 qx9Var = (qx9) fy.a.getObjectVolatile(t2aVar, j4);
                    z = z3;
                    j = j4;
                    if (qx9Var.d >= a.d) {
                        break;
                    }
                    if (!a.j()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe3 = fy.a;
                        if (!unsafe3.compareAndSwapObject(t2aVar, f, qx9Var, a)) {
                            j2 = j;
                            if (unsafe3.getObjectVolatile(t2aVar, j2) != qx9Var) {
                                break;
                            } else {
                                j = j2;
                            }
                        } else if (qx9Var.f()) {
                            qx9Var.e();
                        }
                    }
                    j4 = j2;
                    z3 = z;
                }
                z3 = z;
                j4 = j;
            }
            v2a v2aVar2 = (v2a) vve.a(b2);
            AtomicReferenceArray atomicReferenceArray = v2aVar2.g;
            v2aVar2.b();
            boolean z4 = false;
            if (v2aVar2.d <= j5) {
                int i = (int) (andIncrement2 % u2a.f);
                Object andSet = atomicReferenceArray.getAndSet(i, u2a.b);
                if (andSet == null) {
                    int i2 = u2a.a;
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (atomicReferenceArray.get(i) != u2a.c) {
                        }
                    }
                    du2 du2Var = u2a.b;
                    du2 du2Var2 = u2a.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i, du2Var, du2Var2)) {
                            if (atomicReferenceArray.get(i) != du2Var) {
                                break;
                            }
                        } else {
                            z4 = z;
                            break;
                        }
                    }
                    z2 = !z4;
                } else if (andSet != u2a.e) {
                    if (!(andSet instanceof tb1)) {
                        zo4.p(andSet, "unexpected: ");
                        return;
                    }
                    tb1 tb1Var = (tb1) andSet;
                    du2 b3 = tb1Var.b(g7c.a, t2aVar.a);
                    if (b3 != null) {
                        tb1Var.e(b3);
                    }
                }
                z2 = z;
                break;
            }
            z2 = false;
        } while (!z2);
    }
}
