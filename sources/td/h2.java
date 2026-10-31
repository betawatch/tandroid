package td;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h2 extends yd.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h2(cd.c cVar, cd.h hVar) {
        super(cVar, hVar.get(r0) == null ? hVar.plus(r0) : hVar);
        i2 i2Var = i2.a;
        this.e = new ThreadLocal();
        if (cVar.getContext().get(cd.d.a) instanceof a0) {
            return;
        }
        Object k10 = yd.a.k(hVar, null);
        yd.a.f(hVar, k10);
        N(hVar, k10);
    }

    public final boolean M() {
        boolean z10 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z10;
    }

    public final void N(cd.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new ad.e(hVar, obj));
    }

    @Override // yd.s, td.u1
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            ad.e eVar = (ad.e) this.e.get();
            if (eVar != null) {
                yd.a.f((cd.h) eVar.a, eVar.b);
            }
            this.e.remove();
        }
        Object r10 = e0.r(obj);
        cd.c cVar = this.d;
        cd.h context = cVar.getContext();
        Object k10 = yd.a.k(context, null);
        h2 v = k10 != yd.a.f ? e0.v(cVar, context, k10) : null;
        try {
            this.d.resumeWith(r10);
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
}
