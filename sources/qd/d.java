package qd;

import g7.g7;
import hd.f0;
import hd.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends h implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d(boolean z10) {
        super(z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : e.a;
    }

    public final boolean c() {
        return Math.max(h.f.get(this), 0) == 0;
    }

    public final Object d(sc.c cVar) {
        int i9;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > 1) {
                do {
                    i9 = atomicIntegerFieldUpdater.get(this);
                    if (i9 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 1));
            } else {
                oc.i iVar = oc.i.a;
                if (i10 <= 0) {
                    m l10 = f0.l(g7.b(cVar));
                    try {
                        a(new c(this, l10));
                        Object r10 = l10.r();
                        rc.a aVar = rc.a.a;
                        if (r10 != aVar) {
                            r10 = iVar;
                        }
                        return r10 == aVar ? r10 : iVar;
                    } catch (Throwable th) {
                        l10.A();
                        throw th;
                    }
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    g.set(this, null);
                    return iVar;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            e5.c cVar = e.a;
            if (obj2 != cVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, cVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + f0.k(this) + "[isLocked=" + c() + ",owner=" + g.get(this) + ']';
    }
}
