package r4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q0 extends p implements o0 {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int k;
    public n0 l;
    public final /* synthetic */ s0 n;
    public int j = -1;
    public int m = -1;

    public q0(s0 s0Var, String str) {
        this.n = s0Var;
        this.f = str;
    }

    @Override // r4.o0
    public final int a() {
        return this.m;
    }

    @Override // r4.o0
    public final void b(n0 n0Var) {
        p0 p0Var = new p0(this);
        this.l = n0Var;
        int i3 = n0Var.e;
        n0Var.e = i3 + 1;
        int i10 = n0Var.d;
        n0Var.d = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        n0Var.b(11, i10, i3, null, bundle);
        n0Var.h.put(i10, p0Var);
        this.m = i3;
        if (this.i) {
            n0Var.a(i3);
            int i11 = this.j;
            if (i11 >= 0) {
                n0Var.c(this.m, i11);
                this.j = -1;
            }
            int i12 = this.k;
            if (i12 != 0) {
                n0Var.d(this.m, i12);
                this.k = 0;
            }
        }
    }

    @Override // r4.o0
    public final void c() {
        n0 n0Var = this.l;
        if (n0Var != null) {
            int i3 = this.m;
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            n0Var.b(4, i10, i3, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override // r4.q
    public final void d() {
        s0 s0Var = this.n;
        s0Var.w.remove(this);
        c();
        s0Var.r();
    }

    @Override // r4.q
    public final void e() {
        this.i = true;
        n0 n0Var = this.l;
        if (n0Var != null) {
            n0Var.a(this.m);
        }
    }

    @Override // r4.q
    public final void f(int i3) {
        n0 n0Var = this.l;
        if (n0Var != null) {
            n0Var.c(this.m, i3);
        } else {
            this.j = i3;
            this.k = 0;
        }
    }

    @Override // r4.q
    public final void g() {
        h(0);
    }

    @Override // r4.q
    public final void h(int i3) {
        this.i = false;
        n0 n0Var = this.l;
        if (n0Var != null) {
            int i10 = this.m;
            Bundle k10 = f1.k(i3, "unselectReason");
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(6, i11, i10, null, k10);
        }
    }

    @Override // r4.q
    public final void i(int i3) {
        n0 n0Var = this.l;
        if (n0Var != null) {
            n0Var.d(this.m, i3);
        } else {
            this.k += i3;
        }
    }

    @Override // r4.p
    public final String j() {
        return this.g;
    }

    @Override // r4.p
    public final String k() {
        return this.h;
    }

    @Override // r4.p
    public final void m(String str) {
        n0 n0Var = this.l;
        if (n0Var != null) {
            int i3 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            n0Var.b(12, i10, i3, null, bundle);
        }
    }

    @Override // r4.p
    public final void n(String str) {
        n0 n0Var = this.l;
        if (n0Var != null) {
            int i3 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            n0Var.b(13, i10, i3, null, bundle);
        }
    }

    @Override // r4.p
    public final void o(List list) {
        n0 n0Var = this.l;
        if (n0Var != null) {
            int i3 = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            n0Var.b(14, i10, i3, null, bundle);
        }
    }
}
