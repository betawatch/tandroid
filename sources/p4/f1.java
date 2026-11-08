package p4;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f1 extends e2.l1 {
    public static final Object j = new Object();
    public final e2.l0 e;
    public final boolean f;
    public final boolean g;
    public final e2.f0 h;
    public final long i;

    public f1(g1 g1Var) {
        this.e = g1Var.w();
        this.f = g1Var.e0();
        this.g = g1Var.v0();
        this.h = g1Var.P0() ? e2.f0.f : null;
        this.i = h2.m0.S(g1Var.A());
    }

    @Override // e2.l1
    public final int b(Object obj) {
        return j.equals(obj) ? 0 : -1;
    }

    @Override // e2.l1
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z9) {
        i1Var.getClass();
        e2.c cVar = e2.c.c;
        Object obj = j;
        i1Var.h(obj, obj, 0, this.i, 0L, cVar, false);
        i1Var.f = false;
        return i1Var;
    }

    @Override // e2.l1
    public final int h() {
        return 1;
    }

    @Override // e2.l1
    public final Object l(int i7) {
        return j;
    }

    @Override // e2.l1
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        k1Var.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        k1Var.k = false;
        return k1Var;
    }

    @Override // e2.l1
    public final int o() {
        return 1;
    }
}
