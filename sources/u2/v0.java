package u2;

import java.io.IOException;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class v0 implements e1 {
    public final int a;
    public final /* synthetic */ x0 b;

    public v0(x0 x0Var, int i10) {
        this.b = x0Var;
        this.a = i10;
    }

    @Override // u2.e1
    public final void a() {
        int i10 = this.a;
        x0 x0Var = this.b;
        x0Var.L[i10].C();
        y2.l lVar = x0Var.x;
        int y3 = x0Var.d.y3(x0Var.V);
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

    @Override // u2.e1
    public final boolean e() {
        x0 x0Var = this.b;
        return !x0Var.C() && x0Var.L[this.a].A(x0Var.g0);
    }

    @Override // u2.e1
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        x0 x0Var = this.b;
        if (x0Var.C()) {
            return -3;
        }
        int i11 = this.a;
        x0Var.x(i11);
        int F = x0Var.L[i11].F(bVar, hVar, i10, x0Var.g0);
        if (F == -3) {
            x0Var.y(i11);
        }
        return F;
    }

    @Override // u2.e1
    public final int h(long j10) {
        x0 x0Var = this.b;
        if (x0Var.C()) {
            return 0;
        }
        int i10 = this.a;
        x0Var.x(i10);
        d1 d1Var = x0Var.L[i10];
        int x10 = d1Var.x(j10, x0Var.g0);
        d1Var.L(x10);
        if (x10 == 0) {
            x0Var.y(i10);
        }
        return x10;
    }
}
