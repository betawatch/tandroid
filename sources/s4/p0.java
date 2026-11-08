package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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

    @Override // s4.n0
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.l = m0Var;
        int i7 = m0Var.e;
        m0Var.e = i7 + 1;
        int i10 = m0Var.d;
        m0Var.d = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        m0Var.b(11, i10, i7, null, bundle);
        m0Var.h.put(i10, o0Var);
        this.m = i7;
        if (this.i) {
            m0Var.a(i7);
            int i11 = this.j;
            if (i11 >= 0) {
                m0Var.c(this.m, i11);
                this.j = -1;
            }
            int i12 = this.k;
            if (i12 != 0) {
                m0Var.d(this.m, i12);
                this.k = 0;
            }
        }
    }

    @Override // s4.n0
    public final int b() {
        return this.m;
    }

    @Override // s4.n0
    public final void c() {
        m0 m0Var = this.l;
        if (m0Var != null) {
            int i7 = this.m;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(4, i10, i7, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override // s4.q
    public final void d() {
        r0 r0Var = this.n;
        r0Var.w.remove(this);
        c();
        r0Var.r();
    }

    @Override // s4.q
    public final void e() {
        this.i = true;
        m0 m0Var = this.l;
        if (m0Var != null) {
            m0Var.a(this.m);
        }
    }

    @Override // s4.q
    public final void f(int i7) {
        m0 m0Var = this.l;
        if (m0Var != null) {
            m0Var.c(this.m, i7);
        } else {
            this.j = i7;
            this.k = 0;
        }
    }

    @Override // s4.q
    public final void g() {
        h(0);
    }

    @Override // s4.q
    public final void h(int i7) {
        this.i = false;
        m0 m0Var = this.l;
        if (m0Var != null) {
            int i10 = this.m;
            Bundle f10 = rf.b.f(i7, "unselectReason");
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(6, i11, i10, null, f10);
        }
    }

    @Override // s4.q
    public final void i(int i7) {
        m0 m0Var = this.l;
        if (m0Var != null) {
            m0Var.d(this.m, i7);
        } else {
            this.k += i7;
        }
    }

    @Override // s4.p
    public final String j() {
        return this.g;
    }

    @Override // s4.p
    public final String k() {
        return this.h;
    }

    @Override // s4.p
    public final void m(String str) {
        m0 m0Var = this.l;
        if (m0Var != null) {
            int i7 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(12, i10, i7, null, bundle);
        }
    }

    @Override // s4.p
    public final void n(String str) {
        m0 m0Var = this.l;
        if (m0Var != null) {
            int i7 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(13, i10, i7, null, bundle);
        }
    }

    @Override // s4.p
    public final void o(List list) {
        m0 m0Var = this.l;
        if (m0Var != null) {
            int i7 = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(14, i10, i7, null, bundle);
        }
    }
}
