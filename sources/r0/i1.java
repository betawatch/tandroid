package r0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public class i1 {
    public static final l1 b;
    public final l1 a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        b = (i7 >= 34 ? new z0() : i7 >= 30 ? new y0() : i7 >= 29 ? new x0() : new w0()).b().a.a().a.b().a.c();
    }

    public i1(l1 l1Var) {
        this.a = l1Var;
    }

    public l1 a() {
        return this.a;
    }

    public l1 b() {
        return this.a;
    }

    public l1 c() {
        return this.a;
    }

    public h e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return o() == i1Var.o() && n() == i1Var.n() && Objects.equals(k(), i1Var.k()) && Objects.equals(i(), i1Var.i()) && Objects.equals(e(), i1Var.e());
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

    public l1 m(int i7, int i10, int i11, int i12) {
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

    public void r(l1 l1Var) {
    }

    public void s(i0.b bVar) {
    }

    public void t(int i7) {
    }
}
