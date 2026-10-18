package u2;

import java.io.IOException;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        v0Var.L[i10].C();
        y2.l lVar = v0Var.x;
        int y3 = v0Var.d.y3(v0Var.V);
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

    @Override // u2.c1
    public final boolean e() {
        v0 v0Var = this.b;
        return !v0Var.C() && v0Var.L[this.a].A(v0Var.g0);
    }

    @Override // u2.c1
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        v0 v0Var = this.b;
        if (v0Var.C()) {
            return -3;
        }
        int i11 = this.a;
        v0Var.x(i11);
        int F = v0Var.L[i11].F(bVar, hVar, i10, v0Var.g0);
        if (F == -3) {
            v0Var.y(i11);
        }
        return F;
    }

    @Override // u2.c1
    public final int h(long j10) {
        v0 v0Var = this.b;
        if (v0Var.C()) {
            return 0;
        }
        int i10 = this.a;
        v0Var.x(i10);
        b1 b1Var = v0Var.L[i10];
        int x10 = b1Var.x(j10, v0Var.g0);
        b1Var.L(x10);
        if (x10 == 0) {
            v0Var.y(i10);
        }
        return x10;
    }
}
