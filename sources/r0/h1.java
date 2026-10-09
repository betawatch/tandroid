package r0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class h1 {
    public static final k1 b;
    public final k1 a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        b = (i10 >= 34 ? new z0() : i10 >= 30 ? new y0() : i10 >= 29 ? new x0() : new w0()).b().a.a().a.b().a.c();
    }

    public h1(k1 k1Var) {
        this.a = k1Var;
    }

    public k1 a() {
        return this.a;
    }

    public k1 b() {
        return this.a;
    }

    public k1 c() {
        return this.a;
    }

    public i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return o() == h1Var.o() && n() == h1Var.n() && Objects.equals(k(), h1Var.k()) && Objects.equals(i(), h1Var.i()) && Objects.equals(e(), h1Var.e());
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

    public k1 m(int i10, int i11, int i12, int i13) {
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

    public void r(k1 k1Var) {
    }

    public void s(i0.b bVar) {
    }

    public void t(int i10) {
    }
}
