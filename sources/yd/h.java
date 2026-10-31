package yd;

import c3.i0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.a0;
import td.d2;
import td.e0;
import td.l0;
import td.w0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h extends l0 implements ed.d, cd.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final ed.c e;
    public Object f;
    public final Object h;

    public h(a0 a0Var, ed.c cVar) {
        super(-1);
        this.d = a0Var;
        this.e = cVar;
        this.f = a.c;
        Object fold = cVar.getContext().fold(0, w.c);
        kotlin.jvm.internal.i.b(fold);
        this.h = fold;
    }

    @Override // td.l0
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof td.w) {
            throw null;
        }
    }

    @Override // ed.d
    public final ed.d getCallerFrame() {
        ed.c cVar = this.e;
        if (i0.t(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // cd.c
    public final cd.h getContext() {
        return this.e.getContext();
    }

    @Override // td.l0
    public final Object j() {
        Object obj = this.f;
        this.f = a.c;
        return obj;
    }

    @Override // cd.c
    public final void resumeWith(Object obj) {
        ed.c cVar = this.e;
        cd.h context = cVar.getContext();
        Throwable a2 = ad.g.a(obj);
        Object vVar = a2 == null ? obj : new td.v(a2, false);
        a0 a0Var = this.d;
        if (a0Var.d()) {
            this.f = vVar;
            this.c = 0;
            a0Var.c(context, this);
            return;
        }
        w0 a10 = d2.a();
        if (a10.c >= 4294967296L) {
            this.f = vVar;
            this.c = 0;
            bd.g gVar = a10.e;
            if (gVar == null) {
                gVar = new bd.g();
                a10.e = gVar;
            }
            gVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            cd.h context2 = cVar.getContext();
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

    @Override // td.l0
    public final cd.c c() {
        return this;
    }
}
