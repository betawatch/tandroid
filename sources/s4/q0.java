package s4;

import android.os.Bundle;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class q0 extends q implements n0 {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public m0 f;
    public int g;
    public final /* synthetic */ r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.a = str;
        this.b = str2;
    }

    @Override // s4.n0
    public final void a(m0 m0Var) {
        this.f = m0Var;
        int i7 = m0Var.e;
        m0Var.e = i7 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i10 = m0Var.d;
        m0Var.d = i10 + 1;
        m0Var.b(3, i10, i7, null, bundle);
        this.g = i7;
        if (this.c) {
            m0Var.a(i7);
            int i11 = this.d;
            if (i11 >= 0) {
                m0Var.c(this.g, i11);
                this.d = -1;
            }
            int i12 = this.e;
            if (i12 != 0) {
                m0Var.d(this.g, i12);
                this.e = 0;
            }
        }
    }

    @Override // s4.n0
    public final int b() {
        return this.g;
    }

    @Override // s4.n0
    public final void c() {
        m0 m0Var = this.f;
        if (m0Var != null) {
            int i7 = this.g;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(4, i10, i7, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // s4.q
    public final void d() {
        r0 r0Var = this.h;
        r0Var.w.remove(this);
        c();
        r0Var.r();
    }

    @Override // s4.q
    public final void e() {
        this.c = true;
        m0 m0Var = this.f;
        if (m0Var != null) {
            m0Var.a(this.g);
        }
    }

    @Override // s4.q
    public final void f(int i7) {
        m0 m0Var = this.f;
        if (m0Var != null) {
            m0Var.c(this.g, i7);
        } else {
            this.d = i7;
            this.e = 0;
        }
    }

    @Override // s4.q
    public final void g() {
        h(0);
    }

    @Override // s4.q
    public final void h(int i7) {
        this.c = false;
        m0 m0Var = this.f;
        if (m0Var != null) {
            int i10 = this.g;
            Bundle f10 = rf.b.f(i7, "unselectReason");
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(6, i11, i10, null, f10);
        }
    }

    @Override // s4.q
    public final void i(int i7) {
        m0 m0Var = this.f;
        if (m0Var != null) {
            m0Var.d(this.g, i7);
        } else {
            this.e += i7;
        }
    }
}
