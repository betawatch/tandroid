// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class st5 implements k8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bu5 b;

    public /* synthetic */ st5(bu5 bu5Var, byte b) {
        this.a = b;
        this.b = bu5Var;
    }

    @Override // k8
    public final void q(KeyEvent keyEvent) {
        wt5 wt5Var;
        wt5 wt5Var2;
        byte b = this.a;
        bu5 bu5Var = this.b;
        switch (b) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (wt5Var = bu5Var.m) != null && wt5Var.isShowing()) {
                    bu5Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (wt5Var2 = bu5Var.m) != null && wt5Var2.isShowing()) {
                    bu5Var.u();
                    break;
                }
                break;
        }
    }
}
