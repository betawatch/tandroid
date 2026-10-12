package p4;

import android.os.Bundle;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class r0 extends q implements o0 {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public n0 f;
    public int g;
    public final /* synthetic */ s0 h;

    public r0(s0 s0Var, String str, String str2) {
        this.h = s0Var;
        this.a = str;
        this.b = str2;
    }

    @Override // p4.o0
    public final void a(n0 n0Var) {
        this.f = n0Var;
        int i10 = n0Var.e;
        n0Var.e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i11 = n0Var.d;
        n0Var.d = i11 + 1;
        n0Var.b(3, i11, i10, null, bundle);
        this.g = i10;
        if (this.c) {
            n0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                n0Var.c(this.g, i12);
                this.d = -1;
            }
            int i13 = this.e;
            if (i13 != 0) {
                n0Var.d(this.g, i13);
                this.e = 0;
            }
        }
    }

    @Override // p4.o0
    public final int b() {
        return this.g;
    }

    @Override // p4.o0
    public final void c() {
        n0 n0Var = this.f;
        if (n0Var != null) {
            int i10 = this.g;
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(4, i11, i10, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // p4.q
    public final void d() {
        s0 s0Var = this.h;
        s0Var.v.remove(this);
        c();
        s0Var.r();
    }

    @Override // p4.q
    public final void e() {
        this.c = true;
        n0 n0Var = this.f;
        if (n0Var != null) {
            n0Var.a(this.g);
        }
    }

    @Override // p4.q
    public final void f(int i10) {
        n0 n0Var = this.f;
        if (n0Var != null) {
            n0Var.c(this.g, i10);
        } else {
            this.d = i10;
            this.e = 0;
        }
    }

    @Override // p4.q
    public final void g() {
        h(0);
    }

    @Override // p4.q
    public final void h(int i10) {
        this.c = false;
        n0 n0Var = this.f;
        if (n0Var != null) {
            int i11 = this.g;
            Bundle g10 = org.telegram.ui.Cells.d0.g(i10, "unselectReason");
            int i12 = n0Var.d;
            n0Var.d = i12 + 1;
            n0Var.b(6, i12, i11, null, g10);
        }
    }

    @Override // p4.q
    public final void i(int i10) {
        n0 n0Var = this.f;
        if (n0Var != null) {
            n0Var.d(this.g, i10);
        } else {
            this.e += i10;
        }
    }
}
