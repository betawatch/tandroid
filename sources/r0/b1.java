package r0;

import w7.x6;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
            i0.b bVar3 = this.b[x6.a(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            i0.b bVar4 = this.b[x6.a(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            i0.b bVar5 = this.b[x6.a(64)];
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
                this.b[x6.a(i11)] = bVar;
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
}
