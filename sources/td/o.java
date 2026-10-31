package td;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o extends h1 {
    public final m e;

    public o(m mVar) {
        this.e = mVar;
    }

    @Override // td.d1
    public final void a(Throwable th2) {
        u1 i10 = i();
        m mVar = this.e;
        Throwable q6 = mVar.q(i10);
        if (mVar.x()) {
            cd.c cVar = mVar.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            yd.h hVar = (yd.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yd.h.n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                ea.a aVar = yd.a.d;
                if (!kotlin.jvm.internal.i.a(obj, aVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, q6)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                        break;
                    }
                }
                return;
            }
        }
        mVar.n(q6);
        if (mVar.x()) {
            return;
        }
        mVar.o();
    }
}
