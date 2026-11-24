// default package

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class tzc {
    public static final wzc b;
    public final wzc a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 34 ? new lzc() : i >= 30 ? new kzc() : i >= 29 ? new jzc() : new izc()).b().a.a().a.b().a.c();
    }

    public tzc(wzc wzcVar) {
        this.a = wzcVar;
    }

    public wzc a() {
        return this.a;
    }

    public wzc b() {
        return this.a;
    }

    public wzc c() {
        return this.a;
    }

    public vp3 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzc)) {
            return false;
        }
        tzc tzcVar = (tzc) obj;
        return o() == tzcVar.o() && n() == tzcVar.n() && Objects.equals(k(), tzcVar.k()) && Objects.equals(i(), tzcVar.i()) && Objects.equals(e(), tzcVar.e());
    }

    public iq5 f(int i) {
        return iq5.e;
    }

    public iq5 g(int i) {
        if ((i & 8) == 0) {
            return iq5.e;
        }
        u36.j("Unable to query the maximum insets for IME");
        return null;
    }

    public iq5 h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public iq5 i() {
        return iq5.e;
    }

    public iq5 j() {
        return k();
    }

    public iq5 k() {
        return iq5.e;
    }

    public iq5 l() {
        return k();
    }

    public wzc m(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void q(iq5[] iq5VarArr) {
    }

    public void r(wzc wzcVar) {
    }

    public void s(iq5 iq5Var) {
    }

    public void t(int i) {
    }
}
