package r0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class h1 {
    public static final k1 b;
    public final k1 a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        b = (i3 >= 34 ? new z0() : i3 >= 30 ? new y0() : i3 >= 29 ? new x0() : new w0()).b().a.a().a.b().a.c();
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

    public i0.b f(int i3) {
        return i0.b.e;
    }

    public i0.b g(int i3) {
        if ((i3 & 8) == 0) {
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

    public k1 m(int i3, int i10, int i11, int i12) {
        return b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i3) {
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

    public void t(int i3) {
    }
}
