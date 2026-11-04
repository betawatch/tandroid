package wd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class m extends i0 implements l, hd.d, c2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final fd.c d;
    public final fd.h e;

    public m(int i3, fd.c cVar) {
        super(i3);
        this.d = cVar;
        this.e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.a;
    }

    public static Object E(q1 q1Var, Object obj, int i3, od.q qVar) {
        if (obj instanceof v) {
            return obj;
        }
        if (i3 != 1 && i3 != 2) {
            return obj;
        }
        if (qVar != null || (q1Var instanceof k)) {
            return new u(obj, q1Var instanceof k ? (k) q1Var : null, qVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(q1 q1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + q1Var + ", already has " + obj).toString());
    }

    public final void A() {
        fd.c cVar = this.d;
        Throwable th2 = null;
        be.f fVar = cVar instanceof be.f ? (be.f) cVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.f.n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                be.t tVar = be.a.c;
                if (obj == tVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != tVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            o();
            n(th2);
        }
    }

    public final void B(Object obj, od.q qVar) {
        C(obj, this.c, qVar);
    }

    public final void C(Object obj, int i3, od.q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof q1) {
                Object E = E((q1) obj2, obj, i3, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                p(i3);
                return;
            }
            if (obj2 instanceof n) {
                n nVar = (n) obj2;
                if (n.c.compareAndSet(nVar, 0, 1)) {
                    if (qVar != null) {
                        l(qVar, nVar.a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void D(x xVar) {
        fd.c cVar = this.d;
        be.f fVar = cVar instanceof be.f ? (be.f) cVar : null;
        C(dd.k.a, (fVar != null ? fVar.d : null) == xVar ? 4 : this.c, null);
    }

    public final be.t F(Object obj, od.q qVar) {
        be.t tVar = b0.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof q1)) {
                return null;
            }
            Object E = E((q1) obj2, obj, this.c, qVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                o();
            }
            return tVar;
        }
    }

    @Override // wd.c2
    public final void a(be.r rVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i3));
        v(rVar);
    }

    @Override // wd.i0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof q1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof v) {
                return;
            }
            if (!(obj instanceof u)) {
                cancellationException2 = cancellationException;
                u uVar = new u(obj, (k) null, (od.q) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            u uVar2 = (u) obj;
            if (uVar2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            u a10 = u.a(uVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a10)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            k kVar = uVar2.b;
            if (kVar != null) {
                k(kVar, cancellationException);
            }
            od.q qVar = uVar2.c;
            if (qVar != null) {
                l(qVar, cancellationException, uVar2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // wd.i0
    public final fd.c c() {
        return this.d;
    }

    @Override // wd.l
    public final void e(Object obj) {
        p(this.c);
    }

    @Override // wd.l
    public final be.t f(Object obj, od.q qVar) {
        return F(obj, qVar);
    }

    @Override // wd.i0
    public final Throwable g(Object obj) {
        Throwable g7 = super.g(obj);
        if (g7 != null) {
            return g7;
        }
        return null;
    }

    @Override // hd.d
    public final hd.d getCallerFrame() {
        fd.c cVar = this.d;
        if (cVar instanceof hd.d) {
            return (hd.d) cVar;
        }
        return null;
    }

    @Override // fd.c
    public final fd.h getContext() {
        return this.e;
    }

    @Override // wd.i0
    public final Object h(Object obj) {
        return obj instanceof u ? ((u) obj).a : obj;
    }

    @Override // wd.i0
    public final Object j() {
        return h.get(this);
    }

    public final void k(k kVar, Throwable th2) {
        try {
            kVar.a(th2);
        } catch (Throwable th3) {
            b0.m(this.e, new androidx.car.app.j("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void l(od.q qVar, Throwable th2, Object obj) {
        fd.h hVar = this.e;
        try {
            qVar.a(th2, obj, hVar);
        } catch (Throwable th3) {
            b0.m(hVar, new androidx.car.app.j("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void m(be.r rVar, Throwable th2) {
        fd.h hVar = this.e;
        int i3 = f.get(this) & 536870911;
        if (i3 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.h(i3, hVar);
        } catch (Throwable th3) {
            b0.m(hVar, new androidx.car.app.j("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final boolean n(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof q1)) {
                return false;
            }
            n nVar = new n(this, th2, (obj instanceof k) || (obj instanceof be.r));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            q1 q1Var = (q1) obj;
            if (q1Var instanceof k) {
                k((k) obj, th2);
            } else if (q1Var instanceof be.r) {
                m((be.r) obj, th2);
            }
            if (!x()) {
                o();
            }
            p(this.c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        l0 l0Var = (l0) atomicReferenceFieldUpdater.get(this);
        if (l0Var == null) {
            return;
        }
        l0Var.dispose();
        atomicReferenceFieldUpdater.set(this, p1.a);
    }

    public final void p(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z10 = i3 == 4;
                fd.c cVar = this.d;
                if (!z10 && (cVar instanceof be.f)) {
                    boolean z11 = i3 == 1 || i3 == 2;
                    int i12 = this.c;
                    if (z11 == (i12 == 1 || i12 == 2)) {
                        be.f fVar = (be.f) cVar;
                        x xVar = fVar.d;
                        fd.h context = fVar.e.getContext();
                        if (xVar.e(context)) {
                            xVar.c(context, this);
                            return;
                        }
                        t0 a10 = v1.a();
                        if (a10.c >= 4294967296L) {
                            ed.e eVar = a10.e;
                            if (eVar == null) {
                                eVar = new ed.e();
                                a10.e = eVar;
                            }
                            eVar.addLast(this);
                            return;
                        }
                        a10.i(true);
                        try {
                            b0.t(this, cVar, true);
                            do {
                            } while (a10.k());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                b0.t(this, cVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, TLObject.FLAG_30 + (536870911 & i10)));
    }

    public Throwable q(n1 n1Var) {
        return n1Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        a1 a1Var;
        boolean x10 = x();
        do {
            atomicIntegerFieldUpdater = f;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i10 = i3 >> 29;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (x10) {
                    A();
                }
                Object obj = h.get(this);
                if (obj instanceof v) {
                    throw ((v) obj).a;
                }
                int i11 = this.c;
                if ((i11 != 1 && i11 != 2) || (a1Var = (a1) this.e.get(y.b)) == null || a1Var.isActive()) {
                    return h(obj);
                }
                CancellationException cancellationException = a1Var.getCancellationException();
                b(cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, TLObject.FLAG_29 + (536870911 & i3)));
        if (((l0) n.get(this)) == null) {
            t();
        }
        if (x10) {
            A();
        }
        return gd.a.a;
    }

    @Override // fd.c
    public final void resumeWith(Object obj) {
        Throwable a10 = dd.g.a(obj);
        if (a10 != null) {
            obj = new v(a10, false);
        }
        C(obj, this.c, null);
    }

    public final void s() {
        l0 t10 = t();
        if (t10 == null || (h.get(this) instanceof q1)) {
            return;
        }
        t10.dispose();
        n.set(this, p1.a);
    }

    public final l0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a1 a1Var = (a1) this.e.get(y.b);
        if (a1Var == null) {
            return null;
        }
        l0 n4 = b0.n(a1Var, true, new o(this, 0));
        do {
            atomicReferenceFieldUpdater = n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, n4)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return n4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(b0.v(this.d));
        sb2.append("){");
        Object obj = h.get(this);
        sb2.append(obj instanceof q1 ? "Active" : obj instanceof n ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(b0.j(this));
        return sb2.toString();
    }

    public final void u(od.l lVar) {
        v(new j(lVar, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a0, code lost:
    
        y(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(q1 q1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof k) || (obj instanceof be.r)) {
                break;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (!v.b.compareAndSet(vVar, 0, 1)) {
                    y(q1Var, obj);
                    throw null;
                }
                if (obj instanceof n) {
                    Throwable th2 = vVar.a;
                    if (q1Var instanceof k) {
                        k((k) q1Var, th2);
                        return;
                    } else {
                        m((be.r) q1Var, th2);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof u)) {
                if (q1Var instanceof be.r) {
                    return;
                }
                u uVar = new u(obj, (k) q1Var, (od.q) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            u uVar2 = (u) obj;
            if (uVar2.b != null) {
                y(q1Var, obj);
                throw null;
            }
            if (q1Var instanceof be.r) {
                return;
            }
            k kVar = (k) q1Var;
            Throwable th3 = uVar2.e;
            if (th3 != null) {
                k(kVar, th3);
                return;
            }
            u a10 = u.a(uVar2, kVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a10)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        return h.get(this) instanceof q1;
    }

    public final boolean x() {
        if (this.c != 2) {
            return false;
        }
        fd.c cVar = this.d;
        kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return be.f.n.get((be.f) cVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
