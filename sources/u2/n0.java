package u2;

import java.util.List;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class n0 implements x2.p {
    public final x2.p a;
    public final b2.p1 b;

    public n0(x2.p pVar, b2.p1 p1Var) {
        this.a = pVar;
        this.b = p1Var;
    }

    @Override // x2.p
    public final boolean a(int i10, long j10) {
        return this.a.a(i10, j10);
    }

    @Override // x2.p
    public final b2.p1 b() {
        return this.b;
    }

    @Override // x2.p
    public final int c() {
        return this.a.c();
    }

    @Override // x2.p
    public final boolean d(long j10, v2.f fVar, List list) {
        return this.a.d(j10, fVar, list);
    }

    @Override // x2.p
    public final void e(boolean z10) {
        this.a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof n0)) {
            return this.b.equals(((n0) obj).b);
        }
        return false;
    }

    @Override // x2.p
    public final b2.w f(int i10) {
        return this.b.d[this.a.h(i10)];
    }

    @Override // x2.p
    public final void g() {
        this.a.g();
    }

    @Override // x2.p
    public final int h(int i10) {
        return this.a.h(i10);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // x2.p
    public final int i(long j10, List list) {
        return this.a.i(j10, list);
    }

    @Override // x2.p
    public final void j() {
        this.a.j();
    }

    @Override // x2.p
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        this.a.k(j10, j11, j12, list, mVarArr);
    }

    @Override // x2.p
    public final int l() {
        return this.a.l();
    }

    @Override // x2.p
    public final int length() {
        return this.a.length();
    }

    @Override // x2.p
    public final b2.w m() {
        return this.b.d[this.a.l()];
    }

    @Override // x2.p
    public final int n() {
        return this.a.n();
    }

    @Override // x2.p
    public final boolean o(int i10, long j10) {
        return this.a.o(i10, j10);
    }

    @Override // x2.p
    public final void p(float f7) {
        this.a.p(f7);
    }

    @Override // x2.p
    public final Object q() {
        return this.a.q();
    }

    @Override // x2.p
    public final void r() {
        this.a.r();
    }

    @Override // x2.p
    public final int s(b2.w wVar) {
        return this.a.u(this.b.a(wVar));
    }

    @Override // x2.p
    public final void t() {
        this.a.t();
    }

    @Override // x2.p
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
