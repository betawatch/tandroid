package u2;

import java.io.IOException;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class s0 implements b1 {
    public final int a;
    public final /* synthetic */ u0 b;

    public s0(u0 u0Var, int i10) {
        this.b = u0Var;
        this.a = i10;
    }

    @Override // u2.b1
    public final void a() {
        int i10 = this.a;
        u0 u0Var = this.b;
        u0Var.K[i10].z();
        y2.l lVar = u0Var.x;
        int m32 = u0Var.d.m3(u0Var.U);
        IOException iOException = lVar.c;
        if (iOException != null) {
            throw iOException;
        }
        y2.h hVar = lVar.b;
        if (hVar != null) {
            if (m32 == Integer.MIN_VALUE) {
                m32 = hVar.a;
            }
            IOException iOException2 = hVar.e;
            if (iOException2 != null && hVar.f > m32) {
                throw iOException2;
            }
        }
    }

    @Override // u2.b1
    public final boolean e() {
        u0 u0Var = this.b;
        return !u0Var.A() && u0Var.K[this.a].x(u0Var.e0);
    }

    @Override // u2.b1
    public final int f(n4.x xVar, h2.h hVar, int i10) {
        u0 u0Var = this.b;
        if (u0Var.A()) {
            return -3;
        }
        int i11 = this.a;
        u0Var.u(i11);
        int C = u0Var.K[i11].C(xVar, hVar, i10, u0Var.e0);
        if (C == -3) {
            u0Var.v(i11);
        }
        return C;
    }

    @Override // u2.b1
    public final int j(long j3) {
        u0 u0Var = this.b;
        if (u0Var.A()) {
            return 0;
        }
        int i10 = this.a;
        u0Var.u(i10);
        a1 a1Var = u0Var.K[i10];
        int v = a1Var.v(j3, u0Var.e0);
        a1Var.H(v);
        if (v == 0) {
            u0Var.v(i10);
        }
        return v;
    }
}
