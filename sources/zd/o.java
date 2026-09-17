package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class o extends h1 {
    public final m e;

    public o(m mVar) {
        this.e = mVar;
    }

    @Override // zd.d1
    public final void a(Throwable th2) {
        u1 i10 = i();
        m mVar = this.e;
        Throwable q6 = mVar.q(i10);
        if (mVar.x()) {
            id.c cVar = mVar.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            ee.h hVar = (ee.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.h.n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                d9.f fVar = ee.a.d;
                if (!kotlin.jvm.internal.i.a(obj, fVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, fVar, q6)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != fVar) {
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
