package sc;

import hd.a0;
import hd.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c extends a {
    private final qc.h _context;
    private transient qc.c intercepted;

    public c(qc.c cVar, qc.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // qc.c
    public qc.h getContext() {
        qc.h hVar = this._context;
        kotlin.jvm.internal.i.b(hVar);
        return hVar;
    }

    public final qc.c intercepted() {
        qc.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        qc.e eVar = (qc.e) getContext().get(qc.d.a);
        qc.c hVar = eVar != null ? new md.h((a0) eVar, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // sc.a
    public void releaseIntercepted() {
        qc.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            qc.f fVar = getContext().get(qc.d.a);
            kotlin.jvm.internal.i.b(fVar);
            md.h hVar = (md.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = md.h.n;
            while (atomicReferenceFieldUpdater.get(hVar) == md.a.d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            m mVar = obj instanceof m ? (m) obj : null;
            if (mVar != null) {
                mVar.o();
            }
        }
        this.intercepted = b.a;
    }

    public c(qc.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
