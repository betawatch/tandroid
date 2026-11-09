package zd;

import a8.la;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class n1 implements a1, r, r1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public n1(boolean z9) {
        this._state$volatile = z9 ? b0.j : b0.i;
    }

    public static q F(ee.j jVar) {
        while (jVar.g()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.j.b;
            ee.j d = jVar.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (ee.j) obj;
                    if (!jVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = d;
            }
        }
        while (true) {
            jVar = jVar.f();
            if (!jVar.g()) {
                if (jVar instanceof q) {
                    return (q) jVar;
                }
                if (jVar instanceof o1) {
                    return null;
                }
            }
        }
    }

    public static String M(Object obj) {
        if (!(obj instanceof h1)) {
            return obj instanceof x0 ? ((x0) obj).isActive() ? "Active" : "New" : obj instanceof v ? "Cancelled" : "Completed";
        }
        h1 h1Var = (h1) obj;
        return h1Var.d() ? "Cancelling" : h1.b.get(h1Var) != 0 ? "Completing" : "Active";
    }

    public static CancellationException N(n1 n1Var, Throwable th2) {
        n1Var.getClass();
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        return cancellationException == null ? new b1(n1Var.m(), th2, n1Var) : cancellationException;
    }

    public final boolean A() {
        return !(a.get(this) instanceof x0);
    }

    public boolean B() {
        return this instanceof h;
    }

    public final boolean C(Object obj) {
        Object O;
        do {
            O = O(a.get(this), obj);
            if (O == b0.d) {
                return false;
            }
            if (O == b0.e) {
                return true;
            }
        } while (O == b0.f);
        g(O);
        return true;
    }

    public final Object D(Object obj) {
        Object O;
        do {
            O = O(a.get(this), obj);
            if (O == b0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                v vVar = obj instanceof v ? (v) obj : null;
                throw new IllegalStateException(str, vVar != null ? vVar.a : null);
            }
        } while (O == b0.f);
        return O;
    }

    public String E() {
        return getClass().getSimpleName();
    }

    public final void G(o1 o1Var, Throwable th2) {
        o1Var.c(new ee.h(4), 4);
        Object obj = ee.j.a.get(o1Var);
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        androidx.car.app.j jVar = null;
        for (ee.j jVar2 = (ee.j) obj; !jVar2.equals(o1Var); jVar2 = jVar2.f()) {
            if ((jVar2 instanceof e1) && ((e1) jVar2).i()) {
                try {
                    ((e1) jVar2).j(th2);
                } catch (Throwable th3) {
                    if (jVar != null) {
                        la.a(jVar, th3);
                    } else {
                        jVar = new androidx.car.app.j("Exception in completion handler " + jVar2 + " for " + this, th3);
                    }
                }
            }
        }
        if (jVar != null) {
            x(jVar);
        }
        l(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [zd.w0] */
    public final void J(n0 n0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o1 o1Var = new o1();
        if (!n0Var.a) {
            o1Var = new w0(o1Var);
        }
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, n0Var, o1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == n0Var);
    }

    public final void K(e1 e1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o1 o1Var = new o1();
        e1Var.getClass();
        ee.j.b.set(o1Var, e1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ee.j.a;
        atomicReferenceFieldUpdater2.set(o1Var, e1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(e1Var) == e1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(e1Var, e1Var, o1Var)) {
                    if (atomicReferenceFieldUpdater2.get(e1Var) != e1Var) {
                        break;
                    }
                }
                o1Var.e(e1Var);
                break loop0;
            }
            break;
        }
        ee.j f10 = e1Var.f();
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, e1Var, f10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == e1Var);
    }

    public final int L(Object obj) {
        boolean z9 = obj instanceof n0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z9) {
            if (((n0) obj).a) {
                return 0;
            }
            n0 n0Var = b0.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof w0)) {
            return 0;
        }
        o1 o1Var = ((w0) obj).a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object O(Object obj, Object obj2) {
        if (!(obj instanceof x0)) {
            return b0.d;
        }
        if (((obj instanceof n0) || (obj instanceof e1)) && !(obj instanceof q) && !(obj2 instanceof v)) {
            x0 x0Var = (x0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object y0Var = obj2 instanceof x0 ? new y0((x0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, x0Var, y0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != x0Var) {
                    return b0.f;
                }
            }
            H(obj2);
            o(x0Var, obj2);
            return obj2;
        }
        x0 x0Var2 = (x0) obj;
        o1 v = v(x0Var2);
        if (v == null) {
            return b0.f;
        }
        h1 h1Var = x0Var2 instanceof h1 ? (h1) x0Var2 : null;
        if (h1Var == null) {
            h1Var = new h1(v, null);
        }
        synchronized (h1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h1.b;
            if (atomicIntegerFieldUpdater.get(h1Var) != 0) {
                return b0.d;
            }
            atomicIntegerFieldUpdater.set(h1Var, 1);
            if (h1Var != x0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, x0Var2, h1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != x0Var2) {
                        return b0.f;
                    }
                }
            }
            boolean d = h1Var.d();
            v vVar = obj2 instanceof v ? (v) obj2 : null;
            if (vVar != null) {
                h1Var.a(vVar.a);
            }
            Throwable c10 = d ? null : h1Var.c();
            if (c10 != null) {
                G(v, c10);
            }
            q F = F(v);
            if (F != null && P(h1Var, F, obj2)) {
                return b0.e;
            }
            v.c(new ee.h(2), 2);
            q F2 = F(v);
            return (F2 == null || !P(h1Var, F2, obj2)) ? q(h1Var, obj2) : b0.e;
        }
    }

    public final boolean P(h1 h1Var, q qVar, Object obj) {
        while (b0.n(qVar.e, false, new g1(this, h1Var, qVar, obj)) == p1.a) {
            qVar = F(qVar);
            if (qVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // zd.a1
    public final p attachChild(r rVar) {
        q qVar = new q(rVar);
        qVar.d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                if (n0Var.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                J(n0Var);
            } else {
                boolean z9 = obj instanceof x0;
                p1 p1Var = p1.a;
                if (!z9) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    v vVar = obj2 instanceof v ? (v) obj2 : null;
                    qVar.j(vVar != null ? vVar.a : null);
                    return p1Var;
                }
                o1 b10 = ((x0) obj).b();
                if (b10 == null) {
                    K((e1) obj);
                } else if (!b10.c(qVar, 7)) {
                    boolean c10 = b10.c(qVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof h1) {
                        r4 = ((h1) obj3).c();
                    } else {
                        v vVar2 = obj3 instanceof v ? (v) obj3 : null;
                        if (vVar2 != null) {
                            r4 = vVar2.a;
                        }
                    }
                    qVar.j(r4);
                    if (c10) {
                        break loop0;
                    }
                    return p1Var;
                }
            }
        }
        return qVar;
    }

    @Override // zd.a1, be.t
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new b1(m(), null, this);
        }
        k(cancellationException);
    }

    @Override // id.h
    public final Object fold(Object obj, rd.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // id.h
    public final id.f get(id.g gVar) {
        return c8.m0.a(this, gVar);
    }

    @Override // zd.a1
    public final CancellationException getCancellationException() {
        Object obj = a.get(this);
        if (!(obj instanceof h1)) {
            if (!(obj instanceof x0)) {
                return obj instanceof v ? N(this, ((v) obj).a) : new b1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable c10 = ((h1) obj).c();
        if (c10 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = c10 instanceof CancellationException ? (CancellationException) c10 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = m();
        }
        return new b1(concat, c10, this);
    }

    @Override // zd.a1
    public final wd.b getChildren() {
        return new wd.e(new j1(null, this), 0);
    }

    public Object getCompleted() {
        return r();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object obj = a.get(this);
        if (obj instanceof x0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            return vVar.a;
        }
        return null;
    }

    @Override // id.f
    public final id.g getKey() {
        return y.b;
    }

    public void h(Object obj) {
        g(obj);
    }

    public final Object i(id.c cVar) {
        Object obj;
        do {
            obj = a.get(this);
            if (!(obj instanceof x0)) {
                if (obj instanceof v) {
                    throw ((v) obj).a;
                }
                return b0.w(obj);
            }
        } while (L(obj) < 0);
        f1 f1Var = new f1(c8.u0.b(cVar), this);
        f1Var.s();
        f1Var.v(new j(b0.n(this, true, new m0(f1Var, 3)), 2));
        Object r10 = f1Var.r();
        jd.a aVar = jd.a.a;
        return r10;
    }

    @Override // zd.a1
    public final l0 invokeOnCompletion(rd.l lVar) {
        return z(true, new m0(lVar, 1));
    }

    @Override // zd.a1
    public boolean isActive() {
        Object obj = a.get(this);
        return (obj instanceof x0) && ((x0) obj).isActive();
    }

    @Override // zd.a1
    public final boolean isCancelled() {
        Object obj = a.get(this);
        if (obj instanceof v) {
            return true;
        }
        return (obj instanceof h1) && ((h1) obj).d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 == zd.b0.e) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(Object obj) {
        com.google.android.gms.internal.clearcut.e eVar;
        Object obj2 = b0.d;
        if (u()) {
            do {
                Object obj3 = a.get(this);
                if (obj3 instanceof x0) {
                    if (obj3 instanceof h1) {
                        if (h1.b.get((h1) obj3) != 0) {
                        }
                    }
                    obj2 = O(obj3, new v(p(obj), false));
                }
                obj2 = b0.d;
                break;
            } while (obj2 == b0.f);
        }
        if (obj2 == b0.d) {
            Throwable th2 = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof h1)) {
                    if (!(obj4 instanceof x0)) {
                        eVar = b0.g;
                        break;
                    }
                    if (th2 == null) {
                        th2 = p(obj);
                    }
                    x0 x0Var = (x0) obj4;
                    if (x0Var.isActive()) {
                        o1 v = v(x0Var);
                        if (v != null) {
                            h1 h1Var = new h1(v, th2);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, x0Var, h1Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != x0Var) {
                                    break;
                                }
                            }
                            G(v, th2);
                            eVar = b0.d;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object O = O(obj4, new v(th2, false));
                        if (O == b0.d) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (O != b0.f) {
                            obj2 = O;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        if (h1.d.get((h1) obj4) == b0.h) {
                            eVar = b0.g;
                        } else {
                            boolean d = ((h1) obj4).d();
                            if (th2 == null) {
                                th2 = p(obj);
                            }
                            ((h1) obj4).a(th2);
                            Throwable c10 = d ? null : ((h1) obj4).c();
                            if (c10 != null) {
                                G(((h1) obj4).a, c10);
                            }
                            eVar = b0.d;
                        }
                    }
                }
            }
            obj2 = eVar;
        }
        if (obj2 != b0.d && obj2 != b0.e) {
            if (obj2 == b0.g) {
                return false;
            }
            g(obj2);
            return true;
        }
        return true;
    }

    @Override // zd.a1
    public final Object join(id.c cVar) {
        Object obj;
        gd.k kVar;
        do {
            obj = a.get(this);
            boolean z9 = obj instanceof x0;
            kVar = gd.k.a;
            if (!z9) {
                b0.g(cVar.getContext());
                return kVar;
            }
        } while (L(obj) < 0);
        m mVar = new m(1, c8.u0.b(cVar));
        mVar.s();
        mVar.v(new j(b0.n(this, true, new o(mVar, 1)), 2));
        Object r10 = mVar.r();
        jd.a aVar = jd.a.a;
        if (r10 != aVar) {
            r10 = kVar;
        }
        return r10 == aVar ? r10 : kVar;
    }

    public void k(CancellationException cancellationException) {
        j(cancellationException);
    }

    public final boolean l(Throwable th2) {
        if (B()) {
            return true;
        }
        boolean z9 = th2 instanceof CancellationException;
        p pVar = (p) b.get(this);
        return (pVar == null || pVar == p1.a) ? z9 : pVar.a(th2) || z9;
    }

    public String m() {
        return "Job was cancelled";
    }

    @Override // id.h
    public final id.h minusKey(id.g gVar) {
        return c8.m0.b(this, gVar);
    }

    public boolean n(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return j(th2) && t();
    }

    public final void o(x0 x0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar != null) {
            pVar.dispose();
            atomicReferenceFieldUpdater.set(this, p1.a);
        }
        androidx.car.app.j jVar = null;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th2 = vVar != null ? vVar.a : null;
        if (x0Var instanceof e1) {
            try {
                ((e1) x0Var).j(th2);
                return;
            } catch (Throwable th3) {
                x(new androidx.car.app.j("Exception in completion handler " + x0Var + " for " + this, th3));
                return;
            }
        }
        o1 b10 = x0Var.b();
        if (b10 != null) {
            b10.c(new ee.h(1), 1);
            Object obj2 = ee.j.a.get(b10);
            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (ee.j jVar2 = (ee.j) obj2; !jVar2.equals(b10); jVar2 = jVar2.f()) {
                if (jVar2 instanceof e1) {
                    try {
                        ((e1) jVar2).j(th2);
                    } catch (Throwable th4) {
                        if (jVar != null) {
                            la.a(jVar, th4);
                        } else {
                            jVar = new androidx.car.app.j("Exception in completion handler " + jVar2 + " for " + this, th4);
                        }
                    }
                }
            }
            if (jVar != null) {
                x(jVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable p(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        n1 n1Var = (n1) ((r1) obj);
        Object obj2 = a.get(n1Var);
        if (obj2 instanceof h1) {
            cancellationException = ((h1) obj2).c();
        } else if (obj2 instanceof v) {
            cancellationException = ((v) obj2).a;
        } else {
            if (obj2 instanceof x0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new b1("Parent job is ".concat(M(obj2)), cancellationException, n1Var) : cancellationException2;
    }

    @Override // id.h
    public final id.h plus(id.h hVar) {
        return c8.m0.c(this, hVar);
    }

    public final Object q(h1 h1Var, Object obj) {
        Throwable s5;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th2 = vVar != null ? vVar.a : null;
        synchronized (h1Var) {
            h1Var.d();
            ArrayList e10 = h1Var.e(th2);
            s5 = s(h1Var, e10);
            if (s5 != null && e10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(e10.size()));
                int size = e10.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj2 = e10.get(i7);
                    i7++;
                    Throwable th3 = (Throwable) obj2;
                    if (th3 != s5 && th3 != s5 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        la.a(s5, th3);
                    }
                }
            }
        }
        if (s5 != null && s5 != th2) {
            obj = new v(s5, false);
        }
        if (s5 != null && (l(s5) || w(s5))) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            v.b.compareAndSet((v) obj, 0, 1);
        }
        H(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object y0Var = obj instanceof x0 ? new y0((x0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, h1Var, y0Var) && atomicReferenceFieldUpdater.get(this) == h1Var) {
        }
        o(h1Var, obj);
        return obj;
    }

    public final Object r() {
        Object obj = a.get(this);
        if (obj instanceof x0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof v) {
            throw ((v) obj).a;
        }
        return b0.w(obj);
    }

    public final Throwable s(h1 h1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (h1Var.d()) {
                return new b1(m(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof x1) {
            int size2 = arrayList.size();
            while (true) {
                if (i7 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i7);
                i7++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof x1)) {
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

    @Override // zd.a1
    public final boolean start() {
        int L;
        do {
            L = L(a.get(this));
            if (L == 0) {
                return false;
            }
        } while (L != 1);
        return true;
    }

    public boolean t() {
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(E() + '{' + M(a.get(this)) + '}');
        sb2.append('@');
        sb2.append(b0.j(this));
        return sb2.toString();
    }

    public boolean u() {
        return this instanceof t;
    }

    public final o1 v(x0 x0Var) {
        o1 b10 = x0Var.b();
        if (b10 != null) {
            return b10;
        }
        if (x0Var instanceof n0) {
            return new o1();
        }
        if (x0Var instanceof e1) {
            K((e1) x0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + x0Var).toString());
    }

    public boolean w(Throwable th2) {
        return false;
    }

    public final void y(a1 a1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        p1 p1Var = p1.a;
        if (a1Var == null) {
            atomicReferenceFieldUpdater.set(this, p1Var);
            return;
        }
        a1Var.start();
        p attachChild = a1Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (A()) {
            attachChild.dispose();
            atomicReferenceFieldUpdater.set(this, p1Var);
        }
    }

    public final l0 z(boolean z9, e1 e1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p1 p1Var;
        boolean z10;
        boolean c10;
        e1Var.d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj instanceof n0;
            p1Var = p1.a;
            z10 = true;
            if (!z11) {
                if (!(obj instanceof x0)) {
                    z10 = false;
                    break;
                }
                x0 x0Var = (x0) obj;
                o1 b10 = x0Var.b();
                if (b10 == null) {
                    K((e1) obj);
                } else {
                    if (e1Var.i()) {
                        h1 h1Var = x0Var instanceof h1 ? (h1) x0Var : null;
                        Throwable c11 = h1Var != null ? h1Var.c() : null;
                        if (c11 == null) {
                            c10 = b10.c(e1Var, 5);
                        } else if (z9) {
                            e1Var.j(c11);
                            return p1Var;
                        }
                    } else {
                        c10 = b10.c(e1Var, 1);
                    }
                    if (c10) {
                        break;
                    }
                }
            } else {
                n0 n0Var = (n0) obj;
                if (n0Var.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                J(n0Var);
            }
        }
        if (z10) {
            return e1Var;
        }
        if (z9) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            v vVar = obj2 instanceof v ? (v) obj2 : null;
            e1Var.j(vVar != null ? vVar.a : null);
        }
        return p1Var;
    }

    @Override // zd.a1
    public final l0 invokeOnCompletion(boolean z9, boolean z10, rd.l lVar) {
        e1 m0Var;
        if (z9) {
            m0Var = new z0(lVar);
        } else {
            m0Var = new m0(lVar, 1);
        }
        return z(z10, m0Var);
    }

    public void I() {
    }

    public void H(Object obj) {
    }

    public void g(Object obj) {
    }

    public void x(androidx.car.app.j jVar) {
        throw jVar;
    }
}
