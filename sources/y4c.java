// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class y4c extends rq9 {
    public final ThreadLocal f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y4c(fw2 fw2Var, sw2 sw2Var) {
        super(fw2Var, sw2Var.get(r0) == null ? sw2Var.plus(r0) : sw2Var);
        z4c z4cVar = z4c.a;
        this.f = new ThreadLocal();
        if (fw2Var.getContext().get(vi2.b) instanceof vw2) {
            return;
        }
        Object c = edd.c(sw2Var, null);
        edd.a(sw2Var, c);
        T(sw2Var, c);
    }

    public final boolean S() {
        boolean z = this.threadLocalIsSet && this.f.get() == null;
        this.f.remove();
        return !z;
    }

    public final void T(sw2 sw2Var, Object obj) {
        this.threadLocalIsSet = true;
        this.f.set(new ku7(sw2Var, obj));
    }

    @Override // rq9, pt5
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            ku7 ku7Var = (ku7) this.f.get();
            if (ku7Var != null) {
                edd.a((sw2) ku7Var.a, ku7Var.b);
            }
            this.f.remove();
        }
        Object a = zsd.a(obj);
        fw2 fw2Var = this.e;
        sw2 context = fw2Var.getContext();
        Object c = edd.c(context, null);
        y4c c2 = c != edd.a ? qzd.c(fw2Var, context, c) : null;
        try {
            this.e.resumeWith(a);
            if (c2 == null || c2.S()) {
                edd.a(context, c);
            }
        } catch (Throwable th) {
            if (c2 == null || c2.S()) {
                edd.a(context, c);
            }
            throw th;
        }
    }
}
