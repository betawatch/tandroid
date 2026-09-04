package u2;

import java.io.IOException;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class s0 implements b1 {
    public final int a;
    public final /* synthetic */ u0 b;

    public s0(u0 u0Var, int i10) {
        this.b = u0Var;
        this.a = i10;
    }

    @Override // u2.b1
    public final void b() {
        int i10 = this.a;
        u0 u0Var = this.b;
        u0Var.K[i10].z();
        y2.m mVar = u0Var.x;
        int L3 = u0Var.d.L3(u0Var.U);
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

    @Override // u2.b1
    public final boolean e() {
        u0 u0Var = this.b;
        return !u0Var.D() && u0Var.K[this.a].x(u0Var.e0);
    }

    @Override // u2.b1
    public final int f(n4.y yVar, h2.g gVar, int i10) {
        u0 u0Var = this.b;
        if (u0Var.D()) {
            return -3;
        }
        int i11 = this.a;
        u0Var.y(i11);
        int C = u0Var.K[i11].C(yVar, gVar, i10, u0Var.e0);
        if (C == -3) {
            u0Var.z(i11);
        }
        return C;
    }

    @Override // u2.b1
    public final int m(long j3) {
        u0 u0Var = this.b;
        if (u0Var.D()) {
            return 0;
        }
        int i10 = this.a;
        u0Var.y(i10);
        a1 a1Var = u0Var.K[i10];
        int v = a1Var.v(j3, u0Var.e0);
        a1Var.H(v);
        if (v == 0) {
            u0Var.z(i10);
        }
        return v;
    }
}
