// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class z01 implements xe1 {
    public static final /* synthetic */ long E;
    public static final /* synthetic */ long F;
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(z01.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public static final /* synthetic */ AtomicReferenceFieldUpdater f;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long r;
    public static final /* synthetic */ long s;
    public static final /* synthetic */ long w;
    public static final /* synthetic */ long x;
    public static final /* synthetic */ long y;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = fx.a;
        F = unsafe.objectFieldOffset(z01.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(z01.class, "receivers$volatile");
        y = unsafe.objectFieldOffset(z01.class.getDeclaredField("receivers$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(z01.class, "bufferEnd$volatile");
        n = unsafe.objectFieldOffset(z01.class.getDeclaredField("bufferEnd$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(z01.class, "completedExpandBuffersAndPauseFlag$volatile");
        w = unsafe.objectFieldOffset(z01.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        E = unsafe.objectFieldOffset(z01.class.getDeclaredField("sendSegment$volatile"));
        f = AtomicReferenceFieldUpdater.newUpdater(z01.class, Object.class, "receiveSegment$volatile");
        x = unsafe.objectFieldOffset(z01.class.getDeclaredField("receiveSegment$volatile"));
        r = unsafe.objectFieldOffset(z01.class.getDeclaredField("bufferEndSegment$volatile"));
        h = unsafe.objectFieldOffset(z01.class.getDeclaredField("_closeCause$volatile"));
        s = unsafe.objectFieldOffset(z01.class.getDeclaredField("closeHandler$volatile"));
    }

    public z01(int i) {
        this.a = i;
        if (i < 0) {
            bya.a(qd4.n(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        qj1 qj1Var = b11.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = j();
        qj1 qj1Var2 = new qj1(0L, null, this, 3);
        this.sendSegment$volatile = qj1Var2;
        this.receiveSegment$volatile = qj1Var2;
        if (v()) {
            qj1Var2 = b11.a;
            qj1Var2.getClass();
        }
        this.bufferEndSegment$volatile = qj1Var2;
        this._closeCause$volatile = b11.s;
    }

    public static boolean B(Object obj) {
        if (!(obj instanceof ta1)) {
            lq5.i(obj, "Unexpected waiter: ");
            return false;
        }
        ta1 ta1Var = (ta1) obj;
        qj1 qj1Var = b11.a;
        ow5 b2 = ta1Var.b(f9c.a, null);
        if (b2 == null) {
            return false;
        }
        ta1Var.e(b2);
        return true;
    }

    public final boolean A(Object obj, Object obj2) {
        if (!(obj instanceof y01)) {
            if (!(obj instanceof ta1)) {
                lq5.i(obj, "Unexpected receiver type: ");
                return false;
            }
            ta1 ta1Var = (ta1) obj;
            qj1 qj1Var = b11.a;
            ow5 b2 = ta1Var.b(obj2, null);
            if (b2 == null) {
                return false;
            }
            ta1Var.e(b2);
            return true;
        }
        y01 y01Var = (y01) obj;
        va1 va1Var = y01Var.b;
        va1Var.getClass();
        y01Var.b = null;
        y01Var.a = obj2;
        Boolean bool = Boolean.TRUE;
        qj1 qj1Var2 = b11.a;
        ow5 b3 = va1Var.b(bool, null);
        if (b3 == null) {
            return false;
        }
        va1Var.e(b3);
        return true;
    }

    public final Object C(qj1 qj1Var, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = qj1Var.h;
        Object l = qj1Var.l(i);
        long j2 = F;
        if (l == null) {
            if (j >= (fx.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return b11.n;
                }
                if (qj1Var.k(i, l, obj)) {
                    g();
                    return b11.m;
                }
            }
        } else if (l == b11.d && qj1Var.k(i, l, b11.i)) {
            g();
            Object obj2 = atomicReferenceArray.get(i << 1);
            qj1Var.n(i, null);
            return obj2;
        }
        while (true) {
            Object l2 = qj1Var.l(i);
            if (l2 == null || l2 == b11.e) {
                if (j < (fx.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (qj1Var.k(i, l2, b11.h)) {
                        g();
                        return b11.o;
                    }
                } else {
                    if (obj == null) {
                        return b11.n;
                    }
                    if (qj1Var.k(i, l2, obj)) {
                        g();
                        return b11.m;
                    }
                }
            } else if (l2 != b11.d) {
                ow5 ow5Var = b11.j;
                if (l2 == ow5Var) {
                    return b11.o;
                }
                if (l2 == b11.h) {
                    return b11.o;
                }
                if (l2 == b11.l) {
                    g();
                    return b11.o;
                }
                if (l2 != b11.g && qj1Var.k(i, l2, b11.f)) {
                    boolean z = l2 instanceof ooc;
                    if (z) {
                        l2 = ((ooc) l2).a;
                    }
                    if (B(l2)) {
                        qj1Var.o(i, b11.i);
                        g();
                        Object obj3 = atomicReferenceArray.get(i << 1);
                        qj1Var.n(i, null);
                        return obj3;
                    }
                    qj1Var.o(i, ow5Var);
                    qj1Var.i();
                    if (z) {
                        g();
                    }
                    return b11.o;
                }
            } else if (qj1Var.k(i, l2, b11.i)) {
                g();
                Object obj4 = atomicReferenceArray.get(i << 1);
                qj1Var.n(i, null);
                return obj4;
            }
        }
    }

    public final int D(qj1 qj1Var, int i, Object obj, long j, Object obj2, boolean z) {
        qj1Var.n(i, obj);
        if (z) {
            return E(qj1Var, i, obj, j, obj2, z);
        }
        Object l = qj1Var.l(i);
        if (l == null) {
            if (b(j)) {
                if (qj1Var.k(i, null, b11.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (qj1Var.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (l instanceof noc) {
            qj1Var.n(i, null);
            if (A(l, obj)) {
                qj1Var.o(i, b11.i);
                return 0;
            }
            ow5 ow5Var = b11.k;
            if (qj1Var.h.getAndSet((i << 1) + 1, ow5Var) == ow5Var) {
                return 5;
            }
            qj1Var.m(i, true);
            return 5;
        }
        return E(qj1Var, i, obj, j, obj2, z);
    }

    public final int E(qj1 qj1Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object l = qj1Var.l(i);
            if (l == null) {
                if (!b(j) || z) {
                    if (z) {
                        if (qj1Var.k(i, null, b11.j)) {
                            qj1Var.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (qj1Var.k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (qj1Var.k(i, null, b11.d)) {
                    break;
                }
            } else {
                if (l != b11.e) {
                    ow5 ow5Var = b11.k;
                    if (l == ow5Var) {
                        qj1Var.n(i, null);
                        return 5;
                    }
                    if (l == b11.h) {
                        qj1Var.n(i, null);
                        return 5;
                    }
                    if (l == b11.l) {
                        qj1Var.n(i, null);
                        t();
                        return 4;
                    }
                    qj1Var.n(i, null);
                    if (l instanceof ooc) {
                        l = ((ooc) l).a;
                    }
                    if (A(l, obj)) {
                        qj1Var.o(i, b11.i);
                        return 0;
                    }
                    if (qj1Var.h.getAndSet((i << 1) + 1, ow5Var) != ow5Var) {
                        qj1Var.m(i, true);
                    }
                    return 5;
                }
                if (qj1Var.k(i, l, b11.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void F(long j) {
        z01 z01Var = this;
        if (z01Var.v()) {
            return;
        }
        while (z01Var.j() <= j) {
            z01Var = this;
        }
        int i = b11.c;
        int i2 = 0;
        while (true) {
            long j2 = w;
            if (i2 < i) {
                long j3 = z01Var.j();
                if (j3 == (fx.a.getLongVolatile(z01Var, j2) & 4611686018427387903L) && j3 == z01Var.j()) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = fx.a;
                    long longVolatile = unsafe.getLongVolatile(z01Var, j2);
                    if (unsafe.compareAndSwapLong(z01Var, w, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        z01Var = this;
                    }
                }
                while (true) {
                    long j4 = z01Var.j();
                    Unsafe unsafe2 = fx.a;
                    long longVolatile2 = unsafe2.getLongVolatile(z01Var, j2);
                    long j5 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (j4 == j5 && j4 == z01Var.j()) {
                        break;
                    }
                    if (z) {
                        z01Var = this;
                    } else {
                        z01Var = this;
                        unsafe2.compareAndSwapLong(z01Var, w, longVolatile2, j5 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = fx.a;
                    long longVolatile3 = unsafe3.getLongVolatile(z01Var, j2);
                    if (unsafe3.compareAndSwapLong(z01Var, w, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        z01Var = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152 A[RETURN] */
    @Override // o4a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(zw2 zw2Var, Object obj) {
        Object obj2;
        Object obj3;
        Object q;
        Object obj4;
        String str;
        int i;
        z01 z01Var = this;
        Unsafe unsafe = fx.a;
        long j = E;
        qj1 qj1Var = (qj1) unsafe.getObjectVolatile(z01Var, j);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(z01Var);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r2 = z01Var.r(andIncrement, false);
            int i2 = b11.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = qj1Var.d;
            Object obj5 = vx2.a;
            obj2 = f9c.a;
            if (j5 != j4) {
                qj1 i4 = z01Var.i(j4, qj1Var);
                if (i4 != null) {
                    qj1Var = i4;
                } else if (r2) {
                    Object x2 = x(zw2Var, obj);
                    if (x2 == obj5) {
                        return x2;
                    }
                }
            }
            int D = z01Var.D(qj1Var, i3, obj, j2, null, r2);
            if (D == 0) {
                qj1Var.b();
                return obj2;
            }
            if (D == 1) {
                break;
            }
            if (D != 2) {
                if (D == 3) {
                    va1 a = yud.a(xpe.a(zw2Var));
                    try {
                        int D2 = D(qj1Var, i3, obj, j2, a, false);
                        if (D2 != 0) {
                            if (D2 == 1) {
                                obj3 = obj5;
                                a.resumeWith(obj2);
                            } else if (D2 != 2) {
                                if (D2 != 4) {
                                    String str2 = "unexpected";
                                    if (D2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    qj1Var.b();
                                    qj1 qj1Var2 = (qj1) fx.a.getObjectVolatile(this, j);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean r3 = r(andIncrement2, false);
                                        int i5 = b11.b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                                        long j7 = i5;
                                        obj3 = obj5;
                                        long j8 = j6 / j7;
                                        int i6 = (int) (j6 % j7);
                                        if (qj1Var2.d != j8) {
                                            qj1 i7 = i(j8, qj1Var2);
                                            if (i7 != null) {
                                                str = str2;
                                                i = i6;
                                                qj1Var2 = i7;
                                            } else {
                                                if (r3) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                obj5 = obj3;
                                            }
                                        } else {
                                            str = str2;
                                            i = i6;
                                        }
                                        int D3 = D(qj1Var2, i, obj, j6, a, r3);
                                        if (D3 == 0) {
                                            qj1Var2.b();
                                            break;
                                        }
                                        if (D3 == 1) {
                                            break;
                                        }
                                        if (D3 != 2) {
                                            if (D3 == 3) {
                                                throw new IllegalStateException(str);
                                            }
                                            if (D3 != 4) {
                                                if (D3 == 5) {
                                                    qj1Var2.b();
                                                }
                                                str2 = str;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                obj5 = obj3;
                                            } else if (j6 < m()) {
                                                qj1Var2.b();
                                            }
                                        } else if (r3) {
                                            qj1Var2.i();
                                        } else {
                                            a.a(qj1Var2, i + i5);
                                        }
                                    }
                                } else {
                                    obj3 = obj5;
                                    if (j2 < m()) {
                                        qj1Var.b();
                                    }
                                }
                                y(obj, a);
                            } else {
                                obj3 = obj5;
                                a.a(qj1Var, i3 + i2);
                            }
                            q = a.q();
                            obj4 = obj3;
                            if (q != obj4) {
                                q = obj2;
                            }
                            if (q != obj4) {
                                return q;
                            }
                        } else {
                            obj3 = obj5;
                            qj1Var.b();
                        }
                        a.resumeWith(obj2);
                        q = a.q();
                        obj4 = obj3;
                        if (q != obj4) {
                        }
                        if (q != obj4) {
                            break;
                        }
                    } catch (Throwable th) {
                        a.z();
                        throw th;
                    }
                } else if (D != 4) {
                    if (D == 5) {
                        qj1Var.b();
                    }
                    z01Var = this;
                } else {
                    if (j2 < m()) {
                        qj1Var.b();
                    }
                    Object x3 = x(zw2Var, obj);
                    if (x3 == obj5) {
                        return x3;
                    }
                }
            } else if (r2) {
                qj1Var.i();
                Object x4 = x(zw2Var, obj);
                if (x4 == obj5) {
                    return x4;
                }
            }
        }
        return obj2;
    }

    public final boolean b(long j) {
        return j < j() || j < m() + ((long) this.a);
    }

    public final boolean c(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j3;
        long longVolatile2;
        z01 z01Var = this;
        if (z) {
            while (true) {
                Unsafe unsafe4 = fx.a;
                long j4 = F;
                long longVolatile3 = unsafe4.getLongVolatile(z01Var, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                qj1 qj1Var = b11.a;
                if (unsafe4.compareAndSwapLong(z01Var, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                z01Var = this;
            }
        }
        ow5 ow5Var = b11.s;
        while (true) {
            Unsafe unsafe5 = fx.a;
            long j5 = h;
            if (unsafe5.compareAndSwapObject(this, j5, ow5Var, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j5) != ow5Var) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = fx.a;
                j3 = F;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = fx.a;
                j = F;
                longVolatile = unsafe.getLongVolatile(this, j);
                int i = (int) (longVolatile >> 60);
                if (i == 0) {
                    j2 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        }
        t();
        if (z2) {
            loop3: while (true) {
                Unsafe unsafe6 = fx.a;
                long j6 = s;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                ow5 ow5Var2 = objectVolatile == null ? b11.q : b11.r;
                do {
                    unsafe2 = fx.a;
                    if (unsafe2.compareAndSwapObject(this, s, objectVolatile, ow5Var2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                q7c.a(1, objectVolatile);
                ((ur4) objectVolatile).invoke(k());
                return z2;
            }
        }
        return z2;
    }

    @Override // xe1
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        c(cancellationException, true);
    }

    @Override // o4a
    public Object d(Object obj) {
        z01 z01Var = this;
        Unsafe unsafe = fx.a;
        long j = 1152921504606846975L;
        boolean z = z01Var.r(unsafe.getLongVolatile(z01Var, F), false) ? false : !z01Var.b(r2 & 1152921504606846975L);
        oj1 oj1Var = pj1.b;
        if (z) {
            return oj1Var;
        }
        Object obj2 = b11.j;
        qj1 qj1Var = (qj1) unsafe.getObjectVolatile(z01Var, E);
        while (true) {
            long andIncrement = b.getAndIncrement(z01Var);
            long j2 = andIncrement & j;
            boolean r2 = z01Var.r(andIncrement, false);
            int i = b11.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (qj1Var.d != j4) {
                qj1 i3 = z01Var.i(j4, qj1Var);
                if (i3 != null) {
                    qj1Var = i3;
                } else {
                    if (r2) {
                        return new nj1(z01Var.n());
                    }
                    j = 1152921504606846975L;
                }
            }
            int D = z01Var.D(qj1Var, i2, obj, j2, obj2, r2);
            f9c f9cVar = f9c.a;
            if (D == 0) {
                qj1Var.b();
                return f9cVar;
            }
            if (D == 1) {
                return f9cVar;
            }
            if (D == 2) {
                if (r2) {
                    qj1Var.i();
                    return new nj1(n());
                }
                noc nocVar = obj2 instanceof noc ? (noc) obj2 : null;
                if (nocVar != null) {
                    nocVar.a(qj1Var, i2 + i);
                }
                qj1Var.i();
                return oj1Var;
            }
            if (D == 3) {
                grb.i("unexpected");
                return null;
            }
            if (D == 4) {
                if (j2 < m()) {
                    qj1Var.b();
                }
                return new nj1(n());
            }
            if (D == 5) {
                qj1Var.b();
            }
            j = 1152921504606846975L;
            z01Var = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
    
        r0 = (qj1) ((nr2) fx.a.getObjectVolatile(r0, nr2.b));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qj1 e(long j) {
        nr2 nr2Var;
        long j2;
        Unsafe unsafe;
        long j3;
        Unsafe unsafe2 = fx.a;
        Object objectVolatile = unsafe2.getObjectVolatile(this, r);
        qj1 qj1Var = (qj1) unsafe2.getObjectVolatile(this, E);
        if (qj1Var.d > ((qj1) objectVolatile).d) {
            objectVolatile = qj1Var;
        }
        qj1 qj1Var2 = (qj1) unsafe2.getObjectVolatile(this, x);
        if (qj1Var2.d > ((qj1) objectVolatile).d) {
            objectVolatile = qj1Var2;
        }
        nr2 nr2Var2 = (nr2) objectVolatile;
        loop0: while (true) {
            nr2Var = nr2Var2;
            while (true) {
                int i = nr2.c;
                nr2Var.getClass();
                Object objectVolatile2 = fx.a.getObjectVolatile(nr2Var, nr2.a);
                ow5 ow5Var = td3.a;
                if (objectVolatile2 == ow5Var) {
                    break loop0;
                }
                nr2Var2 = (nr2) objectVolatile2;
                if (nr2Var2 == null) {
                    do {
                        unsafe = fx.a;
                        j3 = nr2.a;
                        if (unsafe.compareAndSwapObject(nr2Var, j3, (Object) null, ow5Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(nr2Var, j3) == null);
                }
            }
        }
        qj1 qj1Var3 = (qj1) nr2Var;
        if (u()) {
            qj1 qj1Var4 = qj1Var3;
            loop3: do {
                int i2 = b11.b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j2 = (qj1Var4.d * b11.b) + i2;
                    if (j2 < m()) {
                        break loop3;
                    }
                    while (true) {
                        Object l = qj1Var4.l(i2);
                        if (l != null && l != b11.e) {
                            if (l == b11.d) {
                                break loop3;
                            }
                        } else {
                            if (qj1Var4.k(i2, l, b11.l)) {
                                qj1Var4.i();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (qj1Var4 != null);
            j2 = -1;
            if (j2 != -1) {
                f(j2);
            }
        }
        Object obj = null;
        loop6: for (qj1 qj1Var5 = qj1Var3; qj1Var5 != null; qj1Var5 = (qj1) ((nr2) fx.a.getObjectVolatile(qj1Var5, nr2.b))) {
            for (int i3 = b11.b - 1; -1 < i3; i3--) {
                if ((qj1Var5.d * b11.b) + i3 < j) {
                    break loop6;
                }
                while (true) {
                    Object l2 = qj1Var5.l(i3);
                    if (l2 != null && l2 != b11.e) {
                        if (!(l2 instanceof ooc)) {
                            if (!(l2 instanceof noc)) {
                                break;
                            }
                            if (qj1Var5.k(i3, l2, b11.l)) {
                                obj = ppe.a(obj, l2);
                                qj1Var5.m(i3, true);
                                break;
                            }
                        } else {
                            if (qj1Var5.k(i3, l2, b11.l)) {
                                obj = ppe.a(obj, ((ooc) l2).a);
                                qj1Var5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (qj1Var5.k(i3, l2, b11.l)) {
                            qj1Var5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                z((noc) obj, true);
                return qj1Var3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                z((noc) arrayList.get(size), true);
            }
        }
        return qj1Var3;
    }

    public final void f(long j) {
        qj1 qj1Var = (qj1) fx.a.getObjectVolatile(this, x);
        while (true) {
            Unsafe unsafe = fx.a;
            long j2 = y;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(this.a + longVolatile, this.j())) {
                return;
            }
            z01 z01Var = this;
            if (unsafe.compareAndSwapLong(z01Var, j2, longVolatile, 1 + longVolatile)) {
                long j3 = b11.b;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (qj1Var.d != j4) {
                    qj1 h2 = z01Var.h(j4, qj1Var);
                    if (h2 != null) {
                        qj1Var = h2;
                    }
                }
                qj1 qj1Var2 = qj1Var;
                if (z01Var.C(qj1Var2, i, longVolatile, null) != b11.o) {
                    qj1Var2.b();
                } else if (longVolatile < z01Var.o()) {
                    qj1Var2.b();
                }
                this = z01Var;
                qj1Var = qj1Var2;
            }
            this = z01Var;
        }
    }

    public final void g() {
        Object b2;
        Unsafe unsafe;
        if (v()) {
            return;
        }
        Unsafe unsafe2 = fx.a;
        long j = r;
        qj1 qj1Var = (qj1) unsafe2.getObjectVolatile(this, j);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j2 = andIncrement / b11.b;
            if (o() <= andIncrement) {
                if (qj1Var.d < j2 && qj1Var.c() != null) {
                    w(j2, qj1Var);
                }
                p(1L);
                return;
            }
            if (qj1Var.d != j2) {
                a11 a11Var = a11.a;
                while (true) {
                    b2 = td3.b(qj1Var, j2, a11Var);
                    if (mye.b(b2)) {
                        break;
                    }
                    hz9 a = mye.a(b2);
                    while (true) {
                        hz9 hz9Var = (hz9) fx.a.getObjectVolatile(this, j);
                        if (hz9Var.d >= a.d) {
                            break;
                        }
                        if (a.j()) {
                            do {
                                unsafe = fx.a;
                                if (unsafe.compareAndSwapObject(this, r, hz9Var, a)) {
                                    if (hz9Var.f()) {
                                        hz9Var.e();
                                    }
                                }
                            } while (unsafe.getObjectVolatile(this, j) == hz9Var);
                            if (a.f()) {
                                a.e();
                            }
                        }
                    }
                }
                qj1 qj1Var2 = null;
                if (mye.b(b2)) {
                    t();
                    w(j2, qj1Var);
                    p(1L);
                } else {
                    qj1 qj1Var3 = (qj1) mye.a(b2);
                    long j3 = qj1Var3.d;
                    if (j3 > j2) {
                        long j4 = b11.b * j3;
                        if (fx.a.compareAndSwapLong(this, n, 1 + andIncrement, j4)) {
                            p(j4 - andIncrement);
                        } else {
                            p(1L);
                        }
                    } else {
                        qj1Var2 = qj1Var3;
                    }
                }
                if (qj1Var2 != null) {
                    qj1Var = qj1Var2;
                } else {
                    continue;
                }
            }
            int i = (int) (andIncrement % b11.b);
            Object l = qj1Var.l(i);
            boolean z = l instanceof noc;
            long j5 = y;
            if (!z || andIncrement < fx.a.getLongVolatile(this, j5) || !qj1Var.k(i, l, b11.g)) {
                while (true) {
                    Object l2 = qj1Var.l(i);
                    if (!(l2 instanceof noc)) {
                        if (l2 != b11.j) {
                            if (l2 != null) {
                                if (l2 == b11.d || l2 == b11.h || l2 == b11.i || l2 == b11.k || l2 == b11.l) {
                                    break loop0;
                                } else if (l2 != b11.f) {
                                    lq5.i(l2, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (qj1Var.k(i, l2, b11.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < fx.a.getLongVolatile(this, j5)) {
                        if (qj1Var.k(i, l2, new ooc((noc) l2))) {
                            break loop0;
                        }
                    } else if (qj1Var.k(i, l2, b11.g)) {
                        if (B(l2)) {
                            qj1Var.o(i, b11.d);
                            break;
                        } else {
                            qj1Var.o(i, b11.j);
                            qj1Var.i();
                        }
                    }
                }
                p(1L);
            } else if (B(l)) {
                qj1Var.o(i, b11.d);
                break;
            } else {
                qj1Var.o(i, b11.j);
                qj1Var.i();
                p(1L);
            }
        }
        p(1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
    
        if (r8.f() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
    
        r8.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qj1 h(long j, qj1 qj1Var) {
        Object b2;
        qj1 qj1Var2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        Unsafe unsafe2;
        qj1 qj1Var3 = b11.a;
        a11 a11Var = a11.a;
        loop0: while (true) {
            b2 = td3.b(qj1Var, j, a11Var);
            if (mye.b(b2)) {
                break;
            }
            hz9 a = mye.a(b2);
            while (true) {
                Unsafe unsafe3 = fx.a;
                long j3 = x;
                hz9 hz9Var = (hz9) unsafe3.getObjectVolatile(this, j3);
                if (hz9Var.d >= a.d) {
                    break loop0;
                }
                if (a.j()) {
                    do {
                        unsafe2 = fx.a;
                        if (unsafe2.compareAndSwapObject(this, x, hz9Var, a)) {
                            if (hz9Var.f()) {
                                hz9Var.e();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j3) == hz9Var);
                    if (a.f()) {
                        a.e();
                    }
                }
            }
        }
        if (mye.b(b2)) {
            t();
            if (qj1Var.d * b11.b < o()) {
                qj1Var.b();
                return null;
            }
        } else {
            qj1 qj1Var4 = (qj1) mye.a(b2);
            long j4 = qj1Var4.d;
            if (!v() && j <= j() / b11.b) {
                while (true) {
                    Unsafe unsafe4 = fx.a;
                    long j5 = r;
                    hz9 hz9Var2 = (hz9) unsafe4.getObjectVolatile(this, j5);
                    if (hz9Var2.d >= j4 || !qj1Var4.j()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe5 = fx.a;
                        qj1Var2 = qj1Var4;
                        if (unsafe5.compareAndSwapObject(this, r, hz9Var2, qj1Var4)) {
                            if (hz9Var2.f()) {
                                hz9Var2.e();
                            }
                        } else {
                            if (unsafe5.getObjectVolatile(this, j5) != hz9Var2) {
                                break;
                            }
                            qj1Var4 = qj1Var2;
                        }
                    }
                    qj1Var4 = qj1Var2;
                }
            }
            qj1Var2 = qj1Var4;
            if (j4 <= j) {
                return qj1Var2;
            }
            long j6 = j4 * b11.b;
            do {
                unsafe = fx.a;
                j2 = y;
                longVolatile = unsafe.getLongVolatile(this, j2);
                if (longVolatile >= j6) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j6));
            if (j4 * b11.b < o()) {
                qj1Var2.b();
            }
        }
        return null;
    }

    public final qj1 i(long j, qj1 qj1Var) {
        Object b2;
        qj1 qj1Var2;
        long j2;
        Unsafe unsafe;
        z01 z01Var = this;
        qj1 qj1Var3 = b11.a;
        a11 a11Var = a11.a;
        loop0: while (true) {
            b2 = td3.b(qj1Var, j, a11Var);
            if (mye.b(b2)) {
                break;
            }
            hz9 a = mye.a(b2);
            while (true) {
                Unsafe unsafe2 = fx.a;
                long j3 = E;
                hz9 hz9Var = (hz9) unsafe2.getObjectVolatile(z01Var, j3);
                if (hz9Var.d >= a.d) {
                    break loop0;
                }
                if (a.j()) {
                    do {
                        unsafe = fx.a;
                        if (unsafe.compareAndSwapObject(z01Var, E, hz9Var, a)) {
                            if (hz9Var.f()) {
                                hz9Var.e();
                            }
                        }
                    } while (unsafe.getObjectVolatile(z01Var, j3) == hz9Var);
                    if (a.f()) {
                        a.e();
                    }
                }
            }
        }
        qj1 qj1Var4 = null;
        if (mye.b(b2)) {
            z01Var.t();
            if (qj1Var.d * b11.b >= z01Var.m()) {
                return null;
            }
            qj1Var.b();
            return null;
        }
        qj1 qj1Var5 = (qj1) mye.a(b2);
        long j4 = qj1Var5.d;
        if (j4 <= j) {
            return qj1Var5;
        }
        long j5 = j4 * b11.b;
        while (true) {
            Unsafe unsafe3 = fx.a;
            long j6 = F;
            long longVolatile = unsafe3.getLongVolatile(z01Var, j6);
            long j7 = 1152921504606846975L & longVolatile;
            if (j7 >= j5) {
                qj1Var2 = qj1Var4;
                j2 = j4;
                break;
            }
            qj1Var2 = qj1Var4;
            j2 = j4;
            if (unsafe3.compareAndSwapLong(z01Var, j6, longVolatile, j7 + (((int) (longVolatile >> 60)) << 60))) {
                break;
            }
            z01Var = this;
            qj1Var4 = qj1Var2;
            j4 = j2;
        }
        if (j2 * b11.b >= m()) {
            return qj1Var2;
        }
        qj1Var5.b();
        return qj1Var2;
    }

    public final long j() {
        return fx.a.getLongVolatile(this, n);
    }

    public final Throwable k() {
        return (Throwable) fx.a.getObjectVolatile(this, h);
    }

    public final Throwable l() {
        Throwable k = k();
        return k == null ? new uj2("Channel was closed") : k;
    }

    public final long m() {
        return fx.a.getLongVolatile(this, y);
    }

    public final Throwable n() {
        Throwable k = k();
        return k == null ? new vj2("Channel was closed") : k;
    }

    public final long o() {
        return fx.a.getLongVolatile(this, F) & 1152921504606846975L;
    }

    public final void p(long j) {
        if ((e.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((fx.a.getLongVolatile(this, w) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0157, code lost:
    
        fx.a.compareAndSwapLong(r11, z01.y, r7, r7 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x009d, code lost:
    
        r12 = (qj1) ((nr2) fx.a.getObjectVolatile(r12, nr2.b));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                e(j & 1152921504606846975L);
                if (z) {
                    while (true) {
                        Unsafe unsafe = fx.a;
                        long j2 = x;
                        qj1 qj1Var = (qj1) unsafe.getObjectVolatile(this, j2);
                        long m = m();
                        if (o() <= m) {
                            break;
                        }
                        long j3 = b11.b;
                        long j4 = m / j3;
                        if (qj1Var.d != j4 && (qj1Var = h(j4, qj1Var)) == null) {
                            if (((qj1) unsafe.getObjectVolatile(this, j2)).d < j4) {
                                break;
                            }
                        } else {
                            qj1Var.b();
                            int i2 = (int) (m % j3);
                            while (true) {
                                Object l = qj1Var.l(i2);
                                if (l == null || l == b11.e) {
                                    if (qj1Var.k(i2, l, b11.h)) {
                                        g();
                                        break;
                                    }
                                } else {
                                    if (l == b11.d) {
                                        break;
                                    }
                                    if (l != b11.j) {
                                        if (l != b11.l) {
                                            if (l != b11.i) {
                                                if (l != b11.h) {
                                                    if (l == b11.g) {
                                                        break;
                                                    }
                                                    if (l != b11.f && m == m()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(uh9.k(i, "unexpected close status: ").toString());
                }
                qj1 e2 = e(j & 1152921504606846975L);
                Object obj = null;
                loop0: do {
                    int i3 = b11.b - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j5 = (e2.d * b11.b) + i3;
                        while (true) {
                            Object l2 = e2.l(i3);
                            if (l2 == b11.i) {
                                break loop0;
                            }
                            if (l2 == b11.d) {
                                if (j5 < m()) {
                                    break loop0;
                                }
                                if (e2.k(i3, l2, b11.l)) {
                                    e2.n(i3, null);
                                    e2.i();
                                    break;
                                }
                            } else if (l2 != b11.e && l2 != null) {
                                if (!(l2 instanceof noc) && !(l2 instanceof ooc)) {
                                    ow5 ow5Var = b11.g;
                                    if (l2 == ow5Var || l2 == b11.f) {
                                        break loop0;
                                    }
                                    if (l2 != ow5Var) {
                                        break;
                                    }
                                } else {
                                    if (j5 < m()) {
                                        break loop0;
                                    }
                                    noc nocVar = l2 instanceof ooc ? ((ooc) l2).a : (noc) l2;
                                    if (e2.k(i3, l2, b11.l)) {
                                        obj = ppe.a(obj, nocVar);
                                        e2.n(i3, null);
                                        e2.i();
                                        break;
                                    }
                                }
                            } else if (e2.k(i3, l2, b11.l)) {
                                e2.i();
                                break;
                            }
                        }
                        i3--;
                    }
                } while (e2 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            z((noc) arrayList.get(size), false);
                        }
                    } else {
                        z((noc) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean s() {
        return r(fx.a.getLongVolatile(this, F), true);
    }

    public final void t() {
        r(fx.a.getLongVolatile(this, F), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0188, code lost:
    
        r3 = (qj1) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018f, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = fx.a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, F) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        int i = 0;
        List b2 = tl2.b(unsafe.getObjectVolatile(this, x), unsafe.getObjectVolatile(this, E), unsafe.getObjectVolatile(this, r));
        ArrayList arrayList = new ArrayList();
        for (Object obj : b2) {
            if (((qj1) obj) != b11.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            lq5.n();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((qj1) next).d;
            do {
                Object next2 = it.next();
                long j2 = ((qj1) next2).d;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        qj1 qj1Var = (qj1) next;
        long m = m();
        long o = o();
        loop2: while (true) {
            int i2 = b11.b;
            int i3 = i;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                long j3 = (qj1Var.d * b11.b) + i3;
                if (j3 >= o && j3 >= m) {
                    break loop2;
                }
                Object l = qj1Var.l(i3);
                Object obj2 = qj1Var.h.get(i3 << 1);
                if (l instanceof ta1) {
                    str = (j3 >= m || j3 < o) ? (j3 >= o || j3 < m) ? "cont" : "send" : "receive";
                } else if (l instanceof ooc) {
                    str = "EB(" + l + ')';
                } else if (ur5.a(l, b11.f) || ur5.a(l, b11.g)) {
                    str = "resuming_sender";
                } else {
                    if (l != null && !l.equals(b11.e) && !l.equals(b11.i) && !l.equals(b11.h) && !l.equals(b11.k) && !l.equals(b11.j) && !l.equals(b11.l)) {
                        str = l.toString();
                    }
                    i3++;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i3++;
            }
            i = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u() {
        return false;
    }

    public final boolean v() {
        long j = j();
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r5.f() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r5.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(long j, qj1 qj1Var) {
        z01 z01Var;
        qj1 qj1Var2;
        qj1 qj1Var3;
        while (qj1Var.d < j && (qj1Var3 = (qj1) qj1Var.c()) != null) {
            qj1Var = qj1Var3;
        }
        while (true) {
            qj1 qj1Var4 = qj1Var;
            while (qj1Var4.d() && (qj1Var2 = (qj1) qj1Var4.c()) != null) {
                qj1Var4 = qj1Var2;
            }
            while (true) {
                Unsafe unsafe = fx.a;
                long j2 = r;
                hz9 hz9Var = (hz9) unsafe.getObjectVolatile(this, j2);
                if (hz9Var.d >= qj1Var4.d) {
                    return;
                }
                if (!qj1Var4.j()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = fx.a;
                    z01Var = this;
                    if (unsafe2.compareAndSwapObject(z01Var, r, hz9Var, qj1Var4)) {
                        if (hz9Var.f()) {
                            hz9Var.e();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(z01Var, j2) != hz9Var) {
                        break;
                    } else {
                        this = z01Var;
                    }
                }
                this = z01Var;
            }
            qj1Var = qj1Var4;
        }
    }

    public final Object x(zw2 zw2Var, Object obj) {
        va1 va1Var = new va1(1, xpe.a(zw2Var));
        va1Var.s();
        va1Var.resumeWith(new ge9(n()));
        Object q = va1Var.q();
        return q == vx2.a ? q : f9c.a;
    }

    public final void y(Object obj, va1 va1Var) {
        va1Var.resumeWith(new ge9(n()));
    }

    public final void z(noc nocVar, boolean z) {
        if (nocVar instanceof ta1) {
            ((zw2) nocVar).resumeWith(new ge9(z ? l() : n()));
            return;
        }
        if (!(nocVar instanceof y01)) {
            lq5.i(nocVar, "Unexpected waiter: ");
            return;
        }
        y01 y01Var = (y01) nocVar;
        va1 va1Var = y01Var.b;
        va1Var.getClass();
        y01Var.b = null;
        y01Var.a = b11.l;
        Throwable k = y01Var.c.k();
        if (k == null) {
            va1Var.resumeWith(Boolean.FALSE);
        } else {
            va1Var.resumeWith(new ge9(k));
        }
    }
}
