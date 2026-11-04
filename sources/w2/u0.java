package w2;

import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u0 implements d1 {
    public final int a;
    public final /* synthetic */ w0 b;

    public u0(w0 w0Var, int i3) {
        this.b = w0Var;
        this.a = i3;
    }

    @Override // w2.d1
    public final void a() {
        int i3 = this.a;
        w0 w0Var = this.b;
        w0Var.M[i3].C();
        a3.q qVar = w0Var.y;
        int F4 = w0Var.d.F4(w0Var.W);
        IOException iOException = qVar.c;
        if (iOException != null) {
            throw iOException;
        }
        a3.l lVar = qVar.b;
        if (lVar != null) {
            if (F4 == Integer.MIN_VALUE) {
                F4 = lVar.a;
            }
            IOException iOException2 = lVar.e;
            if (iOException2 != null && lVar.f > F4) {
                throw iOException2;
            }
        }
    }

    @Override // w2.d1
    public final boolean f() {
        w0 w0Var = this.b;
        return !w0Var.C() && w0Var.M[this.a].A(w0Var.h0);
    }

    @Override // w2.d1
    public final int m(long j10) {
        w0 w0Var = this.b;
        if (w0Var.C()) {
            return 0;
        }
        int i3 = this.a;
        w0Var.x(i3);
        c1 c1Var = w0Var.M[i3];
        int x10 = c1Var.x(j10, w0Var.h0);
        c1Var.L(x10);
        if (x10 == 0) {
            w0Var.y(i3);
        }
        return x10;
    }

    @Override // w2.d1
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        w0 w0Var = this.b;
        if (w0Var.C()) {
            return -3;
        }
        int i10 = this.a;
        w0Var.x(i10);
        int F = w0Var.M[i10].F(bVar, hVar, i3, w0Var.h0);
        if (F == -3) {
            w0Var.y(i10);
        }
        return F;
    }
}
