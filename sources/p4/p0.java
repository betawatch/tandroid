package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class p0 extends p implements n0 {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int k;
    public m0 l;
    public final /* synthetic */ r0 n;
    public int j = -1;
    public int m = -1;

    public p0(r0 r0Var, String str) {
        this.n = r0Var;
        this.f = str;
    }

    @Override // p4.n0
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.l = m0Var;
        int i10 = m0Var.e;
        m0Var.e = i10 + 1;
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        m0Var.b(11, i11, i10, null, bundle);
        m0Var.h.put(i11, o0Var);
        this.m = i10;
        if (this.i) {
            m0Var.a(i10);
            int i12 = this.j;
            if (i12 >= 0) {
                m0Var.c(this.m, i12);
                this.j = -1;
            }
            int i13 = this.k;
            if (i13 != 0) {
                m0Var.d(this.m, i13);
                this.k = 0;
            }
        }
    }

    @Override // p4.n0
    public final int b() {
        return this.m;
    }

    @Override // p4.n0
    public final void c() {
        m0 m0Var = this.l;
        if (m0Var != null) {
            int i10 = this.m;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override // p4.q
    public final void d() {
        r0 r0Var = this.n;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override // p4.q
    public final void e() {
        this.i = true;
        m0 m0Var = this.l;
        if (m0Var != null) {
            m0Var.a(this.m);
        }
    }

    @Override // p4.q
    public final void f(int i10) {
        m0 m0Var = this.l;
        if (m0Var != null) {
            m0Var.c(this.m, i10);
        } else {
            this.j = i10;
            this.k = 0;
        }
    }

    @Override // p4.q
    public final void g() {
        h(0);
    }

    @Override // p4.q
    public final void h(int i10) {
        this.i = false;
        m0 m0Var = this.l;
        if (m0Var != null) {
            int i11 = this.m;
            Bundle e7 = p6.e(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, e7);
        }
    }

    @Override // p4.q
    public final void i(int i10) {
        m0 m0Var = this.l;
        if (m0Var != null) {
            m0Var.d(this.m, i10);
        } else {
            this.k += i10;
        }
    }

    @Override // p4.p
    public final String j() {
        return this.g;
    }

    @Override // p4.p
    public final String k() {
        return this.h;
    }

    @Override // p4.p
    public final void m(String str) {
        m0 m0Var = this.l;
        if (m0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override // p4.p
    public final void n(String str) {
        m0 m0Var = this.l;
        if (m0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override // p4.p
    public final void o(List list) {
        m0 m0Var = this.l;
        if (m0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(14, i11, i10, null, bundle);
        }
    }
}
