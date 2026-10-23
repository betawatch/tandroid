package u2;

import java.io.IOException;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class w0 implements f1 {
    public final int a;
    public final /* synthetic */ y0 b;

    public w0(y0 y0Var, int i10) {
        this.b = y0Var;
        this.a = i10;
    }

    @Override // u2.f1
    public final void a() {
        int i10 = this.a;
        y0 y0Var = this.b;
        y0Var.L[i10].C();
        y2.l lVar = y0Var.x;
        int y3 = y0Var.d.y3(y0Var.V);
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

    @Override // u2.f1
    public final boolean f() {
        y0 y0Var = this.b;
        return !y0Var.E() && y0Var.L[this.a].A(y0Var.g0);
    }

    @Override // u2.f1
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        y0 y0Var = this.b;
        if (y0Var.E()) {
            return -3;
        }
        int i11 = this.a;
        y0Var.x(i11);
        int F = y0Var.L[i11].F(bVar, hVar, i10, y0Var.g0);
        if (F == -3) {
            y0Var.y(i11);
        }
        return F;
    }

    @Override // u2.f1
    public final int m(long j10) {
        y0 y0Var = this.b;
        if (y0Var.E()) {
            return 0;
        }
        int i10 = this.a;
        y0Var.x(i10);
        e1 e1Var = y0Var.L[i10];
        int x10 = e1Var.x(j10, y0Var.g0);
        e1Var.L(x10);
        if (x10 == 0) {
            y0Var.y(i10);
        }
        return x10;
    }
}
