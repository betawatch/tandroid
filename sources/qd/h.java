package qd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ld.a0;
import ld.c2;
import ld.e0;
import ld.l0;
import ld.w0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h extends l0 implements wc.d, uc.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final wc.c e;
    public Object f;
    public final Object h;

    public h(a0 a0Var, wc.c cVar) {
        super(-1);
        this.d = a0Var;
        this.e = cVar;
        this.f = a.c;
        Object fold = cVar.getContext().fold(0, w.c);
        kotlin.jvm.internal.j.b(fold);
        this.h = fold;
    }

    @Override // ld.l0
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof ld.w) {
            throw null;
        }
    }

    @Override // wc.d
    public final wc.d getCallerFrame() {
        wc.c cVar = this.e;
        if (e2.c.s(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // uc.c
    public final uc.h getContext() {
        return this.e.getContext();
    }

    @Override // ld.l0
    public final Object j() {
        Object obj = this.f;
        this.f = a.c;
        return obj;
    }

    @Override // uc.c
    public final void resumeWith(Object obj) {
        wc.c cVar = this.e;
        uc.h context = cVar.getContext();
        Throwable a2 = sc.f.a(obj);
        Object vVar = a2 == null ? obj : new ld.v(a2, false);
        a0 a0Var = this.d;
        if (a0Var.e()) {
            this.f = vVar;
            this.c = 0;
            a0Var.c(context, this);
            return;
        }
        w0 a10 = c2.a();
        if (a10.c >= 4294967296L) {
            this.f = vVar;
            this.c = 0;
            tc.e eVar = a10.e;
            if (eVar == null) {
                eVar = new tc.e();
                a10.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            uc.h context2 = cVar.getContext();
            Object k10 = a.k(context2, this.h);
            try {
                cVar.resumeWith(obj);
                while (a10.j()) {
                }
            } finally {
                a.f(context2, k10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + e0.t(this.e) + ']';
    }

    @Override // ld.l0
    public final uc.c f() {
        return this;
    }
}
