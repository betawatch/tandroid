// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
