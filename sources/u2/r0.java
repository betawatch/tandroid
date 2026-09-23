package u2;

import java.io.IOException;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class r0 implements a1 {
    public final int a;
    public final /* synthetic */ t0 b;

    public r0(t0 t0Var, int i10) {
        this.b = t0Var;
        this.a = i10;
    }

    @Override // u2.a1
    public final void a() {
        int i10 = this.a;
        t0 t0Var = this.b;
        t0Var.K[i10].z();
        y2.m mVar = t0Var.x;
        int L3 = t0Var.d.L3(t0Var.U);
        IOException iOException = mVar.c;
        if (iOException != null) {
            throw iOException;
        }
        y2.i iVar = mVar.b;
        if (iVar != null) {
            if (L3 == Integer.MIN_VALUE) {
                L3 = iVar.a;
            }
            IOException iOException2 = iVar.e;
            if (iOException2 != null && iVar.f > L3) {
                throw iOException2;
            }
        }
    }

    @Override // u2.a1
    public final boolean e() {
        t0 t0Var = this.b;
        return !t0Var.C() && t0Var.K[this.a].x(t0Var.e0);
    }

    @Override // u2.a1
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        t0 t0Var = this.b;
        if (t0Var.C()) {
            return -3;
        }
        int i11 = this.a;
        t0Var.x(i11);
        int C = t0Var.K[i11].C(yVar, hVar, i10, t0Var.e0);
        if (C == -3) {
            t0Var.y(i11);
        }
        return C;
    }

    @Override // u2.a1
    public final int j(long j3) {
        t0 t0Var = this.b;
        if (t0Var.C()) {
            return 0;
        }
        int i10 = this.a;
        t0Var.x(i10);
        z0 z0Var = t0Var.K[i10];
        int v = z0Var.v(j3, t0Var.e0);
        z0Var.H(v);
        if (v == 0) {
            t0Var.y(i10);
        }
        return v;
    }
}
