package u2;

import java.io.IOException;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u0 implements d1 {
    public final int a;
    public final /* synthetic */ w0 b;

    public u0(w0 w0Var, int i10) {
        this.b = w0Var;
        this.a = i10;
    }

    @Override // u2.d1
    public final void d() {
        int i10 = this.a;
        w0 w0Var = this.b;
        w0Var.L[i10].C();
        y2.l lVar = w0Var.x;
        int B0 = w0Var.d.B0(w0Var.V);
        IOException iOException = lVar.c;
        if (iOException != null) {
            throw iOException;
        }
        y2.h hVar = lVar.b;
        if (hVar != null) {
            if (B0 == Integer.MIN_VALUE) {
                B0 = hVar.a;
            }
            IOException iOException2 = hVar.e;
            if (iOException2 != null && hVar.f > B0) {
                throw iOException2;
            }
        }
    }

    @Override // u2.d1
    public final boolean e() {
        w0 w0Var = this.b;
        return !w0Var.C() && w0Var.L[this.a].A(w0Var.g0);
    }

    @Override // u2.d1
    public final int f(n4.s sVar, h2.h hVar, int i10) {
        w0 w0Var = this.b;
        if (w0Var.C()) {
            return -3;
        }
        int i11 = this.a;
        w0Var.u(i11);
        int F = w0Var.L[i11].F(sVar, hVar, i10, w0Var.g0);
        if (F == -3) {
            w0Var.v(i11);
        }
        return F;
    }

    @Override // u2.d1
    public final int j(long j10) {
        w0 w0Var = this.b;
        if (w0Var.C()) {
            return 0;
        }
        int i10 = this.a;
        w0Var.u(i10);
        c1 c1Var = w0Var.L[i10];
        int x9 = c1Var.x(j10, w0Var.g0);
        c1Var.L(x9);
        if (x9 == 0) {
            w0Var.v(i10);
        }
        return x9;
    }
}
