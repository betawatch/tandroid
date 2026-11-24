// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tr5 implements k8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cs5 b;

    public /* synthetic */ tr5(cs5 cs5Var, byte b) {
        this.a = b;
        this.b = cs5Var;
    }

    @Override // k8
    public final void r(KeyEvent keyEvent) {
        xr5 xr5Var;
        xr5 xr5Var2;
        byte b = this.a;
        cs5 cs5Var = this.b;
        switch (b) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (xr5Var = cs5Var.m) != null && xr5Var.isShowing()) {
                    cs5Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (xr5Var2 = cs5Var.m) != null && xr5Var2.isShowing()) {
                    cs5Var.u();
                    break;
                }
                break;
        }
    }
}
