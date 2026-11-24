// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vt1 extends jb8 {
    public final /* synthetic */ k47 a;
    public final /* synthetic */ jo6 b;
    public final /* synthetic */ yv1 c;

    public vt1(yv1 yv1Var, k47 k47Var, jo6 jo6Var) {
        this.c = yv1Var;
        this.a = k47Var;
        this.b = jo6Var;
    }

    @Override // jb8, pb8
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        yv1 yv1Var = this.c;
        if (yv1Var.H5 != this.a) {
            return;
        }
        jo6 jo6Var = this.b;
        if (jo6Var.w || jo6Var.v || jo6Var.u || rccVar != null) {
            yv1Var.G(jo6Var, rccVar, z, i2, z2, 0L);
        } else {
            yv1Var.a0.t0();
        }
    }

    @Override // jb8, pb8
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        return this.c.d7(this.a, null, i, z, true);
    }

    @Override // jb8, pb8
    public final boolean Q() {
        yv1 yv1Var = this.c;
        if (yv1Var.a0 == null || !yv1Var.Y7()) {
            return false;
        }
        yv1Var.a0.R();
        return true;
    }

    @Override // jb8, pb8
    public final k47 W() {
        k47 k47Var = this.c.H5;
        k47 k47Var2 = this.a;
        if (k47Var == k47Var2) {
            return k47Var2;
        }
        return null;
    }

    @Override // jb8, pb8
    public final void f(CharSequence charSequence) {
        this.c.a0.J1(charSequence, false);
    }

    @Override // jb8, pb8
    public final boolean h() {
        return false;
    }
}
