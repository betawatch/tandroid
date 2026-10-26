package u2;

import j$.util.Objects;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class z extends s {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public z(b2.p1 p1Var, Object obj, Object obj2) {
        super(p1Var);
        this.f = obj;
        this.g = obj2;
    }

    @Override // u2.s, b2.p1
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // u2.s, b2.p1
    public final b2.m1 f(int i10, b2.m1 m1Var, boolean z10) {
        this.e.f(i10, m1Var, z10);
        if (Objects.equals(m1Var.b, this.g) && z10) {
            m1Var.b = h;
        }
        return m1Var;
    }

    @Override // u2.s, b2.p1
    public final Object l(int i10) {
        Object l4 = this.e.l(i10);
        return Objects.equals(l4, this.g) ? h : l4;
    }

    @Override // u2.s, b2.p1
    public final b2.o1 m(int i10, b2.o1 o1Var, long j10) {
        this.e.m(i10, o1Var, j10);
        if (Objects.equals(o1Var.a, this.f)) {
            o1Var.a = b2.o1.q;
        }
        return o1Var;
    }
}
