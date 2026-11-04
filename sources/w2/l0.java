package w2;

import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l0 implements z2.p {
    public final z2.p a;
    public final d2.o1 b;

    public l0(z2.p pVar, d2.o1 o1Var) {
        this.a = pVar;
        this.b = o1Var;
    }

    @Override // z2.p
    public final boolean a(int i3, long j10) {
        return this.a.a(i3, j10);
    }

    @Override // z2.p
    public final d2.o1 b() {
        return this.b;
    }

    @Override // z2.p
    public final int c() {
        return this.a.c();
    }

    @Override // z2.p
    public final void d(long j10, long j11, long j12, List list, x2.m[] mVarArr) {
        this.a.d(j10, j11, j12, list, mVarArr);
    }

    @Override // z2.p
    public final int e(d2.v vVar) {
        return this.a.u(this.b.a(vVar));
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof l0)) {
            return this.b.equals(((l0) obj).b);
        }
        return false;
    }

    @Override // z2.p
    public final void f(boolean z10) {
        this.a.f(z10);
    }

    @Override // z2.p
    public final d2.v g(int i3) {
        return this.b.d[this.a.i(i3)];
    }

    @Override // z2.p
    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // z2.p
    public final int i(int i3) {
        return this.a.i(i3);
    }

    @Override // z2.p
    public final int j(long j10, List list) {
        return this.a.j(j10, list);
    }

    @Override // z2.p
    public final void k() {
        this.a.k();
    }

    @Override // z2.p
    public final int l() {
        return this.a.l();
    }

    @Override // z2.p
    public final int length() {
        return this.a.length();
    }

    @Override // z2.p
    public final boolean m(long j10, x2.f fVar, List list) {
        return this.a.m(j10, fVar, list);
    }

    @Override // z2.p
    public final d2.v n() {
        return this.b.d[this.a.l()];
    }

    @Override // z2.p
    public final int o() {
        return this.a.o();
    }

    @Override // z2.p
    public final boolean p(int i3, long j10) {
        return this.a.p(i3, j10);
    }

    @Override // z2.p
    public final void q(float f10) {
        this.a.q(f10);
    }

    @Override // z2.p
    public final Object r() {
        return this.a.r();
    }

    @Override // z2.p
    public final void s() {
        this.a.s();
    }

    @Override // z2.p
    public final void t() {
        this.a.t();
    }

    @Override // z2.p
    public final int u(int i3) {
        return this.a.u(i3);
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
