package rd;

import id.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.m;
import nd.t;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class h {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final m a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i10) {
        if (i10 < 0 || i10 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = 1 - i10;
        this.a = new m(this, 1);
    }

    public final void a(c cVar) {
        Object a2;
        j jVar;
        id.m mVar = cVar.a;
        d dVar = cVar.b;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                pc.i iVar = pc.i.a;
                if (andDecrement > 0) {
                    d.g.set(dVar, null);
                    mVar.B(new b(dVar, cVar, 0), iVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                f fVar = f.a;
                long j10 = andIncrement / i.f;
                while (true) {
                    a2 = nd.a.a(jVar2, j10, fVar);
                    if (!nd.a.d(a2)) {
                        t b10 = nd.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            if (tVar.c >= b10.c) {
                                break;
                            }
                            if (!b10.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b10)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (b10.f()) {
                                        b10.e();
                                    }
                                    jVar2 = jVar;
                                }
                            }
                            if (tVar.f()) {
                                tVar.e();
                            }
                        }
                    } else {
                        break;
                    }
                    jVar2 = jVar;
                }
                j jVar3 = (j) nd.a.b(a2);
                AtomicReferenceArray atomicReferenceArray = jVar3.e;
                int i10 = (int) (andIncrement % i.f);
                while (!atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                    if (atomicReferenceArray.get(i10) != null) {
                        ec.a aVar = i.b;
                        ec.a aVar2 = i.c;
                        while (!atomicReferenceArray.compareAndSet(i10, aVar, aVar2)) {
                            if (atomicReferenceArray.get(i10) != aVar) {
                                break;
                            }
                        }
                        d.g.set(dVar, null);
                        mVar.B(new b(dVar, cVar, 0), iVar);
                        return;
                    }
                }
                cVar.a(jVar3, i10);
                return;
            }
        }
    }

    public final void b() {
        boolean z10;
        int i10;
        Object a2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z10 = true;
            if (andIncrement >= 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = c.getAndIncrement(this);
            long j10 = andIncrement2 / i.f;
            g gVar = g.a;
            while (true) {
                a2 = nd.a.a(jVar, j10, gVar);
                if (!nd.a.d(a2)) {
                    t b10 = nd.a.b(a2);
                    while (true) {
                        t tVar = (t) atomicReferenceFieldUpdater.get(this);
                        if (tVar.c >= b10.c) {
                            break;
                        }
                        if (!b10.j()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b10)) {
                            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                if (b10.f()) {
                                    b10.e();
                                }
                            }
                        }
                        if (tVar.f()) {
                            tVar.e();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) nd.a.b(a2);
            AtomicReferenceArray atomicReferenceArray = jVar2.e;
            jVar2.b();
            long j11 = jVar2.c;
            boolean z11 = false;
            if (j11 <= j10) {
                int i11 = (int) (andIncrement2 % i.f);
                Object andSet = atomicReferenceArray.getAndSet(i11, i.b);
                if (andSet == null) {
                    int i12 = i.a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            ec.a aVar = i.b;
                            ec.a aVar2 = i.d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i11, aVar, aVar2)) {
                                    z11 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i11) != aVar) {
                                    break;
                                }
                            }
                            z10 = true ^ z11;
                        } else if (atomicReferenceArray.get(i11) == i.c) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                } else if (andSet != i.e) {
                    if (!(andSet instanceof l)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    l lVar = (l) andSet;
                    ec.a b11 = lVar.b(this.a, pc.i.a);
                    if (b11 != null) {
                        lVar.e(b11);
                    }
                }
            }
            z10 = false;
        } while (!z10);
    }
}
