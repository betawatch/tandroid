// default package

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class y07 implements k64 {
    public final k64 a;
    public final sxb b;

    public y07(k64 k64Var, sxb sxbVar) {
        this.a = k64Var;
        this.b = sxbVar;
    }

    @Override // k64
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // k64
    public final void b(long j, long j2, long j3, List list, bk6[] bk6VarArr) {
        this.a.b(j, j2, j3, list, bk6VarArr);
    }

    @Override // k64
    public final sxb c() {
        return this.b;
    }

    @Override // k64
    public final int d() {
        return this.a.d();
    }

    @Override // k64
    public final int e(fm4 fm4Var) {
        return this.a.v(this.b.a(fm4Var));
    }

    public final boolean equals(Object obj) {
        if (w(obj) && (obj instanceof y07)) {
            return this.b.equals(((y07) obj).b);
        }
        return false;
    }

    @Override // k64
    public final void f() {
        this.a.f();
    }

    @Override // k64
    public final boolean g(long j, zg2 zg2Var, List list) {
        return this.a.g(j, zg2Var, list);
    }

    @Override // k64
    public final void h(boolean z) {
        this.a.h(z);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // k64
    public final fm4 i(int i) {
        return this.b.d[this.a.k(i)];
    }

    @Override // k64
    public final void j() {
        this.a.j();
    }

    @Override // k64
    public final int k(int i) {
        return this.a.k(i);
    }

    @Override // k64
    public final int l(long j, List list) {
        return this.a.l(j, list);
    }

    @Override // k64
    public final int length() {
        return this.a.length();
    }

    @Override // k64
    public final void m() {
        this.a.m();
    }

    @Override // k64
    public final int n() {
        return this.a.n();
    }

    @Override // k64
    public final fm4 o() {
        return this.b.d[this.a.n()];
    }

    @Override // k64
    public final int p() {
        return this.a.p();
    }

    @Override // k64
    public final boolean q(int i, long j) {
        return this.a.q(i, j);
    }

    @Override // k64
    public final void r(float f) {
        this.a.r(f);
    }

    @Override // k64
    public final Object s() {
        return this.a.s();
    }

    @Override // k64
    public final void t() {
        this.a.t();
    }

    @Override // k64
    public final void u() {
        this.a.u();
    }

    @Override // k64
    public final int v(int i) {
        return this.a.v(i);
    }

    public final boolean w(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y07) {
            return this.a.equals(((y07) obj).a);
        }
        return false;
    }
}
