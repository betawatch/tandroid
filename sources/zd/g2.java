package zd;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class g2 extends ee.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g2(id.c cVar, id.h hVar) {
        super(cVar, hVar.get(r0) == null ? hVar.plus(r0) : hVar);
        h2 h2Var = h2.a;
        this.e = new ThreadLocal();
        if (cVar.getContext().get(id.d.a) instanceof a0) {
            return;
        }
        Object k10 = ee.a.k(hVar, null);
        ee.a.f(hVar, k10);
        N(hVar, k10);
    }

    public final boolean M() {
        boolean z10 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z10;
    }

    public final void N(id.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new gd.d(hVar, obj));
    }

    @Override // ee.s, zd.u1
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            gd.d dVar = (gd.d) this.e.get();
            if (dVar != null) {
                ee.a.f((id.h) dVar.a, dVar.b);
            }
            this.e.remove();
        }
        Object r10 = e0.r(obj);
        id.c cVar = this.d;
        id.h context = cVar.getContext();
        Object k10 = ee.a.k(context, null);
        g2 v = k10 != ee.a.f ? e0.v(cVar, context, k10) : null;
        try {
            this.d.resumeWith(r10);
            if (v == null || v.M()) {
                ee.a.f(context, k10);
            }
        } catch (Throwable th2) {
            if (v == null || v.M()) {
                ee.a.f(context, k10);
            }
            throw th2;
        }
    }
}
