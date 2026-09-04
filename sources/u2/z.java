package u2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class z extends b2.k1 {
    public final b2.k0 e;

    public z(b2.k0 k0Var) {
        this.e = k0Var;
    }

    @Override // b2.k1
    public final int b(Object obj) {
        return obj == y.h ? 0 : -1;
    }

    @Override // b2.k1
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.h(z10 ? 0 : null, z10 ? y.h : null, 0, -9223372036854775807L, 0L, b2.b.c, true);
        return h1Var;
    }

    @Override // b2.k1
    public final int h() {
        return 1;
    }

    @Override // b2.k1
    public final Object l(int i10) {
        return y.h;
    }

    @Override // b2.k1
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(b2.j1.q, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        j1Var.k = true;
        return j1Var;
    }

    @Override // b2.k1
    public final int o() {
        return 1;
    }
}
