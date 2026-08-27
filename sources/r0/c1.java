package r0;

import h7.s6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class c1 {
    public final m1 a;
    public i0.c[] b;

    public c1() {
        this(new m1());
    }

    public final void a() {
        i0.c[] cVarArr = this.b;
        if (cVarArr != null) {
            i0.c cVar = cVarArr[0];
            i0.c cVar2 = cVarArr[1];
            m1 m1Var = this.a;
            if (cVar2 == null) {
                cVar2 = m1Var.a.f(2);
            }
            if (cVar == null) {
                cVar = m1Var.a.f(1);
            }
            g(i0.c.a(cVar, cVar2));
            i0.c cVar3 = this.b[s6.a(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            i0.c cVar4 = this.b[s6.a(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            i0.c cVar5 = this.b[s6.a(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract m1 b();

    public void c(int i10, i0.c cVar) {
        if (this.b == null) {
            this.b = new i0.c[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.b[s6.a(i11)] = cVar;
            }
        }
    }

    public abstract void e(i0.c cVar);

    public abstract void g(i0.c cVar);

    public c1(m1 m1Var) {
        this.a = m1Var;
    }

    public void d(i0.c cVar) {
    }

    public void f(i0.c cVar) {
    }

    public void h(i0.c cVar) {
    }
}
