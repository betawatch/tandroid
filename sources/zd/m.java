package zd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class m extends l0 implements l, kd.d, i2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final id.c d;
    public final id.h e;

    public m(int i10, id.c cVar) {
        super(i10);
        this.d = cVar;
        this.e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.a;
    }

    public static Object E(x1 x1Var, Object obj, int i10, rd.l lVar) {
        if (obj instanceof v) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (lVar != null || (x1Var instanceof k)) {
            return new u(obj, x1Var instanceof k ? (k) x1Var : null, lVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(x1 x1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + x1Var + ", already has " + obj).toString());
    }

    public final void A() {
        id.c cVar = this.d;
        Throwable th2 = null;
        ee.h hVar = cVar instanceof ee.h ? (ee.h) cVar : null;
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.h.n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                d9.f fVar = ee.a.d;
                if (obj == fVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, fVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != fVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
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

    public final void B(rd.l lVar, Object obj) {
        C(obj, this.c, lVar);
    }

    public final void C(Object obj, int i10, rd.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof x1) {
                Object E = E((x1) obj2, obj, i10, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                p(i10);
                return;
            }
            if (obj2 instanceof n) {
                n nVar = (n) obj2;
                if (n.c.compareAndSet(nVar, 0, 1)) {
                    if (lVar != null) {
                        l(lVar, nVar.a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void D(a0 a0Var) {
        id.c cVar = this.d;
        ee.h hVar = cVar instanceof ee.h ? (ee.h) cVar : null;
        C(gd.i.a, (hVar != null ? hVar.d : null) == a0Var ? 4 : this.c, null);
    }

    public final d9.f F(rd.l lVar, Object obj) {
        d9.f fVar = e0.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof x1)) {
                return null;
            }
            Object E = E((x1) obj2, obj, this.c, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                o();
            }
            return fVar;
        }
    }

    @Override // zd.i2
    public final void a(ee.t tVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        v(tVar);
    }

    @Override // zd.l
    public final d9.f b(rd.l lVar, Object obj) {
        return F(lVar, obj);
    }

    @Override // zd.l0
    public final void c(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof x1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof v) {
                return;
            }
            if (!(obj2 instanceof u)) {
                cancellationException2 = cancellationException;
                u uVar = new u(obj2, (k) null, (rd.l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, uVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            u uVar2 = (u) obj2;
            if (uVar2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            u a2 = u.a(uVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            k kVar = uVar2.b;
            if (kVar != null) {
                k(kVar, cancellationException);
            }
            rd.l lVar = uVar2.c;
            if (lVar != null) {
                l(lVar, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // zd.l
    public final void e(Object obj) {
        p(this.c);
    }

    @Override // zd.l0
    public final id.c f() {
        return this.d;
    }

    @Override // zd.l0
    public final Throwable g(Object obj) {
        Throwable g10 = super.g(obj);
        if (g10 != null) {
            return g10;
        }
        return null;
    }

    @Override // kd.d
    public final kd.d getCallerFrame() {
        id.c cVar = this.d;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override // id.c
    public final id.h getContext() {
        return this.e;
    }

    @Override // zd.l0
    public final Object h(Object obj) {
        return obj instanceof u ? ((u) obj).a : obj;
    }

    @Override // zd.l0
    public final Object j() {
        return h.get(this);
    }

    public final void k(k kVar, Throwable th2) {
        try {
            kVar.a(th2);
        } catch (Throwable th3) {
            e0.m(this.e, new androidx.car.app.j("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void l(rd.l lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            e0.m(this.e, new androidx.car.app.j("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void m(ee.t tVar, Throwable th2) {
        id.h hVar = this.e;
        int i10 = f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.h(i10, hVar);
        } catch (Throwable th3) {
            e0.m(hVar, new androidx.car.app.j("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final boolean n(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof x1)) {
                return false;
            }
            n nVar = new n(this, th2, (obj instanceof k) || (obj instanceof ee.t));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            x1 x1Var = (x1) obj;
            if (x1Var instanceof k) {
                k((k) obj, th2);
            } else if (x1Var instanceof ee.t) {
                m((ee.t) obj, th2);
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
        o0 o0Var = (o0) atomicReferenceFieldUpdater.get(this);
        if (o0Var == null) {
            return;
        }
        o0Var.dispose();
        atomicReferenceFieldUpdater.set(this, w1.a);
    }

    public final void p(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z10 = i10 == 4;
                id.c cVar = this.d;
                if (!z10 && (cVar instanceof ee.h)) {
                    boolean z11 = i10 == 1 || i10 == 2;
                    int i13 = this.c;
                    if (z11 == (i13 == 1 || i13 == 2)) {
                        ee.h hVar = (ee.h) cVar;
                        a0 a0Var = hVar.d;
                        id.h context = hVar.e.getContext();
                        if (a0Var.e()) {
                            a0Var.c(context, this);
                            return;
                        }
                        w0 a2 = c2.a();
                        if (a2.c >= 4294967296L) {
                            hd.e eVar = a2.e;
                            if (eVar == null) {
                                eVar = new hd.e();
                                a2.e = eVar;
                            }
                            eVar.addLast(this);
                            return;
                        }
                        a2.h(true);
                        try {
                            e0.s(this, cVar, true);
                            do {
                            } while (a2.j());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                e0.s(this, cVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, TLObject.FLAG_30 + (536870911 & i11)));
    }

    public Throwable q(u1 u1Var) {
        return u1Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        f1 f1Var;
        boolean x10 = x();
        do {
            atomicIntegerFieldUpdater = f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (x10) {
                    A();
                }
                Object obj = h.get(this);
                if (obj instanceof v) {
                    throw ((v) obj).a;
                }
                int i12 = this.c;
                if ((i12 != 1 && i12 != 2) || (f1Var = (f1) this.e.get(b0.b)) == null || f1Var.isActive()) {
                    return h(obj);
                }
                CancellationException cancellationException = f1Var.getCancellationException();
                c(obj, cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, TLObject.FLAG_29 + (536870911 & i10)));
        if (((o0) n.get(this)) == null) {
            t();
        }
        if (x10) {
            A();
        }
        return jd.a.a;
    }

    @Override // id.c
    public final void resumeWith(Object obj) {
        Throwable a2 = gd.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        C(obj, this.c, null);
    }

    public final void s() {
        o0 t10 = t();
        if (t10 == null || (h.get(this) instanceof x1)) {
            return;
        }
        t10.dispose();
        n.set(this, w1.a);
    }

    public final o0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f1 f1Var = (f1) this.e.get(b0.b);
        if (f1Var == null) {
            return null;
        }
        o0 n10 = e0.n(f1Var, true, new o(this), 2);
        do {
            atomicReferenceFieldUpdater = n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, n10)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return n10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(e0.t(this.d));
        sb2.append("){");
        Object obj = h.get(this);
        sb2.append(obj instanceof x1 ? "Active" : obj instanceof n ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(e0.k(this));
        return sb2.toString();
    }

    public final void u(rd.l lVar) {
        v(new j(lVar, 1));
    }

    public final void v(x1 x1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z10 = true;
            if (obj instanceof k ? true : obj instanceof ee.t) {
                y(x1Var, obj);
                throw null;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (!v.b.compareAndSet(vVar, 0, 1)) {
                    y(x1Var, obj);
                    throw null;
                }
                if (obj instanceof n) {
                    Throwable th2 = vVar.a;
                    if (x1Var instanceof k) {
                        k((k) x1Var, th2);
                        return;
                    } else {
                        m((ee.t) x1Var, th2);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof u) {
                u uVar = (u) obj;
                if (uVar.b != null) {
                    y(x1Var, obj);
                    throw null;
                }
                if (x1Var instanceof ee.t) {
                    return;
                }
                k kVar = (k) x1Var;
                Throwable th3 = uVar.e;
                if (th3 != null) {
                    k(kVar, th3);
                    return;
                }
                u a2 = u.a(uVar, kVar, null, 29);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                if (x1Var instanceof ee.t) {
                    return;
                }
                u uVar2 = new u(obj, (k) x1Var, (rd.l) null, (Throwable) null, 28);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    public final boolean w() {
        return h.get(this) instanceof x1;
    }

    public final boolean x() {
        if (this.c != 2) {
            return false;
        }
        id.c cVar = this.d;
        kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ee.h.n.get((ee.h) cVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
