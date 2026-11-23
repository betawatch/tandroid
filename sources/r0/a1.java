package r0;

import c8.ac;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class a1 {
    public final l1 a;
    public i0.b[] b;

    public a1() {
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
            i0.b bVar3 = this.b[ac.a(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            i0.b bVar4 = this.b[ac.a(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            i0.b bVar5 = this.b[ac.a(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract l1 b();

    public void c(int i7, i0.b bVar) {
        if (this.b == null) {
            this.b = new i0.b[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                this.b[ac.a(i10)] = bVar;
            }
        }
    }

    public abstract void e(i0.b bVar);

    public abstract void g(i0.b bVar);

    public a1(l1 l1Var) {
        this.a = l1Var;
    }

    public void d(i0.b bVar) {
    }

    public void f(i0.b bVar) {
    }

    public void h(i0.b bVar) {
    }

    public void i(int i7, boolean z10) {
    }
}
