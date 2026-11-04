package w2;

import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z extends s {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public z(d2.n1 n1Var, Object obj, Object obj2) {
        super(n1Var);
        this.f = obj;
        this.g = obj2;
    }

    @Override // w2.s, d2.n1
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // w2.s, d2.n1
    public final d2.k1 f(int i3, d2.k1 k1Var, boolean z10) {
        this.e.f(i3, k1Var, z10);
        if (Objects.equals(k1Var.b, this.g) && z10) {
            k1Var.b = h;
        }
        return k1Var;
    }

    @Override // w2.s, d2.n1
    public final Object l(int i3) {
        Object l10 = this.e.l(i3);
        return Objects.equals(l10, this.g) ? h : l10;
    }

    @Override // w2.s, d2.n1
    public final d2.m1 m(int i3, d2.m1 m1Var, long j10) {
        this.e.m(i3, m1Var, j10);
        if (Objects.equals(m1Var.a, this.f)) {
            m1Var.a = d2.m1.q;
        }
        return m1Var;
    }
}
