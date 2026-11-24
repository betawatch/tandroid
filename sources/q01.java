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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class q01 implements oe1 {
    public static final /* synthetic */ long E;
    public static final /* synthetic */ long F;
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(q01.class, "sendersAndCloseStatus$volatile");
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
        Unsafe unsafe = ex.a;
        F = unsafe.objectFieldOffset(q01.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(q01.class, "receivers$volatile");
        y = unsafe.objectFieldOffset(q01.class.getDeclaredField("receivers$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(q01.class, "bufferEnd$volatile");
        n = unsafe.objectFieldOffset(q01.class.getDeclaredField("bufferEnd$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(q01.class, "completedExpandBuffersAndPauseFlag$volatile");
        w = unsafe.objectFieldOffset(q01.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        E = unsafe.objectFieldOffset(q01.class.getDeclaredField("sendSegment$volatile"));
        f = AtomicReferenceFieldUpdater.newUpdater(q01.class, Object.class, "receiveSegment$volatile");
        x = unsafe.objectFieldOffset(q01.class.getDeclaredField("receiveSegment$volatile"));
        r = unsafe.objectFieldOffset(q01.class.getDeclaredField("bufferEndSegment$volatile"));
        h = unsafe.objectFieldOffset(q01.class.getDeclaredField("_closeCause$volatile"));
        s = unsafe.objectFieldOffset(q01.class.getDeclaredField("closeHandler$volatile"));
    }

    public q01(int i) {
        this.a = i;
        if (i < 0) {
            v0b.a(tb4.n(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        hj1 hj1Var = s01.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = j();
        hj1 hj1Var2 = new hj1(0L, null, this, 3);
        this.sendSegment$volatile = hj1Var2;
        this.receiveSegment$volatile = hj1Var2;
        if (v()) {
            hj1Var2 = s01.a;
            hj1Var2.getClass();
        }
        this.bufferEndSegment$volatile = hj1Var2;
        this._closeCause$volatile = s01.s;
    }

    public static boolean B(Object obj) {
        if (!(obj instanceof la1)) {
            wn4.n(obj, "Unexpected waiter: ");
            return false;
        }
        la1 la1Var = (la1) obj;
        hj1 hj1Var = s01.a;
        lo5 b2 = la1Var.b(g5c.a, null);
        if (b2 == null) {
            return false;
        }
        la1Var.e(b2);
        return true;
    }

    public final boolean A(Object obj, Object obj2) {
        if (!(obj instanceof p01)) {
            if (!(obj instanceof la1)) {
                wn4.n(obj, "Unexpected receiver type: ");
                return false;
            }
            la1 la1Var = (la1) obj;
            hj1 hj1Var = s01.a;
            lo5 b2 = la1Var.b(obj2, null);
            if (b2 == null) {
                return false;
            }
            la1Var.e(b2);
            return true;
        }
        p01 p01Var = (p01) obj;
        na1 na1Var = p01Var.b;
        na1Var.getClass();
        p01Var.b = null;
        p01Var.a = obj2;
        Boolean bool = Boolean.TRUE;
        hj1 hj1Var2 = s01.a;
        lo5 b3 = na1Var.b(bool, null);
        if (b3 == null) {
            return false;
        }
        na1Var.e(b3);
        return true;
    }

    public final Object C(hj1 hj1Var, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = hj1Var.h;
        Object l = hj1Var.l(i);
        long j2 = F;
        if (l == null) {
            if (j >= (ex.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return s01.n;
                }
                if (hj1Var.k(i, l, obj)) {
                    g();
                    return s01.m;
                }
            }
        } else if (l == s01.d && hj1Var.k(i, l, s01.i)) {
            g();
            Object obj2 = atomicReferenceArray.get(i << 1);
            hj1Var.n(i, null);
            return obj2;
        }
        while (true) {
            Object l2 = hj1Var.l(i);
            if (l2 == null || l2 == s01.e) {
                if (j < (ex.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (hj1Var.k(i, l2, s01.h)) {
                        g();
                        return s01.o;
                    }
                } else {
                    if (obj == null) {
                        return s01.n;
                    }
                    if (hj1Var.k(i, l2, obj)) {
                        g();
                        return s01.m;
                    }
                }
            } else if (l2 != s01.d) {
                lo5 lo5Var = s01.j;
                if (l2 == lo5Var) {
                    return s01.o;
                }
                if (l2 == s01.h) {
                    return s01.o;
                }
                if (l2 == s01.l) {
                    g();
                    return s01.o;
                }
                if (l2 != s01.g && hj1Var.k(i, l2, s01.f)) {
                    boolean z = l2 instanceof bkc;
                    if (z) {
                        l2 = ((bkc) l2).a;
                    }
                    if (B(l2)) {
                        hj1Var.o(i, s01.i);
                        g();
                        Object obj3 = atomicReferenceArray.get(i << 1);
                        hj1Var.n(i, null);
                        return obj3;
                    }
                    hj1Var.o(i, lo5Var);
                    hj1Var.i();
                    if (z) {
                        g();
                    }
                    return s01.o;
                }
            } else if (hj1Var.k(i, l2, s01.i)) {
                g();
                Object obj4 = atomicReferenceArray.get(i << 1);
                hj1Var.n(i, null);
                return obj4;
            }
        }
    }

    public final int D(hj1 hj1Var, int i, Object obj, long j, Object obj2, boolean z) {
        hj1Var.n(i, obj);
        if (z) {
            return E(hj1Var, i, obj, j, obj2, z);
        }
        Object l = hj1Var.l(i);
        if (l == null) {
            if (b(j)) {
                if (hj1Var.k(i, null, s01.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (hj1Var.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (l instanceof akc) {
            hj1Var.n(i, null);
            if (A(l, obj)) {
                hj1Var.o(i, s01.i);
                return 0;
            }
            lo5 lo5Var = s01.k;
            if (hj1Var.h.getAndSet((i << 1) + 1, lo5Var) == lo5Var) {
                return 5;
            }
            hj1Var.m(i, true);
            return 5;
        }
        return E(hj1Var, i, obj, j, obj2, z);
    }

    public final int E(hj1 hj1Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object l = hj1Var.l(i);
            if (l == null) {
                if (!b(j) || z) {
                    if (z) {
                        if (hj1Var.k(i, null, s01.j)) {
                            hj1Var.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (hj1Var.k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (hj1Var.k(i, null, s01.d)) {
                    break;
                }
            } else {
                if (l != s01.e) {
                    lo5 lo5Var = s01.k;
                    if (l == lo5Var) {
                        hj1Var.n(i, null);
                        return 5;
                    }
                    if (l == s01.h) {
                        hj1Var.n(i, null);
                        return 5;
                    }
                    if (l == s01.l) {
                        hj1Var.n(i, null);
                        t();
                        return 4;
                    }
                    hj1Var.n(i, null);
                    if (l instanceof bkc) {
                        l = ((bkc) l).a;
                    }
                    if (A(l, obj)) {
                        hj1Var.o(i, s01.i);
                        return 0;
                    }
                    if (hj1Var.h.getAndSet((i << 1) + 1, lo5Var) != lo5Var) {
                        hj1Var.m(i, true);
                    }
                    return 5;
                }
                if (hj1Var.k(i, l, s01.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void F(long j) {
        q01 q01Var = this;
        if (q01Var.v()) {
            return;
        }
        while (q01Var.j() <= j) {
            q01Var = this;
        }
        int i = s01.c;
        int i2 = 0;
        while (true) {
            long j2 = w;
            if (i2 < i) {
                long j3 = q01Var.j();
                if (j3 == (ex.a.getLongVolatile(q01Var, j2) & 4611686018427387903L) && j3 == q01Var.j()) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = ex.a;
                    long longVolatile = unsafe.getLongVolatile(q01Var, j2);
                    if (unsafe.compareAndSwapLong(q01Var, w, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        q01Var = this;
                    }
                }
                while (true) {
                    long j4 = q01Var.j();
                    Unsafe unsafe2 = ex.a;
                    long longVolatile2 = unsafe2.getLongVolatile(q01Var, j2);
                    long j5 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (j4 == j5 && j4 == q01Var.j()) {
                        break;
                    }
                    if (z) {
                        q01Var = this;
                    } else {
                        q01Var = this;
                        unsafe2.compareAndSwapLong(q01Var, w, longVolatile2, j5 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = ex.a;
                    long longVolatile3 = unsafe3.getLongVolatile(q01Var, j2);
                    if (unsafe3.compareAndSwapLong(q01Var, w, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        q01Var = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152 A[RETURN] */
    @Override // v0a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(fw2 fw2Var, Object obj) {
        Object obj2;
        Object obj3;
        Object q;
        Object obj4;
        String str;
        int i;
        q01 q01Var = this;
        Unsafe unsafe = ex.a;
        long j = E;
        hj1 hj1Var = (hj1) unsafe.getObjectVolatile(q01Var, j);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(q01Var);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r2 = q01Var.r(andIncrement, false);
            int i2 = s01.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = hj1Var.d;
            Object obj5 = bx2.a;
            obj2 = g5c.a;
            if (j5 != j4) {
                hj1 i4 = q01Var.i(j4, hj1Var);
                if (i4 != null) {
                    hj1Var = i4;
                } else if (r2) {
                    Object x2 = x(fw2Var, obj);
                    if (x2 == obj5) {
                        return x2;
                    }
                }
            }
            int D = q01Var.D(hj1Var, i3, obj, j2, null, r2);
            if (D == 0) {
                hj1Var.b();
                return obj2;
            }
            if (D == 1) {
                break;
            }
            if (D != 2) {
                if (D == 3) {
                    na1 a = iqd.a(dle.a(fw2Var));
                    try {
                        int D2 = D(hj1Var, i3, obj, j2, a, false);
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
                                    hj1Var.b();
                                    hj1 hj1Var2 = (hj1) ex.a.getObjectVolatile(this, j);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean r3 = r(andIncrement2, false);
                                        int i5 = s01.b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                                        long j7 = i5;
                                        obj3 = obj5;
                                        long j8 = j6 / j7;
                                        int i6 = (int) (j6 % j7);
                                        if (hj1Var2.d != j8) {
                                            hj1 i7 = i(j8, hj1Var2);
                                            if (i7 != null) {
                                                str = str2;
                                                i = i6;
                                                hj1Var2 = i7;
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
                                        int D3 = D(hj1Var2, i, obj, j6, a, r3);
                                        if (D3 == 0) {
                                            hj1Var2.b();
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
                                                    hj1Var2.b();
                                                }
                                                str2 = str;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                obj5 = obj3;
                                            } else if (j6 < m()) {
                                                hj1Var2.b();
                                            }
                                        } else if (r3) {
                                            hj1Var2.i();
                                        } else {
                                            a.a(hj1Var2, i + i5);
                                        }
                                    }
                                } else {
                                    obj3 = obj5;
                                    if (j2 < m()) {
                                        hj1Var.b();
                                    }
                                }
                                y(obj, a);
                            } else {
                                obj3 = obj5;
                                a.a(hj1Var, i3 + i2);
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
                            hj1Var.b();
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
                        hj1Var.b();
                    }
                    q01Var = this;
                } else {
                    if (j2 < m()) {
                        hj1Var.b();
                    }
                    Object x3 = x(fw2Var, obj);
                    if (x3 == obj5) {
                        return x3;
                    }
                }
            } else if (r2) {
                hj1Var.i();
                Object x4 = x(fw2Var, obj);
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
        q01 q01Var = this;
        if (z) {
            while (true) {
                Unsafe unsafe4 = ex.a;
                long j4 = F;
                long longVolatile3 = unsafe4.getLongVolatile(q01Var, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                hj1 hj1Var = s01.a;
                if (unsafe4.compareAndSwapLong(q01Var, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                q01Var = this;
            }
        }
        lo5 lo5Var = s01.s;
        while (true) {
            Unsafe unsafe5 = ex.a;
            long j5 = h;
            if (unsafe5.compareAndSwapObject(this, j5, lo5Var, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j5) != lo5Var) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = ex.a;
                j3 = F;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = ex.a;
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
                Unsafe unsafe6 = ex.a;
                long j6 = s;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                lo5 lo5Var2 = objectVolatile == null ? s01.q : s01.r;
                do {
                    unsafe2 = ex.a;
                    if (unsafe2.compareAndSwapObject(this, s, objectVolatile, lo5Var2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                r3c.a(1, objectVolatile);
                ((qp4) objectVolatile).invoke(k());
                return z2;
            }
        }
        return z2;
    }

    @Override // oe1
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        c(cancellationException, true);
    }

    @Override // v0a
    public Object d(Object obj) {
        q01 q01Var = this;
        Unsafe unsafe = ex.a;
        long j = 1152921504606846975L;
        boolean z = q01Var.r(unsafe.getLongVolatile(q01Var, F), false) ? false : !q01Var.b(r2 & 1152921504606846975L);
        fj1 fj1Var = gj1.b;
        if (z) {
            return fj1Var;
        }
        Object obj2 = s01.j;
        hj1 hj1Var = (hj1) unsafe.getObjectVolatile(q01Var, E);
        while (true) {
            long andIncrement = b.getAndIncrement(q01Var);
            long j2 = andIncrement & j;
            boolean r2 = q01Var.r(andIncrement, false);
            int i = s01.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (hj1Var.d != j4) {
                hj1 i3 = q01Var.i(j4, hj1Var);
                if (i3 != null) {
                    hj1Var = i3;
                } else {
                    if (r2) {
                        return new ej1(q01Var.n());
                    }
                    j = 1152921504606846975L;
                }
            }
            int D = q01Var.D(hj1Var, i2, obj, j2, obj2, r2);
            g5c g5cVar = g5c.a;
            if (D == 0) {
                hj1Var.b();
                return g5cVar;
            }
            if (D == 1) {
                return g5cVar;
            }
            if (D == 2) {
                if (r2) {
                    hj1Var.i();
                    return new ej1(n());
                }
                akc akcVar = obj2 instanceof akc ? (akc) obj2 : null;
                if (akcVar != null) {
                    akcVar.a(hj1Var, i2 + i);
                }
                hj1Var.i();
                return fj1Var;
            }
            if (D == 3) {
                sc8.j("unexpected");
                return null;
            }
            if (D == 4) {
                if (j2 < m()) {
                    hj1Var.b();
                }
                return new ej1(n());
            }
            if (D == 5) {
                hj1Var.b();
            }
            j = 1152921504606846975L;
            q01Var = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
    
        r0 = (hj1) ((uq2) ex.a.getObjectVolatile(r0, uq2.b));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hj1 e(long j) {
        uq2 uq2Var;
        long j2;
        Unsafe unsafe;
        long j3;
        Unsafe unsafe2 = ex.a;
        Object objectVolatile = unsafe2.getObjectVolatile(this, r);
        hj1 hj1Var = (hj1) unsafe2.getObjectVolatile(this, E);
        if (hj1Var.d > ((hj1) objectVolatile).d) {
            objectVolatile = hj1Var;
        }
        hj1 hj1Var2 = (hj1) unsafe2.getObjectVolatile(this, x);
        if (hj1Var2.d > ((hj1) objectVolatile).d) {
            objectVolatile = hj1Var2;
        }
        uq2 uq2Var2 = (uq2) objectVolatile;
        loop0: while (true) {
            uq2Var = uq2Var2;
            while (true) {
                int i = uq2.c;
                uq2Var.getClass();
                Object objectVolatile2 = ex.a.getObjectVolatile(uq2Var, uq2.a);
                lo5 lo5Var = bd3.a;
                if (objectVolatile2 == lo5Var) {
                    break loop0;
                }
                uq2Var2 = (uq2) objectVolatile2;
                if (uq2Var2 == null) {
                    do {
                        unsafe = ex.a;
                        j3 = uq2.a;
                        if (unsafe.compareAndSwapObject(uq2Var, j3, (Object) null, lo5Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(uq2Var, j3) == null);
                }
            }
        }
        hj1 hj1Var3 = (hj1) uq2Var;
        if (u()) {
            hj1 hj1Var4 = hj1Var3;
            loop3: do {
                int i2 = s01.b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j2 = (hj1Var4.d * s01.b) + i2;
                    if (j2 < m()) {
                        break loop3;
                    }
                    while (true) {
                        Object l = hj1Var4.l(i2);
                        if (l != null && l != s01.e) {
                            if (l == s01.d) {
                                break loop3;
                            }
                        } else {
                            if (hj1Var4.k(i2, l, s01.l)) {
                                hj1Var4.i();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (hj1Var4 != null);
            j2 = -1;
            if (j2 != -1) {
                f(j2);
            }
        }
        Object obj = null;
        loop6: for (hj1 hj1Var5 = hj1Var3; hj1Var5 != null; hj1Var5 = (hj1) ((uq2) ex.a.getObjectVolatile(hj1Var5, uq2.b))) {
            for (int i3 = s01.b - 1; -1 < i3; i3--) {
                if ((hj1Var5.d * s01.b) + i3 < j) {
                    break loop6;
                }
                while (true) {
                    Object l2 = hj1Var5.l(i3);
                    if (l2 != null && l2 != s01.e) {
                        if (!(l2 instanceof bkc)) {
                            if (!(l2 instanceof akc)) {
                                break;
                            }
                            if (hj1Var5.k(i3, l2, s01.l)) {
                                obj = tke.a(obj, l2);
                                hj1Var5.m(i3, true);
                                break;
                            }
                        } else {
                            if (hj1Var5.k(i3, l2, s01.l)) {
                                obj = tke.a(obj, ((bkc) l2).a);
                                hj1Var5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (hj1Var5.k(i3, l2, s01.l)) {
                            hj1Var5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                z((akc) obj, true);
                return hj1Var3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                z((akc) arrayList.get(size), true);
            }
        }
        return hj1Var3;
    }

    public final void f(long j) {
        hj1 hj1Var = (hj1) ex.a.getObjectVolatile(this, x);
        while (true) {
            Unsafe unsafe = ex.a;
            long j2 = y;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(this.a + longVolatile, this.j())) {
                return;
            }
            q01 q01Var = this;
            if (unsafe.compareAndSwapLong(q01Var, j2, longVolatile, 1 + longVolatile)) {
                long j3 = s01.b;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (hj1Var.d != j4) {
                    hj1 h2 = q01Var.h(j4, hj1Var);
                    if (h2 != null) {
                        hj1Var = h2;
                    }
                }
                hj1 hj1Var2 = hj1Var;
                if (q01Var.C(hj1Var2, i, longVolatile, null) != s01.o) {
                    hj1Var2.b();
                } else if (longVolatile < q01Var.o()) {
                    hj1Var2.b();
                }
                this = q01Var;
                hj1Var = hj1Var2;
            }
            this = q01Var;
        }
    }

    public final void g() {
        Object b2;
        Unsafe unsafe;
        if (v()) {
            return;
        }
        Unsafe unsafe2 = ex.a;
        long j = r;
        hj1 hj1Var = (hj1) unsafe2.getObjectVolatile(this, j);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j2 = andIncrement / s01.b;
            if (o() <= andIncrement) {
                if (hj1Var.d < j2 && hj1Var.c() != null) {
                    w(j2, hj1Var);
                }
                p(1L);
                return;
            }
            if (hj1Var.d != j2) {
                r01 r01Var = r01.a;
                while (true) {
                    b2 = bd3.b(hj1Var, j2, r01Var);
                    if (ste.b(b2)) {
                        break;
                    }
                    nv9 a = ste.a(b2);
                    while (true) {
                        nv9 nv9Var = (nv9) ex.a.getObjectVolatile(this, j);
                        if (nv9Var.d >= a.d) {
                            break;
                        }
                        if (a.j()) {
                            do {
                                unsafe = ex.a;
                                if (unsafe.compareAndSwapObject(this, r, nv9Var, a)) {
                                    if (nv9Var.f()) {
                                        nv9Var.e();
                                    }
                                }
                            } while (unsafe.getObjectVolatile(this, j) == nv9Var);
                            if (a.f()) {
                                a.e();
                            }
                        }
                    }
                }
                hj1 hj1Var2 = null;
                if (ste.b(b2)) {
                    t();
                    w(j2, hj1Var);
                    p(1L);
                } else {
                    hj1 hj1Var3 = (hj1) ste.a(b2);
                    long j3 = hj1Var3.d;
                    if (j3 > j2) {
                        long j4 = s01.b * j3;
                        if (ex.a.compareAndSwapLong(this, n, 1 + andIncrement, j4)) {
                            p(j4 - andIncrement);
                        } else {
                            p(1L);
                        }
                    } else {
                        hj1Var2 = hj1Var3;
                    }
                }
                if (hj1Var2 != null) {
                    hj1Var = hj1Var2;
                } else {
                    continue;
                }
            }
            int i = (int) (andIncrement % s01.b);
            Object l = hj1Var.l(i);
            boolean z = l instanceof akc;
            long j5 = y;
            if (!z || andIncrement < ex.a.getLongVolatile(this, j5) || !hj1Var.k(i, l, s01.g)) {
                while (true) {
                    Object l2 = hj1Var.l(i);
                    if (!(l2 instanceof akc)) {
                        if (l2 != s01.j) {
                            if (l2 != null) {
                                if (l2 == s01.d || l2 == s01.h || l2 == s01.i || l2 == s01.k || l2 == s01.l) {
                                    break loop0;
                                } else if (l2 != s01.f) {
                                    wn4.n(l2, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (hj1Var.k(i, l2, s01.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < ex.a.getLongVolatile(this, j5)) {
                        if (hj1Var.k(i, l2, new bkc((akc) l2))) {
                            break loop0;
                        }
                    } else if (hj1Var.k(i, l2, s01.g)) {
                        if (B(l2)) {
                            hj1Var.o(i, s01.d);
                            break;
                        } else {
                            hj1Var.o(i, s01.j);
                            hj1Var.i();
                        }
                    }
                }
                p(1L);
            } else if (B(l)) {
                hj1Var.o(i, s01.d);
                break;
            } else {
                hj1Var.o(i, s01.j);
                hj1Var.i();
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
    public final hj1 h(long j, hj1 hj1Var) {
        Object b2;
        hj1 hj1Var2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        Unsafe unsafe2;
        hj1 hj1Var3 = s01.a;
        r01 r01Var = r01.a;
        loop0: while (true) {
            b2 = bd3.b(hj1Var, j, r01Var);
            if (ste.b(b2)) {
                break;
            }
            nv9 a = ste.a(b2);
            while (true) {
                Unsafe unsafe3 = ex.a;
                long j3 = x;
                nv9 nv9Var = (nv9) unsafe3.getObjectVolatile(this, j3);
                if (nv9Var.d >= a.d) {
                    break loop0;
                }
                if (a.j()) {
                    do {
                        unsafe2 = ex.a;
                        if (unsafe2.compareAndSwapObject(this, x, nv9Var, a)) {
                            if (nv9Var.f()) {
                                nv9Var.e();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j3) == nv9Var);
                    if (a.f()) {
                        a.e();
                    }
                }
            }
        }
        if (ste.b(b2)) {
            t();
            if (hj1Var.d * s01.b < o()) {
                hj1Var.b();
                return null;
            }
        } else {
            hj1 hj1Var4 = (hj1) ste.a(b2);
            long j4 = hj1Var4.d;
            if (!v() && j <= j() / s01.b) {
                while (true) {
                    Unsafe unsafe4 = ex.a;
                    long j5 = r;
                    nv9 nv9Var2 = (nv9) unsafe4.getObjectVolatile(this, j5);
                    if (nv9Var2.d >= j4 || !hj1Var4.j()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe5 = ex.a;
                        hj1Var2 = hj1Var4;
                        if (unsafe5.compareAndSwapObject(this, r, nv9Var2, hj1Var4)) {
                            if (nv9Var2.f()) {
                                nv9Var2.e();
                            }
                        } else {
                            if (unsafe5.getObjectVolatile(this, j5) != nv9Var2) {
                                break;
                            }
                            hj1Var4 = hj1Var2;
                        }
                    }
                    hj1Var4 = hj1Var2;
                }
            }
            hj1Var2 = hj1Var4;
            if (j4 <= j) {
                return hj1Var2;
            }
            long j6 = j4 * s01.b;
            do {
                unsafe = ex.a;
                j2 = y;
                longVolatile = unsafe.getLongVolatile(this, j2);
                if (longVolatile >= j6) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j6));
            if (j4 * s01.b < o()) {
                hj1Var2.b();
            }
        }
        return null;
    }

    public final hj1 i(long j, hj1 hj1Var) {
        Object b2;
        hj1 hj1Var2;
        long j2;
        Unsafe unsafe;
        q01 q01Var = this;
        hj1 hj1Var3 = s01.a;
        r01 r01Var = r01.a;
        loop0: while (true) {
            b2 = bd3.b(hj1Var, j, r01Var);
            if (ste.b(b2)) {
                break;
            }
            nv9 a = ste.a(b2);
            while (true) {
                Unsafe unsafe2 = ex.a;
                long j3 = E;
                nv9 nv9Var = (nv9) unsafe2.getObjectVolatile(q01Var, j3);
                if (nv9Var.d >= a.d) {
                    break loop0;
                }
                if (a.j()) {
                    do {
                        unsafe = ex.a;
                        if (unsafe.compareAndSwapObject(q01Var, E, nv9Var, a)) {
                            if (nv9Var.f()) {
                                nv9Var.e();
                            }
                        }
                    } while (unsafe.getObjectVolatile(q01Var, j3) == nv9Var);
                    if (a.f()) {
                        a.e();
                    }
                }
            }
        }
        hj1 hj1Var4 = null;
        if (ste.b(b2)) {
            q01Var.t();
            if (hj1Var.d * s01.b >= q01Var.m()) {
                return null;
            }
            hj1Var.b();
            return null;
        }
        hj1 hj1Var5 = (hj1) ste.a(b2);
        long j4 = hj1Var5.d;
        if (j4 <= j) {
            return hj1Var5;
        }
        long j5 = j4 * s01.b;
        while (true) {
            Unsafe unsafe3 = ex.a;
            long j6 = F;
            long longVolatile = unsafe3.getLongVolatile(q01Var, j6);
            long j7 = 1152921504606846975L & longVolatile;
            if (j7 >= j5) {
                hj1Var2 = hj1Var4;
                j2 = j4;
                break;
            }
            hj1Var2 = hj1Var4;
            j2 = j4;
            if (unsafe3.compareAndSwapLong(q01Var, j6, longVolatile, j7 + (((int) (longVolatile >> 60)) << 60))) {
                break;
            }
            q01Var = this;
            hj1Var4 = hj1Var2;
            j4 = j2;
        }
        if (j2 * s01.b >= m()) {
            return hj1Var2;
        }
        hj1Var5.b();
        return hj1Var2;
    }

    public final long j() {
        return ex.a.getLongVolatile(this, n);
    }

    public final Throwable k() {
        return (Throwable) ex.a.getObjectVolatile(this, h);
    }

    public final Throwable l() {
        Throwable k = k();
        return k == null ? new yi2("Channel was closed") : k;
    }

    public final long m() {
        return ex.a.getLongVolatile(this, y);
    }

    public final Throwable n() {
        Throwable k = k();
        return k == null ? new zi2("Channel was closed") : k;
    }

    public final long o() {
        return ex.a.getLongVolatile(this, F) & 1152921504606846975L;
    }

    public final void p(long j) {
        if ((e.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((ex.a.getLongVolatile(this, w) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0157, code lost:
    
        ex.a.compareAndSwapLong(r11, q01.y, r7, r7 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x009d, code lost:
    
        r12 = (hj1) ((uq2) ex.a.getObjectVolatile(r12, uq2.b));
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
                        Unsafe unsafe = ex.a;
                        long j2 = x;
                        hj1 hj1Var = (hj1) unsafe.getObjectVolatile(this, j2);
                        long m = m();
                        if (o() <= m) {
                            break;
                        }
                        long j3 = s01.b;
                        long j4 = m / j3;
                        if (hj1Var.d != j4 && (hj1Var = h(j4, hj1Var)) == null) {
                            if (((hj1) unsafe.getObjectVolatile(this, j2)).d < j4) {
                                break;
                            }
                        } else {
                            hj1Var.b();
                            int i2 = (int) (m % j3);
                            while (true) {
                                Object l = hj1Var.l(i2);
                                if (l == null || l == s01.e) {
                                    if (hj1Var.k(i2, l, s01.h)) {
                                        g();
                                        break;
                                    }
                                } else {
                                    if (l == s01.d) {
                                        break;
                                    }
                                    if (l != s01.j) {
                                        if (l != s01.l) {
                                            if (l != s01.i) {
                                                if (l != s01.h) {
                                                    if (l == s01.g) {
                                                        break;
                                                    }
                                                    if (l != s01.f && m == m()) {
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
                    throw new IllegalStateException(de9.k(i, "unexpected close status: ").toString());
                }
                hj1 e2 = e(j & 1152921504606846975L);
                Object obj = null;
                loop0: do {
                    int i3 = s01.b - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j5 = (e2.d * s01.b) + i3;
                        while (true) {
                            Object l2 = e2.l(i3);
                            if (l2 == s01.i) {
                                break loop0;
                            }
                            if (l2 == s01.d) {
                                if (j5 < m()) {
                                    break loop0;
                                }
                                if (e2.k(i3, l2, s01.l)) {
                                    e2.n(i3, null);
                                    e2.i();
                                    break;
                                }
                            } else if (l2 != s01.e && l2 != null) {
                                if (!(l2 instanceof akc) && !(l2 instanceof bkc)) {
                                    lo5 lo5Var = s01.g;
                                    if (l2 == lo5Var || l2 == s01.f) {
                                        break loop0;
                                    }
                                    if (l2 != lo5Var) {
                                        break;
                                    }
                                } else {
                                    if (j5 < m()) {
                                        break loop0;
                                    }
                                    akc akcVar = l2 instanceof bkc ? ((bkc) l2).a : (akc) l2;
                                    if (e2.k(i3, l2, s01.l)) {
                                        obj = tke.a(obj, akcVar);
                                        e2.n(i3, null);
                                        e2.i();
                                        break;
                                    }
                                }
                            } else if (e2.k(i3, l2, s01.l)) {
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
                            z((akc) arrayList.get(size), false);
                        }
                    } else {
                        z((akc) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean s() {
        return r(ex.a.getLongVolatile(this, F), true);
    }

    public final void t() {
        r(ex.a.getLongVolatile(this, F), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0188, code lost:
    
        r3 = (hj1) r3.c();
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
        Unsafe unsafe = ex.a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, F) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        int i = 0;
        List b2 = zk2.b(unsafe.getObjectVolatile(this, x), unsafe.getObjectVolatile(this, E), unsafe.getObjectVolatile(this, r));
        ArrayList arrayList = new ArrayList();
        for (Object obj : b2) {
            if (((hj1) obj) != s01.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            w26.g();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((hj1) next).d;
            do {
                Object next2 = it.next();
                long j2 = ((hj1) next2).d;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        hj1 hj1Var = (hj1) next;
        long m = m();
        long o = o();
        loop2: while (true) {
            int i2 = s01.b;
            int i3 = i;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                long j3 = (hj1Var.d * s01.b) + i3;
                if (j3 >= o && j3 >= m) {
                    break loop2;
                }
                Object l = hj1Var.l(i3);
                Object obj2 = hj1Var.h.get(i3 << 1);
                if (l instanceof la1) {
                    str = (j3 >= m || j3 < o) ? (j3 >= o || j3 < m) ? "cont" : "send" : "receive";
                } else if (l instanceof bkc) {
                    str = "EB(" + l + ')';
                } else if (rp5.a(l, s01.f) || rp5.a(l, s01.g)) {
                    str = "resuming_sender";
                } else {
                    if (l != null && !l.equals(s01.e) && !l.equals(s01.i) && !l.equals(s01.h) && !l.equals(s01.k) && !l.equals(s01.j) && !l.equals(s01.l)) {
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
    public final void w(long j, hj1 hj1Var) {
        q01 q01Var;
        hj1 hj1Var2;
        hj1 hj1Var3;
        while (hj1Var.d < j && (hj1Var3 = (hj1) hj1Var.c()) != null) {
            hj1Var = hj1Var3;
        }
        while (true) {
            hj1 hj1Var4 = hj1Var;
            while (hj1Var4.d() && (hj1Var2 = (hj1) hj1Var4.c()) != null) {
                hj1Var4 = hj1Var2;
            }
            while (true) {
                Unsafe unsafe = ex.a;
                long j2 = r;
                nv9 nv9Var = (nv9) unsafe.getObjectVolatile(this, j2);
                if (nv9Var.d >= hj1Var4.d) {
                    return;
                }
                if (!hj1Var4.j()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = ex.a;
                    q01Var = this;
                    if (unsafe2.compareAndSwapObject(q01Var, r, nv9Var, hj1Var4)) {
                        if (nv9Var.f()) {
                            nv9Var.e();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(q01Var, j2) != nv9Var) {
                        break;
                    } else {
                        this = q01Var;
                    }
                }
                this = q01Var;
            }
            hj1Var = hj1Var4;
        }
    }

    public final Object x(fw2 fw2Var, Object obj) {
        na1 na1Var = new na1(1, dle.a(fw2Var));
        na1Var.s();
        na1Var.resumeWith(new sa9(n()));
        Object q = na1Var.q();
        return q == bx2.a ? q : g5c.a;
    }

    public final void y(Object obj, na1 na1Var) {
        na1Var.resumeWith(new sa9(n()));
    }

    public final void z(akc akcVar, boolean z) {
        if (akcVar instanceof la1) {
            ((fw2) akcVar).resumeWith(new sa9(z ? l() : n()));
            return;
        }
        if (!(akcVar instanceof p01)) {
            wn4.n(akcVar, "Unexpected waiter: ");
            return;
        }
        p01 p01Var = (p01) akcVar;
        na1 na1Var = p01Var.b;
        na1Var.getClass();
        p01Var.b = null;
        p01Var.a = s01.l;
        Throwable k = p01Var.c.k();
        if (k == null) {
            na1Var.resumeWith(Boolean.FALSE);
        } else {
            na1Var.resumeWith(new sa9(k));
        }
    }
}
