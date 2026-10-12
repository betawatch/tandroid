package r0;

import w7.v6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class b1 {
    public final l1 a;
    public i0.b[] b;

    public b1() {
        this(new l1());
    }

    public final void a() {
        i0.b[] bVarArr = this.b;
        if (bVarArr != null) {
            i0.b bVar = bVarArr[0];
            i0.b bVar2 = bVarArr[1];
            l1 l1Var = this.a;
            if (bVar2 == null) {
                bVar2 = l1Var.a.f(2);
            }
            if (bVar == null) {
                bVar = l1Var.a.f(1);
            }
            g(i0.b.a(bVar, bVar2));
            i0.b bVar3 = this.b[v6.a(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            i0.b bVar4 = this.b[v6.a(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            i0.b bVar5 = this.b[v6.a(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract l1 b();

    public void c(int i10, i0.b bVar) {
        if (this.b == null) {
            this.b = new i0.b[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.b[v6.a(i11)] = bVar;
            }
        }
    }

    public abstract void e(i0.b bVar);

    public abstract void g(i0.b bVar);

    public b1(l1 l1Var) {
        this.a = l1Var;
    }

    public void d(i0.b bVar) {
    }

    public void f(i0.b bVar) {
    }

    public void h(i0.b bVar) {
    }

    public void i(int i10, boolean z10) {
    }
}
