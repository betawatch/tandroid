package r0;

import g7.a7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c1 {
    public final m1 a;
    public i0.b[] b;

    public c1() {
        this(new m1());
    }

    public final void a() {
        i0.b[] bVarArr = this.b;
        if (bVarArr != null) {
            i0.b bVar = bVarArr[0];
            i0.b bVar2 = bVarArr[1];
            m1 m1Var = this.a;
            if (bVar2 == null) {
                bVar2 = m1Var.a.f(2);
            }
            if (bVar == null) {
                bVar = m1Var.a.f(1);
            }
            g(i0.b.a(bVar, bVar2));
            i0.b bVar3 = this.b[a7.a(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            i0.b bVar4 = this.b[a7.a(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            i0.b bVar5 = this.b[a7.a(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract m1 b();

    public void c(int i9, i0.b bVar) {
        if (this.b == null) {
            this.b = new i0.b[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i9 & i10) != 0) {
                this.b[a7.a(i10)] = bVar;
            }
        }
    }

    public abstract void e(i0.b bVar);

    public abstract void g(i0.b bVar);

    public c1(m1 m1Var) {
        this.a = m1Var;
    }

    public void d(i0.b bVar) {
    }

    public void f(i0.b bVar) {
    }

    public void h(i0.b bVar) {
    }
}
