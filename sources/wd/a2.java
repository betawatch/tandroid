package wd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a2 extends be.q {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a2(fd.c cVar, fd.h hVar) {
        super(cVar, hVar.get(r0) == null ? hVar.plus(r0) : hVar);
        b2 b2Var = b2.a;
        this.e = new ThreadLocal();
        if (cVar.getContext().get(fd.d.a) instanceof x) {
            return;
        }
        Object l10 = be.a.l(hVar, null);
        be.a.g(hVar, l10);
        U(hVar, l10);
    }

    public final boolean T() {
        boolean z10 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z10;
    }

    public final void U(fd.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new dd.e(hVar, obj));
    }

    @Override // be.q, wd.n1
    public final void h(Object obj) {
        if (this.threadLocalIsSet) {
            dd.e eVar = (dd.e) this.e.get();
            if (eVar != null) {
                be.a.g((fd.h) eVar.a, eVar.b);
            }
            this.e.remove();
        }
        Object s6 = b0.s(obj);
        fd.c cVar = this.d;
        fd.h context = cVar.getContext();
        Object l10 = be.a.l(context, null);
        a2 x10 = l10 != be.a.d ? b0.x(cVar, context, l10) : null;
        try {
            this.d.resumeWith(s6);
            if (x10 == null || x10.T()) {
                be.a.g(context, l10);
            }
        } catch (Throwable th2) {
            if (x10 == null || x10.T()) {
                be.a.g(context, l10);
            }
            throw th2;
        }
    }
}
