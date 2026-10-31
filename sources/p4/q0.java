package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // p4.o0
    public final void a(n0 n0Var) {
        p0 p0Var = new p0(this);
        this.l = n0Var;
        int i10 = n0Var.e;
        n0Var.e = i10 + 1;
        int i11 = n0Var.d;
        n0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        n0Var.b(11, i11, i10, null, bundle);
        n0Var.h.put(i11, p0Var);
        this.m = i10;
        if (this.i) {
            n0Var.a(i10);
            int i12 = this.j;
            if (i12 >= 0) {
                n0Var.c(this.m, i12);
                this.j = -1;
            }
            int i13 = this.k;
            if (i13 != 0) {
                n0Var.d(this.m, i13);
                this.k = 0;
            }
        }
    }

    @Override // p4.o0
    public final int b() {
        return this.m;
    }

    @Override // p4.o0
    public final void c() {
        n0 n0Var = this.l;
        if (n0Var != null) {
            int i10 = this.m;
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(4, i11, i10, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override // p4.q
    public final void d() {
        s0 s0Var = this.n;
        s0Var.w.remove(this);
        c();
        s0Var.r();
    }

    @Override // p4.q
    public final void e() {
        this.i = true;
        n0 n0Var = this.l;
        if (n0Var != null) {
            n0Var.a(this.m);
        }
    }

    @Override // p4.q
    public final void f(int i10) {
        n0 n0Var = this.l;
        if (n0Var != null) {
            n0Var.c(this.m, i10);
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
        n0 n0Var = this.l;
        if (n0Var != null) {
            int i11 = this.m;
            Bundle i12 = f1.i(i10, "unselectReason");
            int i13 = n0Var.d;
            n0Var.d = i13 + 1;
            n0Var.b(6, i13, i11, null, i12);
        }
    }

    @Override // p4.q
    public final void i(int i10) {
        n0 n0Var = this.l;
        if (n0Var != null) {
            n0Var.d(this.m, i10);
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
        n0 n0Var = this.l;
        if (n0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override // p4.p
    public final void n(String str) {
        n0 n0Var = this.l;
        if (n0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override // p4.p
    public final void o(List list) {
        n0 n0Var = this.l;
        if (n0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(14, i11, i10, null, bundle);
        }
    }
}
