package zd;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class a extends n1 implements id.c, z {
    public final id.h c;

    public a(id.h hVar, boolean z9) {
        super(z9);
        y((a1) hVar.get(y.b));
        this.c = hVar.plus(this);
    }

    @Override // zd.n1
    public final void H(Object obj) {
        if (!(obj instanceof v)) {
            R(obj);
        } else {
            v vVar = (v) obj;
            Q(vVar.a, v.b.get(vVar) != 0);
        }
    }

    public final void S(a0 a0Var, a aVar, rd.p pVar) {
        Object invoke;
        int ordinal = a0Var.ordinal();
        gd.k kVar = gd.k.a;
        if (ordinal == 0) {
            try {
                ee.a.h(c8.u0.b(c8.u0.a(aVar, this, pVar)), kVar);
                return;
            } finally {
                resumeWith(af.b.b(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.j.e(pVar, "<this>");
                c8.u0.b(c8.u0.a(aVar, this, pVar)).resumeWith(kVar);
                return;
            }
            if (ordinal != 3) {
                throw new androidx.car.app.j();
            }
            try {
                id.h hVar = this.c;
                Object l10 = ee.a.l(hVar, null);
                try {
                    if (pVar instanceof kd.a) {
                        kotlin.jvm.internal.u.a(2, pVar);
                        invoke = pVar.invoke(aVar, this);
                    } else {
                        invoke = c8.u0.c(pVar, aVar, this);
                    }
                    ee.a.g(hVar, l10);
                    if (invoke != jd.a.a) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th2) {
                    ee.a.g(hVar, l10);
                    throw th2;
                }
            } catch (Throwable th3) {
            }
        }
    }

    @Override // zd.z
    public final id.h c() {
        return this.c;
    }

    @Override // id.c
    public final id.h getContext() {
        return this.c;
    }

    @Override // zd.n1
    public final String m() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // id.c
    public final void resumeWith(Object obj) {
        Throwable a10 = gd.g.a(obj);
        if (a10 != null) {
            obj = new v(a10, false);
        }
        Object D = D(obj);
        if (D == b0.e) {
            return;
        }
        h(D);
    }

    @Override // zd.n1
    public final void x(androidx.car.app.j jVar) {
        b0.m(this.c, jVar);
    }

    public void R(Object obj) {
    }

    public void Q(Throwable th2, boolean z9) {
    }
}
