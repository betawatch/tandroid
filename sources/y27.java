// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y27 implements t74 {
    public final t74 a;
    public final uzb b;

    public y27(t74 t74Var, uzb uzbVar) {
        this.a = t74Var;
        this.b = uzbVar;
    }

    @Override // t74
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // t74
    public final void b(long j, long j2, long j3, List list, em6[] em6VarArr) {
        this.a.b(j, j2, j3, list, em6VarArr);
    }

    @Override // t74
    public final uzb c() {
        return this.b;
    }

    @Override // t74
    public final int d() {
        return this.a.d();
    }

    @Override // t74
    public final int e(go4 go4Var) {
        return this.a.v(this.b.a(go4Var));
    }

    public final boolean equals(Object obj) {
        if (w(obj) && (obj instanceof y27)) {
            return this.b.equals(((y27) obj).b);
        }
        return false;
    }

    @Override // t74
    public final void f() {
        this.a.f();
    }

    @Override // t74
    public final boolean g(long j, ni2 ni2Var, List list) {
        return this.a.g(j, ni2Var, list);
    }

    @Override // t74
    public final void h(boolean z) {
        this.a.h(z);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // t74
    public final go4 i(int i) {
        return this.b.d[this.a.k(i)];
    }

    @Override // t74
    public final void j() {
        this.a.j();
    }

    @Override // t74
    public final int k(int i) {
        return this.a.k(i);
    }

    @Override // t74
    public final int l(long j, List list) {
        return this.a.l(j, list);
    }

    @Override // t74
    public final int length() {
        return this.a.length();
    }

    @Override // t74
    public final void m() {
        this.a.m();
    }

    @Override // t74
    public final int n() {
        return this.a.n();
    }

    @Override // t74
    public final go4 o() {
        return this.b.d[this.a.n()];
    }

    @Override // t74
    public final int p() {
        return this.a.p();
    }

    @Override // t74
    public final boolean q(int i, long j) {
        return this.a.q(i, j);
    }

    @Override // t74
    public final void r(float f) {
        this.a.r(f);
    }

    @Override // t74
    public final Object s() {
        return this.a.s();
    }

    @Override // t74
    public final void t() {
        this.a.t();
    }

    @Override // t74
    public final void u() {
        this.a.u();
    }

    @Override // t74
    public final int v(int i) {
        return this.a.v(i);
    }

    public final boolean w(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y27) {
            return this.a.equals(((y27) obj).a);
        }
        return false;
    }
}
