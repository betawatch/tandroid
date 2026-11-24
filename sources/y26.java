// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class y26 implements ed, k8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f36 b;

    public /* synthetic */ y26(f36 f36Var, byte b) {
        this.a = b;
        this.b = f36Var;
    }

    @Override // k8
    public final void r(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            f36 f36Var = this.b;
            if (f36Var.s.isShowing()) {
                f36Var.s.d(true);
            }
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        f36 f36Var = this.b;
        switch (b) {
            case 0:
                e36 e36Var = f36Var.r;
                if (e36Var != null) {
                    e36Var.k();
                    break;
                }
                break;
            default:
                e36 e36Var2 = f36Var.r;
                if (e36Var2 != null) {
                    e36Var2.c();
                    break;
                }
                break;
        }
    }
}
