package zd;

import a8.la;
import a8.z9;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static final com.google.android.gms.internal.clearcut.e a = new com.google.android.gms.internal.clearcut.e("RESUME_TOKEN", 1);
    public static final com.google.android.gms.internal.clearcut.e b = new com.google.android.gms.internal.clearcut.e("REMOVED_TASK", 1);
    public static final com.google.android.gms.internal.clearcut.e c = new com.google.android.gms.internal.clearcut.e("CLOSED_EMPTY", 1);
    public static final com.google.android.gms.internal.clearcut.e d = new com.google.android.gms.internal.clearcut.e("COMPLETING_ALREADY", 1);
    public static final com.google.android.gms.internal.clearcut.e e = new com.google.android.gms.internal.clearcut.e("COMPLETING_WAITING_CHILDREN", 1);
    public static final com.google.android.gms.internal.clearcut.e f = new com.google.android.gms.internal.clearcut.e("COMPLETING_RETRY", 1);
    public static final com.google.android.gms.internal.clearcut.e g = new com.google.android.gms.internal.clearcut.e("TOO_LATE_TO_CANCEL", 1);
    public static final com.google.android.gms.internal.clearcut.e h = new com.google.android.gms.internal.clearcut.e("SEALED", 1);
    public static final n0 i = new n0(false);
    public static final n0 j = new n0(true);

    public static t a() {
        t tVar = new t(true);
        tVar.y(null);
        return tVar;
    }

    public static final ee.c b(id.h hVar) {
        if (hVar.get(y.b) == null) {
            hVar = hVar.plus(new c1());
        }
        return new ee.c(hVar);
    }

    public static f0 c(z zVar, rd.p pVar) {
        a0 a0Var = a0.a;
        id.h r10 = r(zVar, id.i.a);
        a0 a0Var2 = a0.a;
        f0 f0Var = new f0(r10, true);
        f0Var.S(a0Var, f0Var, pVar);
        return f0Var;
    }

    public static final Object d(e0[] e0VarArr, kd.j jVar) {
        if (e0VarArr.length == 0) {
            return hd.n.a;
        }
        e eVar = new e(e0VarArr);
        m mVar = new m(1, c8.u0.b(jVar));
        mVar.s();
        int length = e0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i7 = 0; i7 < length; i7++) {
            e0 e0Var = e0VarArr[i7];
            e0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f = n(e0Var, true, cVar);
            cVarArr[i7] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            c cVar2 = cVarArr[i10];
            cVar2.getClass();
            c.n.set(cVar2, dVar);
        }
        if (m.h.get(mVar) instanceof q1) {
            mVar.v(dVar);
        } else {
            dVar.b();
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.a;
        return r10;
    }

    public static final Object e(rd.p pVar, id.c cVar) {
        ee.q qVar = new ee.q(cVar, cVar.getContext());
        Object a10 = z9.a(qVar, qVar, pVar);
        jd.a aVar = jd.a.a;
        return a10;
    }

    public static final Object f(long j3, kd.c cVar) {
        if (j3 > 0) {
            m mVar = new m(1, c8.u0.b(cVar));
            mVar.s();
            if (j3 < Long.MAX_VALUE) {
                i(mVar.e).b(j3, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == jd.a.a) {
                return r10;
            }
        }
        return gd.k.a;
    }

    public static final void g(id.h hVar) {
        a1 a1Var = (a1) hVar.get(y.b);
        if (a1Var != null && !a1Var.isActive()) {
            throw a1Var.getCancellationException();
        }
    }

    public static final id.h h(id.h hVar, id.h hVar2, boolean z9) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) hVar.fold(bool, new b1.e(10))).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, new b1.e(10))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        b1.e eVar = new b1.e(11);
        id.i iVar = id.i.a;
        id.h hVar3 = (id.h) hVar.fold(iVar, eVar);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.fold(iVar, new b1.e(12));
        }
        return hVar3.plus((id.h) obj);
    }

    public static final g0 i(id.h hVar) {
        id.f fVar = hVar.get(id.d.a);
        g0 g0Var = fVar instanceof g0 ? (g0) fVar : null;
        return g0Var == null ? d0.a : g0Var;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final a1 k(id.h hVar) {
        a1 a1Var = (a1) hVar.get(y.b);
        if (a1Var != null) {
            return a1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final m l(id.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof ee.f)) {
            return new m(1, cVar);
        }
        ee.f fVar = (ee.f) cVar;
        com.google.android.gms.internal.clearcut.e eVar = ee.a.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.f.n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, eVar);
                mVar2 = null;
                break;
            }
            if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, eVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            }
            if (obj != eVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (mVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(mVar2);
            if (!(obj2 instanceof u) || ((u) obj2).d == null) {
                m.f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.a);
                mVar = mVar2;
            } else {
                mVar2.o();
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m(2, cVar);
    }

    public static final void m(id.h hVar, Throwable th2) {
        try {
            ae.b bVar = (ae.b) hVar.get(y.a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                ee.a.d(hVar, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                la.a(runtimeException, th2);
                th2 = runtimeException;
            }
            ee.a.d(hVar, th2);
        }
    }

    public static final l0 n(a1 a1Var, boolean z9, e1 e1Var) {
        return a1Var instanceof n1 ? ((n1) a1Var).z(z9, e1Var) : a1Var.invokeOnCompletion(e1Var.i(), z9, new d1(1, e1Var, e1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(Collection collection, kd.c cVar) {
        g gVar;
        int i7;
        Iterator it;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.c;
            if ((i10 & TLObject.FLAG_31) != 0) {
                gVar.c = i10 - TLObject.FLAG_31;
                Object obj = gVar.b;
                jd.a aVar = jd.a.a;
                i7 = gVar.c;
                if (i7 != 0) {
                    af.b.c(obj);
                    it = collection.iterator();
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = gVar.a;
                    af.b.c(obj);
                }
                while (it.hasNext()) {
                    a1 a1Var = (a1) it.next();
                    gVar.a = it;
                    gVar.c = 1;
                    if (a1Var.join(gVar) == aVar) {
                        return aVar;
                    }
                }
                return gd.k.a;
            }
        }
        gVar = new g(cVar);
        Object obj2 = gVar.b;
        jd.a aVar2 = jd.a.a;
        i7 = gVar.c;
        if (i7 != 0) {
        }
        while (it.hasNext()) {
        }
        return gd.k.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(a1[] a1VarArr, kd.c cVar) {
        f fVar;
        int i7;
        int i10;
        a1[] a1VarArr2;
        int length;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.e;
            if ((i11 & TLObject.FLAG_31) != 0) {
                fVar.e = i11 - TLObject.FLAG_31;
                Object obj = fVar.d;
                jd.a aVar = jd.a.a;
                i7 = fVar.e;
                if (i7 != 0) {
                    af.b.c(obj);
                    i10 = 0;
                    a1VarArr2 = a1VarArr;
                    length = a1VarArr.length;
                    if (i10 < length) {
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = fVar.c;
                    i10 = fVar.b;
                    a1[] a1VarArr3 = (a1[]) fVar.a;
                    af.b.c(obj);
                    a1VarArr2 = a1VarArr3;
                    i10++;
                    if (i10 < length) {
                        a1 a1Var = a1VarArr2[i10];
                        fVar.a = a1VarArr2;
                        fVar.b = i10;
                        fVar.c = length;
                        fVar.e = 1;
                        if (a1Var.join(fVar) == aVar) {
                            return aVar;
                        }
                        i10++;
                        if (i10 < length) {
                            return gd.k.a;
                        }
                    }
                }
            }
        }
        fVar = new f(cVar);
        Object obj2 = fVar.d;
        jd.a aVar2 = jd.a.a;
        i7 = fVar.e;
        if (i7 != 0) {
        }
    }

    public static s1 q(z zVar, rd.p pVar) {
        a0 a0Var = a0.a;
        id.h r10 = r(zVar, id.i.a);
        a0 a0Var2 = a0.a;
        s1 s1Var = new s1(r10, true);
        s1Var.S(a0Var, s1Var, pVar);
        return s1Var;
    }

    public static final id.h r(z zVar, id.h hVar) {
        id.h h7 = h(zVar.c(), hVar, true);
        ge.e eVar = j0.a;
        return (h7 == eVar || h7.get(id.d.a) != null) ? h7 : h7.plus(eVar);
    }

    public static final Object s(Object obj) {
        return obj instanceof v ? af.b.b(((v) obj).a) : obj;
    }

    public static final void t(m mVar, id.c cVar, boolean z9) {
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        Object b10 = g10 != null ? af.b.b(g10) : mVar.h(obj);
        if (!z9) {
            cVar.resumeWith(b10);
            return;
        }
        kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        ee.f fVar = (ee.f) cVar;
        kd.c cVar2 = fVar.e;
        Object obj2 = fVar.h;
        id.h context = cVar2.getContext();
        Object l10 = ee.a.l(context, obj2);
        a2 x10 = l10 != ee.a.d ? x(cVar2, context, l10) : null;
        try {
            cVar2.resumeWith(b10);
            if (x10 == null || x10.T()) {
                ee.a.g(context, l10);
            }
        } catch (Throwable th2) {
            if (x10 == null || x10.T()) {
                ee.a.g(context, l10);
            }
            throw th2;
        }
    }

    public static Object u(rd.p pVar) {
        Thread currentThread = Thread.currentThread();
        t0 a10 = v1.a();
        id.h h7 = h(id.i.a, a10, true);
        ge.e eVar = j0.a;
        if (h7 != eVar && h7.get(id.d.a) == null) {
            h7 = h7.plus(eVar);
        }
        h hVar = new h(h7, currentThread, a10);
        hVar.S(a0.a, hVar, pVar);
        t0 t0Var = hVar.e;
        if (t0Var != null) {
            int i7 = t0.f;
            t0Var.i(false);
        }
        while (!Thread.interrupted()) {
            try {
                long j3 = t0Var != null ? t0Var.j() : Long.MAX_VALUE;
                if (hVar.A()) {
                    if (t0Var != null) {
                        int i10 = t0.f;
                        t0Var.g(false);
                    }
                    Object w10 = w(n1.a.get(hVar));
                    v vVar = w10 instanceof v ? (v) w10 : null;
                    if (vVar == null) {
                        return w10;
                    }
                    throw vVar.a;
                }
                LockSupport.parkNanos(hVar, j3);
            } catch (Throwable th2) {
                if (t0Var != null) {
                    int i11 = t0.f;
                    t0Var.g(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        hVar.j(interruptedException);
        throw interruptedException;
    }

    public static final String v(id.c cVar) {
        Object b10;
        if (cVar instanceof ee.f) {
            return ((ee.f) cVar).toString();
        }
        try {
            b10 = cVar + '@' + j(cVar);
        } catch (Throwable th2) {
            b10 = af.b.b(th2);
        }
        if (gd.g.a(b10) != null) {
            b10 = cVar.getClass().getName() + '@' + j(cVar);
        }
        return (String) b10;
    }

    public static final Object w(Object obj) {
        x0 x0Var;
        y0 y0Var = obj instanceof y0 ? (y0) obj : null;
        return (y0Var == null || (x0Var = y0Var.a) == null) ? obj : x0Var;
    }

    public static final a2 x(id.c cVar, id.h hVar, Object obj) {
        a2 a2Var = null;
        if ((cVar instanceof kd.d) && hVar.get(b2.a) != null) {
            kd.d dVar = (kd.d) cVar;
            while (true) {
                if ((dVar instanceof h0) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof a2) {
                    a2Var = (a2) dVar;
                    break;
                }
            }
            if (a2Var != null) {
                a2Var.U(hVar, obj);
            }
        }
        return a2Var;
    }

    public static final Object y(id.h hVar, rd.p pVar, id.c cVar) {
        Object w10;
        id.h context = cVar.getContext();
        id.h plus = !((Boolean) hVar.fold(Boolean.FALSE, new b1.e(10))).booleanValue() ? context.plus(hVar) : h(context, hVar, false);
        g(plus);
        if (plus == context) {
            ee.q qVar = new ee.q(cVar, plus);
            w10 = z9.a(qVar, qVar, pVar);
        } else {
            id.d dVar = id.d.a;
            if (kotlin.jvm.internal.j.a(plus.get(dVar), context.get(dVar))) {
                a2 a2Var = new a2(cVar, plus);
                id.h hVar2 = a2Var.c;
                Object l10 = ee.a.l(hVar2, null);
                try {
                    Object a10 = z9.a(a2Var, a2Var, pVar);
                    ee.a.g(hVar2, l10);
                    w10 = a10;
                } catch (Throwable th2) {
                    ee.a.g(hVar2, l10);
                    throw th2;
                }
            } else {
                h0 h0Var = new h0(cVar, plus);
                try {
                    ee.a.h(c8.u0.b(c8.u0.a(h0Var, h0Var, pVar)), gd.k.a);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h0.e;
                    while (true) {
                        int i7 = atomicIntegerFieldUpdater.get(h0Var);
                        if (i7 != 0) {
                            if (i7 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            w10 = w(n1.a.get(h0Var));
                            if (w10 instanceof v) {
                                throw ((v) w10).a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(h0Var, 0, 1)) {
                            w10 = jd.a.a;
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    h0Var.resumeWith(af.b.b(th3));
                    throw th3;
                }
            }
        }
        jd.a aVar = jd.a.a;
        return w10;
    }

    public static final Object z(long j3, rd.p pVar, id.c cVar) {
        Object vVar;
        Object D;
        if (j3 <= 0) {
            throw new x1("Timed out immediately", null);
        }
        y1 y1Var = new y1(j3, cVar);
        n(y1Var, true, new m0(i(y1Var.d.getContext()).a(y1Var.e, y1Var, y1Var.c), 0));
        try {
            kotlin.jvm.internal.u.a(2, pVar);
            vVar = pVar.invoke(y1Var, y1Var);
        } catch (Throwable th2) {
            vVar = new v(th2, false);
        }
        Object obj = jd.a.a;
        if (vVar == obj || (D = y1Var.D(vVar)) == e) {
            return obj;
        }
        if (D instanceof v) {
            Throwable th3 = ((v) D).a;
            if (!(th3 instanceof x1)) {
                throw th3;
            }
            if (((x1) th3).a != y1Var) {
                throw th3;
            }
            if (vVar instanceof v) {
                throw ((v) vVar).a;
            }
        } else {
            vVar = w(D);
        }
        return vVar;
    }
}
