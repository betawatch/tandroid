package zd;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a2 extends ee.q {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a2(id.c cVar, id.h hVar) {
        super(cVar, hVar.get(r0) == null ? hVar.plus(r0) : hVar);
        b2 b2Var = b2.a;
        this.e = new ThreadLocal();
        if (cVar.getContext().get(id.d.a) instanceof x) {
            return;
        }
        Object l10 = ee.a.l(hVar, null);
        ee.a.g(hVar, l10);
        U(hVar, l10);
    }

    public final boolean T() {
        boolean z9 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z9;
    }

    public final void U(id.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new gd.e(hVar, obj));
    }

    @Override // ee.q, zd.n1
    public final void h(Object obj) {
        if (this.threadLocalIsSet) {
            gd.e eVar = (gd.e) this.e.get();
            if (eVar != null) {
                ee.a.g((id.h) eVar.a, eVar.b);
            }
            this.e.remove();
        }
        Object s5 = b0.s(obj);
        id.c cVar = this.d;
        id.h context = cVar.getContext();
        Object l10 = ee.a.l(context, null);
        a2 x10 = l10 != ee.a.d ? b0.x(cVar, context, l10) : null;
        try {
            this.d.resumeWith(s5);
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
}
