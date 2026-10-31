package r0;

import w7.w6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class z0 {
    public final j1 a;
    public i0.c[] b;

    public z0() {
        this(new j1());
    }

    public final void a() {
        i0.c[] cVarArr = this.b;
        if (cVarArr != null) {
            i0.c cVar = cVarArr[0];
            i0.c cVar2 = cVarArr[1];
            j1 j1Var = this.a;
            if (cVar2 == null) {
                cVar2 = j1Var.a.f(2);
            }
            if (cVar == null) {
                cVar = j1Var.a.f(1);
            }
            g(i0.c.a(cVar, cVar2));
            i0.c cVar3 = this.b[w6.a(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            i0.c cVar4 = this.b[w6.a(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            i0.c cVar5 = this.b[w6.a(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract j1 b();

    public void c(int i10, i0.c cVar) {
        if (this.b == null) {
            this.b = new i0.c[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.b[w6.a(i11)] = cVar;
            }
        }
    }

    public abstract void e(i0.c cVar);

    public abstract void g(i0.c cVar);

    public z0(j1 j1Var) {
        this.a = j1Var;
    }

    public void d(i0.c cVar) {
    }

    public void f(i0.c cVar) {
    }

    public void h(i0.c cVar) {
    }

    public void i(int i10, boolean z10) {
    }
}
