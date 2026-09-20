package u2;

import java.io.IOException;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        y2.m mVar = v0Var.x;
        int L3 = v0Var.d.L3(v0Var.U);
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
        v0Var.x(i11);
        int C = v0Var.K[i11].C(yVar, hVar, i10, v0Var.e0);
        if (C == -3) {
            v0Var.y(i11);
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
        v0Var.x(i10);
        b1 b1Var = v0Var.K[i10];
        int v = b1Var.v(j3, v0Var.e0);
        b1Var.H(v);
        if (v == 0) {
            v0Var.y(i10);
        }
        return v;
    }
}
