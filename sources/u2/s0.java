package u2;

import java.io.IOException;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        int L3 = u0Var.d.L3(u0Var.U);
        IOException iOException = lVar.c;
        if (iOException != null) {
            throw iOException;
        }
        y2.h hVar = lVar.b;
        if (hVar != null) {
            if (L3 == Integer.MIN_VALUE) {
                L3 = hVar.a;
            }
            IOException iOException2 = hVar.e;
            if (iOException2 != null && hVar.f > L3) {
                throw iOException2;
            }
        }
    }

    @Override // u2.b1
    public final boolean e() {
        u0 u0Var = this.b;
        return !u0Var.C() && u0Var.K[this.a].x(u0Var.e0);
    }

    @Override // u2.b1
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        u0 u0Var = this.b;
        if (u0Var.C()) {
            return -3;
        }
        int i11 = this.a;
        u0Var.x(i11);
        int C = u0Var.K[i11].C(yVar, hVar, i10, u0Var.e0);
        if (C == -3) {
            u0Var.y(i11);
        }
        return C;
    }

    @Override // u2.b1
    public final int j(long j3) {
        u0 u0Var = this.b;
        if (u0Var.C()) {
            return 0;
        }
        int i10 = this.a;
        u0Var.x(i10);
        a1 a1Var = u0Var.K[i10];
        int v = a1Var.v(j3, u0Var.e0);
        a1Var.H(v);
        if (v == 0) {
            u0Var.y(i10);
        }
        return v;
    }
}
