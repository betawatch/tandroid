package u2;

import j$.util.Objects;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class y extends r {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public y(b2.k1 k1Var, Object obj, Object obj2) {
        super(k1Var);
        this.f = obj;
        this.g = obj2;
    }

    @Override // u2.r, b2.k1
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // u2.r, b2.k1
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        this.e.f(i10, h1Var, z10);
        if (Objects.equals(h1Var.b, this.g) && z10) {
            h1Var.b = h;
        }
        return h1Var;
    }

    @Override // u2.r, b2.k1
    public final Object l(int i10) {
        Object l4 = this.e.l(i10);
        return Objects.equals(l4, this.g) ? h : l4;
    }

    @Override // u2.r, b2.k1
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        this.e.m(i10, j1Var, j3);
        if (Objects.equals(j1Var.a, this.f)) {
            j1Var.a = b2.j1.q;
        }
        return j1Var;
    }
}
