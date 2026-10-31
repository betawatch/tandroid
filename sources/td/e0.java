package td;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.TLObject;
import v7.w6;
import w7.w9;
import w7.x9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class e0 {
    public static final ea.a a = new ea.a("RESUME_TOKEN");
    public static final ea.a b = new ea.a("REMOVED_TASK");
    public static final ea.a c = new ea.a("CLOSED_EMPTY");
    public static final ea.a d = new ea.a("COMPLETING_ALREADY");
    public static final ea.a e = new ea.a("COMPLETING_WAITING_CHILDREN");
    public static final ea.a f = new ea.a("COMPLETING_RETRY");
    public static final ea.a g = new ea.a("TOO_LATE_TO_CANCEL");
    public static final ea.a h = new ea.a("SEALED");
    public static final q0 i = new q0(false);
    public static final q0 j = new q0(true);

    public static t a() {
        t tVar = new t(true);
        tVar.x(null);
        return tVar;
    }

    public static final yd.e b(cd.h hVar) {
        if (hVar.get(b0.b) == null) {
            hVar = hVar.plus(new i1());
        }
        return new yd.e(hVar);
    }

    public static i0 c(c0 c0Var, ld.p pVar) {
        d0 d0Var = d0.a;
        cd.h i10 = i(c0Var.c(), cd.i.a, true);
        ae.e eVar = m0.a;
        if (i10 != eVar && i10.get(cd.d.a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.a;
        i0 i0Var = new i0(i10, true);
        i0Var.L(d0Var, i0Var, pVar);
        return i0Var;
    }

    public static final Object d(h0[] h0VarArr, ed.j jVar) {
        if (h0VarArr.length == 0) {
            return bd.q.a;
        }
        e eVar = new e(h0VarArr);
        m mVar = new m(1, w6.b(jVar));
        mVar.s();
        int length = h0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            h0 h0Var = h0VarArr[i10];
            h0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f = n(h0Var, false, cVar, 3);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.n.set(cVar2, dVar);
        }
        if (m.h.get(mVar) instanceof x1) {
            mVar.v(dVar);
        } else {
            dVar.b();
        }
        Object r10 = mVar.r();
        dd.a aVar = dd.a.a;
        return r10;
    }

    public static final void e(cd.h hVar, CancellationException cancellationException) {
        f1 f1Var = (f1) hVar.get(b0.b);
        if (f1Var != null) {
            f1Var.cancel(cancellationException);
        }
    }

    public static final Object f(ld.p pVar, cd.c cVar) {
        yd.s sVar = new yd.s(cVar, cVar.getContext());
        Object a2 = x9.a(sVar, sVar, pVar);
        dd.a aVar = dd.a.a;
        return a2;
    }

    public static final Object g(long j10, ed.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, w6.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                j(mVar.e).a(j10, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == dd.a.a) {
                return r10;
            }
        }
        return ad.j.a;
    }

    public static final void h(cd.h hVar) {
        f1 f1Var = (f1) hVar.get(b0.b);
        if (f1Var != null && !f1Var.isActive()) {
            throw f1Var.getCancellationException();
        }
    }

    public static final cd.h i(cd.h hVar, cd.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        cd.i iVar = cd.i.a;
        cd.h hVar3 = (cd.h) hVar.fold(iVar, xVar2);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.fold(iVar, x.c);
        }
        return hVar3.plus((cd.h) obj);
    }

    public static final j0 j(cd.h hVar) {
        cd.f fVar = hVar.get(cd.d.a);
        j0 j0Var = fVar instanceof j0 ? (j0) fVar : null;
        return j0Var == null ? g0.a : j0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(cd.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof yd.h)) {
            return new m(1, cVar);
        }
        yd.h hVar = (yd.h) cVar;
        ea.a aVar = yd.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yd.h.n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, aVar);
                mVar2 = null;
                break;
            }
            if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            }
            if (obj != aVar && !(obj instanceof Throwable)) {
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

    public static final void m(cd.h hVar, Throwable th2) {
        try {
            ud.b bVar = (ud.b) hVar.get(b0.a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                yd.a.c(hVar, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                i8.d.a(runtimeException, th2);
                th2 = runtimeException;
            }
            yd.a.c(hVar, th2);
        }
    }

    public static o0 n(f1 f1Var, boolean z10, k1 k1Var, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        return f1Var instanceof u1 ? ((u1) f1Var).y(z10, z11, k1Var) : f1Var.invokeOnCompletion(z10, z11, new j1(1, k1Var, d1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(Collection collection, ed.c cVar) {
        g gVar;
        int i10;
        Iterator it;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                gVar.c = i11 - TLObject.FLAG_31;
                Object obj = gVar.b;
                dd.a aVar = dd.a.a;
                i10 = gVar.c;
                if (i10 != 0) {
                    l9.b.b(obj);
                    it = collection.iterator();
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = gVar.a;
                    l9.b.b(obj);
                }
                while (it.hasNext()) {
                    f1 f1Var = (f1) it.next();
                    gVar.a = it;
                    gVar.c = 1;
                    if (f1Var.join(gVar) == aVar) {
                        return aVar;
                    }
                }
                return ad.j.a;
            }
        }
        gVar = new g(cVar);
        Object obj2 = gVar.b;
        dd.a aVar2 = dd.a.a;
        i10 = gVar.c;
        if (i10 != 0) {
        }
        while (it.hasNext()) {
        }
        return ad.j.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(f1[] f1VarArr, ed.c cVar) {
        f fVar;
        int i10;
        int i11;
        f1[] f1VarArr2;
        int length;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.e;
            if ((i12 & TLObject.FLAG_31) != 0) {
                fVar.e = i12 - TLObject.FLAG_31;
                Object obj = fVar.d;
                dd.a aVar = dd.a.a;
                i10 = fVar.e;
                if (i10 != 0) {
                    l9.b.b(obj);
                    i11 = 0;
                    f1VarArr2 = f1VarArr;
                    length = f1VarArr.length;
                    if (i11 < length) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = fVar.c;
                    i11 = fVar.b;
                    f1[] f1VarArr3 = (f1[]) fVar.a;
                    l9.b.b(obj);
                    f1VarArr2 = f1VarArr3;
                    i11++;
                    if (i11 < length) {
                        f1 f1Var = f1VarArr2[i11];
                        fVar.a = f1VarArr2;
                        fVar.b = i11;
                        fVar.c = length;
                        fVar.e = 1;
                        if (f1Var.join(fVar) == aVar) {
                            return aVar;
                        }
                        i11++;
                        if (i11 < length) {
                            return ad.j.a;
                        }
                    }
                }
            }
        }
        fVar = new f(cVar);
        Object obj2 = fVar.d;
        dd.a aVar2 = dd.a.a;
        i10 = fVar.e;
        if (i10 != 0) {
        }
    }

    public static a2 q(c0 c0Var, ld.p pVar) {
        d0 d0Var = d0.a;
        cd.h i10 = i(c0Var.c(), cd.i.a, true);
        ae.e eVar = m0.a;
        if (i10 != eVar && i10.get(cd.d.a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.a;
        a2 a2Var = new a2(i10, true);
        a2Var.L(d0Var, a2Var, pVar);
        return a2Var;
    }

    public static final Object r(Object obj) {
        return obj instanceof v ? l9.b.a(((v) obj).a) : obj;
    }

    public static final void s(m mVar, cd.c cVar, boolean z10) {
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        Object a2 = g10 != null ? l9.b.a(g10) : mVar.h(obj);
        if (!z10) {
            cVar.resumeWith(a2);
            return;
        }
        kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        yd.h hVar = (yd.h) cVar;
        ed.c cVar2 = hVar.e;
        Object obj2 = hVar.h;
        cd.h context = cVar2.getContext();
        Object k10 = yd.a.k(context, obj2);
        h2 v = k10 != yd.a.f ? v(cVar2, context, k10) : null;
        try {
            cVar2.resumeWith(a2);
            if (v == null || v.M()) {
                yd.a.f(context, k10);
            }
        } catch (Throwable th2) {
            if (v == null || v.M()) {
                yd.a.f(context, k10);
            }
            throw th2;
        }
    }

    public static final String t(cd.c cVar) {
        Object a2;
        if (cVar instanceof yd.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th2) {
            a2 = l9.b.a(th2);
        }
        if (ad.g.a(a2) != null) {
            a2 = cVar.getClass().getName() + '@' + k(cVar);
        }
        return (String) a2;
    }

    public static final Object u(Object obj) {
        a1 a1Var;
        b1 b1Var = obj instanceof b1 ? (b1) obj : null;
        return (b1Var == null || (a1Var = b1Var.a) == null) ? obj : a1Var;
    }

    public static final h2 v(cd.c cVar, cd.h hVar, Object obj) {
        h2 h2Var = null;
        if ((cVar instanceof ed.d) && hVar.get(i2.a) != null) {
            ed.d dVar = (ed.d) cVar;
            while (true) {
                if ((dVar instanceof k0) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof h2) {
                    h2Var = (h2) dVar;
                    break;
                }
            }
            if (h2Var != null) {
                h2Var.N(hVar, obj);
            }
        }
        return h2Var;
    }

    public static final Object w(cd.h hVar, ld.p pVar, cd.c cVar) {
        Object u10;
        cd.h context = cVar.getContext();
        cd.h plus = !((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue() ? context.plus(hVar) : i(context, hVar, false);
        h(plus);
        if (plus == context) {
            yd.s sVar = new yd.s(cVar, plus);
            u10 = x9.a(sVar, sVar, pVar);
        } else {
            cd.d dVar = cd.d.a;
            if (kotlin.jvm.internal.i.a(plus.get(dVar), context.get(dVar))) {
                h2 h2Var = new h2(cVar, plus);
                cd.h hVar2 = h2Var.c;
                Object k10 = yd.a.k(hVar2, null);
                try {
                    Object a2 = x9.a(h2Var, h2Var, pVar);
                    yd.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th2) {
                    yd.a.f(hVar2, k10);
                    throw th2;
                }
            } else {
                k0 k0Var = new k0(cVar, plus);
                w9.a(pVar, k0Var, k0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k0.e;
                while (true) {
                    int i10 = atomicIntegerFieldUpdater.get(k0Var);
                    if (i10 != 0) {
                        if (i10 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        u10 = u(k0Var.u());
                        if (u10 instanceof v) {
                            throw ((v) u10).a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(k0Var, 0, 1)) {
                        u10 = dd.a.a;
                        break;
                    }
                }
            }
        }
        dd.a aVar = dd.a.a;
        return u10;
    }

    public static final Object x(long j10, ld.p pVar, cd.c cVar) {
        Object vVar;
        Object B;
        if (j10 <= 0) {
            throw new e2("Timed out immediately", null);
        }
        f2 f2Var = new f2(j10, cVar);
        n(f2Var, false, new p0(j(f2Var.d.getContext()).b(f2Var.e, f2Var, f2Var.c), 0), 3);
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(f2Var, f2Var);
        } catch (Throwable th2) {
            vVar = new v(th2, false);
        }
        Object obj = dd.a.a;
        if (vVar == obj || (B = f2Var.B(vVar)) == e) {
            return obj;
        }
        if (B instanceof v) {
            Throwable th3 = ((v) B).a;
            if (!(th3 instanceof e2)) {
                throw th3;
            }
            if (((e2) th3).a != f2Var) {
                throw th3;
            }
            if (vVar instanceof v) {
                throw ((v) vVar).a;
            }
        } else {
            vVar = u(B);
        }
        return vVar;
    }
}
