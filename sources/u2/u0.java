package u2;

import java.io.IOException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class u0 implements d1 {
    public final int a;
    public final /* synthetic */ w0 b;

    public u0(w0 w0Var, int i10) {
        this.b = w0Var;
        this.a = i10;
    }

    @Override // u2.d1
    public final void a() {
        int i10 = this.a;
        w0 w0Var = this.b;
        w0Var.K[i10].z();
        y2.n nVar = w0Var.x;
        int o32 = w0Var.d.o3(w0Var.U);
        IOException iOException = nVar.c;
        if (iOException != null) {
            throw iOException;
        }
        y2.j jVar = nVar.b;
        if (jVar != null) {
            if (o32 == Integer.MIN_VALUE) {
                o32 = jVar.a;
            }
            IOException iOException2 = jVar.e;
            if (iOException2 != null && jVar.f > o32) {
                throw iOException2;
            }
        }
    }

    @Override // u2.d1
    public final boolean e() {
        w0 w0Var = this.b;
        return !w0Var.E() && w0Var.K[this.a].x(w0Var.e0);
    }

    @Override // u2.d1
    public final int g(long j3) {
        w0 w0Var = this.b;
        if (w0Var.E()) {
            return 0;
        }
        int i10 = this.a;
        w0Var.x(i10);
        c1 c1Var = w0Var.K[i10];
        int v = c1Var.v(j3, w0Var.e0);
        c1Var.H(v);
        if (v == 0) {
            w0Var.y(i10);
        }
        return v;
    }

    @Override // u2.d1
    public final int t(of.b bVar, h2.h hVar, int i10) {
        w0 w0Var = this.b;
        if (w0Var.E()) {
            return -3;
        }
        int i11 = this.a;
        w0Var.x(i11);
        int C = w0Var.K[i11].C(bVar, hVar, i10, w0Var.e0);
        if (C == -3) {
            w0Var.y(i11);
        }
        return C;
    }
}
