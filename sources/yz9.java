// default package

import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class yz9 implements py4, oy4 {
    public final /* synthetic */ zz9 a;

    public /* synthetic */ yz9(zz9 zz9Var) {
        this.a = zz9Var;
    }

    @Override // py4
    public final int i() {
        return cmb.v0(cmb.c6, this.a.J0);
    }

    @Override // oy4
    public final void s(int i) {
        zz9 zz9Var = this.a;
        mr3 mr3Var = zz9Var.g2;
        if (Build.VERSION.SDK_INT < 31 || mr3Var == null) {
            return;
        }
        if (iqd.a(i, 4)) {
            mr3Var.h(zz9Var.X0.e());
        }
        mr3Var.e(zz9Var.i2, zz9Var.b.getWidth(), zz9Var.b.getHeight());
    }
}
