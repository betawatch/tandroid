package u2;

import java.io.IOException;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        int y3 = w0Var.d.y3(w0Var.V);
        IOException iOException = lVar.c;
        if (iOException != null) {
            throw iOException;
        }
        y2.h hVar = lVar.b;
        if (hVar != null) {
            if (y3 == Integer.MIN_VALUE) {
                y3 = hVar.a;
            }
            IOException iOException2 = hVar.e;
            if (iOException2 != null && hVar.f > y3) {
                throw iOException2;
            }
        }
    }

    @Override // u2.d1
    public final boolean e() {
        w0 w0Var = this.b;
        return !w0Var.E() && w0Var.L[this.a].A(w0Var.g0);
    }

    @Override // u2.d1
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        w0 w0Var = this.b;
        if (w0Var.E()) {
            return -3;
        }
        int i11 = this.a;
        w0Var.x(i11);
        int F = w0Var.L[i11].F(bVar, hVar, i10, w0Var.g0);
        if (F == -3) {
            w0Var.y(i11);
        }
        return F;
    }

    @Override // u2.d1
    public final int m(long j10) {
        w0 w0Var = this.b;
        if (w0Var.E()) {
            return 0;
        }
        int i10 = this.a;
        w0Var.x(i10);
        c1 c1Var = w0Var.L[i10];
        int x10 = c1Var.x(j10, w0Var.g0);
        c1Var.L(x10);
        if (x10 == 0) {
            w0Var.y(i10);
        }
        return x10;
    }
}
