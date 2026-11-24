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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class y11 implements wf1 {
    public static final /* synthetic */ long E;
    public static final /* synthetic */ long F;
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(y11.class, "sendersAndCloseStatus$volatile");
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
        Unsafe unsafe = fy.a;
        F = unsafe.objectFieldOffset(y11.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(y11.class, "receivers$volatile");
        y = unsafe.objectFieldOffset(y11.class.getDeclaredField("receivers$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(y11.class, "bufferEnd$volatile");
        n = unsafe.objectFieldOffset(y11.class.getDeclaredField("bufferEnd$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(y11.class, "completedExpandBuffersAndPauseFlag$volatile");
        w = unsafe.objectFieldOffset(y11.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        E = unsafe.objectFieldOffset(y11.class.getDeclaredField("sendSegment$volatile"));
        f = AtomicReferenceFieldUpdater.newUpdater(y11.class, Object.class, "receiveSegment$volatile");
        x = unsafe.objectFieldOffset(y11.class.getDeclaredField("receiveSegment$volatile"));
        r = unsafe.objectFieldOffset(y11.class.getDeclaredField("bufferEndSegment$volatile"));
        h = unsafe.objectFieldOffset(y11.class.getDeclaredField("_closeCause$volatile"));
        s = unsafe.objectFieldOffset(y11.class.getDeclaredField("closeHandler$volatile"));
    }

    public y11(int i) {
        this.a = i;
        if (i < 0) {
            c1b.a(td4.o(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        pk1 pk1Var = a21.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = j();
        pk1 pk1Var2 = new pk1(0L, null, this, 3);
        this.sendSegment$volatile = pk1Var2;
        this.receiveSegment$volatile = pk1Var2;
        if (v()) {
            pk1Var2 = a21.a;
            pk1Var2.getClass();
        }
        this.bufferEndSegment$volatile = pk1Var2;
        this._closeCause$volatile = a21.s;
    }

    public static boolean B(Object obj) {
        if (!(obj instanceof tb1)) {
            zo4.p(obj, "Unexpected waiter: ");
            return false;
        }
        tb1 tb1Var = (tb1) obj;
        pk1 pk1Var = a21.a;
        du2 b2 = tb1Var.b(g7c.a, null);
        if (b2 == null) {
            return false;
        }
        tb1Var.e(b2);
        return true;
    }

    public final boolean A(Object obj, Object obj2) {
        if (!(obj instanceof x11)) {
            if (!(obj instanceof tb1)) {
                zo4.p(obj, "Unexpected receiver type: ");
                return false;
            }
            tb1 tb1Var = (tb1) obj;
            pk1 pk1Var = a21.a;
            du2 b2 = tb1Var.b(obj2, null);
            if (b2 == null) {
                return false;
            }
            tb1Var.e(b2);
            return true;
        }
        x11 x11Var = (x11) obj;
        vb1 vb1Var = x11Var.b;
        vb1Var.getClass();
        x11Var.b = null;
        x11Var.a = obj2;
        Boolean bool = Boolean.TRUE;
        pk1 pk1Var2 = a21.a;
        du2 b3 = vb1Var.b(bool, null);
        if (b3 == null) {
            return false;
        }
        vb1Var.e(b3);
        return true;
    }

    public final Object C(pk1 pk1Var, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = pk1Var.h;
        Object l = pk1Var.l(i);
        long j2 = F;
        if (l == null) {
            if (j >= (fy.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return a21.n;
                }
                if (pk1Var.k(i, l, obj)) {
                    g();
                    return a21.m;
                }
            }
        } else if (l == a21.d && pk1Var.k(i, l, a21.i)) {
            g();
            Object obj2 = atomicReferenceArray.get(i << 1);
            pk1Var.n(i, null);
            return obj2;
        }
        while (true) {
            Object l2 = pk1Var.l(i);
            if (l2 == null || l2 == a21.e) {
                if (j < (fy.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (pk1Var.k(i, l2, a21.h)) {
                        g();
                        return a21.o;
                    }
                } else {
                    if (obj == null) {
                        return a21.n;
                    }
                    if (pk1Var.k(i, l2, obj)) {
                        g();
                        return a21.m;
                    }
                }
            } else if (l2 != a21.d) {
                du2 du2Var = a21.j;
                if (l2 == du2Var) {
                    return a21.o;
                }
                if (l2 == a21.h) {
                    return a21.o;
                }
                if (l2 == a21.l) {
                    g();
                    return a21.o;
                }
                if (l2 != a21.g && pk1Var.k(i, l2, a21.f)) {
                    boolean z = l2 instanceof bmc;
                    if (z) {
                        l2 = ((bmc) l2).a;
                    }
                    if (B(l2)) {
                        pk1Var.o(i, a21.i);
                        g();
                        Object obj3 = atomicReferenceArray.get(i << 1);
                        pk1Var.n(i, null);
                        return obj3;
                    }
                    pk1Var.o(i, du2Var);
                    pk1Var.i();
                    if (z) {
                        g();
                    }
                    return a21.o;
                }
            } else if (pk1Var.k(i, l2, a21.i)) {
                g();
                Object obj4 = atomicReferenceArray.get(i << 1);
                pk1Var.n(i, null);
                return obj4;
            }
        }
    }

    public final int D(pk1 pk1Var, int i, Object obj, long j, Object obj2, boolean z) {
        pk1Var.n(i, obj);
        if (z) {
            return E(pk1Var, i, obj, j, obj2, z);
        }
        Object l = pk1Var.l(i);
        if (l == null) {
            if (b(j)) {
                if (pk1Var.k(i, null, a21.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pk1Var.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (l instanceof amc) {
            pk1Var.n(i, null);
            if (A(l, obj)) {
                pk1Var.o(i, a21.i);
                return 0;
            }
            du2 du2Var = a21.k;
            if (pk1Var.h.getAndSet((i << 1) + 1, du2Var) == du2Var) {
                return 5;
            }
            pk1Var.m(i, true);
            return 5;
        }
        return E(pk1Var, i, obj, j, obj2, z);
    }

    public final int E(pk1 pk1Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object l = pk1Var.l(i);
            if (l == null) {
                if (!b(j) || z) {
                    if (z) {
                        if (pk1Var.k(i, null, a21.j)) {
                            pk1Var.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (pk1Var.k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (pk1Var.k(i, null, a21.d)) {
                    break;
                }
            } else {
                if (l != a21.e) {
                    du2 du2Var = a21.k;
                    if (l == du2Var) {
                        pk1Var.n(i, null);
                        return 5;
                    }
                    if (l == a21.h) {
                        pk1Var.n(i, null);
                        return 5;
                    }
                    if (l == a21.l) {
                        pk1Var.n(i, null);
                        t();
                        return 4;
                    }
                    pk1Var.n(i, null);
                    if (l instanceof bmc) {
                        l = ((bmc) l).a;
                    }
                    if (A(l, obj)) {
                        pk1Var.o(i, a21.i);
                        return 0;
                    }
                    if (pk1Var.h.getAndSet((i << 1) + 1, du2Var) != du2Var) {
                        pk1Var.m(i, true);
                    }
                    return 5;
                }
                if (pk1Var.k(i, l, a21.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void F(long j) {
        y11 y11Var = this;
        if (y11Var.v()) {
            return;
        }
        while (y11Var.j() <= j) {
            y11Var = this;
        }
        int i = a21.c;
        int i2 = 0;
        while (true) {
            long j2 = w;
            if (i2 < i) {
                long j3 = y11Var.j();
                if (j3 == (fy.a.getLongVolatile(y11Var, j2) & 4611686018427387903L) && j3 == y11Var.j()) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = fy.a;
                    long longVolatile = unsafe.getLongVolatile(y11Var, j2);
                    if (unsafe.compareAndSwapLong(y11Var, w, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        y11Var = this;
                    }
                }
                while (true) {
                    long j4 = y11Var.j();
                    Unsafe unsafe2 = fy.a;
                    long longVolatile2 = unsafe2.getLongVolatile(y11Var, j2);
                    long j5 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (j4 == j5 && j4 == y11Var.j()) {
                        break;
                    }
                    if (z) {
                        y11Var = this;
                    } else {
                        y11Var = this;
                        unsafe2.compareAndSwapLong(y11Var, w, longVolatile2, j5 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = fy.a;
                    long longVolatile3 = unsafe3.getLongVolatile(y11Var, j2);
                    if (unsafe3.compareAndSwapLong(y11Var, w, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        y11Var = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152 A[RETURN] */
    @Override // x2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(px2 px2Var, Object obj) {
        Object obj2;
        Object obj3;
        Object q;
        Object obj4;
        String str;
        int i;
        y11 y11Var = this;
        Unsafe unsafe = fy.a;
        long j = E;
        pk1 pk1Var = (pk1) unsafe.getObjectVolatile(y11Var, j);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(y11Var);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r2 = y11Var.r(andIncrement, false);
            int i2 = a21.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = pk1Var.d;
            Object obj5 = ly2.a;
            obj2 = g7c.a;
            if (j5 != j4) {
                pk1 i4 = y11Var.i(j4, pk1Var);
                if (i4 != null) {
                    pk1Var = i4;
                } else if (r2) {
                    Object x2 = x(px2Var, obj);
                    if (x2 == obj5) {
                        return x2;
                    }
                }
            }
            int D = y11Var.D(pk1Var, i3, obj, j2, null, r2);
            if (D == 0) {
                pk1Var.b();
                return obj2;
            }
            if (D == 1) {
                break;
            }
            if (D != 2) {
                if (D == 3) {
                    vb1 a = lsd.a(fne.a(px2Var));
                    try {
                        int D2 = D(pk1Var, i3, obj, j2, a, false);
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
                                    pk1Var.b();
                                    pk1 pk1Var2 = (pk1) fy.a.getObjectVolatile(this, j);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean r3 = r(andIncrement2, false);
                                        int i5 = a21.b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                                        long j7 = i5;
                                        obj3 = obj5;
                                        long j8 = j6 / j7;
                                        int i6 = (int) (j6 % j7);
                                        if (pk1Var2.d != j8) {
                                            pk1 i7 = i(j8, pk1Var2);
                                            if (i7 != null) {
                                                str = str2;
                                                i = i6;
                                                pk1Var2 = i7;
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
                                        int D3 = D(pk1Var2, i, obj, j6, a, r3);
                                        if (D3 == 0) {
                                            pk1Var2.b();
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
                                                    pk1Var2.b();
                                                }
                                                str2 = str;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                obj5 = obj3;
                                            } else if (j6 < m()) {
                                                pk1Var2.b();
                                            }
                                        } else if (r3) {
                                            pk1Var2.i();
                                        } else {
                                            a.a(pk1Var2, i + i5);
                                        }
                                    }
                                } else {
                                    obj3 = obj5;
                                    if (j2 < m()) {
                                        pk1Var.b();
                                    }
                                }
                                y(obj, a);
                            } else {
                                obj3 = obj5;
                                a.a(pk1Var, i3 + i2);
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
                            pk1Var.b();
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
                        pk1Var.b();
                    }
                    y11Var = this;
                } else {
                    if (j2 < m()) {
                        pk1Var.b();
                    }
                    Object x3 = x(px2Var, obj);
                    if (x3 == obj5) {
                        return x3;
                    }
                }
            } else if (r2) {
                pk1Var.i();
                Object x4 = x(px2Var, obj);
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
        y11 y11Var = this;
        if (z) {
            while (true) {
                Unsafe unsafe4 = fy.a;
                long j4 = F;
                long longVolatile3 = unsafe4.getLongVolatile(y11Var, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                pk1 pk1Var = a21.a;
                if (unsafe4.compareAndSwapLong(y11Var, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                y11Var = this;
            }
        }
        du2 du2Var = a21.s;
        while (true) {
            Unsafe unsafe5 = fy.a;
            long j5 = h;
            if (unsafe5.compareAndSwapObject(this, j5, du2Var, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j5) != du2Var) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = fy.a;
                j3 = F;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = fy.a;
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
                Unsafe unsafe6 = fy.a;
                long j6 = s;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                du2 du2Var2 = objectVolatile == null ? a21.q : a21.r;
                do {
                    unsafe2 = fy.a;
                    if (unsafe2.compareAndSwapObject(this, s, objectVolatile, du2Var2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                r5c.a(1, objectVolatile);
                ((rr4) objectVolatile).invoke(k());
                return z2;
            }
        }
        return z2;
    }

    @Override // wf1
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        c(cancellationException, true);
    }

    @Override // x2a
    public Object d(Object obj) {
        y11 y11Var = this;
        Unsafe unsafe = fy.a;
        long j = 1152921504606846975L;
        boolean z = y11Var.r(unsafe.getLongVolatile(y11Var, F), false) ? false : !y11Var.b(r2 & 1152921504606846975L);
        nk1 nk1Var = ok1.b;
        if (z) {
            return nk1Var;
        }
        Object obj2 = a21.j;
        pk1 pk1Var = (pk1) unsafe.getObjectVolatile(y11Var, E);
        while (true) {
            long andIncrement = b.getAndIncrement(y11Var);
            long j2 = andIncrement & j;
            boolean r2 = y11Var.r(andIncrement, false);
            int i = a21.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (pk1Var.d != j4) {
                pk1 i3 = y11Var.i(j4, pk1Var);
                if (i3 != null) {
                    pk1Var = i3;
                } else {
                    if (r2) {
                        return new mk1(y11Var.n());
                    }
                    j = 1152921504606846975L;
                }
            }
            int D = y11Var.D(pk1Var, i2, obj, j2, obj2, r2);
            g7c g7cVar = g7c.a;
            if (D == 0) {
                pk1Var.b();
                return g7cVar;
            }
            if (D == 1) {
                return g7cVar;
            }
            if (D == 2) {
                if (r2) {
                    pk1Var.i();
                    return new mk1(n());
                }
                amc amcVar = obj2 instanceof amc ? (amc) obj2 : null;
                if (amcVar != null) {
                    amcVar.a(pk1Var, i2 + i);
                }
                pk1Var.i();
                return nk1Var;
            }
            if (D == 3) {
                dq9.m("unexpected");
                return null;
            }
            if (D == 4) {
                if (j2 < m()) {
                    pk1Var.b();
                }
                return new mk1(n());
            }
            if (D == 5) {
                pk1Var.b();
            }
            j = 1152921504606846975L;
            y11Var = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
    
        r0 = (pk1) ((fs2) fy.a.getObjectVolatile(r0, fs2.b));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pk1 e(long j) {
        fs2 fs2Var;
        long j2;
        Unsafe unsafe;
        long j3;
        Unsafe unsafe2 = fy.a;
        Object objectVolatile = unsafe2.getObjectVolatile(this, r);
        pk1 pk1Var = (pk1) unsafe2.getObjectVolatile(this, E);
        if (pk1Var.d > ((pk1) objectVolatile).d) {
            objectVolatile = pk1Var;
        }
        pk1 pk1Var2 = (pk1) unsafe2.getObjectVolatile(this, x);
        if (pk1Var2.d > ((pk1) objectVolatile).d) {
            objectVolatile = pk1Var2;
        }
        fs2 fs2Var2 = (fs2) objectVolatile;
        loop0: while (true) {
            fs2Var = fs2Var2;
            while (true) {
                int i = fs2.c;
                fs2Var.getClass();
                Object objectVolatile2 = fy.a.getObjectVolatile(fs2Var, fs2.a);
                du2 du2Var = ne3.a;
                if (objectVolatile2 == du2Var) {
                    break loop0;
                }
                fs2Var2 = (fs2) objectVolatile2;
                if (fs2Var2 == null) {
                    do {
                        unsafe = fy.a;
                        j3 = fs2.a;
                        if (unsafe.compareAndSwapObject(fs2Var, j3, (Object) null, du2Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(fs2Var, j3) == null);
                }
            }
        }
        pk1 pk1Var3 = (pk1) fs2Var;
        if (u()) {
            pk1 pk1Var4 = pk1Var3;
            loop3: do {
                int i2 = a21.b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j2 = (pk1Var4.d * a21.b) + i2;
                    if (j2 < m()) {
                        break loop3;
                    }
                    while (true) {
                        Object l = pk1Var4.l(i2);
                        if (l != null && l != a21.e) {
                            if (l == a21.d) {
                                break loop3;
                            }
                        } else {
                            if (pk1Var4.k(i2, l, a21.l)) {
                                pk1Var4.i();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (pk1Var4 != null);
            j2 = -1;
            if (j2 != -1) {
                f(j2);
            }
        }
        Object obj = null;
        loop6: for (pk1 pk1Var5 = pk1Var3; pk1Var5 != null; pk1Var5 = (pk1) ((fs2) fy.a.getObjectVolatile(pk1Var5, fs2.b))) {
            for (int i3 = a21.b - 1; -1 < i3; i3--) {
                if ((pk1Var5.d * a21.b) + i3 < j) {
                    break loop6;
                }
                while (true) {
                    Object l2 = pk1Var5.l(i3);
                    if (l2 != null && l2 != a21.e) {
                        if (!(l2 instanceof bmc)) {
                            if (!(l2 instanceof amc)) {
                                break;
                            }
                            if (pk1Var5.k(i3, l2, a21.l)) {
                                obj = vme.a(obj, l2);
                                pk1Var5.m(i3, true);
                                break;
                            }
                        } else {
                            if (pk1Var5.k(i3, l2, a21.l)) {
                                obj = vme.a(obj, ((bmc) l2).a);
                                pk1Var5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (pk1Var5.k(i3, l2, a21.l)) {
                            pk1Var5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                z((amc) obj, true);
                return pk1Var3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                z((amc) arrayList.get(size), true);
            }
        }
        return pk1Var3;
    }

    public final void f(long j) {
        pk1 pk1Var = (pk1) fy.a.getObjectVolatile(this, x);
        while (true) {
            Unsafe unsafe = fy.a;
            long j2 = y;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(this.a + longVolatile, this.j())) {
                return;
            }
            y11 y11Var = this;
            if (unsafe.compareAndSwapLong(y11Var, j2, longVolatile, 1 + longVolatile)) {
                long j3 = a21.b;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (pk1Var.d != j4) {
                    pk1 h2 = y11Var.h(j4, pk1Var);
                    if (h2 != null) {
                        pk1Var = h2;
                    }
                }
                pk1 pk1Var2 = pk1Var;
                if (y11Var.C(pk1Var2, i, longVolatile, null) != a21.o) {
                    pk1Var2.b();
                } else if (longVolatile < y11Var.o()) {
                    pk1Var2.b();
                }
                this = y11Var;
                pk1Var = pk1Var2;
            }
            this = y11Var;
        }
    }

    public final void g() {
        Object b2;
        Unsafe unsafe;
        if (v()) {
            return;
        }
        Unsafe unsafe2 = fy.a;
        long j = r;
        pk1 pk1Var = (pk1) unsafe2.getObjectVolatile(this, j);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j2 = andIncrement / a21.b;
            if (o() <= andIncrement) {
                if (pk1Var.d < j2 && pk1Var.c() != null) {
                    w(j2, pk1Var);
                }
                p(1L);
                return;
            }
            if (pk1Var.d != j2) {
                z11 z11Var = z11.a;
                while (true) {
                    b2 = ne3.b(pk1Var, j2, z11Var);
                    if (vve.b(b2)) {
                        break;
                    }
                    qx9 a = vve.a(b2);
                    while (true) {
                        qx9 qx9Var = (qx9) fy.a.getObjectVolatile(this, j);
                        if (qx9Var.d >= a.d) {
                            break;
                        }
                        if (a.j()) {
                            do {
                                unsafe = fy.a;
                                if (unsafe.compareAndSwapObject(this, r, qx9Var, a)) {
                                    if (qx9Var.f()) {
                                        qx9Var.e();
                                    }
                                }
                            } while (unsafe.getObjectVolatile(this, j) == qx9Var);
                            if (a.f()) {
                                a.e();
                            }
                        }
                    }
                }
                pk1 pk1Var2 = null;
                if (vve.b(b2)) {
                    t();
                    w(j2, pk1Var);
                    p(1L);
                } else {
                    pk1 pk1Var3 = (pk1) vve.a(b2);
                    long j3 = pk1Var3.d;
                    if (j3 > j2) {
                        long j4 = a21.b * j3;
                        if (fy.a.compareAndSwapLong(this, n, 1 + andIncrement, j4)) {
                            p(j4 - andIncrement);
                        } else {
                            p(1L);
                        }
                    } else {
                        pk1Var2 = pk1Var3;
                    }
                }
                if (pk1Var2 != null) {
                    pk1Var = pk1Var2;
                } else {
                    continue;
                }
            }
            int i = (int) (andIncrement % a21.b);
            Object l = pk1Var.l(i);
            boolean z = l instanceof amc;
            long j5 = y;
            if (!z || andIncrement < fy.a.getLongVolatile(this, j5) || !pk1Var.k(i, l, a21.g)) {
                while (true) {
                    Object l2 = pk1Var.l(i);
                    if (!(l2 instanceof amc)) {
                        if (l2 != a21.j) {
                            if (l2 != null) {
                                if (l2 == a21.d || l2 == a21.h || l2 == a21.i || l2 == a21.k || l2 == a21.l) {
                                    break loop0;
                                } else if (l2 != a21.f) {
                                    zo4.p(l2, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (pk1Var.k(i, l2, a21.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < fy.a.getLongVolatile(this, j5)) {
                        if (pk1Var.k(i, l2, new bmc((amc) l2))) {
                            break loop0;
                        }
                    } else if (pk1Var.k(i, l2, a21.g)) {
                        if (B(l2)) {
                            pk1Var.o(i, a21.d);
                            break;
                        } else {
                            pk1Var.o(i, a21.j);
                            pk1Var.i();
                        }
                    }
                }
                p(1L);
            } else if (B(l)) {
                pk1Var.o(i, a21.d);
                break;
            } else {
                pk1Var.o(i, a21.j);
                pk1Var.i();
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
    public final pk1 h(long j, pk1 pk1Var) {
        Object b2;
        pk1 pk1Var2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        Unsafe unsafe2;
        pk1 pk1Var3 = a21.a;
        z11 z11Var = z11.a;
        loop0: while (true) {
            b2 = ne3.b(pk1Var, j, z11Var);
            if (vve.b(b2)) {
                break;
            }
            qx9 a = vve.a(b2);
            while (true) {
                Unsafe unsafe3 = fy.a;
                long j3 = x;
                qx9 qx9Var = (qx9) unsafe3.getObjectVolatile(this, j3);
                if (qx9Var.d >= a.d) {
                    break loop0;
                }
                if (a.j()) {
                    do {
                        unsafe2 = fy.a;
                        if (unsafe2.compareAndSwapObject(this, x, qx9Var, a)) {
                            if (qx9Var.f()) {
                                qx9Var.e();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j3) == qx9Var);
                    if (a.f()) {
                        a.e();
                    }
                }
            }
        }
        if (vve.b(b2)) {
            t();
            if (pk1Var.d * a21.b < o()) {
                pk1Var.b();
                return null;
            }
        } else {
            pk1 pk1Var4 = (pk1) vve.a(b2);
            long j4 = pk1Var4.d;
            if (!v() && j <= j() / a21.b) {
                while (true) {
                    Unsafe unsafe4 = fy.a;
                    long j5 = r;
                    qx9 qx9Var2 = (qx9) unsafe4.getObjectVolatile(this, j5);
                    if (qx9Var2.d >= j4 || !pk1Var4.j()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe5 = fy.a;
                        pk1Var2 = pk1Var4;
                        if (unsafe5.compareAndSwapObject(this, r, qx9Var2, pk1Var4)) {
                            if (qx9Var2.f()) {
                                qx9Var2.e();
                            }
                        } else {
                            if (unsafe5.getObjectVolatile(this, j5) != qx9Var2) {
                                break;
                            }
                            pk1Var4 = pk1Var2;
                        }
                    }
                    pk1Var4 = pk1Var2;
                }
            }
            pk1Var2 = pk1Var4;
            if (j4 <= j) {
                return pk1Var2;
            }
            long j6 = j4 * a21.b;
            do {
                unsafe = fy.a;
                j2 = y;
                longVolatile = unsafe.getLongVolatile(this, j2);
                if (longVolatile >= j6) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j6));
            if (j4 * a21.b < o()) {
                pk1Var2.b();
            }
        }
        return null;
    }

    public final pk1 i(long j, pk1 pk1Var) {
        Object b2;
        pk1 pk1Var2;
        long j2;
        Unsafe unsafe;
        y11 y11Var = this;
        pk1 pk1Var3 = a21.a;
        z11 z11Var = z11.a;
        loop0: while (true) {
            b2 = ne3.b(pk1Var, j, z11Var);
            if (vve.b(b2)) {
                break;
            }
            qx9 a = vve.a(b2);
            while (true) {
                Unsafe unsafe2 = fy.a;
                long j3 = E;
                qx9 qx9Var = (qx9) unsafe2.getObjectVolatile(y11Var, j3);
                if (qx9Var.d >= a.d) {
                    break loop0;
                }
                if (a.j()) {
                    do {
                        unsafe = fy.a;
                        if (unsafe.compareAndSwapObject(y11Var, E, qx9Var, a)) {
                            if (qx9Var.f()) {
                                qx9Var.e();
                            }
                        }
                    } while (unsafe.getObjectVolatile(y11Var, j3) == qx9Var);
                    if (a.f()) {
                        a.e();
                    }
                }
            }
        }
        pk1 pk1Var4 = null;
        if (vve.b(b2)) {
            y11Var.t();
            if (pk1Var.d * a21.b >= y11Var.m()) {
                return null;
            }
            pk1Var.b();
            return null;
        }
        pk1 pk1Var5 = (pk1) vve.a(b2);
        long j4 = pk1Var5.d;
        if (j4 <= j) {
            return pk1Var5;
        }
        long j5 = j4 * a21.b;
        while (true) {
            Unsafe unsafe3 = fy.a;
            long j6 = F;
            long longVolatile = unsafe3.getLongVolatile(y11Var, j6);
            long j7 = 1152921504606846975L & longVolatile;
            if (j7 >= j5) {
                pk1Var2 = pk1Var4;
                j2 = j4;
                break;
            }
            pk1Var2 = pk1Var4;
            j2 = j4;
            if (unsafe3.compareAndSwapLong(y11Var, j6, longVolatile, j7 + (((int) (longVolatile >> 60)) << 60))) {
                break;
            }
            y11Var = this;
            pk1Var4 = pk1Var2;
            j4 = j2;
        }
        if (j2 * a21.b >= m()) {
            return pk1Var2;
        }
        pk1Var5.b();
        return pk1Var2;
    }

    public final long j() {
        return fy.a.getLongVolatile(this, n);
    }

    public final Throwable k() {
        return (Throwable) fy.a.getObjectVolatile(this, h);
    }

    public final Throwable l() {
        Throwable k = k();
        return k == null ? new mk2("Channel was closed") : k;
    }

    public final long m() {
        return fy.a.getLongVolatile(this, y);
    }

    public final Throwable n() {
        Throwable k = k();
        return k == null ? new nk2("Channel was closed") : k;
    }

    public final long o() {
        return fy.a.getLongVolatile(this, F) & 1152921504606846975L;
    }

    public final void p(long j) {
        if ((e.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((fy.a.getLongVolatile(this, w) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0157, code lost:
    
        fy.a.compareAndSwapLong(r11, y11.y, r7, r7 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x009d, code lost:
    
        r12 = (pk1) ((fs2) fy.a.getObjectVolatile(r12, fs2.b));
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
                        Unsafe unsafe = fy.a;
                        long j2 = x;
                        pk1 pk1Var = (pk1) unsafe.getObjectVolatile(this, j2);
                        long m = m();
                        if (o() <= m) {
                            break;
                        }
                        long j3 = a21.b;
                        long j4 = m / j3;
                        if (pk1Var.d != j4 && (pk1Var = h(j4, pk1Var)) == null) {
                            if (((pk1) unsafe.getObjectVolatile(this, j2)).d < j4) {
                                break;
                            }
                        } else {
                            pk1Var.b();
                            int i2 = (int) (m % j3);
                            while (true) {
                                Object l = pk1Var.l(i2);
                                if (l == null || l == a21.e) {
                                    if (pk1Var.k(i2, l, a21.h)) {
                                        g();
                                        break;
                                    }
                                } else {
                                    if (l == a21.d) {
                                        break;
                                    }
                                    if (l != a21.j) {
                                        if (l != a21.l) {
                                            if (l != a21.i) {
                                                if (l != a21.h) {
                                                    if (l == a21.g) {
                                                        break;
                                                    }
                                                    if (l != a21.f && m == m()) {
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
                    throw new IllegalStateException(hg9.j(i, "unexpected close status: ").toString());
                }
                pk1 e2 = e(j & 1152921504606846975L);
                Object obj = null;
                loop0: do {
                    int i3 = a21.b - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j5 = (e2.d * a21.b) + i3;
                        while (true) {
                            Object l2 = e2.l(i3);
                            if (l2 == a21.i) {
                                break loop0;
                            }
                            if (l2 == a21.d) {
                                if (j5 < m()) {
                                    break loop0;
                                }
                                if (e2.k(i3, l2, a21.l)) {
                                    e2.n(i3, null);
                                    e2.i();
                                    break;
                                }
                            } else if (l2 != a21.e && l2 != null) {
                                if (!(l2 instanceof amc) && !(l2 instanceof bmc)) {
                                    du2 du2Var = a21.g;
                                    if (l2 == du2Var || l2 == a21.f) {
                                        break loop0;
                                    }
                                    if (l2 != du2Var) {
                                        break;
                                    }
                                } else {
                                    if (j5 < m()) {
                                        break loop0;
                                    }
                                    amc amcVar = l2 instanceof bmc ? ((bmc) l2).a : (amc) l2;
                                    if (e2.k(i3, l2, a21.l)) {
                                        obj = vme.a(obj, amcVar);
                                        e2.n(i3, null);
                                        e2.i();
                                        break;
                                    }
                                }
                            } else if (e2.k(i3, l2, a21.l)) {
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
                            z((amc) arrayList.get(size), false);
                        }
                    } else {
                        z((amc) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean s() {
        return r(fy.a.getLongVolatile(this, F), true);
    }

    public final void t() {
        r(fy.a.getLongVolatile(this, F), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0188, code lost:
    
        r3 = (pk1) r3.c();
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
        Unsafe unsafe = fy.a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, F) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        int i = 0;
        List b2 = lm2.b(unsafe.getObjectVolatile(this, x), unsafe.getObjectVolatile(this, E), unsafe.getObjectVolatile(this, r));
        ArrayList arrayList = new ArrayList();
        for (Object obj : b2) {
            if (((pk1) obj) != a21.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            u36.g();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((pk1) next).d;
            do {
                Object next2 = it.next();
                long j2 = ((pk1) next2).d;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        pk1 pk1Var = (pk1) next;
        long m = m();
        long o = o();
        loop2: while (true) {
            int i2 = a21.b;
            int i3 = i;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                long j3 = (pk1Var.d * a21.b) + i3;
                if (j3 >= o && j3 >= m) {
                    break loop2;
                }
                Object l = pk1Var.l(i3);
                Object obj2 = pk1Var.h.get(i3 << 1);
                if (l instanceof tb1) {
                    str = (j3 >= m || j3 < o) ? (j3 >= o || j3 < m) ? "cont" : "send" : "receive";
                } else if (l instanceof bmc) {
                    str = "EB(" + l + ')';
                } else if (rr5.a(l, a21.f) || rr5.a(l, a21.g)) {
                    str = "resuming_sender";
                } else {
                    if (l != null && !l.equals(a21.e) && !l.equals(a21.i) && !l.equals(a21.h) && !l.equals(a21.k) && !l.equals(a21.j) && !l.equals(a21.l)) {
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
    public final void w(long j, pk1 pk1Var) {
        y11 y11Var;
        pk1 pk1Var2;
        pk1 pk1Var3;
        while (pk1Var.d < j && (pk1Var3 = (pk1) pk1Var.c()) != null) {
            pk1Var = pk1Var3;
        }
        while (true) {
            pk1 pk1Var4 = pk1Var;
            while (pk1Var4.d() && (pk1Var2 = (pk1) pk1Var4.c()) != null) {
                pk1Var4 = pk1Var2;
            }
            while (true) {
                Unsafe unsafe = fy.a;
                long j2 = r;
                qx9 qx9Var = (qx9) unsafe.getObjectVolatile(this, j2);
                if (qx9Var.d >= pk1Var4.d) {
                    return;
                }
                if (!pk1Var4.j()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = fy.a;
                    y11Var = this;
                    if (unsafe2.compareAndSwapObject(y11Var, r, qx9Var, pk1Var4)) {
                        if (qx9Var.f()) {
                            qx9Var.e();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(y11Var, j2) != qx9Var) {
                        break;
                    } else {
                        this = y11Var;
                    }
                }
                this = y11Var;
            }
            pk1Var = pk1Var4;
        }
    }

    public final Object x(px2 px2Var, Object obj) {
        vb1 vb1Var = new vb1(1, fne.a(px2Var));
        vb1Var.s();
        vb1Var.resumeWith(new sc9(n()));
        Object q = vb1Var.q();
        return q == ly2.a ? q : g7c.a;
    }

    public final void y(Object obj, vb1 vb1Var) {
        vb1Var.resumeWith(new sc9(n()));
    }

    public final void z(amc amcVar, boolean z) {
        if (amcVar instanceof tb1) {
            ((px2) amcVar).resumeWith(new sc9(z ? l() : n()));
            return;
        }
        if (!(amcVar instanceof x11)) {
            zo4.p(amcVar, "Unexpected waiter: ");
            return;
        }
        x11 x11Var = (x11) amcVar;
        vb1 vb1Var = x11Var.b;
        vb1Var.getClass();
        x11Var.b = null;
        x11Var.a = a21.l;
        Throwable k = x11Var.c.k();
        if (k == null) {
            vb1Var.resumeWith(Boolean.FALSE);
        } else {
            vb1Var.resumeWith(new sc9(k));
        }
    }
}
