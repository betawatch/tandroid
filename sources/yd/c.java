package yd;

import b8.ib;
import b8.jc;
import be.t;
import d2.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.p1;
import kotlin.jvm.internal.u;
import wd.b0;
import wd.c2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class c implements g {
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
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

    public c(int i3) {
        this.a = i3;
        if (i3 < 0) {
            throw new IllegalArgumentException(p1.j(i3, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.a;
        this.bufferEnd$volatile = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (t()) {
            kVar2 = e.a;
            kotlin.jvm.internal.j.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.s;
    }

    public static final k c(c cVar, long j10, k kVar) {
        Object b10;
        c cVar2;
        k kVar2 = e.a;
        d dVar = d.a;
        loop0: while (true) {
            b10 = be.a.b(kVar, j10, dVar);
            if (!be.a.e(b10)) {
                be.r c2 = be.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                    be.r rVar = (be.r) atomicReferenceFieldUpdater.get(cVar);
                    if (rVar.c >= c2.c) {
                        break loop0;
                    }
                    if (!c2.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, rVar, c2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != rVar) {
                            if (c2.f()) {
                                c2.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean e10 = be.a.e(b10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (e10) {
            cVar.i();
            if (kVar.c * e.b < atomicLongFieldUpdater.get(cVar)) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) be.a.c(b10);
            long j11 = kVar3.c;
            if (j11 <= j10) {
                return kVar3;
            }
            long j12 = e.b * j11;
            while (true) {
                long j13 = b.get(cVar);
                long j14 = 1152921504606846975L & j13;
                if (j14 >= j12) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (b.compareAndSet(cVar2, j13, (((int) (j13 >> 60)) << 60) + j14)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j11 * e.b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.b();
            }
        }
        return null;
    }

    public static final void d(c cVar, Object obj, wd.m mVar) {
        mVar.resumeWith(ib.a(cVar.o()));
    }

    public static final int e(c cVar, k kVar, int i3, Object obj, long j10, Object obj2, boolean z10) {
        kVar.n(i3, obj);
        if (z10) {
            return cVar.A(kVar, i3, obj, j10, obj2, z10);
        }
        Object l10 = kVar.l(i3);
        if (l10 == null) {
            if (cVar.f(j10)) {
                if (kVar.k(i3, null, e.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.k(i3, null, obj2)) {
                    return 2;
                }
            }
        } else if (l10 instanceof c2) {
            kVar.n(i3, null);
            if (cVar.x(l10, obj)) {
                kVar.o(i3, e.i);
                return 0;
            }
            t tVar = e.k;
            if (kVar.f.getAndSet((i3 * 2) + 1, tVar) == tVar) {
                return 5;
            }
            kVar.m(i3, true);
            return 5;
        }
        return cVar.A(kVar, i3, obj, j10, obj2, z10);
    }

    public static void q(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean y(Object obj) {
        if (!(obj instanceof wd.l)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        wd.l lVar = (wd.l) obj;
        k kVar = e.a;
        t f10 = lVar.f(dd.k.a, null);
        if (f10 == null) {
            return false;
        }
        lVar.e(f10);
        return true;
    }

    public final int A(k kVar, int i3, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object l10 = kVar.l(i3);
            if (l10 == null) {
                if (!f(j10) || z10) {
                    if (z10) {
                        if (kVar.k(i3, null, e.j)) {
                            kVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.k(i3, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.k(i3, null, e.d)) {
                    break;
                }
            } else {
                if (l10 != e.e) {
                    t tVar = e.k;
                    if (l10 == tVar) {
                        kVar.n(i3, null);
                        return 5;
                    }
                    if (l10 == e.h) {
                        kVar.n(i3, null);
                        return 5;
                    }
                    if (l10 == e.l) {
                        kVar.n(i3, null);
                        i();
                        return 4;
                    }
                    kVar.n(i3, null);
                    if (l10 instanceof s) {
                        l10 = ((s) l10).a;
                    }
                    if (x(l10, obj)) {
                        kVar.o(i3, e.i);
                        return 0;
                    }
                    if (kVar.f.getAndSet((i3 * 2) + 1, tVar) != tVar) {
                        kVar.m(i3, true);
                    }
                    return 5;
                }
                if (kVar.k(i3, l10, e.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void B(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.t()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = d;
            if (atomicLongFieldUpdater.get(cVar) > j10) {
                break;
            } else {
                cVar = this;
            }
        }
        int i3 = e.c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (i10 < i3) {
                long j11 = atomicLongFieldUpdater.get(cVar);
                if (j11 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j11 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                while (true) {
                    long j12 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j12, (j12 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater.get(cVar);
                    long j14 = atomicLongFieldUpdater2.get(cVar);
                    long j15 = j14 & 4611686018427387903L;
                    boolean z10 = (j14 & 4611686018427387904L) != 0;
                    if (j13 == j15 && j13 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (z10) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j14, 4611686018427387904L + j15);
                    }
                }
                while (true) {
                    long j16 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j16, j16 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00c6, code lost:
    
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173 A[RETURN] */
    @Override // yd.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(fd.c cVar, Object obj) {
        Object r5;
        gd.a aVar;
        Object obj2;
        c cVar2;
        k kVar;
        int i3;
        int i10;
        boolean z10;
        c cVar3 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar3);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar3);
            long j10 = andIncrement & 1152921504606846975L;
            boolean r9 = cVar3.r(andIncrement, false);
            int i11 = e.b;
            long j11 = i11;
            long j12 = j10 / j11;
            int i12 = (int) (j10 % j11);
            long j13 = kVar2.c;
            dd.k kVar3 = dd.k.a;
            if (j13 != j12) {
                k c2 = c(cVar3, j12, kVar2);
                if (c2 != null) {
                    kVar2 = c2;
                } else if (r9) {
                    Object v = v(cVar, obj);
                    if (v == gd.a.a) {
                        return v;
                    }
                }
            }
            int e10 = e(cVar3, kVar2, i12, obj, j10, null, r9);
            if (e10 == 0) {
                kVar2.b();
                return kVar3;
            }
            if (e10 == 1) {
                break;
            }
            if (e10 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
                if (e10 == 3) {
                    wd.m l10 = b0.l(jc.b(cVar));
                    Object obj3 = obj;
                    try {
                        int e11 = e(cVar3, kVar2, i12, obj3, j10, l10, false);
                        try {
                            if (e11 != 0) {
                                if (e11 == 1) {
                                    l10.resumeWith(kVar3);
                                } else if (e11 != 2) {
                                    if (e11 != 4) {
                                        String str = "unexpected";
                                        if (e11 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.b();
                                        k kVar4 = (k) atomicReferenceFieldUpdater.get(cVar3);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(cVar3);
                                            long j14 = andIncrement2 & 1152921504606846975L;
                                            boolean r10 = cVar3.r(andIncrement2, false);
                                            int i13 = e.b;
                                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                            long j15 = i13;
                                            String str2 = str;
                                            long j16 = j14 / j15;
                                            int i14 = (int) (j14 % j15);
                                            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater2;
                                            if (kVar4.c != j16) {
                                                k c10 = c(cVar3, j16, kVar4);
                                                if (c10 != null) {
                                                    i3 = i13;
                                                    i10 = i14;
                                                    z10 = r10;
                                                    kVar = c10;
                                                } else {
                                                    if (r10) {
                                                        break;
                                                    }
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                }
                                            } else {
                                                kVar = kVar4;
                                                i3 = i13;
                                                i10 = i14;
                                                z10 = r10;
                                            }
                                            int e12 = e(cVar3, kVar, i10, obj3, j14, l10, z10);
                                            Object obj4 = obj3;
                                            cVar2 = cVar3;
                                            k kVar5 = kVar;
                                            int i15 = i10;
                                            obj2 = obj4;
                                            if (e12 == 0) {
                                                kVar5.b();
                                                break;
                                            }
                                            if (e12 == 1) {
                                                break;
                                            }
                                            if (e12 != 2) {
                                                if (e12 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (e12 != 4) {
                                                    if (e12 == 5) {
                                                        kVar5.b();
                                                    }
                                                    kVar4 = kVar5;
                                                    cVar3 = cVar2;
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                    obj3 = obj2;
                                                } else if (j14 < atomicLongFieldUpdater4.get(cVar2)) {
                                                    kVar5.b();
                                                }
                                            } else if (z10) {
                                                kVar5.i();
                                            } else {
                                                l10.a(kVar5, i15 + i3);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        cVar2 = cVar3;
                                        if (j10 < atomicLongFieldUpdater2.get(cVar2)) {
                                            kVar2.b();
                                        }
                                    }
                                    d(cVar2, obj2, l10);
                                } else {
                                    l10.a(kVar2, i12 + i11);
                                }
                                r5 = l10.r();
                                aVar = gd.a.a;
                                if (r5 != aVar) {
                                    r5 = kVar3;
                                }
                                if (r5 != aVar) {
                                    return r5;
                                }
                            } else {
                                kVar2.b();
                            }
                            l10.resumeWith(kVar3);
                            r5 = l10.r();
                            aVar = gd.a.a;
                            if (r5 != aVar) {
                            }
                            if (r5 != aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            l10.A();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else if (e10 == 4) {
                    if (j10 < atomicLongFieldUpdater2.get(cVar3)) {
                        kVar2.b();
                    }
                    Object v10 = v(cVar, obj);
                    if (v10 == gd.a.a) {
                        return v10;
                    }
                } else if (e10 == 5) {
                    kVar2.b();
                }
            } else if (r9) {
                kVar2.i();
                Object v11 = v(cVar, obj);
                if (v11 == gd.a.a) {
                    return v11;
                }
            }
        }
    }

    @Override // yd.r
    public Object b(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        boolean z10 = false;
        long j10 = 1152921504606846975L;
        boolean z11 = r(atomicLongFieldUpdater.get(this), false) ? false : !f(r1 & 1152921504606846975L);
        i iVar = j.b;
        if (z11) {
            return iVar;
        }
        Object obj2 = e.j;
        k kVar = (k) f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = andIncrement & j10;
            boolean r5 = r(andIncrement, z10);
            int i3 = e.b;
            long j12 = i3;
            long j13 = j11 / j12;
            int i10 = (int) (j11 % j12);
            if (kVar.c != j13) {
                k c2 = c(this, j13, kVar);
                if (c2 != null) {
                    kVar = c2;
                } else {
                    if (r5) {
                        return new h(o());
                    }
                    z10 = false;
                    j10 = 1152921504606846975L;
                }
            }
            int e10 = e(this, kVar, i10, obj, j11, obj2, r5);
            dd.k kVar2 = dd.k.a;
            if (e10 == 0) {
                kVar.b();
                return kVar2;
            }
            if (e10 == 1) {
                return kVar2;
            }
            if (e10 == 2) {
                if (r5) {
                    kVar.i();
                    return new h(o());
                }
                c2 c2Var = obj2 instanceof c2 ? (c2) obj2 : null;
                if (c2Var != null) {
                    c2Var.a(kVar, i10 + i3);
                }
                kVar.i();
                return iVar;
            }
            if (e10 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (e10 == 4) {
                if (j11 < c.get(this)) {
                    kVar.b();
                }
                return new h(o());
            }
            if (e10 == 5) {
                kVar.b();
            }
            z10 = false;
            j10 = 1152921504606846975L;
        }
    }

    @Override // yd.q
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    public final boolean f(long j10) {
        return j10 < d.get(this) || j10 < c.get(this) + ((long) this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Throwable th2, boolean z10) {
        c cVar;
        t tVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z11;
        long j10;
        long j11;
        long j12;
        Object obj;
        long j13;
        long j14;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (z10) {
            do {
                j14 = atomicLongFieldUpdater.get(this);
                if (((int) (j14 >> 60)) == 0) {
                    k kVar = e.a;
                    cVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j14, (j14 & 1152921504606846975L) + (1 << 60)));
            tVar = e.s;
            while (true) {
                atomicReferenceFieldUpdater = r;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, th2)) {
                    z11 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                    z11 = false;
                    break;
                }
            }
            if (z10) {
                do {
                    j10 = atomicLongFieldUpdater.get(this);
                    int i3 = (int) (j10 >> 60);
                    if (i3 == 0) {
                        j11 = j10 & 1152921504606846975L;
                        j12 = 2;
                    } else {
                        if (i3 != 1) {
                            break;
                        }
                        j11 = j10 & 1152921504606846975L;
                        j12 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j10, (j12 << 60) + j11));
            } else {
                do {
                    j13 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j13, (3 << 60) + (j13 & 1152921504606846975L)));
            }
            i();
            if (z11) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    t tVar2 = obj == null ? e.q : e.r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, tVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    u.a(1, obj);
                    ((od.l) obj).invoke(m());
                    return z11;
                }
            }
            return z11;
        }
        cVar = this;
        tVar = e.s;
        while (true) {
            atomicReferenceFieldUpdater = r;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, th2)) {
            }
        }
        if (z10) {
        }
        i();
        if (z11) {
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (yd.k) ((be.b) be.b.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k h(long j10) {
        Object obj;
        long j11;
        Object obj2 = n.get(this);
        k kVar = (k) f.get(this);
        if (kVar.c > ((k) obj2).c) {
            obj2 = kVar;
        }
        k kVar2 = (k) h.get(this);
        if (kVar2.c > ((k) obj2).c) {
            obj2 = kVar2;
        }
        be.b bVar = (be.b) obj2;
        loop0: while (true) {
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.b.a;
            Object obj3 = atomicReferenceFieldUpdater.get(bVar);
            t tVar = be.a.a;
            obj = null;
            if (obj3 == tVar) {
                break;
            }
            be.b bVar2 = (be.b) obj3;
            if (bVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(bVar, null, tVar)) {
                    if (atomicReferenceFieldUpdater.get(bVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            bVar = bVar2;
        }
        k kVar3 = (k) bVar;
        if (s()) {
            k kVar4 = kVar3;
            loop2: do {
                int i3 = e.b - 1;
                while (true) {
                    if (-1 >= i3) {
                        break;
                    }
                    j11 = (kVar4.c * e.b) + i3;
                    if (j11 < c.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object l10 = kVar4.l(i3);
                        if (l10 != null && l10 != e.e) {
                            if (l10 == e.d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.k(i3, l10, e.l)) {
                                kVar4.i();
                                break;
                            }
                        }
                    }
                    i3--;
                }
            } while (kVar4 != null);
            j11 = -1;
            if (j11 != -1) {
                j(j11);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((be.b) be.b.b.get(kVar5))) {
            for (int i10 = e.b - 1; -1 < i10; i10--) {
                if ((kVar5.c * e.b) + i10 < j10) {
                    break loop5;
                }
                while (true) {
                    Object l11 = kVar5.l(i10);
                    if (l11 != null && l11 != e.e) {
                        if (!(l11 instanceof s)) {
                            if (!(l11 instanceof c2)) {
                                break;
                            }
                            if (kVar5.k(i10, l11, e.l)) {
                                obj = be.a.f(obj, l11);
                                kVar5.m(i10, true);
                                break;
                            }
                        } else {
                            if (kVar5.k(i10, l11, e.l)) {
                                obj = be.a.f(obj, ((s) l11).a);
                                kVar5.m(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.k(i10, l11, e.l)) {
                            kVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                w((c2) obj, true);
                return kVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                w((c2) arrayList.get(size), true);
            }
        }
        return kVar3;
    }

    public final void i() {
        r(b.get(this), false);
    }

    public final void j(long j10) {
        k kVar = (k) h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(this.a + j11, d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, 1 + j11)) {
                long j12 = e.b;
                long j13 = j11 / j12;
                int i3 = (int) (j11 % j12);
                if (kVar.c != j13) {
                    k l10 = l(j13, kVar);
                    if (l10 != null) {
                        kVar = l10;
                    }
                }
                k kVar2 = kVar;
                if (z(kVar2, i3, j11, null) != e.o) {
                    kVar2.b();
                } else if (j11 < p()) {
                    kVar2.b();
                }
                kVar = kVar2;
            }
        }
    }

    public final void k() {
        Object b10;
        if (t()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j10 = andIncrement / e.b;
            if (p() <= andIncrement) {
                if (kVar.c < j10 && kVar.c() != null) {
                    u(j10, kVar);
                }
                q(this);
                return;
            }
            if (kVar.c != j10) {
                d dVar = d.a;
                while (true) {
                    b10 = be.a.b(kVar, j10, dVar);
                    if (!be.a.e(b10)) {
                        be.r c2 = be.a.c(b10);
                        while (true) {
                            be.r rVar = (be.r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.c >= c2.c) {
                                break;
                            }
                            if (!c2.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c2)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (c2.f()) {
                                        c2.e();
                                    }
                                }
                            }
                            if (rVar.f()) {
                                rVar.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (be.a.e(b10)) {
                    i();
                    u(j10, kVar);
                    q(this);
                } else {
                    k kVar3 = (k) be.a.c(b10);
                    long j11 = kVar3.c;
                    if (j11 > j10) {
                        long j12 = j11 * e.b;
                        if (d.compareAndSet(this, 1 + andIncrement, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j12 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int i3 = (int) (andIncrement % e.b);
            Object l10 = kVar.l(i3);
            boolean z10 = l10 instanceof c2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.k(i3, l10, e.g)) {
                while (true) {
                    Object l11 = kVar.l(i3);
                    if (!(l11 instanceof c2)) {
                        if (l11 != e.j) {
                            if (l11 != null) {
                                if (l11 == e.d || l11 == e.h || l11 == e.i || l11 == e.k || l11 == e.l) {
                                    break loop0;
                                }
                                if (l11 != e.f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + l11).toString());
                                }
                            } else if (kVar.k(i3, l11, e.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.k(i3, l11, new s((c2) l11))) {
                            break loop0;
                        }
                    } else if (kVar.k(i3, l11, e.g)) {
                        if (y(l11)) {
                            kVar.o(i3, e.d);
                            break;
                        } else {
                            kVar.o(i3, e.j);
                            kVar.i();
                        }
                    }
                }
            } else if (y(l10)) {
                kVar.o(i3, e.d);
                break;
            } else {
                kVar.o(i3, e.j);
                kVar.i();
                q(this);
            }
        }
        q(this);
    }

    public final k l(long j10, k kVar) {
        Object b10;
        long j11;
        k kVar2 = e.a;
        d dVar = d.a;
        loop0: while (true) {
            b10 = be.a.b(kVar, j10, dVar);
            if (!be.a.e(b10)) {
                be.r c2 = be.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    be.r rVar = (be.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.c >= c2.c) {
                        break loop0;
                    }
                    if (!c2.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c2)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (c2.f()) {
                                c2.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (be.a.e(b10)) {
            i();
            if (kVar.c * e.b < p()) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) be.a.c(b10);
            long j12 = kVar3.c;
            if (!t() && j10 <= d.get(this) / e.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = n;
                    be.r rVar2 = (be.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.c >= j12 || !kVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (kVar3.f()) {
                                kVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j12 <= j10) {
                return kVar3;
            }
            long j13 = j12 * e.b;
            do {
                j11 = c.get(this);
                if (j11 >= j13) {
                    break;
                }
            } while (!c.compareAndSet(this, j11, j13));
            if (j12 * e.b < p()) {
                kVar3.b();
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) r.get(this);
    }

    public final Throwable n() {
        Throwable m10 = m();
        return m10 == null ? new l("Channel was closed") : m10;
    }

    public final Throwable o() {
        Throwable m10 = m();
        return m10 == null ? new y("Channel was closed") : m10;
    }

    public final long p() {
        return b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (yd.k) ((be.b) be.b.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j10, boolean z10) {
        int i3 = (int) (j10 >> 60);
        if (i3 != 0 && i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            if (i3 == 2) {
                h(1152921504606846975L & j10);
                if (z10) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                        k kVar = (k) atomicReferenceFieldUpdater.get(this);
                        long j11 = atomicLongFieldUpdater.get(this);
                        if (p() <= j11) {
                            break;
                        }
                        long j12 = e.b;
                        long j13 = j11 / j12;
                        if (kVar.c != j13 && (kVar = l(j13, kVar)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).c < j13) {
                                break;
                            }
                        } else {
                            kVar.b();
                            int i10 = (int) (j11 % j12);
                            while (true) {
                                Object l10 = kVar.l(i10);
                                if (l10 == null || l10 == e.e) {
                                    if (kVar.k(i10, l10, e.h)) {
                                        k();
                                        break;
                                    }
                                } else {
                                    if (l10 == e.d) {
                                        break;
                                    }
                                    if (l10 != e.j) {
                                        if (l10 != e.l) {
                                            if (l10 != e.i) {
                                                if (l10 != e.h) {
                                                    if (l10 == e.g) {
                                                        break;
                                                    }
                                                    if (l10 != e.f && j11 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            c.compareAndSet(this, j11, j11 + 1);
                        }
                    }
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException(p1.i(i3, "unexpected close status: ").toString());
                }
                k h7 = h(1152921504606846975L & j10);
                Object obj = null;
                loop0: do {
                    int i11 = e.b - 1;
                    while (true) {
                        if (-1 >= i11) {
                            break;
                        }
                        long j14 = (h7.c * e.b) + i11;
                        while (true) {
                            Object l11 = h7.l(i11);
                            if (l11 == e.i) {
                                break loop0;
                            }
                            if (l11 == e.d) {
                                if (j14 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (h7.k(i11, l11, e.l)) {
                                    h7.n(i11, null);
                                    h7.i();
                                    break;
                                }
                            } else if (l11 != e.e && l11 != null) {
                                if (!(l11 instanceof c2) && !(l11 instanceof s)) {
                                    t tVar = e.g;
                                    if (l11 == tVar || l11 == e.f) {
                                        break loop0;
                                    }
                                    if (l11 != tVar) {
                                        break;
                                    }
                                } else {
                                    if (j14 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    c2 c2Var = l11 instanceof s ? ((s) l11).a : (c2) l11;
                                    if (h7.k(i11, l11, e.l)) {
                                        obj = be.a.f(obj, c2Var);
                                        h7.n(i11, null);
                                        h7.i();
                                        break;
                                    }
                                }
                            } else if (h7.k(i11, l11, e.l)) {
                                h7.i();
                                break;
                            }
                        }
                        i11--;
                    }
                } while (h7 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            w((c2) arrayList.get(size), false);
                        }
                    } else {
                        w((c2) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean s() {
        return false;
    }

    public final boolean t() {
        long j10 = d.get(this);
        return j10 == 0 || j10 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0196, code lost:
    
        r16 = r7;
        r3 = (yd.k) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019f, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i3 = (int) (b.get(this) >> 60);
        if (i3 == 2) {
            sb2.append("closed,");
        } else if (i3 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.a + ',');
        sb2.append("data=[");
        int i10 = 0;
        boolean z11 = true;
        List c2 = ed.h.c(h.get(this), f.get(this), n.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : c2) {
            if (((k) obj) != e.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((k) next).c;
            do {
                Object next2 = it.next();
                long j11 = ((k) next2).c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j12 = c.get(this);
        long p10 = p();
        loop2: while (true) {
            int i11 = e.b;
            int i12 = i10;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                long j13 = (kVar.c * e.b) + i12;
                if (j13 >= p10 && j13 >= j12) {
                    break loop2;
                }
                Object l10 = kVar.l(i12);
                boolean z12 = z11;
                Object obj2 = kVar.f.get(i12 * 2);
                if (l10 instanceof wd.l) {
                    str = (j13 >= j12 || j13 < p10) ? (j13 >= p10 || j13 < j12) ? "cont" : "send" : "receive";
                } else if (l10 instanceof s) {
                    str = "EB(" + l10 + ')';
                } else if (kotlin.jvm.internal.j.a(l10, e.f) || kotlin.jvm.internal.j.a(l10, e.g)) {
                    str = "resuming_sender";
                } else {
                    if (l10 != null && !l10.equals(e.e) && !l10.equals(e.i) && !l10.equals(e.h) && !l10.equals(e.k) && !l10.equals(e.j) && !l10.equals(e.l)) {
                        str = l10.toString();
                    }
                    i12++;
                    z11 = z12;
                }
                if (obj2 != null) {
                    sb2.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb2.append(str + ',');
                }
                i12++;
                z11 = z12;
            }
            z11 = z10;
            i10 = 0;
        }
        if (sb2.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb2.charAt(ud.d.f(sb2)) == ',') {
            kotlin.jvm.internal.j.d(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(long j10, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.c < j10 && (kVar3 = (k) kVar.c()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.d() || (kVar2 = (k) kVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                    be.r rVar = (be.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.c >= kVar.c) {
                        return;
                    }
                    if (!kVar.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (kVar.f()) {
                                kVar.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                        return;
                    }
                    return;
                }
            }
            kVar = kVar2;
        }
    }

    public final Object v(fd.c cVar, Object obj) {
        wd.m mVar = new wd.m(1, jc.b(cVar));
        mVar.s();
        mVar.resumeWith(ib.a(o()));
        Object r5 = mVar.r();
        return r5 == gd.a.a ? r5 : dd.k.a;
    }

    public final void w(c2 c2Var, boolean z10) {
        if (c2Var instanceof wd.l) {
            ((fd.c) c2Var).resumeWith(ib.a(z10 ? n() : o()));
            return;
        }
        if (!(c2Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + c2Var).toString());
        }
        b bVar = (b) c2Var;
        wd.m mVar = bVar.b;
        kotlin.jvm.internal.j.b(mVar);
        bVar.b = null;
        bVar.a = e.l;
        Throwable m10 = bVar.c.m();
        if (m10 == null) {
            mVar.resumeWith(Boolean.FALSE);
        } else {
            mVar.resumeWith(ib.a(m10));
        }
    }

    public final boolean x(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof wd.l)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            wd.l lVar = (wd.l) obj;
            k kVar = e.a;
            t f10 = lVar.f(obj2, null);
            if (f10 == null) {
                return false;
            }
            lVar.e(f10);
            return true;
        }
        b bVar = (b) obj;
        wd.m mVar = bVar.b;
        kotlin.jvm.internal.j.b(mVar);
        bVar.b = null;
        bVar.a = obj2;
        Boolean bool = Boolean.TRUE;
        k kVar2 = e.a;
        t f11 = mVar.f(bool, null);
        if (f11 == null) {
            return false;
        }
        mVar.e(f11);
        return true;
    }

    public final Object z(k kVar, int i3, long j10, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f;
        Object l10 = kVar.l(i3);
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (l10 == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.n;
                }
                if (kVar.k(i3, l10, obj)) {
                    k();
                    return e.m;
                }
            }
        } else if (l10 == e.d && kVar.k(i3, l10, e.i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            kVar.n(i3, null);
            return obj2;
        }
        while (true) {
            Object l11 = kVar.l(i3);
            if (l11 == null || l11 == e.e) {
                if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.k(i3, l11, e.h)) {
                        k();
                        return e.o;
                    }
                } else {
                    if (obj == null) {
                        return e.n;
                    }
                    if (kVar.k(i3, l11, obj)) {
                        k();
                        return e.m;
                    }
                }
            } else if (l11 != e.d) {
                t tVar = e.j;
                if (l11 == tVar) {
                    return e.o;
                }
                if (l11 == e.h) {
                    return e.o;
                }
                if (l11 == e.l) {
                    k();
                    return e.o;
                }
                if (l11 != e.g && kVar.k(i3, l11, e.f)) {
                    boolean z10 = l11 instanceof s;
                    if (z10) {
                        l11 = ((s) l11).a;
                    }
                    if (y(l11)) {
                        kVar.o(i3, e.i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i3 * 2);
                        kVar.n(i3, null);
                        return obj3;
                    }
                    kVar.o(i3, tVar);
                    kVar.i();
                    if (z10) {
                        k();
                    }
                    return e.o;
                }
            } else if (kVar.k(i3, l11, e.i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i3 * 2);
                kVar.n(i3, null);
                return obj4;
            }
        }
    }
}
