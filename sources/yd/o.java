package yd;

import be.t;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wd.b0;
import wd.b1;
import wd.n1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o extends wd.a implements p, g {
    public final c d;

    public o(fd.h hVar, c cVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // wd.a
    public final void Q(Throwable th2, boolean z10) {
        if (this.d.g(th2, false) || z10) {
            return;
        }
        b0.m(this.c, th2);
    }

    @Override // wd.a
    public final void R(Object obj) {
        this.d.g(null, false);
    }

    public final void T(v0.g gVar) {
        c cVar = this.d;
        cVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.s;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, gVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(cVar);
                    t tVar = e.q;
                    if (obj != tVar) {
                        if (obj == e.r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    t tVar2 = e.r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, tVar, tVar2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != tVar) {
                            break;
                        }
                    }
                    gVar.invoke(cVar.m());
                    return;
                }
            }
        }
    }

    @Override // yd.r
    public final Object a(fd.c cVar, Object obj) {
        return this.d.a(cVar, obj);
    }

    @Override // yd.r
    public final Object b(Object obj) {
        return this.d.b(dd.k.a);
    }

    @Override // wd.n1, wd.a1
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new b1(m(), null, this);
        }
        k(cancellationException);
    }

    @Override // wd.n1
    public final void k(CancellationException cancellationException) {
        CancellationException N = n1.N(this, cancellationException);
        this.d.g(N, true);
        j(N);
    }
}
