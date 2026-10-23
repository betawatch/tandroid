package u2;

import j$.util.Objects;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class z extends s {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public z(b2.o1 o1Var, Object obj, Object obj2) {
        super(o1Var);
        this.f = obj;
        this.g = obj2;
    }

    @Override // u2.s, b2.o1
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // u2.s, b2.o1
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        this.e.f(i10, l1Var, z10);
        if (Objects.equals(l1Var.b, this.g) && z10) {
            l1Var.b = h;
        }
        return l1Var;
    }

    @Override // u2.s, b2.o1
    public final Object l(int i10) {
        Object l4 = this.e.l(i10);
        return Objects.equals(l4, this.g) ? h : l4;
    }

    @Override // u2.s, b2.o1
    public final b2.n1 m(int i10, b2.n1 n1Var, long j10) {
        this.e.m(i10, n1Var, j10);
        if (Objects.equals(n1Var.a, this.f)) {
            n1Var.a = b2.n1.q;
        }
        return n1Var;
    }
}
