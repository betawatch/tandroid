// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class y46 implements ee, k8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f56 b;

    public /* synthetic */ y46(f56 f56Var, byte b) {
        this.a = b;
        this.b = f56Var;
    }

    @Override // k8
    public final void q(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            f56 f56Var = this.b;
            if (f56Var.s.isShowing()) {
                f56Var.s.d(true);
            }
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        f56 f56Var = this.b;
        switch (b) {
            case 0:
                e56 e56Var = f56Var.r;
                if (e56Var != null) {
                    e56Var.m();
                    break;
                }
                break;
            default:
                e56 e56Var2 = f56Var.r;
                if (e56Var2 != null) {
                    e56Var2.c();
                    break;
                }
                break;
        }
    }
}
