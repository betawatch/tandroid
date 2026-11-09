package x2;

import j$.util.Objects;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class z extends s {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public z(e2.l1 l1Var, Object obj, Object obj2) {
        super(l1Var);
        this.f = obj;
        this.g = obj2;
    }

    @Override // x2.s, e2.l1
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // x2.s, e2.l1
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z9) {
        this.e.f(i7, i1Var, z9);
        if (Objects.equals(i1Var.b, this.g) && z9) {
            i1Var.b = h;
        }
        return i1Var;
    }

    @Override // x2.s, e2.l1
    public final Object l(int i7) {
        Object l10 = this.e.l(i7);
        return Objects.equals(l10, this.g) ? h : l10;
    }

    @Override // x2.s, e2.l1
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        this.e.m(i7, k1Var, j3);
        if (Objects.equals(k1Var.a, this.f)) {
            k1Var.a = e2.k1.q;
        }
        return k1Var;
    }
}
