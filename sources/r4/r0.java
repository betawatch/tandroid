package r4;

import android.os.Bundle;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // r4.o0
    public final int a() {
        return this.g;
    }

    @Override // r4.o0
    public final void b(n0 n0Var) {
        this.f = n0Var;
        int i3 = n0Var.e;
        n0Var.e = i3 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i10 = n0Var.d;
        n0Var.d = i10 + 1;
        n0Var.b(3, i10, i3, null, bundle);
        this.g = i3;
        if (this.c) {
            n0Var.a(i3);
            int i11 = this.d;
            if (i11 >= 0) {
                n0Var.c(this.g, i11);
                this.d = -1;
            }
            int i12 = this.e;
            if (i12 != 0) {
                n0Var.d(this.g, i12);
                this.e = 0;
            }
        }
    }

    @Override // r4.o0
    public final void c() {
        n0 n0Var = this.f;
        if (n0Var != null) {
            int i3 = this.g;
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            n0Var.b(4, i10, i3, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // r4.q
    public final void d() {
        s0 s0Var = this.h;
        s0Var.w.remove(this);
        c();
        s0Var.r();
    }

    @Override // r4.q
    public final void e() {
        this.c = true;
        n0 n0Var = this.f;
        if (n0Var != null) {
            n0Var.a(this.g);
        }
    }

    @Override // r4.q
    public final void f(int i3) {
        n0 n0Var = this.f;
        if (n0Var != null) {
            n0Var.c(this.g, i3);
        } else {
            this.d = i3;
            this.e = 0;
        }
    }

    @Override // r4.q
    public final void g() {
        h(0);
    }

    @Override // r4.q
    public final void h(int i3) {
        this.c = false;
        n0 n0Var = this.f;
        if (n0Var != null) {
            int i10 = this.g;
            Bundle k10 = f1.k(i3, "unselectReason");
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(6, i11, i10, null, k10);
        }
    }

    @Override // r4.q
    public final void i(int i3) {
        n0 n0Var = this.f;
        if (n0Var != null) {
            n0Var.d(this.g, i3);
        } else {
            this.e += i3;
        }
    }
}
