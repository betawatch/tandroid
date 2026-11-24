// default package

import android.os.Build;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xx9 implements nw4, mw4 {
    public final /* synthetic */ yx9 a;

    public /* synthetic */ xx9(yx9 yx9Var) {
        this.a = yx9Var;
    }

    @Override // nw4
    public final int i() {
        return bkb.v0(bkb.c6, this.a.J0);
    }

    @Override // mw4
    public final void j(int i) {
        yx9 yx9Var = this.a;
        cq3 cq3Var = yx9Var.g2;
        if (Build.VERSION.SDK_INT < 31 || cq3Var == null) {
            return;
        }
        if (fod.a(i, 4)) {
            cq3Var.h(yx9Var.X0.e());
        }
        cq3Var.e(yx9Var.i2, yx9Var.b.getWidth(), yx9Var.b.getHeight());
    }
}
