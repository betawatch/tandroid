// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y6c extends ss9 {
    public final ThreadLocal f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y6c(px2 px2Var, cy2 cy2Var) {
        super(px2Var, cy2Var.get(r0) == null ? cy2Var.plus(r0) : cy2Var);
        z6c z6cVar = z6c.a;
        this.f = new ThreadLocal();
        if (px2Var.getContext().get(jk2.b) instanceof fy2) {
            return;
        }
        Object c = gfd.c(cy2Var, null);
        gfd.a(cy2Var, c);
        T(cy2Var, c);
    }

    public final boolean S() {
        boolean z = this.threadLocalIsSet && this.f.get() == null;
        this.f.remove();
        return !z;
    }

    public final void T(cy2 cy2Var, Object obj) {
        this.threadLocalIsSet = true;
        this.f.set(new lw7(cy2Var, obj));
    }

    @Override // ss9, ov5
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            lw7 lw7Var = (lw7) this.f.get();
            if (lw7Var != null) {
                gfd.a((cy2) lw7Var.a, lw7Var.b);
            }
            this.f.remove();
        }
        Object a = cvd.a(obj);
        px2 px2Var = this.e;
        cy2 context = px2Var.getContext();
        Object c = gfd.c(context, null);
        y6c c2 = c != gfd.a ? t1e.c(px2Var, context, c) : null;
        try {
            this.e.resumeWith(a);
            if (c2 == null || c2.S()) {
                gfd.a(context, c);
            }
        } catch (Throwable th) {
            if (c2 == null || c2.S()) {
                gfd.a(context, c);
            }
            throw th;
        }
    }
}
