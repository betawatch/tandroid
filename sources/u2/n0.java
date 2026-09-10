package u2;

import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n0 implements x2.r {
    public final x2.r a;
    public final b2.l1 b;

    public n0(x2.r rVar, b2.l1 l1Var) {
        this.a = rVar;
        this.b = l1Var;
    }

    @Override // x2.r
    public final boolean a(int i10, long j3) {
        return this.a.a(i10, j3);
    }

    @Override // x2.r
    public final b2.l1 b() {
        return this.b;
    }

    @Override // x2.r
    public final int c() {
        return this.a.c();
    }

    @Override // x2.r
    public final boolean d(long j3, v2.e eVar, List list) {
        return this.a.d(j3, eVar, list);
    }

    @Override // x2.r
    public final void e(boolean z10) {
        this.a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof n0)) {
            return this.b.equals(((n0) obj).b);
        }
        return false;
    }

    @Override // x2.r
    public final b2.s f(int i10) {
        return this.b.d[this.a.h(i10)];
    }

    @Override // x2.r
    public final void g() {
        this.a.g();
    }

    @Override // x2.r
    public final int h(int i10) {
        return this.a.h(i10);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // x2.r
    public final int i(long j3, List list) {
        return this.a.i(j3, list);
    }

    @Override // x2.r
    public final void j() {
        this.a.j();
    }

    @Override // x2.r
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        this.a.k(j3, j10, j11, list, lVarArr);
    }

    @Override // x2.r
    public final int l() {
        return this.a.l();
    }

    @Override // x2.r
    public final int length() {
        return this.a.length();
    }

    @Override // x2.r
    public final b2.s m() {
        return this.b.d[this.a.l()];
    }

    @Override // x2.r
    public final int n() {
        return this.a.n();
    }

    @Override // x2.r
    public final boolean o(int i10, long j3) {
        return this.a.o(i10, j3);
    }

    @Override // x2.r
    public final void p(float f7) {
        this.a.p(f7);
    }

    @Override // x2.r
    public final Object q() {
        return this.a.q();
    }

    @Override // x2.r
    public final void r() {
        this.a.r();
    }

    @Override // x2.r
    public final int s(b2.s sVar) {
        return this.a.u(this.b.a(sVar));
    }

    @Override // x2.r
    public final void t() {
        this.a.t();
    }

    @Override // x2.r
    public final int u(int i10) {
        return this.a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return this.a.equals(((n0) obj).a);
        }
        return false;
    }
}
