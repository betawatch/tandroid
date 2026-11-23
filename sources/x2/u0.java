package x2;

import java.io.IOException;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class u0 implements d1 {
    public final int a;
    public final /* synthetic */ w0 b;

    public u0(w0 w0Var, int i7) {
        this.b = w0Var;
        this.a = i7;
    }

    @Override // x2.d1
    public final void a() {
        int i7 = this.a;
        w0 w0Var = this.b;
        w0Var.M[i7].C();
        b3.p pVar = w0Var.y;
        int R4 = w0Var.d.R4(w0Var.W);
        IOException iOException = pVar.c;
        if (iOException != null) {
            throw iOException;
        }
        b3.l lVar = pVar.b;
        if (lVar != null) {
            if (R4 == Integer.MIN_VALUE) {
                R4 = lVar.a;
            }
            IOException iOException2 = lVar.e;
            if (iOException2 != null && lVar.f > R4) {
                throw iOException2;
            }
        }
    }

    @Override // x2.d1
    public final boolean h() {
        w0 w0Var = this.b;
        return !w0Var.E() && w0Var.M[this.a].A(w0Var.h0);
    }

    @Override // x2.d1
    public final int j(long j3) {
        w0 w0Var = this.b;
        if (w0Var.E()) {
            return 0;
        }
        int i7 = this.a;
        w0Var.y(i7);
        c1 c1Var = w0Var.M[i7];
        int x10 = c1Var.x(j3, w0Var.h0);
        c1Var.L(x10);
        if (x10 == 0) {
            w0Var.A(i7);
        }
        return x10;
    }

    @Override // x2.d1
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        w0 w0Var = this.b;
        if (w0Var.E()) {
            return -3;
        }
        int i10 = this.a;
        w0Var.y(i10);
        int F = w0Var.M[i10].F(aVar, hVar, i7, w0Var.h0);
        if (F == -3) {
            w0Var.A(i10);
        }
        return F;
    }
}
