// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class s78 implements hj, l8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w78 b;

    public /* synthetic */ s78(w78 w78Var, byte b) {
        this.a = b;
        this.b = w78Var;
    }

    @Override // l8
    public final void o(KeyEvent keyEvent) {
        w78 w78Var;
        n8 n8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n8Var = (w78Var = this.b).J) != null && n8Var.isShowing()) {
            w78Var.J.d(true);
        }
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        w78 w78Var = this.b;
        switch (b) {
            case 0:
                w78Var.Z(w78Var.b, w78Var.c, z, i);
                w78Var.finishFragment();
                break;
            default:
                w78Var.Z(w78Var.b, w78Var.c, z, i);
                w78Var.finishFragment();
                break;
        }
    }
}
