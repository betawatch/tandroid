package r0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class j1 {
    public static final m1 b;
    public final m1 a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        b = (i10 >= 34 ? new b1() : i10 >= 30 ? new a1() : i10 >= 29 ? new z0() : new y0()).b().a.a().a.b().a.c();
    }

    public j1(m1 m1Var) {
        this.a = m1Var;
    }

    public m1 a() {
        return this.a;
    }

    public m1 b() {
        return this.a;
    }

    public m1 c() {
        return this.a;
    }

    public j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return o() == j1Var.o() && n() == j1Var.n() && Objects.equals(k(), j1Var.k()) && Objects.equals(i(), j1Var.i()) && Objects.equals(e(), j1Var.e());
    }

    public i0.b f(int i10) {
        return i0.b.e;
    }

    public i0.b g(int i10) {
        if ((i10 & 8) == 0) {
            return i0.b.e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public i0.b h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public i0.b i() {
        return i0.b.e;
    }

    public i0.b j() {
        return k();
    }

    public i0.b k() {
        return i0.b.e;
    }

    public i0.b l() {
        return k();
    }

    public m1 m(int i10, int i11, int i12, int i13) {
        return b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i10) {
        return true;
    }

    public void d(View view) {
    }

    public void q(i0.b[] bVarArr) {
    }

    public void r(m1 m1Var) {
    }

    public void s(i0.b bVar) {
    }

    public void t(int i10) {
    }
}
