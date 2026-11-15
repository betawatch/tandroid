package r0;

import c8.wb;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class a1 {
    public final k1 a;
    public i0.c[] b;

    public a1() {
        this(new k1());
    }

    public final void a() {
        i0.c[] cVarArr = this.b;
        if (cVarArr != null) {
            i0.c cVar = cVarArr[0];
            i0.c cVar2 = cVarArr[1];
            k1 k1Var = this.a;
            if (cVar2 == null) {
                cVar2 = k1Var.a.f(2);
            }
            if (cVar == null) {
                cVar = k1Var.a.f(1);
            }
            g(i0.c.a(cVar, cVar2));
            i0.c cVar3 = this.b[wb.a(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            i0.c cVar4 = this.b[wb.a(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            i0.c cVar5 = this.b[wb.a(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract k1 b();

    public void c(int i7, i0.c cVar) {
        if (this.b == null) {
            this.b = new i0.c[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                this.b[wb.a(i10)] = cVar;
            }
        }
    }

    public abstract void e(i0.c cVar);

    public abstract void g(i0.c cVar);

    public a1(k1 k1Var) {
        this.a = k1Var;
    }

    public void d(i0.c cVar) {
    }

    public void f(i0.c cVar) {
    }

    public void h(i0.c cVar) {
    }

    public void i(int i7, boolean z10) {
    }
}
