// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vt5 implements l8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fu5 b;

    public /* synthetic */ vt5(fu5 fu5Var, byte b) {
        this.a = b;
        this.b = fu5Var;
    }

    @Override // l8
    public final void o(KeyEvent keyEvent) {
        zt5 zt5Var;
        zt5 zt5Var2;
        byte b = this.a;
        fu5 fu5Var = this.b;
        switch (b) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (zt5Var = fu5Var.m) != null && zt5Var.isShowing()) {
                    fu5Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (zt5Var2 = fu5Var.m) != null && zt5Var2.isShowing()) {
                    fu5Var.u();
                    break;
                }
                break;
        }
    }
}
