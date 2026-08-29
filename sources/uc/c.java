package uc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.a0;
import jd.m;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class c extends a {
    private final sc.h _context;
    private transient sc.c intercepted;

    public c(sc.c cVar, sc.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // sc.c
    public sc.h getContext() {
        sc.h hVar = this._context;
        j.b(hVar);
        return hVar;
    }

    public final sc.c intercepted() {
        sc.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        sc.e eVar = (sc.e) getContext().get(sc.d.a);
        sc.c hVar = eVar != null ? new od.h((a0) eVar, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // uc.a
    public void releaseIntercepted() {
        sc.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            sc.f fVar = getContext().get(sc.d.a);
            j.b(fVar);
            od.h hVar = (od.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = od.h.n;
            while (atomicReferenceFieldUpdater.get(hVar) == od.a.d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            m mVar = obj instanceof m ? (m) obj : null;
            if (mVar != null) {
                mVar.o();
            }
        }
        this.intercepted = b.a;
    }

    public c(sc.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
