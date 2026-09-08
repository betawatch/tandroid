package zd;

import v7.h7;
import v7.t7;
import v7.t8;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class a extends u1 implements id.c, c0 {
    public final id.h c;

    public a(id.h hVar, boolean z10) {
        super(z10);
        x((f1) hVar.get(b0.b));
        this.c = hVar.plus(this);
    }

    @Override // zd.u1
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, rd.p pVar) {
        Object invoke;
        int ordinal = d0Var.ordinal();
        if (ordinal == 0) {
            h7.a(pVar, aVar, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.i.e(pVar, "<this>");
                t8.b(t8.a(aVar, this, pVar)).resumeWith(gd.i.a);
                return;
            }
            if (ordinal != 3) {
                throw new androidx.car.app.j();
            }
            try {
                id.h hVar = this.c;
                Object k10 = ee.a.k(hVar, null);
                try {
                    if (pVar instanceof kd.a) {
                        kotlin.jvm.internal.s.a(2, pVar);
                        invoke = pVar.invoke(aVar, this);
                    } else {
                        kotlin.jvm.internal.i.e(pVar, "<this>");
                        id.h hVar2 = this.c;
                        Object dVar = hVar2 == id.i.a ? new jd.d(this) : new jd.e(this, hVar2);
                        kotlin.jvm.internal.s.a(2, pVar);
                        invoke = pVar.invoke(aVar, dVar);
                    }
                    if (invoke != jd.a.a) {
                        resumeWith(invoke);
                    }
                } finally {
                    ee.a.f(hVar, k10);
                }
            } catch (Throwable th2) {
                resumeWith(t7.a(th2));
            }
        }
    }

    @Override // zd.c0
    public final id.h c() {
        return this.c;
    }

    @Override // id.c
    public final id.h getContext() {
        return this.c;
    }

    @Override // zd.u1
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // id.c
    public final void resumeWith(Object obj) {
        Throwable a2 = gd.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == e0.e) {
            return;
        }
        g(B);
    }

    @Override // zd.u1
    public final void w(androidx.car.app.j jVar) {
        e0.m(this.c, jVar);
    }
}
