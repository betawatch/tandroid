package x2;

import java.util.List;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class l0 implements a3.u {
    public final a3.u a;
    public final e2.m1 b;

    public l0(a3.u uVar, e2.m1 m1Var) {
        this.a = uVar;
        this.b = m1Var;
    }

    @Override // a3.u
    public final boolean a(int i7, long j3) {
        return this.a.a(i7, j3);
    }

    @Override // a3.u
    public final int b(e2.u uVar) {
        return this.a.u(this.b.a(uVar));
    }

    @Override // a3.u
    public final e2.m1 c() {
        return this.b;
    }

    @Override // a3.u
    public final int d() {
        return this.a.d();
    }

    @Override // a3.u
    public final void e(long j3, long j10, long j11, List list, y2.m[] mVarArr) {
        this.a.e(j3, j10, j11, list, mVarArr);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof l0)) {
            return this.b.equals(((l0) obj).b);
        }
        return false;
    }

    @Override // a3.u
    public final void f(boolean z9) {
        this.a.f(z9);
    }

    @Override // a3.u
    public final e2.u g(int i7) {
        return this.b.d[this.a.i(i7)];
    }

    @Override // a3.u
    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // a3.u
    public final int i(int i7) {
        return this.a.i(i7);
    }

    @Override // a3.u
    public final int j(long j3, List list) {
        return this.a.j(j3, list);
    }

    @Override // a3.u
    public final boolean k(long j3, y2.f fVar, List list) {
        return this.a.k(j3, fVar, list);
    }

    @Override // a3.u
    public final void l() {
        this.a.l();
    }

    @Override // a3.u
    public final int length() {
        return this.a.length();
    }

    @Override // a3.u
    public final int m() {
        return this.a.m();
    }

    @Override // a3.u
    public final e2.u n() {
        return this.b.d[this.a.m()];
    }

    @Override // a3.u
    public final int o() {
        return this.a.o();
    }

    @Override // a3.u
    public final boolean p(int i7, long j3) {
        return this.a.p(i7, j3);
    }

    @Override // a3.u
    public final void q(float f10) {
        this.a.q(f10);
    }

    @Override // a3.u
    public final Object r() {
        return this.a.r();
    }

    @Override // a3.u
    public final void s() {
        this.a.s();
    }

    @Override // a3.u
    public final void t() {
        this.a.t();
    }

    @Override // a3.u
    public final int u(int i7) {
        return this.a.u(i7);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return this.a.equals(((l0) obj).a);
        }
        return false;
    }
}
