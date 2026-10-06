package u2;

import java.io.IOException;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class t0 implements c1 {
    public final int a;
    public final /* synthetic */ v0 b;

    public t0(v0 v0Var, int i10) {
        this.b = v0Var;
        this.a = i10;
    }

    @Override // u2.c1
    public final void a() {
        int i10 = this.a;
        v0 v0Var = this.b;
        v0Var.K[i10].z();
        y2.l lVar = v0Var.x;
        int L3 = v0Var.d.L3(v0Var.U);
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

    @Override // u2.c1
    public final boolean e() {
        v0 v0Var = this.b;
        return !v0Var.C() && v0Var.K[this.a].x(v0Var.e0);
    }

    @Override // u2.c1
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        v0 v0Var = this.b;
        if (v0Var.C()) {
            return -3;
        }
        int i11 = this.a;
        v0Var.u(i11);
        int C = v0Var.K[i11].C(yVar, hVar, i10, v0Var.e0);
        if (C == -3) {
            v0Var.w(i11);
        }
        return C;
    }

    @Override // u2.c1
    public final int j(long j3) {
        v0 v0Var = this.b;
        if (v0Var.C()) {
            return 0;
        }
        int i10 = this.a;
        v0Var.u(i10);
        b1 b1Var = v0Var.K[i10];
        int v = b1Var.v(j3, v0Var.e0);
        b1Var.H(v);
        if (v == 0) {
            v0Var.w(i10);
        }
        return v;
    }
}
