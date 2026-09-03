package wc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import ld.a0;
import ld.m;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class c extends a {
    private final uc.h _context;
    private transient uc.c intercepted;

    public c(uc.c cVar, uc.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // uc.c
    public uc.h getContext() {
        uc.h hVar = this._context;
        j.b(hVar);
        return hVar;
    }

    public final uc.c intercepted() {
        uc.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        uc.e eVar = (uc.e) getContext().get(uc.d.a);
        uc.c hVar = eVar != null ? new qd.h((a0) eVar, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // wc.a
    public void releaseIntercepted() {
        uc.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            uc.f fVar = getContext().get(uc.d.a);
            j.b(fVar);
            qd.h hVar = (qd.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qd.h.n;
            while (atomicReferenceFieldUpdater.get(hVar) == qd.a.d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            m mVar = obj instanceof m ? (m) obj : null;
            if (mVar != null) {
                mVar.o();
            }
        }
        this.intercepted = b.a;
    }

    public c(uc.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
