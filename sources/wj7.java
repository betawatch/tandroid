// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wj7 implements ta1, noc {
    public final va1 a;
    public final /* synthetic */ xj7 b;

    public wj7(xj7 xj7Var, va1 va1Var) {
        this.b = xj7Var;
        this.a = va1Var;
    }

    @Override // noc
    public final void a(hz9 hz9Var, int i) {
        this.a.a(hz9Var, i);
    }

    @Override // ta1
    public final ow5 b(Object obj, ks4 ks4Var) {
        xj7 xj7Var = this.b;
        ua1 ua1Var = new ua1(xj7Var, this);
        ow5 E = this.a.E((g9c) obj, ua1Var);
        if (E != null) {
            xj7.h.set(xj7Var, null);
        }
        return E;
    }

    @Override // ta1
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // zw2
    public final mx2 getContext() {
        return this.a.e;
    }

    @Override // zw2
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
