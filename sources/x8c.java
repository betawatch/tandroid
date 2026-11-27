// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class x8c extends ju9 {
    public final ThreadLocal f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x8c(zw2 zw2Var, mx2 mx2Var) {
        super(zw2Var, mx2Var.get(r0) == null ? mx2Var.plus(r0) : mx2Var);
        y8c y8cVar = y8c.a;
        this.f = new ThreadLocal();
        if (zw2Var.getContext().get(rj2.b) instanceof px2) {
            return;
        }
        Object c = xhd.c(mx2Var, null);
        xhd.a(mx2Var, c);
        T(mx2Var, c);
    }

    public final boolean S() {
        boolean z = this.threadLocalIsSet && this.f.get() == null;
        this.f.remove();
        return !z;
    }

    public final void T(mx2 mx2Var, Object obj) {
        this.threadLocalIsSet = true;
        this.f.set(new rx7(mx2Var, obj));
    }

    @Override // ju9, sv5
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            rx7 rx7Var = (rx7) this.f.get();
            if (rx7Var != null) {
                xhd.a((mx2) rx7Var.a, rx7Var.b);
            }
            this.f.remove();
        }
        Object a = pxd.a(obj);
        zw2 zw2Var = this.e;
        mx2 context = zw2Var.getContext();
        Object c = xhd.c(context, null);
        x8c c2 = c != xhd.a ? g4e.c(zw2Var, context, c) : null;
        try {
            this.e.resumeWith(a);
            if (c2 == null || c2.S()) {
                xhd.a(context, c);
            }
        } catch (Throwable th) {
            if (c2 == null || c2.S()) {
                xhd.a(context, c);
            }
            throw th;
        }
    }
}
