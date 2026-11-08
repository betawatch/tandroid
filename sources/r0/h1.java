package r0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class h1 {
    public static final k1 b;
    public final k1 a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        b = (i7 >= 34 ? new z0() : i7 >= 30 ? new y0() : i7 >= 29 ? new x0() : new w0()).b().a.a().a.b().a.c();
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

    public h e() {
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

    public i0.b f(int i7) {
        return i0.b.e;
    }

    public i0.b g(int i7) {
        if ((i7 & 8) == 0) {
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

    public k1 m(int i7, int i10, int i11, int i12) {
        return b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i7) {
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

    public void t(int i7) {
    }
}
