package r0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class g1 {
    public static final j1 b;
    public final j1 a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        b = (i10 >= 34 ? new y0() : i10 >= 30 ? new x0() : i10 >= 29 ? new w0() : new v0()).b().a.a().a.b().a.c();
    }

    public g1(j1 j1Var) {
        this.a = j1Var;
    }

    public j1 a() {
        return this.a;
    }

    public j1 b() {
        return this.a;
    }

    public j1 c() {
        return this.a;
    }

    public h e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return o() == g1Var.o() && n() == g1Var.n() && Objects.equals(k(), g1Var.k()) && Objects.equals(i(), g1Var.i()) && Objects.equals(e(), g1Var.e());
    }

    public i0.c f(int i10) {
        return i0.c.e;
    }

    public i0.c g(int i10) {
        if ((i10 & 8) == 0) {
            return i0.c.e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public i0.c h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public i0.c i() {
        return i0.c.e;
    }

    public i0.c j() {
        return k();
    }

    public i0.c k() {
        return i0.c.e;
    }

    public i0.c l() {
        return k();
    }

    public j1 m(int i10, int i11, int i12, int i13) {
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

    public void q(i0.c[] cVarArr) {
    }

    public void r(j1 j1Var) {
    }

    public void s(i0.c cVar) {
    }

    public void t(int i10) {
    }
}
