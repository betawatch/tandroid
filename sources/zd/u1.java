package zd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.n8;
import v7.r7;
import v7.t8;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class u1 implements f1, r, y1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public u1(boolean z10) {
        this._state$volatile = z10 ? e0.j : e0.i;
    }

    public static q D(ee.k kVar) {
        while (kVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.k.b;
            ee.k d = kVar.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (ee.k) obj;
                    if (!kVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = d;
            }
        }
        while (true) {
            kVar = kVar.g();
            if (!kVar.h()) {
                if (kVar instanceof q) {
                    return (q) kVar;
                }
                if (kVar instanceof v1) {
                    return null;
                }
            }
        }
    }

    public static String J(Object obj) {
        if (!(obj instanceof n1)) {
            return obj instanceof a1 ? ((a1) obj).isActive() ? "Active" : "New" : obj instanceof v ? "Cancelled" : "Completed";
        }
        n1 n1Var = (n1) obj;
        return n1Var.d() ? "Cancelling" : n1Var.e() ? "Completing" : "Active";
    }

    public final boolean A(Object obj) {
        Object K;
        do {
            K = K(u(), obj);
            if (K == e0.d) {
                return false;
            }
            if (K == e0.e) {
                return true;
            }
        } while (K == e0.f);
        f(K);
        return true;
    }

    public final Object B(Object obj) {
        Object K;
        do {
            K = K(u(), obj);
            if (K == e0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                v vVar = obj instanceof v ? (v) obj : null;
                throw new IllegalStateException(str, vVar != null ? vVar.a : null);
            }
        } while (K == e0.f);
        return K;
    }

    public String C() {
        return getClass().getSimpleName();
    }

    public final void E(v1 v1Var, Throwable th2) {
        Object f7 = v1Var.f();
        kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        androidx.car.app.j jVar = null;
        for (ee.k kVar = (ee.k) f7; !kVar.equals(v1Var); kVar = kVar.g()) {
            if (kVar instanceof h1) {
                k1 k1Var = (k1) kVar;
                try {
                    k1Var.a(th2);
                } catch (Throwable th3) {
                    if (jVar != null) {
                        r7.a(jVar, th3);
                    } else {
                        jVar = new androidx.car.app.j("Exception in completion handler " + k1Var + " for " + this, th3);
                    }
                }
            }
        }
        if (jVar != null) {
            w(jVar);
        }
        j(th2);
    }

    public final void H(k1 k1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        v1 v1Var = new v1();
        k1Var.getClass();
        ee.k.b.set(v1Var, k1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ee.k.a;
        atomicReferenceFieldUpdater2.set(v1Var, k1Var);
        loop0: while (true) {
            if (k1Var.f() == k1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(k1Var, k1Var, v1Var)) {
                    if (atomicReferenceFieldUpdater2.get(k1Var) != k1Var) {
                        break;
                    }
                }
                v1Var.e(k1Var);
                break loop0;
            }
            break;
        }
        ee.k g10 = k1Var.g();
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, k1Var, g10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == k1Var);
    }

    public final int I(Object obj) {
        boolean z10 = obj instanceof q0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z10) {
            if (((q0) obj).a) {
                return 0;
            }
            q0 q0Var = e0.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof z0)) {
            return 0;
        }
        v1 v1Var = ((z0) obj).a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, v1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object K(Object obj, Object obj2) {
        if (!(obj instanceof a1)) {
            return e0.d;
        }
        if (((obj instanceof q0) || (obj instanceof k1)) && !(obj instanceof q) && !(obj2 instanceof v)) {
            a1 a1Var = (a1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object b1Var = obj2 instanceof a1 ? new b1((a1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, a1Var, b1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != a1Var) {
                    return e0.f;
                }
            }
            F(obj2);
            m(a1Var, obj2);
            return obj2;
        }
        a1 a1Var2 = (a1) obj;
        v1 t10 = t(a1Var2);
        if (t10 == null) {
            return e0.f;
        }
        q qVar = null;
        n1 n1Var = a1Var2 instanceof n1 ? (n1) a1Var2 : null;
        if (n1Var == null) {
            n1Var = new n1(t10, null);
        }
        synchronized (n1Var) {
            if (n1Var.e()) {
                return e0.d;
            }
            n1.b.set(n1Var, 1);
            if (n1Var != a1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, a1Var2, n1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != a1Var2) {
                        return e0.f;
                    }
                }
            }
            boolean d = n1Var.d();
            v vVar = obj2 instanceof v ? (v) obj2 : null;
            if (vVar != null) {
                n1Var.a(vVar.a);
            }
            Throwable b10 = n1Var.b();
            if (d) {
                b10 = null;
            }
            if (b10 != null) {
                E(t10, b10);
            }
            q qVar2 = a1Var2 instanceof q ? (q) a1Var2 : null;
            if (qVar2 == null) {
                v1 c10 = a1Var2.c();
                if (c10 != null) {
                    qVar = D(c10);
                }
            } else {
                qVar = qVar2;
            }
            if (qVar != null) {
                while (e0.n(qVar.e, false, new m1(this, n1Var, qVar, obj2), 1) == w1.a) {
                    qVar = D(qVar);
                    if (qVar == null) {
                    }
                }
                return e0.e;
            }
            return o(n1Var, obj2);
        }
    }

    public final boolean a(a1 a1Var, v1 v1Var, k1 k1Var) {
        ee.k d;
        p1 p1Var = new p1(k1Var, this, a1Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.k.b;
            d = v1Var.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(v1Var);
                while (true) {
                    d = (ee.k) obj;
                    if (!d.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d);
                }
            }
            ee.k.b.set(k1Var, d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ee.k.a;
            atomicReferenceFieldUpdater2.set(k1Var, v1Var);
            p1Var.c = v1Var;
            while (!atomicReferenceFieldUpdater2.compareAndSet(d, v1Var, p1Var)) {
                if (atomicReferenceFieldUpdater2.get(d) != v1Var) {
                    break;
                }
            }
        }
        return p1Var.a(d) == null;
    }

    @Override // zd.f1
    public final p attachChild(r rVar) {
        o0 n10 = e0.n(this, true, new q(rVar), 2);
        kotlin.jvm.internal.i.c(n10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (p) n10;
    }

    @Override // zd.f1
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new g1(k(), null, this);
        }
        i(cancellationException);
    }

    @Override // id.h
    public final Object fold(Object obj, rd.p pVar) {
        return pVar.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override // id.h
    public final id.f get(id.g gVar) {
        return n8.a(this, gVar);
    }

    @Override // zd.f1
    public final CancellationException getCancellationException() {
        CancellationException cancellationException;
        Object u10 = u();
        if (!(u10 instanceof n1)) {
            if (u10 instanceof a1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(u10 instanceof v)) {
                return new g1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((v) u10).a;
            cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return cancellationException == null ? new g1(k(), th2, this) : cancellationException;
        }
        Throwable b10 = ((n1) u10).b();
        if (b10 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = b10 instanceof CancellationException ? (CancellationException) b10 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = k();
        }
        return new g1(concat, b10, this);
    }

    @Override // zd.f1
    public final wd.b getChildren() {
        return new wd.e(new q1(null, this), 0);
    }

    public Object getCompleted() {
        return p();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object u10 = u();
        if (u10 instanceof a1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        v vVar = u10 instanceof v ? (v) u10 : null;
        if (vVar != null) {
            return vVar.a;
        }
        return null;
    }

    @Override // id.f
    public final id.g getKey() {
        return b0.b;
    }

    @Override // zd.f1
    public final f1 getParent() {
        p pVar = (p) b.get(this);
        if (pVar != null) {
            return pVar.getParent();
        }
        return null;
    }

    public final Object h(id.c cVar) {
        Object u10;
        do {
            u10 = u();
            if (!(u10 instanceof a1)) {
                if (u10 instanceof v) {
                    throw ((v) u10).a;
                }
                return e0.u(u10);
            }
        } while (I(u10) < 0);
        l1 l1Var = new l1(t8.b(cVar), this);
        l1Var.s();
        l1Var.v(new j(e0.n(this, false, new p0(l1Var, 3), 3), 2));
        Object r10 = l1Var.r();
        jd.a aVar = jd.a.a;
        return r10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == zd.e0.e) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Object obj) {
        d9.f fVar;
        Object obj2 = e0.d;
        if (s()) {
            do {
                Object u10 = u();
                if (!(u10 instanceof a1) || ((u10 instanceof n1) && ((n1) u10).e())) {
                    obj2 = e0.d;
                    break;
                }
                obj2 = K(u10, new v(n(obj), false));
            } while (obj2 == e0.f);
        }
        if (obj2 == e0.d) {
            Throwable th2 = null;
            loop1: while (true) {
                Object u11 = u();
                if (!(u11 instanceof n1)) {
                    if (!(u11 instanceof a1)) {
                        fVar = e0.g;
                        break;
                    }
                    if (th2 == null) {
                        th2 = n(obj);
                    }
                    a1 a1Var = (a1) u11;
                    if (a1Var.isActive()) {
                        v1 t10 = t(a1Var);
                        if (t10 != null) {
                            n1 n1Var = new n1(t10, th2);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, a1Var, n1Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != a1Var) {
                                    break;
                                }
                            }
                            E(t10, th2);
                            fVar = e0.d;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object K = K(u11, new v(th2, false));
                        if (K == e0.d) {
                            throw new IllegalStateException(("Cannot happen in " + u11).toString());
                        }
                        if (K != e0.f) {
                            obj2 = K;
                            break;
                        }
                    }
                } else {
                    synchronized (u11) {
                        if (n1.d.get((n1) u11) == e0.h) {
                            fVar = e0.g;
                        } else {
                            boolean d = ((n1) u11).d();
                            if (th2 == null) {
                                th2 = n(obj);
                            }
                            ((n1) u11).a(th2);
                            Throwable b10 = d ? null : ((n1) u11).b();
                            if (b10 != null) {
                                E(((n1) u11).a, b10);
                            }
                            fVar = e0.d;
                        }
                    }
                }
            }
            obj2 = fVar;
        }
        if (obj2 != e0.d && obj2 != e0.e) {
            if (obj2 == e0.g) {
                return false;
            }
            f(obj2);
            return true;
        }
        return true;
    }

    @Override // zd.f1
    public final o0 invokeOnCompletion(rd.l lVar) {
        return y(false, true, new c1(lVar));
    }

    @Override // zd.f1
    public boolean isActive() {
        Object u10 = u();
        return (u10 instanceof a1) && ((a1) u10).isActive();
    }

    @Override // zd.f1
    public final boolean isCancelled() {
        Object u10 = u();
        if (u10 instanceof v) {
            return true;
        }
        return (u10 instanceof n1) && ((n1) u10).d();
    }

    public final boolean j(Throwable th2) {
        if (z()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        p pVar = (p) b.get(this);
        return (pVar == null || pVar == w1.a) ? z10 : pVar.b(th2) || z10;
    }

    @Override // zd.f1
    public final Object join(id.c cVar) {
        Object u10;
        gd.i iVar;
        do {
            u10 = u();
            boolean z10 = u10 instanceof a1;
            iVar = gd.i.a;
            if (!z10) {
                e0.h(cVar.getContext());
                return iVar;
            }
        } while (I(u10) < 0);
        m mVar = new m(1, t8.b(cVar));
        mVar.s();
        mVar.v(new j(e0.n(this, false, new p0(mVar, 4), 3), 2));
        Object r10 = mVar.r();
        jd.a aVar = jd.a.a;
        if (r10 != aVar) {
            r10 = iVar;
        }
        return r10 == aVar ? r10 : iVar;
    }

    public String k() {
        return "Job was cancelled";
    }

    public boolean l(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return i(th2) && r();
    }

    public final void m(a1 a1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar != null) {
            pVar.dispose();
            atomicReferenceFieldUpdater.set(this, w1.a);
        }
        androidx.car.app.j jVar = null;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th2 = vVar != null ? vVar.a : null;
        if (a1Var instanceof k1) {
            try {
                ((k1) a1Var).a(th2);
                return;
            } catch (Throwable th3) {
                w(new androidx.car.app.j("Exception in completion handler " + a1Var + " for " + this, th3));
                return;
            }
        }
        v1 c10 = a1Var.c();
        if (c10 != null) {
            Object f7 = c10.f();
            kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (ee.k kVar = (ee.k) f7; !kVar.equals(c10); kVar = kVar.g()) {
                if (kVar instanceof k1) {
                    k1 k1Var = (k1) kVar;
                    try {
                        k1Var.a(th2);
                    } catch (Throwable th4) {
                        if (jVar != null) {
                            r7.a(jVar, th4);
                        } else {
                            jVar = new androidx.car.app.j("Exception in completion handler " + k1Var + " for " + this, th4);
                        }
                    }
                }
            }
            if (jVar != null) {
                w(jVar);
            }
        }
    }

    @Override // id.h
    public final id.h minusKey(id.g gVar) {
        return n8.b(this, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable n(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        u1 u1Var = (u1) ((y1) obj);
        Object u10 = u1Var.u();
        if (u10 instanceof n1) {
            cancellationException = ((n1) u10).b();
        } else if (u10 instanceof v) {
            cancellationException = ((v) u10).a;
        } else {
            if (u10 instanceof a1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + u10).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new g1("Parent job is ".concat(J(u10)), cancellationException, u1Var) : cancellationException2;
    }

    public final Object o(n1 n1Var, Object obj) {
        Throwable q6;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th2 = vVar != null ? vVar.a : null;
        synchronized (n1Var) {
            n1Var.d();
            ArrayList f7 = n1Var.f(th2);
            q6 = q(n1Var, f7);
            if (q6 != null && f7.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f7.size()));
                int size = f7.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = f7.get(i10);
                    i10++;
                    Throwable th3 = (Throwable) obj2;
                    if (th3 != q6 && th3 != q6 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        r7.a(q6, th3);
                    }
                }
            }
        }
        if (q6 != null && q6 != th2) {
            obj = new v(q6, false);
        }
        if (q6 != null && (j(q6) || v(q6))) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            v.b.compareAndSet((v) obj, 0, 1);
        }
        F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object b1Var = obj instanceof a1 ? new b1((a1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, n1Var, b1Var) && atomicReferenceFieldUpdater.get(this) == n1Var) {
        }
        m(n1Var, obj);
        return obj;
    }

    public final Object p() {
        Object u10 = u();
        if (u10 instanceof a1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (u10 instanceof v) {
            throw ((v) u10).a;
        }
        return e0.u(u10);
    }

    @Override // id.h
    public final id.h plus(id.h hVar) {
        return n8.c(this, hVar);
    }

    public final Throwable q(n1 n1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (n1Var.d()) {
                return new g1(k(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof d2) {
            int size2 = arrayList.size();
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i10);
                i10++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof d2)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean r() {
        return true;
    }

    public boolean s() {
        return this instanceof t;
    }

    @Override // zd.f1
    public final boolean start() {
        int I;
        do {
            I = I(u());
            if (I == 0) {
                return false;
            }
        } while (I != 1);
        return true;
    }

    public final v1 t(a1 a1Var) {
        v1 c10 = a1Var.c();
        if (c10 != null) {
            return c10;
        }
        if (a1Var instanceof q0) {
            return new v1();
        }
        if (a1Var instanceof k1) {
            H((k1) a1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + a1Var).toString());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C() + '{' + J(u()) + '}');
        sb2.append('@');
        sb2.append(e0.k(this));
        return sb2.toString();
    }

    public final Object u() {
        while (true) {
            Object obj = a.get(this);
            if (!(obj instanceof ee.p)) {
                return obj;
            }
            ((ee.p) obj).a(this);
        }
    }

    public boolean v(Throwable th2) {
        return false;
    }

    public final void x(f1 f1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        w1 w1Var = w1.a;
        if (f1Var == null) {
            atomicReferenceFieldUpdater.set(this, w1Var);
            return;
        }
        f1Var.start();
        p attachChild = f1Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (u() instanceof a1) {
            return;
        }
        attachChild.dispose();
        atomicReferenceFieldUpdater.set(this, w1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o0 y(boolean z10, boolean z11, d1 d1Var) {
        k1 k1Var;
        Throwable th2;
        if (z10) {
            k1Var = d1Var instanceof h1 ? (h1) d1Var : null;
            if (k1Var == null) {
                k1Var = new e1(d1Var);
            }
        } else {
            k1Var = d1Var instanceof k1 ? (k1) d1Var : null;
            if (k1Var == null) {
                k1Var = new p0(d1Var, 1);
            }
        }
        k1Var.d = this;
        loop0: while (true) {
            Object u10 = u();
            if (u10 instanceof q0) {
                q0 q0Var = (q0) u10;
                if (q0Var.a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, u10, k1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != u10) {
                            break;
                        }
                    }
                    break loop0;
                }
                v1 v1Var = new v1();
                a1 z0Var = q0Var.a ? v1Var : new z0(v1Var);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, q0Var, z0Var) && atomicReferenceFieldUpdater2.get(this) == q0Var) {
                }
            } else {
                if (!(u10 instanceof a1)) {
                    if (z11) {
                        v vVar = u10 instanceof v ? (v) u10 : null;
                        d1Var.a(vVar != null ? vVar.a : null);
                    }
                    return w1.a;
                }
                a1 a1Var = (a1) u10;
                v1 c10 = a1Var.c();
                if (c10 == null) {
                    H((k1) u10);
                } else {
                    o0 o0Var = w1.a;
                    if (z10 && (u10 instanceof n1)) {
                        synchronized (u10) {
                            try {
                                th2 = ((n1) u10).b();
                                if (th2 != null) {
                                    if ((d1Var instanceof q) && !((n1) u10).e()) {
                                    }
                                }
                                if (a((a1) u10, c10, k1Var)) {
                                    if (th2 == null) {
                                        return k1Var;
                                    }
                                    o0Var = k1Var;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        th2 = null;
                    }
                    if (th2 != null) {
                        if (z11) {
                            d1Var.a(th2);
                        }
                        return o0Var;
                    }
                    if (a(a1Var, c10, k1Var)) {
                        break;
                    }
                }
            }
        }
    }

    public boolean z() {
        return this instanceof h;
    }

    @Override // zd.f1
    public final o0 invokeOnCompletion(boolean z10, boolean z11, rd.l lVar) {
        return y(z10, z11, new c1(lVar));
    }

    public void G() {
    }

    public void F(Object obj) {
    }

    public void f(Object obj) {
    }

    public void w(androidx.car.app.j jVar) {
        throw jVar;
    }
}
