package x2;

import java.io.IOException;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class t0 implements b1 {
    public final int a;
    public final /* synthetic */ v0 b;

    public t0(v0 v0Var, int i7) {
        this.b = v0Var;
        this.a = i7;
    }

    @Override // x2.b1
    public final void a() {
        int i7 = this.a;
        v0 v0Var = this.b;
        v0Var.L[i7].C();
        b3.o oVar = v0Var.y;
        int X0 = v0Var.d.X0(v0Var.V);
        IOException iOException = oVar.c;
        if (iOException != null) {
            throw iOException;
        }
        b3.k kVar = oVar.b;
        if (kVar != null) {
            if (X0 == Integer.MIN_VALUE) {
                X0 = kVar.a;
            }
            IOException iOException2 = kVar.e;
            if (iOException2 != null && kVar.f > X0) {
                throw iOException2;
            }
        }
    }

    @Override // x2.b1
    public final boolean f() {
        v0 v0Var = this.b;
        return !v0Var.A() && v0Var.L[this.a].A(v0Var.g0);
    }

    @Override // x2.b1
    public final int l(long j3) {
        v0 v0Var = this.b;
        if (v0Var.A()) {
            return 0;
        }
        int i7 = this.a;
        v0Var.v(i7);
        a1 a1Var = v0Var.L[i7];
        int x10 = a1Var.x(j3, v0Var.g0);
        a1Var.L(x10);
        if (x10 == 0) {
            v0Var.w(i7);
        }
        return x10;
    }

    @Override // x2.b1
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        v0 v0Var = this.b;
        if (v0Var.A()) {
            return -3;
        }
        int i10 = this.a;
        v0Var.v(i10);
        int F = v0Var.L[i10].F(bVar, hVar, i7, v0Var.g0);
        if (F == -3) {
            v0Var.w(i10);
        }
        return F;
    }
}
