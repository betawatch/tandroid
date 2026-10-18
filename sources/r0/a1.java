package r0;

import w7.v6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class a1 {
    public final k1 a;
    public i0.b[] b;

    public a1() {
        this(new k1());
    }

    public final void a() {
        i0.b[] bVarArr = this.b;
        if (bVarArr != null) {
            i0.b bVar = bVarArr[0];
            i0.b bVar2 = bVarArr[1];
            k1 k1Var = this.a;
            if (bVar2 == null) {
                bVar2 = k1Var.a.f(2);
            }
            if (bVar == null) {
                bVar = k1Var.a.f(1);
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

    public abstract k1 b();

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

    public a1(k1 k1Var) {
        this.a = k1Var;
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
