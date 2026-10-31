package td;

import v7.w6;
import w7.w9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class a extends u1 implements cd.c, c0 {
    public final cd.h c;

    public a(cd.h hVar, boolean z10) {
        super(z10);
        x((f1) hVar.get(b0.b));
        this.c = hVar.plus(this);
    }

    @Override // td.u1
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, ld.p pVar) {
        Object invoke;
        int ordinal = d0Var.ordinal();
        if (ordinal == 0) {
            w9.a(pVar, aVar, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.i.e(pVar, "<this>");
                w6.b(w6.a(aVar, this, pVar)).resumeWith(ad.j.a);
                return;
            }
            if (ordinal != 3) {
                throw new ad.d();
            }
            try {
                cd.h hVar = this.c;
                Object k10 = yd.a.k(hVar, null);
                try {
                    if (pVar instanceof ed.a) {
                        kotlin.jvm.internal.s.a(2, pVar);
                        invoke = pVar.invoke(aVar, this);
                    } else {
                        kotlin.jvm.internal.i.e(pVar, "<this>");
                        cd.h hVar2 = this.c;
                        Object dVar = hVar2 == cd.i.a ? new dd.d(this) : new dd.e(this, hVar2);
                        kotlin.jvm.internal.s.a(2, pVar);
                        invoke = pVar.invoke(aVar, dVar);
                    }
                    if (invoke != dd.a.a) {
                        resumeWith(invoke);
                    }
                } finally {
                    yd.a.f(hVar, k10);
                }
            } catch (Throwable th2) {
                resumeWith(l9.b.a(th2));
            }
        }
    }

    @Override // td.c0
    public final cd.h c() {
        return this.c;
    }

    @Override // cd.c
    public final cd.h getContext() {
        return this.c;
    }

    @Override // td.u1
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // cd.c
    public final void resumeWith(Object obj) {
        Throwable a2 = ad.g.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == e0.e) {
            return;
        }
        g(B);
    }

    @Override // td.u1
    public final void w(ad.d dVar) {
        e0.m(this.c, dVar);
    }
}
