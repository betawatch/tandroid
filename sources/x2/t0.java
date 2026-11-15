package x2;

import java.io.IOException;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class t0 implements b1 {
    public final int a;
    public final /* synthetic */ v0 b;

    public t0(v0 v0Var, int i7) {
        this.b = v0Var;
        this.a = i7;
    }

    @Override // x2.b1
    public final void a() {
        int i7 = this.a;
        v0 v0Var = this.b;
        v0Var.M[i7].C();
        b3.o oVar = v0Var.y;
        int R4 = v0Var.d.R4(v0Var.W);
        IOException iOException = oVar.c;
        if (iOException != null) {
            throw iOException;
        }
        b3.k kVar = oVar.b;
        if (kVar != null) {
            if (R4 == Integer.MIN_VALUE) {
                R4 = kVar.a;
            }
            IOException iOException2 = kVar.e;
            if (iOException2 != null && kVar.f > R4) {
                throw iOException2;
            }
        }
    }

    @Override // x2.b1
    public final boolean f() {
        v0 v0Var = this.b;
        return !v0Var.E() && v0Var.M[this.a].A(v0Var.h0);
    }

    @Override // x2.b1
    public final int n(long j3) {
        v0 v0Var = this.b;
        if (v0Var.E()) {
            return 0;
        }
        int i7 = this.a;
        v0Var.z(i7);
        a1 a1Var = v0Var.M[i7];
        int x10 = a1Var.x(j3, v0Var.h0);
        a1Var.L(x10);
        if (x10 == 0) {
            v0Var.A(i7);
        }
        return x10;
    }

    @Override // x2.b1
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        v0 v0Var = this.b;
        if (v0Var.E()) {
            return -3;
        }
        int i10 = this.a;
        v0Var.z(i10);
        int F = v0Var.M[i10].F(aVar, hVar, i7, v0Var.h0);
        if (F == -3) {
            v0Var.A(i10);
        }
        return F;
    }
}
