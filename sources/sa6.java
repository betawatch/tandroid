// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sa6 extends rj7 {
    public final m8d l;
    public i36 m;
    public n31 n;

    public sa6(m8d m8dVar) {
        this.l = m8dVar;
        if (m8dVar.a == null) {
            m8dVar.a = this;
        } else {
            grb.i("There is already a listener registered");
            throw null;
        }
    }

    @Override // rj7
    public final void e() {
        m8d m8dVar = this.l;
        m8dVar.b = true;
        m8dVar.d = false;
        m8dVar.c = false;
        m8dVar.i.drainPermits();
        m8dVar.c();
    }

    @Override // rj7
    public final void f() {
        this.l.b = false;
    }

    @Override // rj7
    public final void h(cr7 cr7Var) {
        super.h(cr7Var);
        this.m = null;
        this.n = null;
    }

    public final void j() {
        i36 i36Var = this.m;
        n31 n31Var = this.n;
        if (i36Var == null || n31Var == null) {
            return;
        }
        super.h(n31Var);
        d(i36Var, n31Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
