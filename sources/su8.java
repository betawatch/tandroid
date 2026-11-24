// default package

import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class su8 implements jr9 {
    public final int a;
    public final boolean b;
    public final /* synthetic */ uu8 c;

    public su8(uu8 uu8Var, int i, boolean z) {
        this.c = uu8Var;
        this.a = i;
        this.b = z;
    }

    @Override // jr9
    public final int a() {
        return this.b ? 4 : 0;
    }

    @Override // jr9
    public final void d() {
        int i = this.a;
        uu8 uu8Var = this.c;
        uu8Var.M[i].C();
        mx6 mx6Var = uu8Var.y;
        int v3 = uu8Var.d.v3(uu8Var.W);
        IOException iOException = (IOException) mx6Var.d;
        if (iOException != null) {
            throw iOException;
        }
        ia6 ia6Var = (ia6) mx6Var.c;
        if (ia6Var != null) {
            if (v3 == Integer.MIN_VALUE) {
                v3 = ia6Var.a;
            }
            IOException iOException2 = ia6Var.e;
            if (iOException2 != null && ia6Var.f > v3) {
                throw iOException2;
            }
        }
    }

    @Override // jr9
    public final boolean i() {
        uu8 uu8Var = this.c;
        return !uu8Var.C() && uu8Var.M[this.a].A(uu8Var.j0);
    }

    @Override // jr9
    public final int m(long j) {
        uu8 uu8Var = this.c;
        if (uu8Var.C()) {
            return 0;
        }
        int i = this.a;
        uu8Var.v(i);
        hr9 hr9Var = uu8Var.M[i];
        int x = hr9Var.x(j, uu8Var.j0);
        hr9Var.L(x);
        if (x == 0) {
            uu8Var.x(i);
        }
        return x;
    }

    @Override // jr9
    public final int p(mj4 mj4Var, la3 la3Var, int i) {
        uu8 uu8Var = this.c;
        if (uu8Var.C()) {
            return -3;
        }
        int i2 = this.a;
        uu8Var.v(i2);
        int F = uu8Var.M[i2].F(mj4Var, la3Var, i, uu8Var.j0);
        if (F == -3) {
            uu8Var.x(i2);
        }
        return F;
    }
}
