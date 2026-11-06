package r0;

import c8.vb;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
            i0.b bVar3 = this.b[vb.a(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            i0.b bVar4 = this.b[vb.a(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            i0.b bVar5 = this.b[vb.a(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract k1 b();

    public void c(int i7, i0.b bVar) {
        if (this.b == null) {
            this.b = new i0.b[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                this.b[vb.a(i10)] = bVar;
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

    public void i(int i7, boolean z9) {
    }
}
