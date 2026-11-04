package wd;

import b8.ib;
import b8.jc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a extends n1 implements fd.c, z {
    public final fd.h c;

    public a(fd.h hVar, boolean z10) {
        super(z10);
        y((a1) hVar.get(y.b));
        this.c = hVar.plus(this);
    }

    @Override // wd.n1
    public final void H(Object obj) {
        if (!(obj instanceof v)) {
            R(obj);
        } else {
            v vVar = (v) obj;
            Q(vVar.a, v.b.get(vVar) != 0);
        }
    }

    public final void S(a0 a0Var, a aVar, od.p pVar) {
        Object invoke;
        int ordinal = a0Var.ordinal();
        dd.k kVar = dd.k.a;
        if (ordinal == 0) {
            try {
                be.a.h(jc.b(jc.a(aVar, this, pVar)), kVar);
                return;
            } finally {
                resumeWith(ib.a(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.j.e(pVar, "<this>");
                jc.b(jc.a(aVar, this, pVar)).resumeWith(kVar);
                return;
            }
            if (ordinal != 3) {
                throw new androidx.car.app.j();
            }
            try {
                fd.h hVar = this.c;
                Object l10 = be.a.l(hVar, null);
                try {
                    if (pVar instanceof hd.a) {
                        kotlin.jvm.internal.u.a(2, pVar);
                        invoke = pVar.invoke(aVar, this);
                    } else {
                        invoke = jc.c(pVar, aVar, this);
                    }
                    be.a.g(hVar, l10);
                    if (invoke != gd.a.a) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th2) {
                    be.a.g(hVar, l10);
                    throw th2;
                }
            } catch (Throwable th3) {
            }
        }
    }

    @Override // wd.z
    public final fd.h c() {
        return this.c;
    }

    @Override // fd.c
    public final fd.h getContext() {
        return this.c;
    }

    @Override // wd.n1
    public final String m() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // fd.c
    public final void resumeWith(Object obj) {
        Throwable a10 = dd.g.a(obj);
        if (a10 != null) {
            obj = new v(a10, false);
        }
        Object D = D(obj);
        if (D == b0.e) {
            return;
        }
        h(D);
    }

    @Override // wd.n1
    public final void x(androidx.car.app.j jVar) {
        b0.m(this.c, jVar);
    }

    public void R(Object obj) {
    }

    public void Q(Throwable th2, boolean z10) {
    }
}
